// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.os.SystemClock;
import android.telephony.SmsMessage;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.text.util.Rfc822Token;
import android.text.util.Rfc822Tokenizer;
import android.util.Pair;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.phone.ClassZeroActivity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class any
{

    public static final boolean a = false;
    private static final Uri b;
    private static CharSequence c;
    private static final Object d = new Object();
    private static int e = 0;
    private static final HashSet f = new HashSet();

    public static int a(aoe aoe1, dzx dzx1)
    {
        int i;
        i = 0;
        aoe1.a();
        if (dzx1 != null) goto _L2; else goto _L1
_L1:
        i = aoe1.w(null);
_L6:
        aoe1.b();
        aoe1.c();
        if (i > 0)
        {
            aoe1 = aoe1.f();
            if (aoe1 != null)
            {
                a(g.nS, aoe1.h());
            }
        }
        return i;
_L2:
        dzx1 = dzx1.iterator();
_L4:
        int j;
        if (!dzx1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        j = aoe1.w((String)dzx1.next());
        i += j;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
        dzx1;
        aoe1.c();
        throw dzx1;
    }

    public static long a(aoe aoe1, String s, dfb dfb1, long l1, boolean flag)
    {
        long l2;
        if (ebw.a("Babel_db", 3))
        {
            Object obj = String.valueOf(s);
            if (((String) (obj)).length() != 0)
            {
                obj = "updateConversationWatermark conversationId: ".concat(((String) (obj)));
            } else
            {
                obj = new String("updateConversationWatermark conversationId: ");
            }
            ebw.c("Babel_db", ((String) (obj)));
        }
        aoe1.a();
        obj = aoe1.Q(s);
        if (obj == null) goto _L2; else goto _L1
_L1:
        l2 = Math.max(((aok) (obj)).a, aoe1.m(s));
        if (l1 != 0L) goto _L4; else goto _L3
_L3:
        l1 = l2;
_L13:
        if (l1 <= ((aok) (obj)).b) goto _L2; else goto _L5
_L5:
        aoe1.a(s, l1, true, "useraction");
        obj = aoe1.f();
        cej.a(g.nS, ((ani) (obj)).h(), true);
        a(g.nS, ((ani) (obj)).h());
        if (dfb1 == null) goto _L7; else goto _L6
_L6:
        if (aoe.a(s)) goto _L7; else goto _L8
_L8:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        dfb1.a(new cvk(s, l1));
        dfb1.f();
_L11:
        aoe1.b();
        aoe1.c();
        d(aoe1, s);
        return l1;
_L4:
        if (l1 <= l2)
        {
            continue; /* Loop/switch isn't completed */
        }
        ebw.g("Babel_db", (new StringBuilder(72)).append("New watermark: ").append(l1).append("; max watermark: ").append(l2).toString());
        gbh.a("New watermark greater than maximum possible watermark");
        continue; /* Loop/switch isn't completed */
_L7:
        if (!aoe.b(s)) goto _L2; else goto _L9
_L9:
        l2 = aoe1.aa(s);
        if (l2 == -1L) goto _L2; else goto _L10
_L10:
        drk.a(l2, l1 / 1000L);
_L2:
        l1 = -1L;
          goto _L11
        s;
        aoe1.c();
        throw s;
        if (true) goto _L13; else goto _L12
_L12:
    }

    public static String a(aoe aoe1, boolean flag, String s, List list, List list1, List list2, aob aob1, int i, 
            int j, boolean flag1, dfb dfb1, String s1)
    {
        aoe1.a();
        s = b(aoe1, flag, s, list, list1, list2, aob1, i, j, flag1, dfb1, s1);
        aoe1.b();
        aoe1.c();
        return s;
        s;
        aoe1.c();
        throw s;
    }

    public static List a(ani ani1, String s)
    {
        return (new aoe(g.nS, ani1.h())).a(s, ani1.b());
    }

    public static void a()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (e < 0)
        {
            int i = e;
            throw new IllegalStateException((new StringBuilder(47)).append("sPendingChangeNotificationsCount is ").append(i).toString());
        }
        break MISSING_BLOCK_LABEL_50;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        e++;
        obj;
        JVM INSTR monitorexit ;
    }

    public static void a(int i)
    {
        if (a)
        {
            ebw.b("Babel_db", "NOTIFY CONVERSATIONS");
        }
        a(EsProvider.a(EsProvider.f, i));
        a(EsProvider.a(EsProvider.g, i));
        a(EsProvider.a(EsProvider.h, i));
        a(b(i));
    }

    public static void a(int i, acf acf1)
    {
        Object obj;
        Object obj1;
        aoe aoe1;
        String s;
        String s1;
        ani ani1 = dbf.e(i);
        if (ani1 == null)
        {
            ebw.g("Babel_db", "EsConversationsData.processMmsNotification: no account");
            return;
        }
        aoe1 = new aoe(g.nS, ani1.h());
        s = drk.a(acf1.d(), "UTF-8");
        byte abyte0[] = acf1.g();
        s1 = drk.a(abyte0, "UTF-8");
        obj = acf1.c();
        if (obj != null)
        {
            obj = ((acc) (obj)).c();
        } else
        {
            obj = null;
        }
        obj1 = obj;
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj1 = obj;
        if (!((String) (obj)).contains("@")) goto _L2; else goto _L3
_L3:
        if (((String) (obj)).contains("<")) goto _L5; else goto _L4
_L4:
        obj1 = obj;
_L2:
        long l1 = acf1.f();
        long l2 = acf1.e();
        boolean flag = a(g.m(((String) (obj1))));
        Rfc822Token arfc822token[];
        int j;
        if (drk.e() && !flag)
        {
            acf1 = new ContentValues();
            acf1.put("content_location", s);
            acf1.put("transaction_id", s1);
            acf1.put("from_address", ((String) (obj1)));
            acf1.put("message_size", Long.valueOf(l1));
            acf1.put("expiry", Long.valueOf(l2));
            l1 = aoe1.a(acf1);
            RealTimeChatService.a(ani1.h(), s, abyte0, l1, true);
            return;
        } else
        {
            a(aoe1, s, s1, ((String) (obj1)), flag, l1, l2, 0, l.gH);
            return;
        }
_L5:
        arfc822token = Rfc822Tokenizer.tokenize(((CharSequence) (obj)));
        obj1 = obj;
        if (arfc822token.length <= 0) goto _L2; else goto _L6
_L6:
        j = arfc822token.length;
        i = 0;
_L7:
        obj1 = obj;
        if (i < j)
        {
label0:
            {
                obj1 = arfc822token[i];
                if (obj1 == null || TextUtils.isEmpty(((Rfc822Token) (obj1)).getAddress()))
                {
                    break label0;
                }
                obj1 = ((Rfc822Token) (obj1)).getAddress();
            }
        }
          goto _L2
        i++;
          goto _L7
    }

    public static void a(long l1)
    {
        l1 = System.currentTimeMillis() - l1;
        int i = drk.c(l1);
        ebw.e("Babel_db", (new StringBuilder(70)).append("Message purging: deleted ").append(i).append(" old sms/mms messages in telephony").toString());
        if (i > 0)
        {
            Object obj = dbf.l();
            if (obj != null)
            {
                obj = new aoe(g.nS, ((ani) (obj)).h());
                int j = ((aoe) (obj)).l(l1 * 1000L);
                ebw.e("Babel_db", (new StringBuilder(69)).append("Message purging: deleted ").append(j).append(" old sms/mms messages in Hangouts").toString());
                c(((aoe) (obj)));
            }
        }
    }

    public static void a(Context context, int i)
    {
        if (a)
        {
            ebw.b("Babel_db", "broadcastDatasetChanged");
        }
        Intent intent = new Intent("com.google.android.apps.hangouts.intent.action.ACTION_NOTIFY_DATASET_CHANGED");
        if (i != -1)
        {
            intent.putExtra("account_id", i);
        }
        context.sendBroadcast(intent);
    }

    private static void a(Uri uri)
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (e != 0)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        if (!c(uri)) goto _L2; else goto _L1
_L1:
        a(g.nS, Integer.parseInt(uri.getQueryParameter("account_id")));
_L3:
        return;
_L2:
        g.nS.getContentResolver().notifyChange(uri, null);
          goto _L3
        uri;
        obj;
        JVM INSTR monitorexit ;
        throw uri;
        f.add(uri);
          goto _L3
    }

    public static void a(ani ani1)
    {
        if (a)
        {
            ebw.b("Babel_db", "NOTIFY CONVERSATION");
        }
        a(EsProvider.a(EsProvider.g, ani1.h()));
        a(b(ani1.h()));
    }

    public static void a(ani ani1, long l1, boolean flag, int i)
    {
        if (l1 >= 0L) goto _L2; else goto _L1
_L1:
        ebw.g("Babel_db", (new StringBuilder(75)).append("displayMmsDownloadFailure: invalid notification row id ").append(l1).toString());
_L4:
        return;
_L2:
        Object obj;
        ani1 = new aoe(g.nS, ani1.h());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        obj = ani1.e();
        String as[] = aoc.a;
        String s = String.valueOf("_id=");
        obj = ((apd) (obj)).a("mms_notification_inds", as, (new StringBuilder(String.valueOf(s).length() + 20)).append(s).append(l1).toString(), null, null);
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (((Cursor) (obj)).moveToFirst())
        {
            a(((aoe) (ani1)), ((Cursor) (obj)).getString(0), ((Cursor) (obj)).getString(1), ((Cursor) (obj)).getString(2), false, ((Cursor) (obj)).getLong(3), ((Cursor) (obj)).getLong(4), i, l.gH);
            ani1.m(l1);
        }
        ((Cursor) (obj)).close();
        return;
        ani1;
        ((Cursor) (obj)).close();
        throw ani1;
        ContentValues contentvalues = new ContentValues();
        apd apd1;
        String s1;
        int j;
        if (i == 0)
        {
            j = dqb.e.ordinal();
        } else
        {
            j = dqb.d.ordinal();
        }
        contentvalues.put("status", Integer.valueOf(j));
        contentvalues.put("sending_error", Integer.valueOf(i));
        apd1 = ani1.e();
        s1 = String.valueOf("_id=");
        apd1.a("messages", contentvalues, (new StringBuilder(String.valueOf(s1).length() + 20)).append(s1).append(l1).toString(), null);
        b(ani1, l1);
        return;
    }

    public static void a(ani ani1, Intent intent)
    {
        String s;
        SmsMessage asmsmessage[];
        asmsmessage = android.provider.Telephony.Sms.Intents.getMessagesFromIntent(intent);
        s = intent.getStringExtra("format");
        if (asmsmessage == null || asmsmessage.length <= 0)
        {
            ebw.g("Babel_db", "processReceivedSms: null or zero message");
            return;
        }
        int j = asmsmessage.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                break;
            }
            SmsMessage smsmessage = asmsmessage[i];
            try
            {
                smsmessage.getDisplayMessageBody();
            }
            // Misplaced declaration of an exception variable
            catch (ani ani1)
            {
                ebw.g("Babel_db", "processReceivedSms: NPE inside SmsMessage");
                return;
            }
            i++;
        } while (true);
        if (!drk.i()) goto _L2; else goto _L1
_L1:
        Object aobj[];
        long l1;
        l1 = asmsmessage[0].getTimestampMillis();
        aobj = (Object[])intent.getSerializableExtra("pdus");
        Object obj;
        String s2;
        obj = String.valueOf("smsdump-");
        s2 = String.valueOf(Long.toString(l1));
        if (s2.length() == 0) goto _L4; else goto _L3
_L3:
        obj = ((String) (obj)).concat(s2);
