// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.wearable;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import ani;
import aqb;
import biu;
import cey;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;
import com.google.android.apps.hangouts.phone.BabelGatewayActivity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import dbf;
import dkt;
import ebw;
import ebz;
import egx;
import egy;
import eha;
import ehc;
import ehe;
import ehf;
import ehg;
import ehi;
import ehj;
import ehk;
import ehl;
import ehm;
import ehn;
import ehp;
import ehq;
import ejx;
import ejy;
import eka;
import ekd;
import fsp;
import fsq;
import fst;
import fsx;
import fsy;
import fsz;
import ftb;
import ftc;
import ftd;
import fte;
import fth;
import ftj;
import ftl;
import ftp;
import g;
import gal;
import gam;
import gap;
import gms;
import hgx;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WearableService extends ftp
{

    public static final Uri a = (new android.net.Uri.Builder()).scheme("wear").path("/hangouts/api_level/").build();
    public ejx b;
    ContentResolver c;
    public fst d;
    fte e;
    fsp f;
    egx g;
    SharedPreferences h;
    dkt i;
    ehl j;
    ehn k;
    gap l;
    gms m;
    public Handler n;
    aqb o;
    egy p;
    eka q;
    private HandlerThread r;

    public WearableService()
    {
        o = new eha(this);
        p = new ehc(this);
        q = new ehg(this);
    }

    public static int a(WearableService wearableservice, fsz fsz1)
    {
        return wearableservice.c(fsz1);
    }

    private ehm a(String s)
    {
        ftb ftb1;
        ehm ehm1;
        ehm1 = new ehm();
        ftb1 = (ftb)d.a(b).a();
        Iterator iterator;
        if (!ftb1.B_().e())
        {
            break MISSING_BLOCK_LABEL_256;
        }
        iterator = ftb1.iterator();
_L3:
        Object obj;
        fsz fsz1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_256;
        }
        fsz1 = (fsz)iterator.next();
        obj = fsz1.a().getPath();
        if (!((String) (obj)).startsWith(s)) goto _L2; else goto _L1
_L1:
        obj = fsz1.a().getLastPathSegment();
        ehm1.a.put(obj, a(fsz1));
          goto _L3
        s;
        ftb1.b();
        throw s;
_L2:
        if (!((String) (obj)).startsWith("/hangouts/profiles/")) goto _L5; else goto _L4
_L4:
        obj = fsz1.a();
        ehm1.c.put(((Uri) (obj)).getLastPathSegment(), obj);
          goto _L3
_L5:
        if (!((String) (obj)).contains("/conversations/")) goto _L3; else goto _L6
_L6:
        List list;
        String s1;
        s1 = (String)fsz1.a().getPathSegments().get(1);
        list = (List)ehm1.b.get(s1);
        obj = list;
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_239;
        }
        obj = new ArrayList();
        ehm1.b.put(s1, obj);
        ((List) (obj)).add(fsz1.a());
          goto _L3
        ftb1.b();
        return ehm1;
    }

    private String a()
    {
        return h.getString("wearable-account-", null);
    }

    private void a(int i1)
    {
        android.content.SharedPreferences.Editor editor = h.edit();
        editor.putInt("api_level", i1);
        editor.apply();
        ebw.c("HangoutsWearableService", (new StringBuilder(39)).append("Wearable API level saved as ").append(i1).toString());
    }

    private void a(ani ani1, Map map, Map map1)
    {
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            String s1 = (String)map.get(s);
            k.a(ani1, s, s1, o);
            if (map1 != null)
            {
                map1.remove(s);
            }
        } while (true);
    }

    public static void a(WearableService wearableservice)
    {
        long l10;
        l10 = System.currentTimeMillis();
        wearableservice.b.a(TimeUnit.MILLISECONDS);
        if (wearableservice.b.e()) goto _L2; else goto _L1
_L1:
        Log.e("HangoutsWearableService", "GoogleApiClient failed to connect");
_L4:
        return;
_L2:
        Object obj;
        obj = wearableservice.a();
        if (obj == null)
        {
            obj = wearableservice.b();
        } else
        {
            ani ani1 = dbf.a(((String) (obj)), null);
            obj = ani1;
            if (!wearableservice.a(ani1))
            {
                obj = wearableservice.b();
            }
        }
        if (obj != null)
        {
            break; /* Loop/switch isn't completed */
        }
        wearableservice.a(new ArrayList(0));
        ebw.f("HangoutsWearableService", "No valid account");
        if (ebw.a("HangoutsWearableService", 2))
        {
            long l1 = System.currentTimeMillis();
            ebw.b("HangoutsWearableService", (new StringBuilder(79)).append("WearableService.sendConversations empty account list sent: ").append(l1 - l10).toString());
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        Object obj1;
        HashMap hashmap;
        String s;
        ehm ehm1;
        obj1 = EsProvider.a(EsProvider.f, ((ani) (obj)).h()).buildUpon().appendQueryParameter("limit", "20").build();
        hashmap = new HashMap();
        s = String.format("/hangouts/%s/conversations/", new Object[] {
            ((ani) (obj)).b().a
        });
        ehm1 = wearableservice.a(s);
        if (ebw.a("HangoutsWearableService", 2))
        {
            long l2 = System.currentTimeMillis();
            ebw.b("HangoutsWearableService", (new StringBuilder(83)).append("WearableService.sendConversations old conversations retrieved: ").append(l2 - l10).toString());
        }
        obj1 = wearableservice.c.query(((Uri) (obj1)), biu.a, String.format(Locale.US, "(%s >= 0 OR %s IS NULL) AND %s = %d AND %s > 0 AND %s = %d", new Object[] {
            "is_pending_leave", "is_pending_leave", "view", Integer.valueOf(1), "sort_timestamp", "status", Integer.valueOf(2)
        }), null, "call_media_type DESC, sort_timestamp DESC");
_L9:
        if (!((Cursor) (obj1)).moveToNext()) goto _L6; else goto _L5
_L5:
        Object obj4 = EsProvider.b(((Cursor) (obj1)).getString(1), (int)ConversationListFragment.a(((Cursor) (obj1))));
        long l3 = 0L;
        Object obj2 = (ftc)ehm1.a.remove(obj4);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_1158;
        }
        ehq ehq1 = new ehq(((ftc) (obj2)));
        obj2 = ehq1.b();
        l3 = ehq1.c();
_L13:
        Object obj3;
        String s1;
        obj3 = String.valueOf(s);
        s1 = String.valueOf(obj4);
        if (s1.length() == 0) goto _L8; else goto _L7
_L7:
        obj3 = ((String) (obj3)).concat(s1);
_L10:
        obj3 = ftj.a(((String) (obj3)));
        obj4 = wearableservice.g.a(((Cursor) (obj1)), ((ani) (obj)), ((String) (obj4)), ((ftj) (obj3)).a(), ((ftj) (obj3)).b(), l3, hashmap);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_481;
        }
        wearableservice.a(((ehq) (obj4)), ((Asset) (obj2)));
        wearableservice.d.a(wearableservice.b, ((ftj) (obj3)).c()).a();
          goto _L9
        wearableservice;
