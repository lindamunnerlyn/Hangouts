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
import aoa;
import aqs;
import bjg;
import cgd;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;
import com.google.android.apps.hangouts.phone.BabelGatewayActivity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import dcn;
import dml;
import eev;
import eey;
import ejz;
import eka;
import ekc;
import eke;
import ekg;
import ekh;
import ekj;
import ekk;
import ekl;
import ekm;
import ekn;
import eko;
import ekq;
import ekr;
import emy;
import emz;
import enb;
import ene;
import fuw;
import fuz;
import fvd;
import fve;
import fvf;
import fvh;
import fvi;
import fvj;
import fvk;
import fvn;
import fvp;
import fvr;
import fvv;
import g;
import gcz;
import gda;
import gdd;
import gqz;
import hlp;
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

public class WearableService extends fvv
{

    public static final Uri a = (new android.net.Uri.Builder()).scheme("wear").path("/hangouts/api_level/").build();
    public emy b;
    ContentResolver c;
    public fuz d;
    fvk e;
    fuw f;
    ejz g;
    SharedPreferences h;
    dml i;
    ekm j;
    eko k;
    gdd l;
    gqz m;
    public Handler n;
    aqs o;
    eka p;
    enb q;
    private HandlerThread v;

    public WearableService()
    {
        o = new ekc(this);
        p = new eke(this);
        q = new ekh(this);
    }

    public static int a(WearableService wearableservice, fvf fvf1)
    {
        return wearableservice.c(fvf1);
    }

    private ekn a(String s)
    {
        fvh fvh1;
        ekn ekn1;
        ekn1 = new ekn();
        fvh1 = (fvh)d.a(b).a();
        Iterator iterator;
        if (!fvh1.D_().b())
        {
            break MISSING_BLOCK_LABEL_256;
        }
        iterator = fvh1.iterator();
_L3:
        Object obj;
        fvf fvf1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_256;
        }
        fvf1 = (fvf)iterator.next();
        obj = fvf1.a().getPath();
        if (!((String) (obj)).startsWith(s)) goto _L2; else goto _L1
_L1:
        obj = fvf1.a().getLastPathSegment();
        ekn1.a.put(obj, a(fvf1));
          goto _L3
        s;
        fvh1.b();
        throw s;
_L2:
        if (!((String) (obj)).startsWith("/hangouts/profiles/")) goto _L5; else goto _L4
_L4:
        obj = fvf1.a();
        ekn1.c.put(((Uri) (obj)).getLastPathSegment(), obj);
          goto _L3
_L5:
        if (!((String) (obj)).contains("/conversations/")) goto _L3; else goto _L6
_L6:
        List list;
        String s1;
        s1 = (String)fvf1.a().getPathSegments().get(1);
        list = (List)ekn1.b.get(s1);
        obj = list;
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_239;
        }
        obj = new ArrayList();
        ekn1.b.put(s1, obj);
        ((List) (obj)).add(fvf1.a());
          goto _L3
        fvh1.b();
        return ekn1;
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
        eev.c("HangoutsWearableService", (new StringBuilder(39)).append("Wearable API level saved as ").append(i1).toString());
    }

    private void a(aoa aoa1, Map map, Map map1)
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
            k.a(aoa1, s, s1, o);
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
            aoa aoa1 = dcn.a(((String) (obj)), null);
            obj = aoa1;
            if (!wearableservice.a(aoa1))
            {
                obj = wearableservice.b();
            }
        }
        if (obj != null)
        {
            break; /* Loop/switch isn't completed */
        }
        wearableservice.a(new ArrayList(0));
        eev.f("HangoutsWearableService", "No valid account");
        if (eev.a("HangoutsWearableService", 2))
        {
            long l1 = System.currentTimeMillis();
            eev.b("HangoutsWearableService", (new StringBuilder(79)).append("WearableService.sendConversations empty account list sent: ").append(l1 - l10).toString());
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        Object obj1;
        HashMap hashmap;
        String s;
        ekn ekn1;
        obj1 = EsProvider.a(EsProvider.f, ((aoa) (obj)).h()).buildUpon().appendQueryParameter("limit", "20").build();
        hashmap = new HashMap();
        s = String.format("/hangouts/%s/conversations/", new Object[] {
            ((aoa) (obj)).b().a
        });
        ekn1 = wearableservice.a(s);
        if (eev.a("HangoutsWearableService", 2))
        {
            long l2 = System.currentTimeMillis();
            eev.b("HangoutsWearableService", (new StringBuilder(83)).append("WearableService.sendConversations old conversations retrieved: ").append(l2 - l10).toString());
        }
        obj1 = wearableservice.c.query(((Uri) (obj1)), bjg.a, String.format(Locale.US, "(%s >= 0 OR %s IS NULL) AND %s = %d AND %s > 0 AND %s = %d", new Object[] {
            "is_pending_leave", "is_pending_leave", "view", Integer.valueOf(1), "sort_timestamp", "status", Integer.valueOf(2)
        }), null, "call_media_type DESC, sort_timestamp DESC");
_L9:
        if (!((Cursor) (obj1)).moveToNext()) goto _L6; else goto _L5
_L5:
        Object obj4 = EsProvider.b(((Cursor) (obj1)).getString(1), (int)ConversationListFragment.a(((Cursor) (obj1))));
        long l3 = 0L;
        Object obj2 = (fvi)ekn1.a.remove(obj4);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_1158;
        }
        ekr ekr1 = new ekr(((fvi) (obj2)));
        obj2 = ekr1.b();
        l3 = ekr1.c();