_L5:
        obj = new File(Environment.getExternalStorageDirectory(), ((String) (obj)));
        if (((File) (obj)).exists())
        {
            ((File) (obj)).delete();
        }
        obj = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(((File) (obj)))));
        ((ObjectOutputStream) (obj)).writeObject(((Object) (aobj)));
        ((ObjectOutputStream) (obj)).flush();
        try
        {
            ((ObjectOutputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            String s1 = String.valueOf(obj);
            ebw.e("Babel", (new StringBuilder(String.valueOf(s1).length() + 9)).append("dumpSms: ").append(s1).toString(), ((Throwable) (obj)));
        }
_L2:
        Exception exception;
        if (asmsmessage[0].getMessageClass() == android.telephony.SmsMessage.MessageClass.CLASS_0)
        {
            intent = asmsmessage[0];
            obj = g.nS;
            ((Context) (obj)).startActivity((new Intent(((Context) (obj)), com/google/android/apps/hangouts/phone/ClassZeroActivity)).putExtra("pdu", intent.getPdu()).putExtra("format", s).putExtra("account_id", ani1.h()).setFlags(0x18000000));
            return;
        } else
        {
            a(asmsmessage, ani1, intent.getIntExtra("errorCode", 0), ((Boolean) (null)));
            ank.a(g.nS, ani1.h(), "received_sms_count_since_last_upload");
            return;
        }
_L4:
        obj = new String(((String) (obj)));
          goto _L5
        exception;
        ((ObjectOutputStream) (obj)).close();
        throw exception;
          goto _L5
    }

    public static void a(ani ani1, Intent intent, boolean flag)
    {
        a(ani1, (Uri)intent.getParcelableExtra("uri"), intent.getLongExtra("notification_row_id", -1L), ((Boolean) (null)), flag, false);
    }

    private static void a(ani ani1, Uri uri, long l1, Boolean boolean1, boolean flag, boolean flag1)
    {
        if (uri != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        aoe aoe1 = new aoe(g.nS, ani1.h());
        Object obj;
        String s;
        Object obj1;
        Object obj3;
        dqr dqr1;
        List list;
        String s1;
        String s2;
        String s3;
        List list1;
        dqb dqb1;
        String s4;
        String s5;
        int j;
        int k;
        long l3;
        long l4;
        boolean flag2;
        boolean flag3;
        if (l1 > 0L)
        {
            if (flag)
            {
                aoe1.m(l1);
                s = null;
            } else
            {
                s = aoe1.n(l1);
                aoe1.f(l1);
            }
        } else
        {
            s = null;
        }
        dqr1 = drk.e(uri);
        if (dqr1 == null)
        {
            ebw.g("Babel_db", "EsConversationsData.processReceivedMms: failed to load mms");
            return;
        }
        if (dqr1.w.size() <= 0)
        {
            ebw.g("Babel_db", "EsConversationsData.processReceivedMms: MMS message has no part");
            return;
        }
        list = drk.a(dqr1.r);
        if (list == null || list.size() <= 0)
        {
            ebw.g("Babel_db", "EsConversationsData.processReceivedMms: MMS message has no recipient");
            return;
        }
        if (flag1)
        {
            obj = aoe1.f().b();
            obj1 = null;
        } else
        {
            obj = drk.a(list, dqr1.m);
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                cey cey1 = g.m(((String) (obj)));
                obj1 = obj;
                obj = cey1;
            } else
            {
                Object obj2 = null;
                obj1 = obj;
                obj = obj2;
            }
        }
        if (obj == null)
        {
            ani1 = String.valueOf("EsConversationsData.processReceivedMms: MMS has no From: id=");
            l1 = dqr1.m;
            int i = dqr1.n;
            long l2 = dqr1.r;
            ebw.g("Babel_db", (new StringBuilder(String.valueOf(ani1).length() + 68)).append(ani1).append(l1).append(" type=").append(i).append(" thread_id=").append(l2).toString());
            return;
        }
        l3 = dqr1.q;
        flag1 = a(((cey) (obj)));
        if (flag1)
        {
            obj3 = obj;
        } else
        {
            obj3 = null;
        }
        s1 = drk.a(aoe1, ((cey) (obj3)), list);
        if (TextUtils.isEmpty(s1))
        {
            ebw.g("Babel_db", "EsConversationsData.processNewMms: empty conversation id");
            return;
        }
        flag2 = RealTimeChatService.d(ani1, s1);
        obj3 = boolean1;
        if (boolean1 == null)
        {
            obj3 = Boolean.valueOf(flag2);
        }
        drk.a(uri, g.a(((Boolean) (obj3)), false));
        j = dqr1.k();
        flag3 = dqr1.i();
        if (j > 1 || j > 0 && !flag3)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        boolean1 = new dfb();
        s2 = aoe.g();
        s3 = dqr1.e();
        list1 = dqr1.l();
        dqb1 = dqb.e;
        s4 = g.a(new String[] {
            uri.toString()
        });
        k = dqr1.s;
        l4 = dqr1.h();
        s5 = dqr1.o;
        if (j != 0)
        {
            j = 9;
        } else
        if (flag3)
        {
            j = 3;
        } else
        {
            j = 2;
        }
        (new djc(s1, ((cey) (obj)), l3, s2, null, s3, list1, false, dqb1, 0, 3, null, s4, 0L, k, l4, s5, j, null, 0, 0L)).a(1).a(((String) (obj1))).b(drk.a(list, ((String) (obj1)))).a(aoe1, boolean1);
        aoe1.a();
        aoe1.i(s1, l3);
        aoe1.n(s1, dqr1.r);
        if (flag1 || flag2)
        {
            break MISSING_BLOCK_LABEL_610;
        }
        cej.a(g.nS, ani1.h(), false);
        if (!g.a(((Boolean) (obj3)), false)) goto _L4; else goto _L3
_L3:
        aoe1.a(s1, l3, false, "processnewsms");
_L7:
        aoe1.b();
        aoe1.c();
        d(aoe1, s1);
        if (!TextUtils.equals(s1, s) && l1 > 0L && !flag)
        {
            RealTimeChatService.a(s, ani1, new anz(((String) (obj1))));
        }
        b(uri);
        if (obj1 == null) goto _L1; else goto _L5
_L5:
        ank.a(g.nS, ani1.h(), "received_mms_count_since_last_upload");
        return;
_L4:
        if (!flag1) goto _L7; else goto _L6
_L6:
        aoe1.w(s1);
          goto _L7
        ani1;
        aoe1.c();
        throw ani1;
    }

    public static void a(ani ani1, dfb dfb1, String s)
    {
        ani1 = new aoe(g.nS, ani1.h());
        ani1.e(s, 0);
        a(dfb1, ((aoe) (ani1)), s);
    }

    public static void a(ani ani1, String s, int i)
    {
        (new aoe(g.nS, ani1.h())).e(s, i);
    }

    public static void a(ani ani1, String s, String s1)
    {
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        ani1 = new aoe(g.nS, ani1.h());
        ani1.a();
        ani1.b(s, s1);
        ani1.b();
        ani1.c();
        return;
        s;
        ani1.c();
        throw s;
        ebw.g("Babel_db", "revertConversationName: empty name");
        return;
    }

    public static void a(ani ani1, String s, String s1, String s2)
    {
        gbh.b(TextUtils.isEmpty(s1));
        if (g.c(s2) || "hangouts/gv_voicemail".equals(s2))
        {
            RealTimeChatService.r(ani1, s1);
        } else
        if (g.d(s2))
        {
            RealTimeChatService.h(ani1, s, s1);
            return;
        }
    }

    public static void a(aoe aoe1)
    {
        aoe1.v();
        d(aoe1);
    }

    public static void a(aoe aoe1, long l1)
    {
        aoe1.a();
        String s = (String)aoe1.c(l1).first;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        aoe1.f(l1);
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("snippet_type", Integer.valueOf(7));
        contentvalues.putNull("snippet_author_chat_id");
        contentvalues.putNull("snippet_text");
        contentvalues.putNull("snippet_image_url");
        contentvalues.putNull("snippet_message_row_id");
        contentvalues.putNull("snippet_status");
        contentvalues.putNull("previous_latest_timestamp");
        contentvalues.putNull("snippet_new_conversation_name");
        contentvalues.putNull("snippet_participant_keys");
        contentvalues.putNull("snippet_sms_type");
        aoe1.e().a("conversations", contentvalues, "conversation_id=? AND snippet_message_row_id=?", new String[] {
            s, String.valueOf(l1)
        });
        aoe1.b();
        aoe1.c();
        Exception exception;
        if (s != null)
        {
            d(aoe1, s);
            return;
        } else
        {
            d(aoe1);
            return;
        }
        exception;
        aoe1.c();
        throw exception;
    }

    private static void a(aoe aoe1, long l1, dfb dfb1, aos aos1)
    {
        Object obj = f(aoe1, aos1.b);
        long l2 = aoe1.b(aos1.b, 1000);
        if (aos1.z == 1)
        {
            String s = aos1.o;
            if ("hangouts/location".equals(s))
            {
                s = "image/jpeg";
            }
            dfb1.a((new dhw(aos1.b, aos1.a, l2)).a((String[])((List) (obj)).toArray(new String[((List) (obj)).size()])).a(aos1.C).b(aos1.a()).c(aos1.j).d(s).a(aos1.A).b(aos1.B).c(aos1.D).e(aos1.G).d(aos1.H).a(l1).a());
        } else
        if (aos1.z == 0)
        {
            long l3 = drk.a(g.nS, ((List) (obj)));
            String s1 = aoe1.Z(aos1.b);
            obj = ((List) (obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                String s2 = (String)((Iterator) (obj)).next();
                dfb1.a((new dib(aos1.b, aos1.a, l2)).a(s2).b(aos1.a()).a(l3).c(s1).b(l1).a());
            }
        } else
        {
            int i = aos1.z;
            ebw.g("Babel_db", (new StringBuilder(50)).append("Resending unknown type of SMS message: ").append(i).toString());
            return;
        }
        aoe1.a(l1, dqb.c, l2);
    }

    private static void a(aoe aoe1, aoh aoh1, long l1, boolean flag, dfb dfb1)
    {
        aos aos1 = aoe1.b(l1);
        if (aos1 == null || aos1.b == null)
        {
            ebw.f("Babel_db", (new StringBuilder(36)).append("No such message ").append(l1).toString());
            return;
        }
        if (a)
        {
            String s = String.valueOf("sending queued message type: ");
            String s1 = String.valueOf(aos1.g);
            String s2 = aos1.b;
            long l2 = aos1.h;
            ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 49 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append(" conversationId: ").append(s2).append(" timestamp: ").append(l2).toString());
        }
        switch (aoa.a[aos1.g.ordinal()])
        {
        default:
            aoe1 = String.valueOf(aos1.g);
            ebw.g("Babel", (new StringBuilder(String.valueOf(aoe1).length() + 30)).append("unknown message type to send: ").append(aoe1).toString());
            return;

        case 1: // '\001'
            if (g.d(aos1.x))
            {
                a(aoe1, l1, dfb1, aos1);
                return;
            }
            if (aos1.f == dqb.e)
            {
                aoe1 = String.valueOf(aos1.a);
                if (aoe1.length() != 0)
                {
                    aoe1 = "Skip sending message since it is already on server:".concat(aoe1);
                } else
                {
                    aoe1 = new String("Skip sending message since it is already on server:");
                }
                ebw.f("Babel_db", aoe1);
                return;
            }
            dhr.a(aoe1, dfb1, aos1, aoh1);
            long l3 = 1000L * System.currentTimeMillis();
            if (flag)
            {
                dfb1 = aos1.j;
                aoh1 = dfb1;
                if (dfb1 == null)
                {
                    aoh1 = aos1.k;
                }
                aoe1.a(aos1.b, l3, aos1.i, 6, aos1.o, aoe1.f().b(), aos1.e, aoh1, l1, aos1.z, 0);
            }
            aoh1 = dqb.b;
            if (!flag)
            {
                l3 = -1L;
            }
            aoe1.a(l1, aoh1, l3);
            return;

        case 2: // '\002'
            a(dfb1, aos1, true);
            return;

        case 3: // '\003'
            a(dfb1, aos1, false);
            return;

        case 4: // '\004'
        case 5: // '\005'
            aoe1 = aoe1.K(aos1.F);
            dfb1.a(new cts(aos1.a, aos1.b, aoe1, aos1.h));
            return;

        case 6: // '\006'
            dfb1.a(new cup(aos1.a, aos1.b, aos1.E, null));
            return;
        }
    }

    private static void a(aoe aoe1, crm crm1)
    {
        if (!aoe1.f().b().equals(crm1.d))
        {
            aoe1 = new czn(crm1.c, crm1.d, crm1.e);
            ((ard)hgx.a(g.nS, ard)).a(aoe1);
            RealTimeChatService.a(aoe1);
        }
    }

    public static void a(aoe aoe1, cvn cvn1, dfb dfb1)
    {
        if (ebw.a("Babel_db", 3))
        {
            String s = String.valueOf(cvn1.getClass().getSimpleName());
            if (s.length() != 0)
            {
                s = "processServerResponse of type ".concat(s);
            } else
            {
                s = new String("processServerResponse of type ");
            }
            ebw.c("Babel_db", s);
        }
        cvn1.f = false;
        cvn1.a(aoe1, dfb1);
        if (!cvn1.f)
        {
            aoe1 = String.valueOf(cvn1.getClass().getSimpleName());
            if (aoe1.length() != 0)
            {
                aoe1 = "did not call through to super -- ".concat(aoe1);
            } else
            {
                aoe1 = new String("did not call through to super -- ");
            }
            throw new IllegalStateException(aoe1);
        } else
        {
            return;
        }
    }

    public static void a(aoe aoe1, cyq cyq, dfb dfb1, long l1, long l2, long l3)
    {
        if (!(cyq instanceof cza)) goto _L2; else goto _L1
_L1:
        Object obj = (cza)cyq;
        if (!((cza) (obj)).q) goto _L4; else goto _L3
_L3:
        if (a(aoe1, ((cza) (obj)).c, ((cza) (obj)).e, dfb1, ((cza) (obj)))) goto _L6; else goto _L5
_L5:
        if (a)
        {
            aoe1 = ((cza) (obj)).c;
            cyq = ((cza) (obj)).m;
            l1 = ((cza) (obj)).e;
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(aoe1).length() + 68 + String.valueOf(cyq).length())).append("processEvent saving event ").append(aoe1).append(" eventId: ").append(cyq).append(" timestamp: ").append(l1).toString());
        }
_L13:
        return;
_L4:
        cyq = aoe1.f().b();
        if (!((cza) (obj)).d.a()) goto _L8; else goto _L7
_L7:
        ebw.g("Babel_db", "Sender id for unpersisted event should not be empty");
_L11:
        boolean flag = false;