_L12:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw wearableservice;
_L8:
        obj3 = new String(((String) (obj3)));
          goto _L10
_L6:
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        if (ebw.a("HangoutsWearableService", 2))
        {
            long l4 = System.currentTimeMillis();
            ebw.b("HangoutsWearableService", (new StringBuilder(78)).append("WearableService.sendConversations new conversations sent: ").append(l4 - l10).toString());
        }
        obj2 = dbf.A();
        ArrayList arraylist = new ArrayList();
        int j1 = obj2.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            int k1 = obj2[i1];
            ehp ehp1 = new ehp();
            String s2;
            String s3;
            if (((ani) (obj)).h() == k1)
            {
                ehp1.a(true);
                obj1 = obj;
            } else
            {
                obj1 = dbf.e(k1);
                ehp1.a(false);
            }
            if (!wearableservice.a(((ani) (obj1))))
            {
                continue;
            }
            s2 = ((ani) (obj1)).b().a;
            ehp1.e(s2);
            ehp1.a(((ani) (obj1)).a());
            ehp1.b(((ani) (obj1)).c());
            s3 = ((ani) (obj1)).O();
            if (!TextUtils.isEmpty(s3))
            {
                ehp1.c(ebz.p(s3));
            }
            s3 = ((ani) (obj1)).C();
            if (!TextUtils.isEmpty(s3))
            {
                ehp1.d(ebz.p(s3));
            }
            ehp1.b(((ani) (obj1)).p());
            arraylist.add(ehp1.a());
            hashmap.put(s2, ((ani) (obj1)).x());
            ehm1.b.remove(s2);
            ehm1.c.remove(s2);
            i1++;
        }
        wearableservice.a(arraylist);
        if (ebw.a("HangoutsWearableService", 2))
        {
            long l5 = System.currentTimeMillis();
            ebw.b("HangoutsWearableService", (new StringBuilder(69)).append("WearableService.sendConversations accounts sent: ").append(l5 - l10).toString());
        }
        wearableservice.a(((ani) (obj)), ((Map) (hashmap)), ehm1.c);
        if (ebw.a("HangoutsWearableService", 2))
        {
            long l6 = System.currentTimeMillis();
            ebw.b("HangoutsWearableService", String.format("WearableService.sendConversations profile pictures sent %d (not used: %d): %d", new Object[] {
                Integer.valueOf(hashmap.size()), Integer.valueOf(ehm1.c.size()), Long.valueOf(l6 - l10)
            }));
        }
        wearableservice.a(s, ehm1.a);
        if (ebw.a("HangoutsWearableService", 2))
        {
            long l7 = System.currentTimeMillis();
            ebw.b("HangoutsWearableService", (new StringBuilder(77)).append("WearableService.sendConversations cleanup conversations: ").append(l7 - l10).toString());
        }
        wearableservice.a(ehm1.b);
        if (hashmap.size() + ehm1.c.size() > 50)
        {
            wearableservice.b(ehm1.c);
            if (ebw.a("HangoutsWearableService", 2))
            {
                long l8 = System.currentTimeMillis();
                ebw.b("HangoutsWearableService", String.format("WearableService.sendConversations cleanup profile pictures (%d deleted): %d", new Object[] {
                    Integer.valueOf(ehm1.c.size()), Long.valueOf(l8 - l10)
                }));
            }
        }
        if (!ebw.a("HangoutsWearableService", 2)) goto _L4; else goto _L11