_L13:
        Object obj3;
        String s1;
        obj3 = String.valueOf(s);
        s1 = String.valueOf(obj4);
        if (s1.length() == 0) goto _L8; else goto _L7
_L7:
        obj3 = ((String) (obj3)).concat(s1);
_L10:
        obj3 = fvp.a(((String) (obj3)));
        obj4 = wearableservice.g.a(((Cursor) (obj1)), ((aoa) (obj)), ((String) (obj4)), ((fvp) (obj3)).a(), ((fvp) (obj3)).b(), l3, hashmap);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_481;
        }
        wearableservice.a(((ekr) (obj4)), ((Asset) (obj2)));
        wearableservice.d.a(wearableservice.b, ((fvp) (obj3)).c()).a();
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
        if (eev.a("HangoutsWearableService", 2))
        {
            long l4 = System.currentTimeMillis();
            eev.b("HangoutsWearableService", (new StringBuilder(78)).append("WearableService.sendConversations new conversations sent: ").append(l4 - l10).toString());
        }
        obj2 = dcn.A();
        ArrayList arraylist = new ArrayList();
        int j1 = obj2.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            int k1 = obj2[i1];
            ekq ekq1 = new ekq();
            String s2;
            String s3;
            if (((aoa) (obj)).h() == k1)
            {
                ekq1.a(true);
                obj1 = obj;
            } else
            {
                obj1 = dcn.e(k1);
                ekq1.a(false);
            }
            if (!wearableservice.a(((aoa) (obj1))))
            {
                continue;
            }
            s2 = ((aoa) (obj1)).b().a;
            ekq1.e(s2);
            ekq1.a(((aoa) (obj1)).a());
            ekq1.b(((aoa) (obj1)).c());
            s3 = ((aoa) (obj1)).L();
            if (!TextUtils.isEmpty(s3))
            {
                ekq1.c(eey.p(s3));
            }
            s3 = ((aoa) (obj1)).A();
            if (!TextUtils.isEmpty(s3))
            {
                ekq1.d(eey.p(s3));
            }
            ekq1.b(((aoa) (obj1)).n());
            arraylist.add(ekq1.a());
            hashmap.put(s2, ((aoa) (obj1)).v());
            ekn1.b.remove(s2);
            ekn1.c.remove(s2);
            i1++;
        }
        wearableservice.a(arraylist);
        if (eev.a("HangoutsWearableService", 2))
        {
            long l5 = System.currentTimeMillis();
            eev.b("HangoutsWearableService", (new StringBuilder(69)).append("WearableService.sendConversations accounts sent: ").append(l5 - l10).toString());
        }
        wearableservice.a(((aoa) (obj)), ((Map) (hashmap)), ekn1.c);
        if (eev.a("HangoutsWearableService", 2))
        {
            long l6 = System.currentTimeMillis();
            eev.b("HangoutsWearableService", String.format("WearableService.sendConversations profile pictures sent %d (not used: %d): %d", new Object[] {
                Integer.valueOf(hashmap.size()), Integer.valueOf(ekn1.c.size()), Long.valueOf(l6 - l10)
            }));
        }
        wearableservice.a(s, ekn1.a);
        if (eev.a("HangoutsWearableService", 2))
        {
            long l7 = System.currentTimeMillis();
            eev.b("HangoutsWearableService", (new StringBuilder(77)).append("WearableService.sendConversations cleanup conversations: ").append(l7 - l10).toString());
        }
        wearableservice.a(ekn1.b);
        if (hashmap.size() + ekn1.c.size() > 50)
        {
            wearableservice.b(ekn1.c);
            if (eev.a("HangoutsWearableService", 2))
            {
                long l8 = System.currentTimeMillis();
                eev.b("HangoutsWearableService", String.format("WearableService.sendConversations cleanup profile pictures (%d deleted): %d", new Object[] {
                    Integer.valueOf(ekn1.c.size()), Long.valueOf(l8 - l10)
                }));
            }
        }
        if (!eev.a("HangoutsWearableService", 2)) goto _L4; else goto _L11