_L10:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (a)
        {
            aoe1 = ((cza) (obj)).c;
            cyq = ((cza) (obj)).m;
            l1 = ((cza) (obj)).e;
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(aoe1).length() + 78 + String.valueOf(cyq).length())).append("Unable to process unpersisted event ").append(aoe1).append(" eventId: ").append(cyq).append(" timestamp: ").append(l1).toString());
            return;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (((cza) (obj)).d.equals(cyq))
        {
            break; /* Loop/switch isn't completed */
        }
        aou aou1 = aoe1.a(((cza) (obj)).d, false, 1);
        if (aou1 != null && !aoe.a(aou1.a))
        {
            if (a)
            {
                cyq = ((cza) (obj)).c;
                String s4 = aou1.a;
                ebw.b("Babel_db", (new StringBuilder(String.valueOf(cyq).length() + 43 + String.valueOf(s4).length())).append("unpersisted conversation ").append(cyq).append(" exists locally as").append(s4).toString());
            }
            obj.c = aou1.a;
        } else
        {
            if (ebw.a("Babel_db", 3))
            {
                String s = ((cza) (obj)).c;
                ebw.c("Babel_db", (new StringBuilder(String.valueOf(s).length() + 36)).append("conversation ").append(s).append(" does not exist locally").toString());
            }
            aoe1.a(((cza) (obj)).c, ((cza) (obj)).e, ((cza) (obj)).d);
            aoe1.E(((cza) (obj)).c);
            aoe1.a(((cza) (obj)).c, g.a(((cza) (obj)).d, null, null, null, null, null));
            ArrayList arraylist = new ArrayList();
            arraylist.add(((cza) (obj)).d);
            arraylist.add(cyq);
            dfb1.a(g.nS, aoe1, ((cza) (obj)).c, arraylist);
            b(aoe1, ((cza) (obj)).c);
        }
        flag = true;
        if (true) goto _L10; else goto _L9
_L9:
        if (ebw.a("Babel_db", 3))
        {
            cyq = String.valueOf(((cza) (obj)).c);
            if (cyq.length() != 0)
            {
                cyq = "Only self user Id is present, cannot determine conversation for ".concat(cyq);
            } else
            {
                cyq = new String("Only self user Id is present, cannot determine conversation for ");
            }
            ebw.c("Babel_db", cyq);
        }
        if (true) goto _L11; else goto _L6
_L6:
        dfb1.a(g.nS, aoe1, ((cza) (obj)).c, ((cza) (obj)).a());
        if (!(obj instanceof crm))
        {
            break; /* Loop/switch isn't completed */
        }
        cyq = (crm)obj;
        if (a)
        {
            String s1 = cyq.b();
            if (s1 != null)
            {
                String s5 = aoe1.f().a();
                ebw.b("Babel_Stress", (new StringBuilder(String.valueOf(s5).length() + 34 + String.valueOf(s1).length())).append("Received stress message push for ").append(s5).append(":").append(s1).toString());
            }
        }
        (new djc(cyq, true, l1, l2, l3, 0L)).a(aoe1, dfb1);
        a(aoe1, ((crm) (cyq)));
        if (!aoe1.f().b().equals(((crm) (cyq)).d))
        {
            ((bwg)hgx.a(g.nS, bwg)).a(aoe1.f().h(), bwh.b);
        }
_L14:
        if (((cza) (obj)).o)
        {
            aoe1.h(((cza) (obj)).c, ((cza) (obj)).e);
            return;
        }
        if (true) goto _L13; else goto _L12
_L12:
        if (!(obj instanceof cze))
        {
            break MISSING_BLOCK_LABEL_952;
        }
        cze cze1 = (cze)obj;
        if (a)
        {
            cyq = String.valueOf("processMembershipChange conversationId: ");
            String s6 = String.valueOf(cze1.c);
            if (s6.length() != 0)
            {
                cyq = cyq.concat(s6);
            } else
            {
                cyq = new String(cyq);
            }
            ebw.b("Babel_db", cyq);
        }
        cyq = cze1.c;
        aoe1.a();
        a(aoe1, cze1, dfb1, true);
        aoe1.b();
        aoe1.c();
        ebw.c("Babel_db", "updating conversation (name/avatars) because of a memebership change.");
        b(aoe1, cze1.c);
        d(aoe1);
        d(aoe1, cyq);
        c(aoe1, cyq);
          goto _L14
        cyq;
        aoe1.c();
        throw cyq;
label0:
        {
            if (!(obj instanceof cyx))
            {
                break label0;
            }
            (new djd((cyx)obj)).a(aoe1, dfb1);
        }
          goto _L14
        if (!(obj instanceof czb))
        {
            break MISSING_BLOCK_LABEL_1053;
        }
        cyq = (czb)obj;
        aoe1.a();
        boolean flag1;
        flag1 = a(aoe1, ((czb) (cyq)), dfb1);
        aoe1.b();
        aoe1.c();
        if (flag1)
        {
            d(aoe1, ((czb) (cyq)).c);
        }
        (new djf((czb)obj)).c(aoe1);
          goto _L14
        cyq;
        aoe1.c();
        throw cyq;
        if (obj instanceof czg)
        {
            (new djg((czg)obj)).c(aoe1);
        }
          goto _L14
_L2:
        String s3;
        if (!(cyq instanceof czn))
        {
            break MISSING_BLOCK_LABEL_1464;
        }
        obj = (czn)cyq;
        if (a)
        {
            cyq = String.valueOf("processWatermarkNotification ConversationId: ");
            String s2 = ((czn) (obj)).c;
            l1 = ((czn) (obj)).e;
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(cyq).length() + 32 + String.valueOf(s2).length())).append(cyq).append(s2).append(" Timestamp: ").append(l1).toString());
        }
        s3 = ((czn) (obj)).c;
        aoe1.a();
        if (!a) goto _L16; else goto _L15
_L15:
        if (!aoe1.f().b().equals(((czn) (obj)).d)) goto _L18; else goto _L17
_L17:
        cyq = "self";
_L19:
        String s7 = String.valueOf("processWatermarkNotificationInTransaction  conversationId: ");
        String s10 = ((czn) (obj)).c;
        l1 = ((czn) (obj)).e;
        String s11 = String.valueOf(new Date(((czn) (obj)).e / 1000L));
        ebw.b("Babel_db", (new StringBuilder(String.valueOf(s7).length() + 45 + String.valueOf(s10).length() + String.valueOf(cyq).length() + String.valueOf(s11).length())).append(s7).append(s10).append(" chatId: ").append(cyq).append(" timestamp: ").append(l1).append("  (").append(s11).append(")").toString());
_L16:
        if (!aoe1.f().b().equals(((czn) (obj)).d))
        {
            break MISSING_BLOCK_LABEL_1432;
        }
        aoe1.a(((czn) (obj)).c, ((czn) (obj)).e, false, "WatermarkNotification");
        if (!dbq.t(aoe1.f().h()))
        {
            dfb1.f();
        }
_L20:
        aoe1.b();
        aoe1.c();
        d(aoe1, s3);
        return;
_L18:
        cyq = ((czn) (obj)).d.b;
          goto _L19
        ((ard)hgx.a(g.nS, ard)).a(((czn) (obj)));
        RealTimeChatService.a(((czn) (obj)));
          goto _L20
        cyq;
        aoe1.c();
        throw cyq;
        if ((cyq instanceof czd) && dbq.t(aoe1.f().h()))
        {
            a(aoe1, (czd)cyq, dfb1);
            return;
        }
        if (!(cyq instanceof cyw))
        {
            break MISSING_BLOCK_LABEL_1572;
        }
        if (!a(aoe1.f(), (cyw)cyq))
        {
            g.a(aoe1.f(), 1839);
            return;
        }
        cyq = (cyw)cyq;
        aoe1.a();
        flag1 = a(aoe1, ((cyw) (cyq)), 0L, ((String) (null)), dfb1, ((aod) (null)), false);
        aoe1.b();
        aoe1.c();
        if (!flag1) goto _L13; else goto _L21
_L21:
        d(aoe1);
        return;
        cyq;
        aoe1.c();
        throw cyq;
        if (!(cyq instanceof czk))
        {
            break MISSING_BLOCK_LABEL_1844;
        }
        cyq = (czk)cyq;
        if (a)
        {
            dfb1 = String.valueOf("processFocus conversationId: ");
            obj = ((czk) (cyq)).c;
            s3 = String.valueOf(((czk) (cyq)).d);
            int i = ((czk) (cyq)).a;
            l1 = ((czk) (cyq)).e;
            String s8 = String.valueOf(new Date(((czk) (cyq)).e / 1000L));
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(dfb1).length() + 68 + String.valueOf(obj).length() + String.valueOf(s3).length() + String.valueOf(s8).length())).append(dfb1).append(((String) (obj))).append(" senderId: ").append(s3).append(" type: ").append(i).append(" and timestamp ").append(l1).append("  (").append(s8).append(")").toString());
        }
        aoe1.a();
        if (((czk) (cyq)).c != null) goto _L23; else goto _L22
_L22:
        ebw.g("Babel_db", "Received a Presence message without conversation id");
_L25:
        aoe1.b();
        aoe1.c();
        return;
_L23:
        dfb1 = ((czk) (cyq)).c;
        if (aoe1.f().b().equals(((czk) (cyq)).d)) goto _L25; else goto _L24
_L24:
        obj = ((czk) (cyq)).d;
        if (1 == ((czk) (cyq)).a)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        RealTimeChatService.a(dfb1, ((cey) (obj)), flag1);
          goto _L25
        cyq;
        aoe1.c();
        throw cyq;
        if (!(cyq instanceof czl))
        {
            break MISSING_BLOCK_LABEL_2137;
        }
        cyq = (czl)cyq;
        if (a)
        {
            dfb1 = String.valueOf("processTyping senderId: ");
            obj = String.valueOf(((czl) (cyq)).d);
            s3 = ((czl) (cyq)).c;
            int j = ((czl) (cyq)).a;
            l1 = ((czl) (cyq)).e;
            String s9 = String.valueOf(new Date(((czl) (cyq)).e / 1000L));
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(dfb1).length() + 70 + String.valueOf(obj).length() + String.valueOf(s3).length() + String.valueOf(s9).length())).append(dfb1).append(((String) (obj))).append(" conversationId: ").append(s3).append(" type: ").append(j).append(" timestamp ").append(l1).append("  (").append(s9).append(")").toString());
        }
        aoe1.a();
        dfb1 = aoe1.f();
        if (dfb1.b().equals(((czl) (cyq)).d)) goto _L27; else goto _L26
_L26:
        obj = ((czl) (cyq)).c;
        if (obj != null) goto _L29; else goto _L28
_L28:
        ebw.f("Babel_db", "attempt to process typing for a nonexistent conversation id [null]");
_L27:
        aoe1.b();
        aoe1.c();
        return;
_L29:
        cey cey1;
        s3 = aoe1.a(((czl) (cyq)).d);
        cey1 = ((czl) (cyq)).d;
        l1 = ((czl) (cyq)).e;
        if (((czl) (cyq)).a == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        RealTimeChatService.a(dfb1, ((String) (obj)), cey1, s3, l1, flag1);
          goto _L27
        cyq;
        aoe1.c();
        throw cyq;
        aoe1 = String.valueOf(cyq.getClass());
        ebw.f("Babel_db", (new StringBuilder(String.valueOf(aoe1).length() + 41)).append("Unexpected update type from babel server ").append(aoe1).toString());
        return;
    }

    public static void a(aoe aoe1, cza cza1, dfb dfb1, long l1, long l2, long l3)
    {
        a(aoe1, cza1.c, 0L, dfb1, ((cza) (null)));
        dfb1.a(g.nS, aoe1, cza1.c, cza1.a());
        if (cza1 instanceof crm)
        {
            cza1 = (crm)cza1;
            (new djc(cza1, false, l1, 0L, l2, l3)).b(aoe1, dfb1);
            a(aoe1, ((crm) (cza1)));
        } else
        {
            if (cza1 instanceof cze)
            {
                a(aoe1, (cze)cza1, dfb1, false);
                return;
            }
            if (cza1 instanceof cyx)
            {
                (new djd((cyx)cza1)).b(aoe1, dfb1);
                return;
            }
            if (cza1 instanceof czb)
            {
                a(aoe1, (czb)cza1, dfb1);
                return;
            }
            if (cza1 instanceof czg)
            {
                (new djg((czg)cza1)).d(aoe1);
                return;
            }
        }
    }

    private static void a(aoe aoe1, czd czd1, dfb dfb1)
    {
        if (a)
        {
            ebw.b("Babel_db", "processMarkEventObservedNotification");
        }
        aoe1.a();
        if (a)
        {
            ebw.b("Babel_db", "processMarkEventObservedNotificationInTransaction");
        }
        dfb1.f();
        aoe1.a(czd1.a);
        if (g.a(g.nS, "babel_meo_logging", false))
        {
            g.a(aoe1.f().h(), 2678, czd1.a());
        }
        aoe1.b();
        aoe1.c();
        for (czd1 = czd1.b.iterator(); czd1.hasNext(); d(aoe1, (String)czd1.next())) { }
        break MISSING_BLOCK_LABEL_124;
        czd1;
        aoe1.c();
        throw czd1;
    }

    private static void a(aoe aoe1, cze cze1, dfb dfb1, boolean flag)
    {
        long l1;
        l1 = cze1.e;
        Object obj;
        if (a)
        {
            String s = cze1.c;
            int i = cze1.a;
            String s2 = String.valueOf(cze1.d);
            if (cze1.v == null)
            {
                obj = "(null)";
            } else
            {
                obj = Integer.valueOf(cze1.v.size());
            }
            obj = String.valueOf(obj);
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s).length() + 119 + String.valueOf(s2).length() + String.valueOf(obj).length())).append("processMembershipChange conversationId: ").append(s).append(" type: ").append(i).append(" sender: ").append(s2).append(" participant count: ").append(((String) (obj))).append(" timestamp: ").append(l1).toString());
        }
        if (cze1.v.size() == 0)
        {
            obj = String.valueOf(cze1.c);
            if (((String) (obj)).length() != 0)
            {
                obj = "empty participants in membership change ".concat(((String) (obj)));
            } else
            {
                obj = new String("empty participants in membership change ");
            }
            ebw.g("Babel_db", ((String) (obj)));
        }
        cze1.a;
        JVM INSTR tableswitch 1 2: default 224
    //                   1 265
    //                   2 445;
           goto _L1 _L2 _L3