_L11:
        long l9 = System.currentTimeMillis();
        ebw.b("HangoutsWearableService", (new StringBuilder(60)).append("WearableService.sendConversations done: ").append(l9 - l10).toString());
        return;
        wearableservice;
        obj1 = null;
          goto _L12
        obj2 = null;
          goto _L13
    }

    public static void a(WearableService wearableservice, int i1)
    {
        wearableservice.a(i1);
    }

    public static void a(WearableService wearableservice, String s)
    {
        wearableservice.b(s);
    }

    public static void a(WearableService wearableservice, String s, String s1, int i1)
    {
        long l1 = System.currentTimeMillis();
        wearableservice.b.a(TimeUnit.MILLISECONDS);
        if (!wearableservice.b.e())
        {
            Log.e("HangoutsWearableService", "GoogleApiClient failed to connect");
        } else
        {
            ani ani1 = dbf.a(wearableservice.a(), null);
            HashMap hashmap = new HashMap();
            ArrayList arraylist = wearableservice.g.a(ani1.h(), s1, i1, hashmap);
            ftc ftc1 = new ftc();
            ftc1.a("7", s1);
            ftc1.a("16", arraylist);
            wearableservice.e.a(wearableservice.b, s, "/hangouts/rpc/more_messages/", ftc1.a()).a();
            wearableservice.a(ani1, ((Map) (hashmap)), null);
            if (ebw.a("HangoutsWearableService", 2))
            {
                long l2 = System.currentTimeMillis();
                ebw.b("HangoutsWearableService", (new StringBuilder(54)).append("WearableService.sendMoreMessages: ").append(l2 - l1).toString());
                return;
            }
        }
    }

    private void a(String s, Map map)
    {
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) 
        {
            String s1 = (String)iterator.next();
            android.net.Uri.Builder builder = (new android.net.Uri.Builder()).scheme("wear");
            map = String.valueOf(s);
            s1 = String.valueOf(s1);
            if (s1.length() != 0)
            {
                map = map.concat(s1);
            } else
            {
                map = new String(map);
            }
            map = builder.path(map).build();
            d.b(b, map).a();
        }
    }

    private void a(ArrayList arraylist)
    {
        ftj ftj1 = ftj.a("/hangouts/accounts/");
        ftj1.b().a("2", arraylist);
        d.a(b, ftj1.c()).a();
    }

    private void a(Map map)
    {
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();)
        {
            Iterator iterator1 = ((List)map.get((String)iterator.next())).iterator();
            while (iterator1.hasNext()) 
            {
                Uri uri = (Uri)iterator1.next();
                d.b(b, uri).a();
            }
        }

    }

    private boolean a(ani ani1)
    {
        return ani1 != null && ani1.f() && m.d(ani1.h());
    }

    private ani b()
    {
        int ai[] = dbf.A();
        int j1 = ai.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            ani ani1 = dbf.e(ai[i1]);
            if (a(ani1))
            {
                b(ani1.a());
                return ani1;
            }
        }

        return null;
    }

    public static void b(WearableService wearableservice)
    {
        wearableservice.b.a(TimeUnit.MILLISECONDS);
        if (!wearableservice.b.e())
        {
            Log.e("HangoutsWearableService", "GoogleApiClient failed to connect");
        } else
        {
            wearableservice = ((fsq)wearableservice.f.a(wearableservice.b, "data").a()).B_();
            if (!wearableservice.e() && wearableservice.f() != 4006)
            {
                wearableservice = String.valueOf(wearableservice);
                ebw.g("HangoutsWearableService", (new StringBuilder(String.valueOf(wearableservice).length() + 38)).append("WearableService.addCapability failed: ").append(wearableservice).toString());
                return;
            }
            if (ebw.a("HangoutsWearableService", 2))
            {
                wearableservice = String.valueOf(wearableservice);
                ebw.b("HangoutsWearableService", (new StringBuilder(String.valueOf(wearableservice).length() + 31)).append("WearableService.addCapability: ").append(wearableservice).toString());
                return;
            }
        }
    }

    private void b(String s)
    {
        if (ebw.a("HangoutsWearableService", 2))
        {
            Object obj = String.valueOf(s);
            if (((String) (obj)).length() != 0)
            {
                obj = "WearableService.saveWearableInformation account: ".concat(((String) (obj)));
            } else
            {
                obj = new String("WearableService.saveWearableInformation account: ");
            }
            ebw.b("HangoutsWearableService", ((String) (obj)));
        }
        obj = h.edit();
        ((android.content.SharedPreferences.Editor) (obj)).putString("wearable-account-", s);
        ((android.content.SharedPreferences.Editor) (obj)).apply();
    }

    private void b(Map map)
    {
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); d.b(b, (Uri)map.get(s)).a())
        {
            s = (String)iterator.next();
        }

    }

    private int c(fsz fsz1)
    {
        if (fsz1 == null)
        {
            return 0;
        } else
        {
            return a(fsz1).d("4");
        }
    }

    private static MessageDigest c()
    {
        MessageDigest messagedigest;
        try
        {
            messagedigest = MessageDigest.getInstance("SHA1");
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            throw new IllegalStateException("proper crypto support not installed", nosuchalgorithmexception);
        }
        return messagedigest;
    }

    ftc a(fsz fsz1)
    {
        return ftd.a(fsz1).b();
    }

    public String a(byte abyte0[])
    {
        return new String(Base64.encode(c().digest(abyte0), 11), Charset.defaultCharset());
    }

    public void a(Uri uri, Bitmap bitmap)
    {
        ftb ftb1;
        b.a(TimeUnit.MILLISECONDS);
        if (!b.e())
        {
            Log.e("HangoutsWearableService", "GoogleApiClient failed to connect");
            return;
        }
        ftb1 = (ftb)d.a(b, uri).a();
        if (!ftb1.B_().e() || ftb1.a() <= 0) goto _L2; else goto _L1
_L1:
        ftj ftj1;
        ehq ehq1;
        ftj1 = b((fsz)ftb1.a(0));
        ehq1 = new ehq(ftj1.b());
        bitmap = g.a(bitmap);
        if (ehq1.b() != null) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L9:
        if (!flag) goto _L6; else goto _L5
_L5:
        ehq1.a(bitmap);
        if (ebw.a("HangoutsWearableService", 2))
        {
            ebw.b("HangoutsWearableService", String.format("WearableService.uploadAvatar avatar loaded: %s, size: %d", new Object[] {
                uri.getLastPathSegment(), Integer.valueOf(bitmap.a().length)
            }));
        }
        d.a(b, ftj1.c()).a();
_L2:
        ftb1.b();
        return;
_L4:
        if (!a(bitmap.a()).equals(ehq1.b().b()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (!ebw.a("HangoutsWearableService", 2)) goto _L2; else goto _L7
_L7:
        ebw.b("HangoutsWearableService", "WearableService.uploadAvatar avatar: skipped, same avatar");
          goto _L2
        uri;
        ftb1.b();
        throw uri;
        if (true) goto _L9; else goto _L8
_L8:
    }

    void a(ehq ehq1, Asset asset)
    {
        ehq1.a(asset);
    }

    public void a(fsy fsy1)
    {
        fsy1 = fsy1.iterator();
        do
        {
            if (!fsy1.hasNext())
            {
                break;
            }
            fsz fsz1 = ((fsx)fsy1.next()).a();
            if ("/hangouts/api_level/".equals(fsz1.a().getPath()))
            {
                a(c(fsz1));
            }
        } while (true);
    }

    public void a(fth fth1)
    {
        int i1 = -1;
        String s2 = fth1.a();
        if (ebw.a("HangoutsWearableService", 2))
        {
            Object obj = String.valueOf(s2);
            if (((String) (obj)).length() != 0)
            {
                obj = "WearableService.onMessageReceived: ".concat(((String) (obj)));
            } else
            {
                obj = new String("WearableService.onMessageReceived: ");
            }
            ebw.b("HangoutsWearableService", ((String) (obj)));
        }
        if ("/hangouts/rpc/send_message/".equals(s2))
        {
            fth1 = ftc.a(fth1.b());
            obj = dbf.a(a(), null);
            i.a(((ani) (obj)), fth1.f("7"), fth1.f("android.intent.extra.TEXT"), null, 0, null, 0, 0, null, null, fth1.b("17"), null, 0);
            return;
        }
        if ("/hangouts/rpc/switch_account/".equals(s2))
        {
            fth1 = ftc.a(fth1.b()).f("1");
            n.post(new ehi(this, fth1));
            return;
        }
        if ("/hangouts/rpc/update_watermark/".equals(s2))
        {
            fth1 = ftc.a(fth1.b());
            RealTimeChatService.b(dbf.a(a(), null), fth1.f("7"), fth1.e("26"));
            return;
        }
        if ("/hangouts/rpc/open_home/".equals(s2))
        {
            fth1 = BabelGatewayActivity.d(dbf.a(a(), null).h());
            fth1.addFlags(0x10000000);
            startActivity(fth1);
            return;
        }
        if ("/hangouts/rpc/open_conversation/".equals(s2))
        {
            fth1 = ftc.a(fth1.b()).f("7");
            fth1 = BabelGatewayActivity.a(dbf.a(a(), null).h(), fth1, null);
            fth1.addFlags(0x10000000);
            startActivity(fth1);
            return;
        }
        if ("/hangouts/rpc/resend_message/".equals(s2))
        {
            fth1 = ftc.a(fth1.b());
            String s = fth1.f("7");
            long l1 = fth1.e("12");
            RealTimeChatService.a(dbf.a(a(), null), new Long[] {
                Long.valueOf(l1)
            }, s);
            return;
        }
        if ("/hangouts/rpc/delete_message/".equals(s2))
        {
            long l2 = ftc.a(fth1.b()).e("12");
            RealTimeChatService.a(dbf.a(a(), null), new long[] {
                l2
            });
            return;
        }
        if ("/hangouts/rpc/request_more_messages/".equals(s2))
        {
            String s1 = fth1.c();
            fth1 = ftc.a(fth1.b());
            s2 = fth1.f("7");
            i1 = fth1.c("19");
            n.post(new ehj(this, s1, s2, i1));
            fth1 = dbf.a(a(), null);
            if (fth1 != null)
            {
                i1 = fth1.h();
            } else
            {
                i1 = -1;
            }
            l.a(i1).a(2238).d();
            return;
        }
        if ("/hangouts/rpc/log_impression/".equals(s2))
        {
            fth1 = ftc.a(fth1.b());
            int k1 = fth1.c("13");
            Object obj1 = dbf.a(a(), null);
            if (obj1 != null)
            {
                i1 = ((ani) (obj1)).h();
            }
            obj1 = l.a(i1);
            switch (k1)
            {
            default:
                return;

            case 2230: 
            case 2231: 
                ((gal) (obj1)).a(k1).d();
                return;

            case 2232: 
                String s3 = fth1.f("20");
                int j1 = (int)fth1.e("29");
                ((gal) (obj1)).a(k1).a(s3).a(Integer.valueOf(j1)).d();
                return;

            case 2233: 
                fth1 = fth1.f("20");
                break;
            }
            ((gal) (obj1)).a(k1).a(fth1).d();
            return;
        } else
        {
            n.post(new ehk(this));
            return;
        }
    }

    ftj b(fsz fsz1)
    {
        fsz1 = ftd.a(fsz1);
        return new ftj(PutDataRequest.a(fsz1.a()), fsz1.b());
    }

    public void onCreate()
    {
        super.onCreate();
        c = getContentResolver();
        h = getSharedPreferences("wearablePrefs", 0);
        d = ftl.a;
        e = ftl.c;
        f = ftl.b;
        b = (new ejy(this)).a(ftl.l).a(q).a();
        g = new egx(this, p);
        i = (dkt)hgx.a(getApplicationContext(), dkt);
        j = new ehl();
        k = new ehn(this);
        l = (gap)hgx.a(getApplicationContext(), gap);
        m = (gms)hgx.a(getApplicationContext(), gms);
        r = new HandlerThread("Hangouts: wearable sync");
        r.start();
        n = new Handler(r.getLooper());
    }

    public void onDestroy()
    {
        super.onDestroy();
        b.d();
        r.quit();
    }

    public int onStartCommand(Intent intent, int i1, int j1)
    {
        if (intent == null) goto _L2; else goto _L1
_L1:
        String s = intent.getAction();
        s.hashCode();
        JVM INSTR lookupswitch 3: default 48
    //                   798292259: 94
    //                   1232336056: 78
    //                   1737074039: 110;
           goto _L3 _L4 _L5 _L6
_L3:
        i1 = -1;
_L10:
        i1;
        JVM INSTR tableswitch 0 2: default 76
    //                   0 126
    //                   1 174
    //                   2 174;
           goto _L2 _L7 _L8 _L8
_L2:
        return 2;
_L5:
        if (!s.equals("com.google.android.apps.hangouts.intent.action.ACTION_NOTIFY_DATASET_CHANGED")) goto _L3; else goto _L9
_L9:
        i1 = 0;
          goto _L10
_L4:
        if (!s.equals("android.intent.action.BOOT_COMPLETED")) goto _L3; else goto _L11
_L11:
        i1 = 1;
          goto _L10
_L6:
        if (!s.equals("android.intent.action.MY_PACKAGE_REPLACED")) goto _L3; else goto _L12
_L12:
        i1 = 2;
          goto _L10
_L7:
        if ((intent = dbf.e(intent.getIntExtra("account_id", -1))) == null || intent.a().equals(a()))
        {
            n.post(new ehe(this));
            return 2;
        }
          goto _L2
_L8:
        n.post(new ehf(this));
        return 2;
          goto _L10
    }

}