_L11:
        long l9 = System.currentTimeMillis();
        eev.b("HangoutsWearableService", (new StringBuilder(60)).append("WearableService.sendConversations done: ").append(l9 - l10).toString());
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
            aoa aoa1 = dcn.a(wearableservice.a(), null);
            HashMap hashmap = new HashMap();
            ArrayList arraylist = wearableservice.g.a(aoa1.h(), s1, i1, hashmap);
            fvi fvi1 = new fvi();
            fvi1.a("7", s1);
            fvi1.a("16", arraylist);
            wearableservice.e.a(wearableservice.b, s, "/hangouts/rpc/more_messages/", fvi1.a()).a();
            wearableservice.a(aoa1, ((Map) (hashmap)), null);
            if (eev.a("HangoutsWearableService", 2))
            {
                long l2 = System.currentTimeMillis();
                eev.b("HangoutsWearableService", (new StringBuilder(54)).append("WearableService.sendMoreMessages: ").append(l2 - l1).toString());
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
        fvp fvp1 = fvp.a("/hangouts/accounts/");
        fvp1.b().a("2", arraylist);
        d.a(b, fvp1.c()).a();
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

    private boolean a(aoa aoa1)
    {
        return aoa1 != null && aoa1.f() && m.d(aoa1.h());
    }

    private aoa b()
    {
        int ai[] = dcn.A();
        int j1 = ai.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            aoa aoa1 = dcn.e(ai[i1]);
            if (a(aoa1))
            {
                b(aoa1.a());
                return aoa1;
            }
        }

        return null;
    }

    private void b(String s)
    {
        if (eev.a("HangoutsWearableService", 2))
        {
            Object obj = String.valueOf(s);
            if (((String) (obj)).length() != 0)
            {
                obj = "WearableService.saveWearableInformation account: ".concat(((String) (obj)));
            } else
            {
                obj = new String("WearableService.saveWearableInformation account: ");
            }
            eev.b("HangoutsWearableService", ((String) (obj)));
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

    private int c(fvf fvf1)
    {
        if (fvf1 == null)
        {
            return 0;
        } else
        {
            return a(fvf1).d("4");
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

    fvi a(fvf fvf1)
    {
        return fvj.a(fvf1).b();
    }

    public String a(byte abyte0[])
    {
        return new String(Base64.encode(c().digest(abyte0), 11), Charset.defaultCharset());
    }

    public void a(Uri uri, Bitmap bitmap)
    {
        fvh fvh1;
        b.a(TimeUnit.MILLISECONDS);
        if (!b.e())
        {
            Log.e("HangoutsWearableService", "GoogleApiClient failed to connect");
            return;
        }
        fvh1 = (fvh)d.a(b, uri).a();
        if (!fvh1.D_().b() || fvh1.a() <= 0) goto _L2; else goto _L1
_L1:
        fvp fvp1;
        ekr ekr1;
        fvp1 = b((fvf)fvh1.a(0));
        ekr1 = new ekr(fvp1.b());
        bitmap = g.a(bitmap);
        if (ekr1.b() != null) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L9:
        if (!flag) goto _L6; else goto _L5
_L5:
        ekr1.a(bitmap);
        if (eev.a("HangoutsWearableService", 2))
        {
            eev.b("HangoutsWearableService", String.format("WearableService.uploadAvatar avatar loaded: %s, size: %d", new Object[] {
                uri.getLastPathSegment(), Integer.valueOf(bitmap.a().length)
            }));
        }
        d.a(b, fvp1.c()).a();
_L2:
        fvh1.b();
        return;
_L4:
        if (!a(bitmap.a()).equals(ekr1.b().b()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (!eev.a("HangoutsWearableService", 2)) goto _L2; else goto _L7
_L7:
        eev.b("HangoutsWearableService", "WearableService.uploadAvatar avatar: skipped, same avatar");
          goto _L2
        uri;
        fvh1.b();
        throw uri;
        if (true) goto _L9; else goto _L8
_L8:
    }

    void a(ekr ekr1, Asset asset)
    {
        ekr1.a(asset);
    }

    public void a(fve fve1)
    {
        fve1 = fve1.iterator();
        do
        {
            if (!fve1.hasNext())
            {
                break;
            }
            fvf fvf1 = ((fvd)fve1.next()).a();
            if ("/hangouts/api_level/".equals(fvf1.a().getPath()))
            {
                a(c(fvf1));
            }
        } while (true);
    }

    public void a(fvn fvn1)
    {
        int i1 = -1;
        String s2 = fvn1.a();
        if (eev.a("HangoutsWearableService", 2))
        {
            Object obj = String.valueOf(s2);
            if (((String) (obj)).length() != 0)
            {
                obj = "WearableService.onMessageReceived: ".concat(((String) (obj)));
            } else
            {
                obj = new String("WearableService.onMessageReceived: ");
            }
            eev.b("HangoutsWearableService", ((String) (obj)));
        }
        if ("/hangouts/rpc/send_message/".equals(s2))
        {
            fvn1 = fvi.a(fvn1.b());
            obj = dcn.a(a(), null);
            i.a(((aoa) (obj)), fvn1.f("7"), fvn1.f("android.intent.extra.TEXT"), null, 0, null, 0, 0, null, null, fvn1.b("17"), null, 0);
            return;
        }
        if ("/hangouts/rpc/switch_account/".equals(s2))
        {
            fvn1 = fvi.a(fvn1.b()).f("1");
            n.post(new ekj(this, fvn1));
            return;
        }
        if ("/hangouts/rpc/update_watermark/".equals(s2))
        {
            fvn1 = fvi.a(fvn1.b());
            RealTimeChatService.b(dcn.a(a(), null), fvn1.f("7"), fvn1.e("26"));
            return;
        }
        if ("/hangouts/rpc/open_home/".equals(s2))
        {
            fvn1 = BabelGatewayActivity.d(dcn.a(a(), null).h());
            fvn1.addFlags(0x10000000);
            startActivity(fvn1);
            return;
        }
        if ("/hangouts/rpc/open_conversation/".equals(s2))
        {
            fvn1 = fvi.a(fvn1.b()).f("7");
            fvn1 = BabelGatewayActivity.a(dcn.a(a(), null).h(), fvn1, null);
            fvn1.addFlags(0x10000000);
            startActivity(fvn1);
            return;
        }
        if ("/hangouts/rpc/resend_message/".equals(s2))
        {
            fvn1 = fvi.a(fvn1.b());
            String s = fvn1.f("7");
            long l1 = fvn1.e("12");
            RealTimeChatService.a(dcn.a(a(), null), new Long[] {
                Long.valueOf(l1)
            }, s);
            return;
        }
        if ("/hangouts/rpc/delete_message/".equals(s2))
        {
            long l2 = fvi.a(fvn1.b()).e("12");
            RealTimeChatService.a(dcn.a(a(), null), new long[] {
                l2
            });
            return;
        }
        if ("/hangouts/rpc/request_more_messages/".equals(s2))
        {
            String s1 = fvn1.c();
            fvn1 = fvi.a(fvn1.b());
            s2 = fvn1.f("7");
            i1 = fvn1.c("19");
            n.post(new ekk(this, s1, s2, i1));
            fvn1 = dcn.a(a(), null);
            if (fvn1 != null)
            {
                i1 = fvn1.h();
            } else
            {
                i1 = -1;
            }
            l.a(i1).a(2238).d();
            return;
        }
        if ("/hangouts/rpc/log_impression/".equals(s2))
        {
            fvn1 = fvi.a(fvn1.b());
            int k1 = fvn1.c("13");
            Object obj1 = dcn.a(a(), null);
            if (obj1 != null)
            {
                i1 = ((aoa) (obj1)).h();
            }
            obj1 = l.a(i1);
            switch (k1)
            {
            default:
                return;

            case 2230: 
            case 2231: 
                ((gcz) (obj1)).a(k1).d();
                return;

            case 2232: 
                String s3 = fvn1.f("20");
                int j1 = (int)fvn1.e("29");
                ((gcz) (obj1)).a(k1).a(s3).a(Integer.valueOf(j1)).d();
                return;

            case 2233: 
                fvn1 = fvn1.f("20");
                break;
            }
            ((gcz) (obj1)).a(k1).a(fvn1).d();
            return;
        } else
        {
            n.post(new ekl(this));
            return;
        }
    }

    fvp b(fvf fvf1)
    {
        fvf1 = fvj.a(fvf1);
        return new fvp(PutDataRequest.a(fvf1.a()), fvf1.b());
    }

    public void onCreate()
    {
        super.onCreate();
        c = getContentResolver();
        h = getSharedPreferences("wearablePrefs", 0);
        d = fvr.a;
        e = fvr.c;
        f = fvr.b;
        b = (new emz(this)).a(fvr.l).a(q).a();
        g = new ejz(this, p);
        i = (dml)hlp.a(getApplicationContext(), dml);
        j = new ekm();
        k = new eko(this);
        l = (gdd)hlp.a(getApplicationContext(), gdd);
        m = (gqz)hlp.a(getApplicationContext(), gqz);
        v = new HandlerThread("Hangouts: wearable sync");
        v.start();
        n = new Handler(v.getLooper());
    }

    public void onDestroy()
    {
        super.onDestroy();
        b.d();
        v.quit();
    }

    public int onStartCommand(Intent intent, int i1, int j1)
    {
        if (intent == null) goto _L2; else goto _L1
_L1:
        String s = intent.getAction();
        s.hashCode();
        JVM INSTR tableswitch 1232336056 1232336056: default 32
    //                   1232336056 54;
           goto _L3 _L4
_L3:
        i1 = -1;
_L7:
        i1;
        JVM INSTR tableswitch 0 0: default 52
    //                   0 70;
           goto _L2 _L5
_L2:
        return 2;
_L4:
        if (!s.equals("com.google.android.apps.hangouts.intent.action.ACTION_NOTIFY_DATASET_CHANGED")) goto _L3; else goto _L6
_L6:
        i1 = 0;
          goto _L7
_L5:
        intent = dcn.e(intent.getIntExtra("account_id", -1));
        if (intent == null || intent.a().equals(a()))
        {
            n.post(new ekg(this));
        }
          goto _L2
    }

}