_L1:
        ebw.f("Babel_db", "Ignoring unsupported membership change event");
_L5:
        return;
_L2:
        Object obj1;
        String s1;
        dqb dqb1;
        cey cey2;
        boolean flag1;
        if (RealTimeChatService.d(aoe1.f(), cze1.c) || cze1.d.a(aoe1.f().b()))
        {
            flag1 = false;
        } else
        {
            flag1 = true;
        }
        if (flag)
        {
            cey cey1;
            for (Iterator iterator = cze1.v.iterator(); iterator.hasNext(); aoe1.a(cze1.c, cey1, true))
            {
                cey1 = (cey)iterator.next();
            }

        }
        obj1 = aoe1.a(cze1.c, cze1.v);
        l1 = aoe1.a(cze1.c, cze1.m, dqb.e, cze1.d, dqc.m, l1, cze1.n, cze1.f, null, ((String) (obj1)));
        aoe1.a(cze1.c, cze1.e, cze1.n, 4, cze1.d, l1, dqb.e, null, ((String) (obj1)));
        if (flag1)
        {
            dfb1.a(cze1.e);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        dfb1 = null;
        if (cze1.v.size() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = (cey)cze1.v.get(0);
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (flag && aoe1.f().b().equals(obj1))
        {
            if (cze1.c != null)
            {
                aoe1.j(cze1.c);
                flag1 = true;
            } else
            {
                ebw.f("Babel_db", "attempt to process presence for a nonexistant conversation id [null]");
                flag1 = false;
            }
        } else
        {
            if (flag)
            {
                aoe1.a(cze1.c, ((cey) (obj1)), false);
            }
            dfb1 = new ArrayList();
            dfb1.add(obj1);
            dfb1 = aoe1.a(cze1.c, dfb1);
            flag1 = false;
        }
_L6:
        if (!flag1)
        {
            s1 = cze1.c;
            dqb1 = dqb.e;
            cey2 = cze1.d;
            if (cze1.b == 1)
            {
                obj1 = dqc.o;
            } else
            {
                obj1 = dqc.l;
            }
            aoe1.a(s1, String.valueOf(l1), dqb1, cey2, ((dqc) (obj1)), l1, cze1.n, cze1.f, null, dfb1);
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
        flag1 = false;
          goto _L6
        if (true) goto _L5; else goto _L7
_L7:
    }

    public static void a(aoe aoe1, dfb dfb1, int i)
    {
        eaa eaa1;
        eaa1 = null;
        if (dzy.b())
        {
            eaa1 = (new eaa()).a("request_more_conversations").b((new StringBuilder(22)).append("filterMode=").append(i).toString()).a(aoe1.f());
        }
        aoe1.a();
        long l2 = aoe1.b(i);
        if (l2 != -2L) goto _L2; else goto _L1
_L1:
        if (eaa1 == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        eaa1.b("continuationEndTimeStamp=exhausted").b("notifyExhausted").b();
_L5:
        aoe1.b();
        aoe1.c();
        if (eaa1 != null)
        {
            eaa1.b();
        }
        return;
_L2:
        long l3 = aoe1.O("last_successful_sync_time");
        long l1;
        l1 = l2;
        if (l2 != -1L)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        l1 = aoe1.a(i);
        if (a)
        {
            ebw.b("Babel_db", (new StringBuilder(52)).append("requesting conversations before ").append(l1).toString());
        }
        if (ebw.a("Babel_db", 3))
        {
            ebw.c("Babel_db", (new StringBuilder(124)).append("create SRC from scroll back, filter=").append(i).append(", oldestConversationTimestamp=").append(l1).append(", suppressNotification=true").toString());
        }
        if (eaa1 == null) goto _L4; else goto _L3
_L3:
        eaa1.b((new StringBuilder(45)).append("continuationEndTimeStamp=").append(l1).toString());
          goto _L4
_L6:
        if (eaa1 == null)
        {
            break MISSING_BLOCK_LABEL_274;
        }
        eaa1.b("calledSRC");
        dfb1.a(new cvh(l1, i));
          goto _L5
        dfb1;
        aoe1.c();
        throw dfb1;
_L7:
        if (eaa1 == null)
        {
            break MISSING_BLOCK_LABEL_310;
        }
        eaa1.b("empty");
        if (ebw.a("Babel_db", 3))
        {
            ebw.c("Babel_db", "requestMoreConversations - db empty, warm sync executing doing nothing");
        }
          goto _L5
_L4:
        if (l1 <= 0L && l3 == 0L && i == 1) goto _L7; else goto _L6
    }

    public static void a(aoe aoe1, dfb dfb1, boolean flag, boolean flag1, String s)
    {
        ebw.c("Babel_db", "requestWarmSync");
        aoe1.a();
        Object obj;
        long l1;
        obj = aoe1.a(1, -1);
        l1 = aoe1.O("last_successful_sync_time");
        if (l1 == 0L) goto _L2; else goto _L1
_L1:
        if (((List) (obj)).size() != 0) goto _L3; else goto _L2
_L2:
        if (a)
        {
            s = aoe1.f().a();
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s).length() + 58)).append("Warm sync fall back to cold sync for: ").append(s).append(", create SRC request").toString());
        }
        dfb1.a(new cvh(5, null));
        dfb1.a(new cvh(6, null));
_L7:
        aoe1.b();
        aoe1.c();
        if (g.a(g.nS, "babel_gsi_atwarmsync", true) && !aoe1.f().q())
        {
            RealTimeChatService.a(aoe1.f());
        }
        return;
_L3:
        LinkedList linkedlist;
        Iterator iterator;
        List list = aoe1.d(l1);
        linkedlist = new LinkedList();
        obj = new LinkedList();
        iterator = list.iterator();
        Object obj1 = null;
_L6:
        if (!iterator.hasNext()) goto _L5; else goto _L4
_L4:
        String s1;
        Object obj4;
        obj4 = (Pair)iterator.next();
        s1 = (String)((Pair) (obj4)).first;
        obj4 = (String)((Pair) (obj4)).second;
        if (a)
        {
            ebw.c("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 38 + String.valueOf(obj4).length())).append("Warm sync new event since last sync: ").append(s1).append(" ").append(((String) (obj4))).toString());
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_328;
        }
        if (((String) (obj1)).equals(s1))
        {
            break MISSING_BLOCK_LABEL_508;
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_352;
        }
        linkedlist.add(new cuj(((String) (obj1)), ((List) (obj))));
        obj1 = new LinkedList();
        obj = s1;
_L8:
        ((List) (obj1)).add(obj4);
        Object obj2 = obj1;
        obj1 = obj;
        obj = obj2;
          goto _L6
_L5:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_414;
        }
        linkedlist.add(new cuj(((String) (obj1)), ((List) (obj))));
        s = new cvg(l1, linkedlist, aoe1.l(), flag, flag1, s);
        if (ebw.a("Babel_db", 3))
        {
            ebw.c("Babel_db", (new StringBuilder(101)).append("SyncAllNewEventsRequest ").append(l1).append(" noMissedEventsExpected=").append(flag).append(" suppressNotifications=").append(flag1).toString());
        }
        dfb1.a(s);
          goto _L7
        dfb1;
        aoe1.c();
        throw dfb1;
        Object obj3 = obj;
        obj = obj1;
        obj1 = obj3;
          goto _L8
    }

    public static void a(aoe aoe1, String s)
    {
        aoe1.af(s);
        d(aoe1);
    }

    public static void a(aoe aoe1, String s, long l1)
    {
        aoe1.l(s, -1L);
        if ((4L & l1) != 0L)
        {
            (new dbe(s)).a(aoe1);
        }
        if ((2L & l1) != 0L)
        {
            RealTimeChatService.a(aoe1, s, null);
        }
        d(aoe1);
    }

    public static void a(aoe aoe1, String s, aoh aoh1, long l1, dfb dfb1, long l2, 
            long l3)
    {
        long l4;
        if (ebw.a("Babel_db", 3))
        {
            ebw.c("Babel_db", (new StringBuilder(55)).append("resendMessageLocally messageRowId: ").append(l1).toString());
        }
        aoe1.a();
        l4 = SystemClock.elapsedRealtime();
        aos aos1;
        aos1 = aoe1.b(l1);
        a(aoe1, aoh1, l1, true, dfb1);
        aoe1.b();
        aoe1.c();
        if (aos1 != null && aos1.a != null)
        {
            l1 = SystemClock.elapsedRealtime();
            int i = aoe1.f().h();
            aoh1 = (new byy()).a(s);
            if (aoe.a(aos1.a))
            {
                aoh1.b(aos1.a);
            } else
            {
                aoh1.c(aos1.a);
            }
            h.a(i, l2 / 1000L, 10, aoh1.a(302));
            h.a(i, l3 / 1000L, 10, aoh1.a(205));
            h.a(i, l4, 10, aoh1.a(105));
            h.a(i, l1, 10, aoh1.a(106));
        }
        d(aoe1, s);
        return;
        s;
        aoe1.c();
        throw s;
    }

    public static void a(aoe aoe1, String s, dfb dfb1)
    {
        aoe1.a();
        Object obj = aoe1.f(s);
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = String.valueOf("Requested older events for an unknown conversation Account:");
        String s1 = String.valueOf(ebw.b(aoe1.f().a()));
        ebw.f("Babel_db", (new StringBuilder(String.valueOf(obj).length() + 16 + String.valueOf(s1).length() + String.valueOf(s).length())).append(((String) (obj))).append(s1).append(" conversationId:").append(s).toString());
        s = new cuc(s, true, true, false, null, -1L, null, 0L, null);
_L3:
        dfb1.a(s);
        aoe1.b();
        aoe1.c();
        return;
_L2:
        if (!((aoh) (obj)).p)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        if (ebw.a("Babel_db", 3))
        {
            ebw.c("Babel_db", (new StringBuilder(String.valueOf(s).length() + 78)).append("Skip requesting old events for conversation ").append(s).append(" since it already has oldest event").toString());
        }
        aoe1.b();
        aoe1.c();
        return;
        if (ebw.a("Babel_db", 3))
        {
            String s2 = String.valueOf(Arrays.toString(((aoh) (obj)).f));
            long l1 = ((aoh) (obj)).g;
            ebw.c("Babel_db", (new StringBuilder(String.valueOf(s2).length() + 74 + String.valueOf(s).length())).append("requesting events before token ").append(s2).append(" eventId ").append(l1).append(" conversation ").append(s).toString());
        }
        s = new cuc(s, false, true, false, ((aoh) (obj)).f, ((aoh) (obj)).g, null, 0L, null);
          goto _L3
        s;
        aoe1.c();
        throw s;
    }

    public static void a(aoe aoe1, String s, String s1, Uri uri, long l1, long l2, 
            boolean flag, long l3, long l4)
    {
        Object obj;
        aoe1.a();
        obj = aoe1.f(s, s1);
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = String.valueOf("processSmsMmsSendResponse: received response for nonexistant  clientGeneratedId ");
        s1 = String.valueOf(s1);
        if (s1.length() == 0) goto _L4; else goto _L3
_L3:
        s1 = ((String) (obj)).concat(s1);
_L5:
        ebw.g("Babel_db", s1);
_L6:
        aoe1.b();
        aoe1.c();
        d(aoe1, s);
        b(uri);
        return;
_L4:
        s1 = new String(((String) (obj)));
          goto _L5
        s;
        aoe1.c();
        throw s;
_L2:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        a(aoe1.f(), uri, l3, Boolean.valueOf(true), false, true);
        aoe1.a(s, g.a(((Long) (obj)), 0L), l2, 0L);
        aoe1.a(s, s1, uri, l1);
        aoe1.i(s, l2);
        aoe1.n(s, l4);
          goto _L6
    }

    public static void a(aoe aoe1, String s, String s1, dqb dqb1, int i)
    {
        aoe1.a(s, s1, dqb1, i);
    }

    private static void a(aoe aoe1, String s, String s1, String s2, boolean flag, long l1, long l2, int i, int j)
    {
        ani ani1;
        ani1 = aoe1.f();
        Object obj1 = g.nS;
        Object obj2 = ((Context) (obj1)).getResources();
        cey cey1;
        if (!TextUtils.isEmpty(s2))
        {
            cey1 = g.m(s2);
            cey cey2;
            if (flag)
            {
                cey2 = cey1;
            } else
            {
                cey2 = null;
            }
            s2 = drk.a(aoe1, cey2, s2);
        } else
        {
            s2 = drk.h();
            cey1 = ((ceu) (s2)).b;
            s2 = drk.a(aoe1, flag, Arrays.asList(new ceu[] {
                s2
            }));
        }
        if (TextUtils.isEmpty(s2))
        {
            ebw.g("Babel_db", "EsConversationsData.storeMmsNotificationMessage: failed to get conv.");
            return;
        }
        long l3 = aoe1.b(s2, 1000);
        Object obj = String.valueOf(String.valueOf(drk.b(l1)));
        String s3 = String.valueOf(((Resources) (obj2)).getString(l.fs));
        if (s3.length() != 0)
        {
            obj = ((String) (obj)).concat(s3);
        } else
        {
            obj = new String(((String) (obj)));
        }
        obj = ((Resources) (obj2)).getString(j, new Object[] {
            obj, DateUtils.formatDateTime(((Context) (obj1)), 1000L * l2, 0x20019)
        });
        obj1 = aoe.g();
        obj2 = g.a(((String) (obj)), 2);
        if (i == 0)
        {
            obj = dqb.e;
        } else
        {
            obj = dqb.d;
        }
        (new djc(s2, cey1, l3, ((String) (obj1)), ((List) (obj2)), null, null, false, ((dqb) (obj)), i, 3, null, g.a(new String[] {
            s, s1
        }), 0L, 0, 0L, null, 2, null, 0, 0L)).a(2).a(aoe1, new dfb());
        aoe1.a();
        aoe1.h(s2, l3);
        if (!flag) goto _L2; else goto _L1
_L1:
        aoe1.w(s2);
_L4:
        aoe1.b();
        aoe1.c();
        return;
_L2:
        if (RealTimeChatService.d(aoe1.f(), s2)) goto _L4; else goto _L3
_L3:
        cej.a(g.nS, ani1.h(), false);
          goto _L4
        s;
        aoe1.c();
        throw s;
    }

    public static void a(aoe aoe1, String s, List list)
    {
        if (ebw.a("Babel_db", 3))
        {
            String s1 = String.valueOf(list);
            ebw.c("Babel_db", (new StringBuilder(String.valueOf(s).length() + 87 + String.valueOf(s1).length())).append("forking a new conversation for an existing conversation ").append(s).append(" with additional participants: ").append(s1).toString());
        }
        List list1 = aoe1.J(s);
        list1.addAll(list);
        RealTimeChatService.a(aoe1.f(), g.a(list1), s);
    }

    public static void a(aoe aoe1, String s, List list, dfb dfb1)
    {
        Object obj;
        Object obj1;
        eaz eaz1;
        daf daf1;
        boolean flag2;
        if (ebw.a("Babel_db", 3))
        {
            obj = String.valueOf(s);
            if (((String) (obj)).length() != 0)
            {
                obj = "inviteParticipantsLocally: conversationId=".concat(((String) (obj)));
            } else
            {
                obj = new String("inviteParticipantsLocally: conversationId=");
            }
            ebw.c("Babel_db", ((String) (obj)));
        }
        aoe1.a();
        eaz1 = aoe1.L(s);
        flag2 = aoe.b(s);
        obj = new ArrayList();
        obj1 = new ArrayList();
        list = list.iterator();
_L3:
        if (!list.hasNext()) goto _L2; else goto _L1
_L1:
        daf1 = (daf)list.next();
        if (daf1.c == null || flag2)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        ((List) (obj)).add(daf.b(daf1.c, daf1.e));
          goto _L3
        s;
        aoe1.c();
        throw s;
        cey cey1 = daf1.b();
        boolean flag = false;
        Iterator iterator = eaz1.iterator();
_L5:
        boolean flag1 = flag;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        if (!((cey)iterator.next()).a(cey1))
        {
            continue; /* Loop/switch isn't completed */
        }
        flag1 = true;
        break; /* Loop/switch isn't completed */
        if (true) goto _L5; else goto _L4
_L4:
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        if (daf1.d != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag1 || !flag) goto _L7; else goto _L6
_L6:
        ((List) (obj)).add(daf1);
_L7:
        if (flag) goto _L3; else goto _L8
_L8:
        ((List) (obj1)).add(daf1);
          goto _L3
        String s1;
        long l1;
        long l2;
        if (daf1.a != null && !daf1.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        break MISSING_BLOCK_LABEL_229;
_L2:
        list = aoe1.f().b();
        s1 = aoe1.b(s, ((List) (obj1)));
        if (((List) (obj1)).size() > 0)
        {
            l1 = aoe1.P(s);
            aoe1.a(s, aoe.g(), dqb.d, list, dqc.m, l1, -1L, 10, null, s1);
        }
        if (((List) (obj)).size() != 0)
        {
            break MISSING_BLOCK_LABEL_368;
        }
        aoe1.b();
        aoe1.c();
        return;
        obj1 = aoe1.b(s, ((List) (obj)));
        s1 = aoe.g();
        l1 = aoe1.P(s);
        l2 = aoe1.a(s, s1, dqb.b, list, dqc.m, l1, -1L, 10, null, ((String) (obj1)));
        aoe1.a(s, l1, -1L, 4, aoe1.f().b(), l2, dqb.b, null, ((String) (obj1)));
        if (!aoe.a(s))
        {
            dfb1.a(new cts(s1, s, ((List) (obj)), l1));
        }
        aoe1.b();
        aoe1.c();
        return;
          goto _L3
    }

    private static void a(aoe aoe1, String s, List list, List list1)
    {
        if (a)
        {
            String s1 = String.valueOf(s);
            if (s1.length() != 0)
            {
                s1 = "insertTemporaryConversationParticipants ".concat(s1);
            } else
            {
                s1 = new String("insertTemporaryConversationParticipants ");
            }
            ebw.b("Babel_db", s1);
        }
        for (list = list.iterator(); list.hasNext(); aoe1.a(s, (ceu)list.next())) { }
        if (list1 != null)
        {
            for (list = list1.iterator(); list.hasNext(); aoe1.a(s, (aim)list.next())) { }
        } else
        {
            aoe1.I(s);
        }
        b(aoe1, s);
    }

    private static void a(aoe aoe1, String s, boolean flag)
    {
        if (a)
        {
            ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 25)).append("processPendingMute ").append(s).append(" ").append(flag).toString());
        }
        aoe1 = aoe1.f();
        byte byte0;
        if (flag)
        {
            byte0 = 10;
        } else
        {
            byte0 = 30;
        }
        RealTimeChatService.a(aoe1, s, byte0);
    }

    public static void a(aoe aoe1, String s, byte abyte0[], long l1)
    {
        long l2 = aoe1.h(s);
        if (l1 <= l2 || l2 == 0L)
        {
            aoe1.a(s, abyte0, l1);
        }
    }

    private static void a(aoe aoe1, List list)
    {
        ContentValues contentvalues = new ContentValues();
        String as[] = new String[1];
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = (ceu)list.next();
            String s = ((ceu) (obj)).f();
            if (s != null)
            {
                contentvalues.clear();
                obj = ((ceu) (obj)).b;
                contentvalues.put("phone_id", s);
                as[0] = ((cey) (obj)).b;
                aoe1.e().a("participants", contentvalues, "chat_id=?", as);
            }
        } while (true);
    }

    public static void a(aoe aoe1, List list, String s, String s1, long l1, long l2)
    {
        Object obj;
        String s2;
        Iterator iterator;
        boolean flag;
        boolean flag1;
        boolean flag5;
        if (ebw.a("Babel_db", 3))
        {
            ebw.c("Babel_db", "processContactErrorInTransaction");
        }
        obj = new ArrayList();
        s2 = aoe1.c(s, list);
        iterator = list.iterator();
        flag = false;
        flag1 = false;
        flag5 = false;
_L6:
        boolean flag2;
        boolean flag3;
        boolean flag4;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        list = (dae)iterator.next();
        if (((dae) (list)).b == 3)
        {
            flag3 = true;
            flag4 = flag;
            flag2 = flag5;
        } else
        {
            flag5 = true;
            flag2 = flag5;
            flag3 = flag1;
            flag4 = flag;
            if (((dae) (list)).b == 4)
            {
                flag4 = true;
                flag2 = flag5;
                flag3 = flag1;
            }
        }
        list = ((dae) (list)).a;
        if (TextUtils.isEmpty(((daf) (list)).a)) goto _L2; else goto _L1
_L1:
        list = cey.a(((daf) (list)).a);
_L4:
        flag5 = flag2;
        flag1 = flag3;
        flag = flag4;
        if (aoe1.b(list) == null)
        {
            ((List) (obj)).add(list);
            flag5 = flag2;
            flag1 = flag3;
            flag = flag4;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (TextUtils.isEmpty(((daf) (list)).b))
        {
            break; /* Loop/switch isn't completed */
        }
        list = cey.b(((daf) (list)).b);
        if (true) goto _L4; else goto _L3
_L3:
        ebw.g("Babel_db", "processContactErrorInTransaction: server sends empty ids!");
        flag5 = flag2;
        flag1 = flag3;
        flag = flag4;
        if (true) goto _L6; else goto _L5
_L5:
        if (((List) (obj)).size() > 0)
        {
            list = new dfb();
            list.a(aoe1.f());
            list.a(g.nS, aoe1, s, ((List) (obj)));
            list.e();
        }
        obj = dqc.f;
        if (!flag) goto _L8; else goto _L7
_L7:
        list = dqc.n;
_L10:
        aoe1.a(s, s1, dqb.e, aoe1.f().b(), list, l1, l2, 30, null, s2);
        aoe1.a(s, s1, dqb.d, 0);
        return;
_L8:
        list = ((List) (obj));
        if (flag1)
        {
            list = ((List) (obj));
            if (!flag5)
            {
                list = dqc.p;
            }
        }
        if (true) goto _L10; else goto _L9
_L9:
    }

    public static void a(dfb dfb1, aoe aoe1, String s)
    {
        aoh aoh1 = aoe1.e(s);
        Cursor cursor = aoe1.a(s, dqb.b, new String[] {
            "_id"
        });
        if (!a) goto _L2; else goto _L1
_L1:
        if (cursor != null) goto _L4; else goto _L3
_L3:
        int i = -1;
_L6:
        ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 51)).append("sendUnsentMessages ").append(s).append(" cursor ").append(i).append(" message rows").toString());
_L2:
        aoe1.a();
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        if (cursor.moveToFirst())
        {
            do
            {
                if (a)
                {
                    long l1 = cursor.getLong(0);
                    ebw.b("Babel_db", (new StringBuilder(String.valueOf(s).length() + 54)).append("sendUnsentMessages ").append(s).append(" sending msgID ").append(l1).toString());
                }
                a(aoe1, aoh1, cursor.getLong(0), false, dfb1);
            } while (cursor.moveToNext());
        }
        dfb1.a(new cum(s, aoe1.X(s)));
        aoe1.b();
        aoe1.c();
        if (cursor != null)
        {
            cursor.close();
        }
        return;
_L4:
        i = cursor.getCount();
        if (true) goto _L6; else goto _L5
_L5:
        dfb1;
        aoe1.c();
        throw dfb1;
        dfb1;
        aoe1 = cursor;
_L8:
        if (aoe1 != null)
        {
            aoe1.close();
        }
        throw dfb1;
        dfb1;
        aoe1 = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static void a(dfb dfb1, aos aos1, boolean flag)
    {
        byte byte0 = 2;
        String s = aos1.a;
        aos1 = aos1.b;
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        if (!flag)
        {
            byte0 = 1;
        }
        dfb1.a(new cuk(s, aos1, i, byte0));
    }

    public static void a(dfb dfb1, String s, long l1)
    {
        if (ebw.a("Babel_db", 3))
        {
            String s1 = String.valueOf(s);
            if (s1.length() != 0)
            {
                s1 = "requesting conversation metadata for ".concat(s1);
            } else
            {
                s1 = new String("requesting conversation metadata for ");
            }
            ebw.c("Babel_db", s1);
        }
        dfb1.a(new cuc(s, true, false, false, null, 0L, null, l1, null));
    }

    public static void a(String s, int i, dfb dfb1)
    {
        if (ebw.a("Babel_db", 3))
        {
            String s1 = String.valueOf("sendTypingRequestLocally  conversationId: ");
            ebw.c("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 24 + String.valueOf(s).length())).append(s1).append(s).append(" typingType: ").append(i).toString());
        }
        dfb1.a(new cve(s, i));
    }

    public static void a(String s, boolean flag, int i, dfb dfb1)
    {
        if (ebw.a("Babel_db", 3))
        {
            ebw.c("Babel_db", (new StringBuilder(String.valueOf(s).length() + 61)).append("sendPresenceRequestLocally: conversationId: ").append(s).append(" isFocused: ").append(flag).toString());
        }
        dfb1.a(new cuz(s, flag, i));
    }

    private static void a(List list, String s)
    {
        Object obj;
        for (list = list.iterator(); list.hasNext(); RealTimeChatService.a(((czn) (obj))))
        {
            obj = (czv)list.next();
            if (a)
            {
                String s1 = String.valueOf(((czv) (obj)).a.b);
                long l1 = ((czv) (obj)).b;
                ebw.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 82 + String.valueOf(s).length())).append("process userReadState  chatId: ").append(s1).append("  conversationId: ").append(s).append("  timestamp: ").append(l1).toString());
            }
            obj = new czn(s, ((czv) (obj)).a, ((czv) (obj)).b);
            ((ard)hgx.a(g.nS, ard)).a(((czn) (obj)));
        }

    }

    public static void a(SmsMessage asmsmessage[], ani ani1, int i, Boolean boolean1)
    {
        aoe aoe1;
        String s2;
        boolean flag;
        Context context = g.nS;
        ContentValues contentvalues = drk.a(context, asmsmessage, i);
        String s = contentvalues.getAsString("address");
        String s1 = contentvalues.getAsString("body");
        if (TextUtils.isEmpty(s) || TextUtils.isEmpty(s1))
        {
            ebw.g("Babel_db", "EsConversationsData.storeSmsMessage: empty sender or body");
            return;
        }
        aoe1 = new aoe(g.nS, ani1.h());
        cey cey1 = g.m(s);
        flag = a(cey1);
        Object obj;
        if (flag)
        {
            obj = cey1;
        } else
        {
            obj = null;
        }
        s2 = drk.a(aoe1, ((cey) (obj)), s);
        if (TextUtils.isEmpty(s2))
        {
            ebw.g("Babel_db", "EsConversationsData.storeSmsMessage: empty conversation id");
            return;
        }
        boolean flag1 = RealTimeChatService.d(ani1, s2);
        obj = boolean1;
        if (boolean1 == null)
        {
            obj = Boolean.valueOf(flag1);
        }
        long l1 = g.a(drk.a(asmsmessage[0], aoe1.b(s2, 1000) / 1000L), 0L);
        contentvalues.put("date", Long.valueOf(l1));
        long l2;
        if (g.a(((Boolean) (obj)), false))
        {
            asmsmessage = Integer.valueOf(1);
        } else
        {
            asmsmessage = Integer.valueOf(0);
        }
        contentvalues.put("read", asmsmessage);
        boolean1 = g.b(context.getContentResolver(), android.provider.Telephony.Sms.Inbox.CONTENT_URI, contentvalues);
        asmsmessage = null;
        if (boolean1 != null)
        {
            asmsmessage = g.a(new String[] {
                boolean1.toString()
            });
        } else
        {
            ebw.g("Babel_db", "storeSmsMessage: failed to insert SMS to telephony");
        }
        l2 = l1 * 1000L;
        boolean1 = contentvalues.getAsLong("date_sent");
        if (boolean1 == null)
        {
            l1 = 0L;
        } else
        {
            l1 = g.a(boolean1, 0L) * 1000L;
        }
        (new djc(s2, cey1, l2, aoe.g(), null, s1, null, false, dqb.e, 0, 3, null, asmsmessage, l1, 0, 0L, null, 2, null, 0, 0L)).a(0).a(s).a(aoe1, new dfb());
        aoe1.a();
        aoe1.i(s2, l2);
        asmsmessage = contentvalues.getAsInteger("reply_path_present");
        boolean1 = contentvalues.getAsString("service_center");
        if (asmsmessage == null) goto _L2; else goto _L1
_L1:
        if (g.a(asmsmessage, 0) != 1) goto _L2; else goto _L3
_L3:
        aoe1.i(s2, boolean1);
_L6:
        aoe1.n(s2, g.a(contentvalues.getAsLong("thread_id"), 0L));
        if (flag || flag1)
        {
            break MISSING_BLOCK_LABEL_427;
        }
        cej.a(g.nS, ani1.h(), false);
        if (!g.a(((Boolean) (obj)), false)) goto _L5; else goto _L4
_L4:
        aoe1.a(s2, l2, false, "storesms");
_L8:
        aoe1.b();
        aoe1.c();
        d(aoe1, s2);
        return;
_L2:
        aoe1.i(s2, null);
          goto _L6
        asmsmessage;
        aoe1.c();
        throw asmsmessage;
_L5:
        if (!flag) goto _L8; else goto _L7
_L7:
        aoe1.w(s2);
          goto _L8
    }

    public static boolean a(ani ani1, cyw cyw1)
    {
        if (ani1 == null || cyw1 == null)
        {
            return false;
        }
        ani1 = ani1.b();
        for (cyw1 = cyw1.f.iterator(); cyw1.hasNext();)
        {
            if (ani1.equals((cey)cyw1.next()))
            {
                return true;
            }
        }

        return false;
    }

    public static boolean a(aoe aoe1, cyw cyw1, long l1, String s, dfb dfb1, aod aod1, boolean flag)
    {
        if (ebw.a("Babel_db", 3))
        {
            String s1 = String.valueOf("processConversationInTransaction conversationId: ");
            String s2 = cyw1.c;
            String s3 = cyw1.i;
            int i = cyw1.f.size();
            int j = cyw1.j;
            int k = cyw1.k;
            String s4 = String.valueOf(Arrays.toString(cyw1.l));
            boolean flag2 = cyw1.o;
            Object obj;
            int i1;
            int j1;
            long l2;
            boolean flag4;
            if (cyw1.n == null)
            {
                obj = null;
            } else
            {
                obj = Long.valueOf(cyw1.n.b);
            }
            obj = String.valueOf(obj);
            i1 = cyw1.p;
            l2 = cyw1.s;
            j1 = cyw1.q;
            flag4 = cyw1.w;
            ebw.c("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 308 + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s).length() + String.valueOf(s4).length() + String.valueOf(obj).length())).append(s1).append(s2).append(", clientGeneratedId: ").append(s3).append(", requestClientGeneratedId: ").append(s).append(", participantCount: ").append(i).append(", notificationLevel: ").append(j).append(", status: ").append(k).append(", view: ").append(s4).append(", hasActiveHangout: ").append(flag2).append(", selfReadState.latestReadTimestamp: ").append(((String) (obj))).append(", otrStatus: ").append(i1).append(", sortTimestamp: ").append(l2).append(", otrToggle: ").append(j1).append(", isTemporary: ").append(flag4).toString());
        }
        if (!flag && cyw1.k == 1 && aoe1.t(cyw1.c) == 1 && cyw1.l != null && cyw1.l.length > 0 && cyw1.l[0] == 2)
        {
            aoe1.C(cyw1.c);
            return true;
        }
        if (l1 > 0L)
        {
            if (a)
            {
                ebw.b("Babel", (new StringBuilder(71)).append("got upperBoundTimestamp ").append(l1).append(" calling deleteConversation").toString());
            }
            aoe1.d(cyw1.c, l1);
            if (cyw1.s <= l1)
            {
                if (a)
                {
                    ebw.b("Babel", "upperBoundTimestamp >= timestamp, returning");
                }
                return false;
            }
        }
        if (cyw1.a != 1) goto _L2; else goto _L1
_L1:
        Object obj1;
        Iterator iterator;
        obj1 = aoe1.f().b();
        iterator = cyw1.f.iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L3
_L3:
        cey cey1 = (cey)iterator.next();
        if (cey1.equals(obj1)) goto _L5; else goto _L4
_L4:
        obj1 = aoe1.a(cey1, true, 1);
        if (obj1 == null) goto _L2; else goto _L6
_L6:
        obj1 = ((aou) (obj1)).a;
_L12:
        boolean flag1;
        Object obj2 = aoe1.a(cyw1.c, s, cyw1.i, ((String) (obj1)));
        obj1 = ((aop) (obj2)).a;
        flag1 = false;
        if (((aop) (obj2)).b)
        {
            flag1 = true;
        }
        if (a)
        {
            boolean flag3;
            if (obj1 == null)
            {
                s = "(null)";
            } else
            {
                s = ((aom) (obj1)).a;
            }
            flag3 = ((aop) (obj2)).b;
            obj2 = (new StringBuilder(String.valueOf(s).length() + 70)).append("getExistingMergedConversationId returned ").append(s).append(" conversationIdsMerged: ").append(flag3).toString();
            s = String.valueOf("[EsConversationsData] ");
            obj2 = String.valueOf(obj2);
            if (((String) (obj2)).length() != 0)
            {
                s = s.concat(((String) (obj2)));
            } else
            {
                s = new String(s);
            }
            ebw.b("Babel_db", s);
        }
        if (obj1 == null)
        {
            s = null;
        } else
        {
            s = ((aom) (obj1)).a;
            aoe1.p(s);
        }
        if (s == null) goto _L8; else goto _L7
_L7:
        if (!cyw1.c.equals(s))
        {
            flag1 = true;
        }
        if (!flag1 && ((aom) (obj1)).b != null && Arrays.equals(((aom) (obj1)).b, cyw1.t))
        {
            if (a)
            {
                aoe1 = String.valueOf(g.a(((aom) (obj1)).b));
                if (aoe1.length() != 0)
                {
                    aoe1 = "Skipping update ".concat(aoe1);
                } else
                {
                    aoe1 = new String("Skipping update ");
                }
                ebw.b("Babel_db", aoe1);
            }
            a(cyw1.g, cyw1.c);
            if (aod1 != null)
            {
                aod1.a = ((aom) (obj1)).a;
            }
            return false;
        }
        aoe1.a(s, ((aom) (obj1)).c, cyw1);
        aoe1.I(cyw1.c);
_L10:
        dfb1.a(g.nS, aoe1, cyw1.c, cyw1.f);
        aoe1.a(cyw1.c, cyw1.y, cyw1.x);
        aoe1.a(cyw1.f, cyw1.h, cyw1.c);
        if (cyw1.h != null)
        {
            obj1 = cyw1.h.iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                crv crv1 = (crv)((Iterator) (obj1)).next();
                if (crv1.a != null && !TextUtils.isEmpty(crv1.c))
                {
                    aoe1.a(crv1);
                }
            } while (true);
        }
        break; /* Loop/switch isn't completed */
_L8:
        aoe1.a(cyw1);
        if (cyw1.k == 1)
        {
            dfb1.a(cyw1.e);
        }
        if (true) goto _L10; else goto _L9
_L9:
        b(aoe1, cyw1.c);
        if (flag1)
        {
            RealTimeChatService.i(aoe1.f(), s, cyw1.c);
            a(dfb1, aoe1, cyw1.c);
        }
        if (s != null && aoe1.Y(cyw1.c))
        {
            if (aod1 != null)
            {
                aod1.a = cyw1.c;
            }
            return false;
        }
        if (cyw1.n != null)
        {
            aoe1.a(cyw1.c, cyw1.n.b, false, "serverresponse");
        }
        a(cyw1.g, cyw1.c);
        aoe1.a(cyw1.p, cyw1.q, 1L + aoe1.y(cyw1.c), cyw1.c);
        aoe1.i(cyw1.c, cyw1.s);
        aoe1.a(cyw1.c, cyw1.v);
        aoe1.a(cyw1.c, cyw1.w);
        if (flag)
        {
            if (cyw1.l != null && cyw1.l.length > 0 && cyw1.l[0] == 2)
            {
                RealTimeChatService.a(aoe1.f(), cyw1.c, cyw1.e, false);
            }
            if (cyw1.k == 1)
            {
                dfb1.a(new cuq(cyw1.c));
                aoe1.ae(cyw1.c);
            }
        }
        if (aod1 != null)
        {
            aod1.a = cyw1.c;
        }
        aoe.a(aoe1, cyw1.c);
        return true;
_L2:
        obj1 = null;
        if (true) goto _L12; else goto _L11
_L11:
    }

    private static boolean a(aoe aoe1, czb czb1, dfb dfb1)
    {
        if (a)
        {
            String s = String.valueOf("processHangoutEventInTransaction conversationId: ");
            String s1 = czb1.c;
            int i = czb1.b;
            int k = czb1.a;
            long l1 = czb1.w;
            String s2 = czb1.x;
            String s3 = String.valueOf(czb1.v.toString());
            ebw.b("Babel_db", (new StringBuilder(String.valueOf(s).length() + 101 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s).append(s1).append(" mediaType: ").append(i).append(" event type ").append(k).append(" duration ").append(l1).append(" transfer ").append(s2).append(" participants: ").append(s3).toString());
        }
        dqc dqc1;
        byte byte1;
        int i1;
        boolean flag;
        long l2;
        boolean flag1;
        if (czb1.b == 2)
        {
            byte1 = 1;
        } else
        {
            byte1 = 2;
        }
        if (byte1 == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i1 = czb1.f;
        dqc1 = null;
        byte byte0;
        long l3;
        long l4;
        boolean flag2;
        if (czb1.a == 1)
        {
            dqc1 = dqc.i;
            i1 = 10;
            flag1 = true;
        } else
        if (czb1.a == 0 && czb1.x != null && aoe1.t(czb1.x) == 2)
        {
            i1 = 10;
            flag1 = false;
        } else
        {
            flag1 = false;
        }
        l2 = -1L;
        if (flag1)
        {
            aoh aoh1 = aoe1.e(czb1.c);
            Object obj1 = null;
            Object obj = obj1;
            if (aoh1.b == 1)
            {
                cey cey1 = aoe1.f().b();
                obj = obj1;
                if (cey1.a(czb1.d))
                {
                    int j = czb1.v.size();
                    int j1;
                    if (j > 0)
                    {
                        obj = czb1.v.iterator();
                        do
                        {
                            j1 = j;
                            if (!((Iterator) (obj)).hasNext())
                            {
                                break;
                            }
                            if (cey1.a((cey)((Iterator) (obj)).next()))
                            {
                                j--;
                            }
                        } while (true);
                    } else
                    {
                        j1 = j;
                    }
                    obj = obj1;
                    if (j1 == 0)
                    {
                        ArrayList arraylist = new ArrayList();
                        obj = aoh1.h.iterator();
                        do
                        {
                            if (!((Iterator) (obj)).hasNext())
                            {
                                break;
                            }
                            cey cey2 = ((ceu)((Iterator) (obj)).next()).b;
                            if (!cey1.a(cey2))
                            {
                                arraylist.add(cey2);
                            }
                        } while (true);
                        obj = obj1;
                        if (arraylist.size() == 1)
                        {
                            obj = aoe1.a(czb1.c, arraylist);
                        }
                    }
                }
            }
            obj1 = obj;
            if (obj == null)
            {
                obj1 = aoe1.a(czb1.c, czb1.v);
            }
            l2 = aoe1.a(czb1.c, czb1.m, dqb.e, czb1.d, dqc1, czb1.e, czb1.n, 0L, i1, null, ((String) (obj1)), byte1, null);
            if (i1 == 10)
            {
                dfb1.f();
            } else
            {
                dfb1.a(czb1.e);
            }
        }
        czb1.a;
        JVM INSTR lookupswitch 2: default 596
    //                   1: 624
    //                   5: 791;
           goto _L1 _L2 _L3
_L1:
        aoe1.a(byte1, czb1.e, czb1.c);
        return flag1;
_L2:
        dfb1 = aoe1.f().b();
        flag2 = czb1.v.contains(dfb1);
        l3 = aoe1.m(czb1.c);
        if (czb1.e > l3)
        {
            if (flag2)
            {
                dfb1 = czb1.c;
                l3 = czb1.e;
                l4 = czb1.n;
                if (flag)
                {
                    byte0 = 11;
                } else
                {
                    byte0 = 8;
                }
                aoe1.a(dfb1, l3, l4, byte0, null, l2, dqb.e, null, null);
            } else
            {
                dfb1 = czb1.c;
                l3 = czb1.e;
                l4 = czb1.n;
                if (flag)
                {
                    byte0 = 10;
                } else
                {
                    byte0 = 1;
                }
                aoe1.a(dfb1, l3, l4, byte0, null, l2, dqb.e, null, null);
            }
        }
        byte1 = 0;
        RealTimeChatService.a(czb1.c, null);
        continue; /* Loop/switch isn't completed */
_L3:
        RealTimeChatService.a(czb1.c, czb1.v);
        if (true) goto _L1; else goto _L4
_L4:
    }

    private static boolean a(aoe aoe1, String s, long l1, dfb dfb1, cza cza1)
    {
        aoh aoh1 = aoe1.f(s);
        if (aoh1 != null)
        {
            if (a)
            {
                boolean flag = aoh1.e;
                ebw.b("Babel_db", (new StringBuilder(String.valueOf(s).length() + 52)).append("conversation ").append(s).append(" exists locally,  metadataPresent ").append(flag).toString());
            }
        } else
        {
            if (ebw.a("Babel_db", 3))
            {
                ebw.c("Babel_db", (new StringBuilder(String.valueOf(s).length() + 36)).append("conversation ").append(s).append(" does not exist locally").toString());
            }
            if (l1 == 0L)
            {
                l1 = 0L;
            } else
            {
                l1--;
            }
            aoe1.a(s, l1);
        }
        if (aoh1 == null || !aoh1.e)
        {
            dfb1.a(new cuc(s, true, true, true, null, 0L, null, 0L, cza1));
            return false;
        } else
        {
            return true;
        }
    }

    public static boolean a(cey cey1)
    {
        if (cey1 == null)
        {
            return false;
        } else
        {
            int i = dbf.l().h();
            return (new aoe(g.nS, i)).F(cey1.b);
        }
    }

    public static int b(aoe aoe1, dzx dzx1)
    {
        int i;
        i = 0;
        aoe1.a();
        if (dzx1 != null) goto _L2; else goto _L1
_L1:
        i = aoe1.x(null);
_L6:
        aoe1.b();
        aoe1.c();
        return i;
_L2:
        dzx1 = dzx1.iterator();
_L4:
        int j;
        if (!dzx1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        j = aoe1.x((String)dzx1.next());
        i += j;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
        dzx1;
        aoe1.c();
        throw dzx1;
    }

    private static Uri b(int i)
    {
        android.net.Uri.Builder builder = b.buildUpon();
        builder.appendQueryParameter("account_id", (new StringBuilder(11)).append(i).toString());
        return builder.build();
    }

    public static String b(ani ani1, String s, String s1, String s2)
    {
        gbh.b(TextUtils.isEmpty(s1));
        String s4 = (new aoe(g.nS, ani1.h())).ac(s1);
        String s3 = s4;
        if (TextUtils.isEmpty(s4))
        {
            a(ani1, s, s1, s2);
            s3 = null;
        }
        return s3;
    }

    private static String b(aoe aoe1, String s, List list)
    {
        StringBuilder stringbuilder = new StringBuilder();
        ani ani1 = aoe1.f();
        cey cey1 = ani1.b();
        aoe1 = aoe1.f(s);
        boolean flag;
        boolean flag1;
        if (aoe1 == null || ((aoh) (aoe1)).b == 1 || ((aoh) (aoe1)).b == 2 && g.d(((aoh) (aoe1)).c) || ani1.F() && ani1.H())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        s = list.iterator();
        flag = false;
        do
        {
            if (s.hasNext())
            {
                aoe1 = (ceu)s.next();
                if (((ceu) (aoe1)).d != null)
                {
                    aoe1 = ((ceu) (aoe1)).e;
                } else
                {
                    if (((ceu) (aoe1)).b == null)
                    {
                        continue;
                    }
                    if (!flag && ((ceu) (aoe1)).b.equals(cey1) && list.size() > 1)
                    {
                        flag = true;
                        continue;
                    }
                    if (c == null)
                    {
                        String s1 = ebz.g();
                        c = s1;
                        if (s1 == null)
                        {
                            c = "";
                        }
                    }
                    if (!flag && TextUtils.equals(aoe1.f(), c))
                    {
                        flag = true;
                        continue;
                    }
                    boolean flag2;
                    if (!flag1)
                    {
                        flag2 = true;
                    } else
                    {
                        flag2 = false;
                    }
                    aoe1 = g.a(aoe1, flag2);
                }
                if (!TextUtils.isEmpty(aoe1))
                {
                    if (stringbuilder.length() > 0)
                    {
                        stringbuilder.append(", ");
                    }
                    stringbuilder.append(aoe1);
                }
                continue;
            }
            return stringbuilder.toString();
        } while (true);
    }

    public static String b(aoe aoe1, boolean flag, String s, List list, List list1, List list2, aob aob1, int i, 
            int j, boolean flag1, dfb dfb1, String s1)
    {
        if (ebw.a("Babel_db", 3))
        {
            int k = list.size();
            ebw.c("Babel_db", (new StringBuilder(52)).append("createConversationLocally:  num invitees ").append(k).toString());
        }
        int i1 = 0;
        int k1 = 0;
        boolean flag2 = false;
        int j1 = 0;
        Object obj1 = aoe1.f();
        Object obj = ((ani) (obj1)).b();
        int l1 = list.size() - 1;
        while (l1 >= 0) 
        {
            Object obj2 = (ceu)list.get(l1);
            Object obj3 = ((ceu)list.get(l1)).b;
            boolean flag3;
            int j2;
            long l2;
            if (!((cey) (obj)).a(((cey) (obj3)).b, ((cey) (obj3)).a))
            {
                boolean flag4 = TextUtils.isEmpty(((ceu) (obj2)).f());
                boolean flag5 = TextUtils.isEmpty(((cey) (obj3)).a);
                flag2 = ((ceu) (obj2)).i() | flag2;
                int i2 = g.a(((ceu) (obj2))) | j1;
                j1 = k1 | flag4;
                k1 = i1 | flag5;
                i1 = i2;
            } else
            {
                int k2 = i1;
                i1 = j1;
                j1 = k1;
                k1 = k2;
            }
            j2 = l1 - 1;
            l1 = k1;
            k1 = j1;
            j1 = i1;
            i1 = l1;
            l1 = j2;
        }
        if (k1 == 0 && (list1 == null || list1.size() == 0))
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (i1 == 0 && (list1 == null || list1.size() == 0))
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (j == 0)
        {
            if (k1 != 0)
            {
                if (((ani) (obj1)).t() && (i != 1 || flag2 || j1 != 0))
                {
                    i1 = 3;
                } else
                {
                    i1 = ((ani) (obj1)).a(0);
                }
            } else
            {
                i1 = 1;
            }
        } else
        {
            i1 = j;
        }
        if (aob1 == aob.a) goto _L2; else goto _L1
_L1:
        if (i != 2) goto _L4; else goto _L3
_L3:
        if (k1 != 0)
        {
            obj = aoe1.a(list, i1);
        } else
        if (flag3)
        {
            obj = aoe1.b(list);
        } else
        {
            obj = null;
        }
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj1 = aoe1.e(((String) (obj)));
            j = ((aoh) (obj1)).r;
            l2 = ((aoh) (obj1)).q;
        } else
        {
            j = 0;
            l2 = 0L;
        }
        if (obj != null) goto _L6; else goto _L5
_L4:
        if (list.size() == 1 && (list1 == null || list1.size() == 0) && i == 1)
        {
            obj1 = ((ceu)list.get(0)).b;
            if (obj1 == null || ((cey) (obj1)).a())
            {
                ebw.g("Babel_db", "Server returned a conversation with empty participantId");
                j = 0;
                l2 = 0L;
                obj = null;
                continue; /* Loop/switch isn't completed */
            }
            if (((cey) (obj)).a(((cey) (obj1)).b, ((cey) (obj1)).a))
            {
                ebw.g("Babel_db", "Trying to start a one on one with self");
                j = 0;
                l2 = 0L;
                obj = null;
                continue; /* Loop/switch isn't completed */
            }
            obj1 = aoe1.a(((cey) (obj1)), false, i1);
            if (obj1 != null)
            {
                obj = ((aou) (obj1)).a;
                l2 = ((aou) (obj1)).c;
                j = ((aou) (obj1)).d;
                continue; /* Loop/switch isn't completed */
            }
        }
          goto _L2
_L5:
        if (k1 != 0)
        {
            obj = aoe.h();
        } else
        {
            obj = aoe.g();
        }
        obj1 = String.valueOf(obj);
        if (((String) (obj1)).length() != 0)
        {
            obj1 = "Creating new conversation no match found. generated id: ".concat(((String) (obj1)));
        } else
        {
            obj1 = new String("Creating new conversation no match found. generated id: ");
        }
        ebw.c("Babel_db", ((String) (obj1)));
        if (!g.d(i1))
        {
            j = 1;
        } else
        {
            j = 0;
        }
        l2 = System.currentTimeMillis();
        if (flag)
        {
            j1 = 2;
        } else
        {
            j1 = 1;
        }
        obj1 = aoe1.a(i, i1, 1000L * l2, ((String) (obj)), j1);
        aoe1.E(((String) (obj1)));
        a(aoe1, ((String) (obj1)), list, list1);
        obj2 = list.iterator();
        do
        {
            if (!((Iterator) (obj2)).hasNext())
            {
                break;
            }
            if (!((ceu)((Iterator) (obj2)).next()).g())
            {
                continue;
            }
            aoe.b(aoe1, ((String) (obj1)));
            break;
        } while (true);
        aoe.a(aoe1, ((String) (obj1)));
        if (j != 0 && dfb1 != null)
        {
            obj2 = new ArrayList();
            for (list = list.iterator(); list.hasNext(); ((List) (obj2)).add(obj3))
            {
                obj3 = (ceu)list.next();
                if (list2 != null)
                {
                    if (((ceu) (obj3)).E == null)
                    {
                        obj3.E = new HashSet();
                    }
                    ((ceu) (obj3)).E.addAll(list2);
                }
            }

            if (list1 != null)
            {
                for (list = list1.iterator(); list.hasNext(); ((List) (obj2)).add(g.b(list1.b(), list1.d())))
                {
                    list1 = (aim)list.next();
                }

            }
            s = new ctv(((String) (obj)), i, i1, s, ((List) (obj2)), s1);
            if (aob1 == aob.c)
            {
                if (a)
                {
                    ebw.b("Babel_db", "CreateConversationLocally -- calling GetConversationRequest");
                }
                dfb1.a(new cuc(s));
            } else
            {
                if (a)
                {
                    ebw.b("Babel_db", "CreateConversationLocally -- calling CreateConversationRequest");
                }
                dfb1.a(s);
            }
        }
        i = 1;
        s = ((String) (obj1));
_L7:
        if (i != 0)
        {
            d(aoe1, s);
        }
        return s;
_L6:
        if (ebw.a("Babel_db", 3))
        {
            s = String.valueOf(obj);
            if (s.length() != 0)
            {
                s = "Using existing conversation ".concat(s);
            } else
            {
                s = new String("Using existing conversation ");
            }
            ebw.c("Babel_db", s);
        }
        aoe1.l(((String) (obj)), 0xffffffff80000001L);
        if (!flag && j == 2)
        {
            RealTimeChatService.a(aoe1.f(), ((String) (obj)), l2, false);
        }
        if (k1 != 0 && flag1)
        {
            a(aoe1, list);
        }
        s = ((String) (obj));
        i = 0;
        if (true) goto _L7; else goto _L2
_L2:
        j = 0;
        l2 = 0L;
        obj = null;
        if (true) goto _L9; else goto _L8
_L8:
        break MISSING_BLOCK_LABEL_1115;
_L9:
        break MISSING_BLOCK_LABEL_360;
    }

    public static void b()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        if (e <= 0)
        {
            int i = e;
            throw new IllegalStateException((new StringBuilder(47)).append("sPendingChangeNotificationsCount is ").append(i).toString());
        }
        break MISSING_BLOCK_LABEL_52;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        int j;
        j = e - 1;
        e = j;
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        ContentResolver contentresolver;
        Iterator iterator;
        contentresolver = g.nS.getContentResolver();
        iterator = f.iterator();
_L1:
        Uri uri;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_137;
            }
            uri = (Uri)iterator.next();
            if (!c(uri))
            {
                break MISSING_BLOCK_LABEL_128;
            }
            a(g.nS, Integer.parseInt(uri.getQueryParameter("account_id")));
        } while (true);
        contentresolver.notifyChange(uri, null);
          goto _L1
        f.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    private static void b(Uri uri)
    {
        if (uri != null && uri.getAuthority() != null)
        {
            String s = uri.getAuthority().toLowerCase(Locale.US);
            byte byte0 = -1;
            if ("sms".equals(s))
            {
                byte0 = 0;
            } else
            if ("mms".equals(s))
            {
                byte0 = 1;
            }
            if (byte0 >= 0)
            {
                dry.b(byte0, drk.c(uri));
                return;
            }
        }
    }

    public static void b(ani ani1, Intent intent)
    {
        SmsMessage smsmessage = drk.a(intent);
        if (smsmessage == null)
        {
            ebw.g("Babel_db", "EsConversationsData.processSmsDeliveryReport: empty report message");
        } else
        {
            long l1 = ContentUris.parseId(intent.getData());
            if (l1 < 0L)
            {
                ebw.g("Babel_db", "EsConversationsData.processSmsDeliveryReport: can't find message");
                return;
            }
            int i;
            long l2;
            try
            {
                i = smsmessage.getStatus();
            }
            // Misplaced declaration of an exception variable
            catch (ani ani1)
            {
                ebw.g("Babel_db", "processSmsDeliveryReport: NPE inside SmsMessage");
                return;
            }
            l2 = System.currentTimeMillis();
            ani1 = new aoe(g.nS, ani1.h());
            ani1.a(l1, i, 1000L * l2);
            b(((aoe) (ani1)), l1);
            ani1 = g.h(ani1.g(l1));
            if (ani1 != null)
            {
                drk.a(ani1, i, l2);
                return;
            }
        }
    }

    public static void b(ani ani1, String s)
    {
        Object obj;
        obj = null;
        if (TextUtils.isEmpty(s))
        {
            ebw.g("Babel_db", "receiveSmsFromDumpFile: empty dump file name");
            return;
        }
        if (!s.startsWith("smsdump-"))
        {
            break MISSING_BLOCK_LABEL_227;
        }
        obj = String.valueOf(Environment.getExternalStorageDirectory());
        s = new ObjectInputStream(new BufferedInputStream(new FileInputStream((new StringBuilder(String.valueOf(obj).length() + 1 + String.valueOf(s).length())).append(((String) (obj))).append("/").append(s).toString())));
        obj = ((Object) ((Object[])s.readObject()));
        s.close();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        if (obj.length > 0)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        ebw.g("Babel_db", "receiveSmsFromDumpFile: empty data");
        s = new SmsMessage[obj.length];
        int i = 0;
_L2:
        if (i >= obj.length)
        {
            break; /* Loop/switch isn't completed */
        }
        s[i] = SmsMessage.createFromPdu((byte[])obj[i]);
        i++;
        if (true) goto _L2; else goto _L1
        ani1;
        try
        {
            s.close();
            throw ani1;
        }
        // Misplaced declaration of an exception variable
        catch (ani ani1) { }
        // Misplaced declaration of an exception variable
        catch (ani ani1) { }
        s = String.valueOf(ani1);
        ebw.e("Babel_db", (new StringBuilder(String.valueOf(s).length() + 24)).append("receiveSmsFromDumpFile: ").append(s).toString(), ani1);
        return;
_L1:
        a(s, ani1, 0, ((Boolean) (null)));
        return;
        if (!s.startsWith("mmsdump-"))
        {
            break MISSING_BLOCK_LABEL_416;
        }
        byte abyte0[];
        try
        {
            String s1 = String.valueOf(Environment.getExternalStorageDirectory());
            abyte0 = g.a(g.a(new File((new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(s).length())).append(s1).append("/").append(s).toString()), false));
        }
        // Misplaced declaration of an exception variable
        catch (ani ani1)
        {
            s = String.valueOf(ani1);
            ebw.e("Babel_db", (new StringBuilder(String.valueOf(s).length() + 24)).append("receiveMmsFromDumpFile: ").append(s).toString(), ani1);
            return;
        }
        s = ((String) (obj));
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_317;
        }
        s = (new aco(abyte0)).a();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_328;
        }
        if (s instanceof acv)
        {
            break MISSING_BLOCK_LABEL_380;
        }
        ebw.g("Babel_db", "receiveMmsFromDumpFile: failed to parse PDU");
        return;
        s = drk.a(g.nS, (acv)s);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_404;
        }
        ebw.g("Babel_db", "receiveMmsFromDumpFile: failed to persist PDU");
        return;
        a(ani1, s, -1L, ((Boolean) (null)), true, false);
        return;
        ani1 = String.valueOf(s);
        if (ani1.length() != 0)
        {
            ani1 = "receiveSmsFromDumpFile: invalid dump file name ".concat(ani1);
        } else
        {
            ani1 = new String("receiveSmsFromDumpFile: invalid dump file name ");
        }
        ebw.g("Babel_db", ani1);
        return;
    }

    public static void b(aoe aoe1)
    {
        ebw.c("Babel_db", "NOTIFY ALL PARTICIPANTS");
        amz.a(aoe1.f(), null);
    }

    public static void b(aoe aoe1, long l1)
    {
        aos aos1 = aoe1.b(l1);
        if (aos1 != null)
        {
            d(aoe1, aos1.b);
        }
    }

    public static void b(aoe aoe1, String s)
    {
        Object obj2;
        Object obj3;
        StringBuilder stringbuilder;
        int i;
        obj2 = aoe1.J(s);
        stringbuilder = new StringBuilder();
        i = 0;
        obj3 = dme.a();
        Object obj4;
        Iterator iterator;
        obj4 = new LinkedList();
        iterator = ((List) (obj2)).iterator();
        Object obj = null;
_L3:
        Object obj1;
        ceu ceu1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_176;
        }
        ceu1 = (ceu)iterator.next();
        aoe1.a(((dme) (obj3)), ceu1);
        obj1 = ceu1.h;
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            break MISSING_BLOCK_LABEL_134;
        }
        if (ceu1.b.equals(aoe1.f().b()))
        {
            break MISSING_BLOCK_LABEL_378;
        }
        if (i >= 5)
        {
            break MISSING_BLOCK_LABEL_369;
        }
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        stringbuilder.append('|');
        stringbuilder.append(((String) (obj1)));
        break MISSING_BLOCK_LABEL_369;
        if (!ceu1.b.equals(aoe1.f().b()))
        {
            ((List) (obj4)).add(ceu1.e);
        }
        continue; /* Loop/switch isn't completed */
        aoe1;
        ((dme) (obj3)).b();
        throw aoe1;
        obj1 = ((List) (obj4)).iterator();
_L1:
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_246;
        }
        obj4 = (String)((Iterator) (obj1)).next();
        if (i >= 5)
        {
            break MISSING_BLOCK_LABEL_246;
        }
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        stringbuilder.append('|');
        stringbuilder.append("defaultavatar://").append(((String) (obj4)));
        i++;
          goto _L1
        ((dme) (obj3)).b();
        obj3 = stringbuilder.toString();
        obj2 = b(aoe1, s, ((List) (obj2)));
        if (ebw.a("Babel_db", 3))
        {
            obj1 = String.valueOf(obj2);
            if (((String) (obj1)).length() != 0)
            {
                obj1 = "generated name ".concat(((String) (obj1)));
            } else
            {
                obj1 = new String("generated name ");
            }
            ebw.c("Babel_db", ((String) (obj1)));
            obj1 = String.valueOf(obj3);
            if (((String) (obj1)).length() != 0)
            {
                obj1 = "packed participant urls ".concat(((String) (obj1)));
            } else
            {
                obj1 = new String("packed participant urls ");
            }
            ebw.c("Babel_db", ((String) (obj1)));
        }
        aoe1.b(s, ((String) (obj2)), ((String) (obj3)), ((String) (obj)));
        return;
        i++;
        continue; /* Loop/switch isn't completed */
        obj = obj1;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public static void b(aoe aoe1, String s, long l1)
    {
        aoe1.l(s, 0xffffffff80000000L);
        if ((8L & l1) != 0L)
        {
            a(aoe1, s, true);
        }
        if ((16L & l1) != 0L)
        {
            a(aoe1, s, false);
        }
        if ((4L & l1) != 0L)
        {
            long l2 = aoe1.m(s);
            if (a)
            {
                ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 64)).append("processPendingArchive ").append(s).append(" ").append(l2).append(" ").append(l2).toString());
            }
            RealTimeChatService.a(aoe1.f(), s, l2, true);
        }
        if ((1L & l1) != 0L)
        {
            if (a)
            {
                String s1 = String.valueOf(s);
                if (s1.length() != 0)
                {
                    s1 = "processPendingLeave ".concat(s1);
                } else
                {
                    s1 = new String("processPendingLeave ");
                }
                ebw.b("Babel", s1);
            }
            RealTimeChatService.h(aoe1.f(), s);
        }
        if ((2L & l1) != 0L)
        {
            l1 = aoe1.m(s);
            if (a)
            {
                ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 63)).append("processPendingDelete ").append(s).append(" ").append(l1).append(" ").append(l1).toString());
            }
            RealTimeChatService.a(aoe1.f(), s, l1);
        }
    }

    public static void b(aoe aoe1, String s, dfb dfb1)
    {
        if (ebw.a("Babel_db", 3))
        {
            String s1 = String.valueOf(s);
            if (s1.length() != 0)
            {
                s1 = "leaveConversationLocally: conversationId=".concat(s1);
            } else
            {
                s1 = new String("leaveConversationLocally: conversationId=");
            }
            ebw.c("Babel_db", s1);
        }
        aoe1.a();
        aoe1.r(s);
        if (!aoe.a(s))
        {
            break MISSING_BLOCK_LABEL_84;
        }
        aoe1.m(s, 1L);
_L1:
        aoe1.b();
        aoe1.c();
        d(aoe1);
        return;
        aoe1.D(s);
        dfb1.a(cuo.a(aoe.g(), s));
          goto _L1
        s;
        aoe1.c();
        throw s;
    }

    public static int c(aoe aoe1, dzx dzx1)
    {
        int i;
        i = 0;
        aoe1.a();
        if (dzx1 != null) goto _L2; else goto _L1
_L1:
        i = aoe1.T(null);
_L6:
        aoe1.b();
        aoe1.c();
        return i;
_L2:
        dzx1 = dzx1.iterator();
_L4:
        int j;
        if (!dzx1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        j = aoe1.T((String)dzx1.next());
        i += j;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
        dzx1;
        aoe1.c();
        throw dzx1;
    }

    public static void c()
    {
        int i = drk.f();
        ebw.e("Babel_db", (new StringBuilder(64)).append("Message purging: deleted ").append(i).append(" media messages in telephony").toString());
        if (i > 0)
        {
            Object obj = dbf.l();
            if (obj != null)
            {
                obj = new aoe(g.nS, ((ani) (obj)).h());
                int j = ((aoe) (obj)).u();
                ebw.e("Babel_db", (new StringBuilder(63)).append("Message purging: deleted ").append(j).append(" media messages in Hangouts").toString());
                c(((aoe) (obj)));
            }
        }
    }

    public static void c(aoe aoe1)
    {
        ebw.c("Babel_db", "NOTIFY ALL MESSAGES");
        d(aoe1, null);
    }

    public static void c(aoe aoe1, String s)
    {
        String s1 = String.valueOf(s);
        if (s1.length() != 0)
        {
            s1 = "NOTIFY PARTICIPANTS, conversation_id=".concat(s1);
        } else
        {
            s1 = new String("NOTIFY PARTICIPANTS, conversation_id=");
        }
        ebw.c("Babel_db", s1);
        g.nS.getContentResolver().notifyChange(EsProvider.a(EsProvider.f, aoe1.f().h()), null);
        amz.a(aoe1.f(), s);
    }

    private static boolean c(Uri uri)
    {
        return uri != null && b.getPath().equals(uri.getPath());
    }

    public static void d(aoe aoe1)
    {
        a(aoe1.f().h());
    }

    public static void d(aoe aoe1, String s)
    {
        ani ani1;
        if (ebw.a("Babel_db", 3))
        {
            Object obj = String.valueOf(s);
            if (((String) (obj)).length() != 0)
            {
                obj = "NOTIFY MESSAGES, conversation_id=".concat(((String) (obj)));
            } else
            {
                obj = new String("NOTIFY MESSAGES, conversation_id=");
            }
            ebw.c("Babel_db", ((String) (obj)));
        }
        ani1 = aoe1.f();
        a(EsProvider.a(EsProvider.f, ani1.h()));
        obj = null;
        if (s != null)
        {
            obj = aoe1.ag(s);
        }
        if (obj != null && ((Set) (obj)).size() > 0)
        {
            for (aoe1 = ((Set) (obj)).iterator(); aoe1.hasNext(); a(EsProvider.b(ani1, ((String) (obj)))))
            {
                obj = (String)aoe1.next();
                a(EsProvider.a(ani1, ((String) (obj))));
            }

        } else
        if (s != null)
        {
            a(EsProvider.a(ani1, s));
            a(EsProvider.b(ani1, s));
        }
        a(EsProvider.c(ani1, s));
        a(b(ani1.h()));
    }

    public static void e(aoe aoe1)
    {
        a(aoe1.f());
    }

    public static void e(aoe aoe1, String s)
    {
        if (ebw.a("Babel_db", 3))
        {
            String s1 = String.valueOf(s);
            if (s1.length() != 0)
            {
                s1 = "NOTIFY EVENT SUGGESTIONS, conversation_id=".concat(s1);
            } else
            {
                s1 = new String("NOTIFY EVENT SUGGESTIONS, conversation_id=");
            }
            ebw.c("Babel_db", s1);
        }
        a(EsProvider.b(aoe1.f().h(), s));
    }

    public static List f(aoe aoe1, String s)
    {
        s = aoe1.J(s);
        aoe1 = new ArrayList();
        s = s.iterator();
        do
        {
            if (!s.hasNext())
            {
                break;
            }
            String s1 = ((ceu)s.next()).f();
            if (!TextUtils.isEmpty(s1))
            {
                aoe1.add(s1.trim());
            }
        } while (true);
        return aoe1;
    }

    static 
    {
        Object obj = ebw.d;
        obj = EsProvider.a;
        b = Uri.parse((new StringBuilder(String.valueOf(obj).length() + 12)).append("receiver://").append(((String) (obj))).append("/").toString());
    }
}
