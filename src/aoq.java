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

public final class aoq
{

    public static final boolean a = false;
    private static final Uri b;
    private static CharSequence c;
    private static final Object d = new Object();
    private static int e = 0;
    private static final HashSet f = new HashSet();

    public static int a(aow aow1, edb edb1)
    {
        int i;
        i = 0;
        aow1.a();
        if (edb1 != null) goto _L2; else goto _L1
_L1:
        i = aow1.w(null);
_L6:
        aow1.b();
        aow1.c();
        if (i > 0)
        {
            aow1 = aow1.f();
            if (aow1 != null)
            {
                a(g.nU, aow1.h());
            }
        }
        return i;
_L2:
        edb1 = edb1.iterator();
_L4:
        int j;
        if (!edb1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        j = aow1.w((String)edb1.next());
        i += j;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
        edb1;
        aow1.c();
        throw edb1;
    }

    public static long a(aow aow1, String s, dgk dgk1, long l1, boolean flag)
    {
        long l2;
        if (eev.a("Babel_db", 3))
        {
            Object obj = String.valueOf(s);
            if (((String) (obj)).length() != 0)
            {
                obj = "updateConversationWatermark conversationId: ".concat(((String) (obj)));
            } else
            {
                obj = new String("updateConversationWatermark conversationId: ");
            }
            eev.c("Babel_db", ((String) (obj)));
        }
        aow1.a();
        obj = aow1.P(s);
        if (obj == null) goto _L2; else goto _L1
_L1:
        l2 = Math.max(((apc) (obj)).a, aow1.m(s));
        if (l1 != 0L) goto _L4; else goto _L3
_L3:
        l1 = l2;
_L13:
        if (l1 <= ((apc) (obj)).b) goto _L2; else goto _L5
_L5:
        aow1.a(s, l1, true, "useraction");
        obj = aow1.f();
        cfo.a(g.nU, ((aoa) (obj)).h(), true);
        a(g.nU, ((aoa) (obj)).h());
        if (dgk1 == null) goto _L7; else goto _L6
_L6:
        if (aow.a(s)) goto _L7; else goto _L8
_L8:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        dgk1.a(new cxo(s, l1));
        dgk1.f();
_L11:
        aow1.b();
        aow1.c();
        d(aow1, s);
        return l1;
_L4:
        if (l1 <= l2)
        {
            continue; /* Loop/switch isn't completed */
        }
        eev.g("Babel_db", (new StringBuilder(72)).append("New watermark: ").append(l1).append("; max watermark: ").append(l2).toString());
        gdv.a("New watermark greater than maximum possible watermark");
        continue; /* Loop/switch isn't completed */
_L7:
        if (!aow.b(s)) goto _L2; else goto _L9
_L9:
        l2 = aow1.Z(s);
        if (l2 == -1L) goto _L2; else goto _L10
_L10:
        due.a(l2, l1 / 1000L);
_L2:
        l1 = -1L;
          goto _L11
        s;
        aow1.c();
        throw s;
        if (true) goto _L13; else goto _L12
_L12:
    }

    public static String a(aow aow1, boolean flag, String s, List list, List list1, List list2, aot aot1, int i, 
            int j, boolean flag1, dgk dgk1, String s1)
    {
        aow1.a();
        s = b(aow1, flag, s, list, list1, list2, aot1, i, j, flag1, dgk1, s1);
        aow1.b();
        aow1.c();
        return s;
        s;
        aow1.c();
        throw s;
    }

    public static List a(aoa aoa1, String s)
    {
        return (new aow(g.nU, aoa1.h())).a(s, aoa1.b());
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
            eev.b("Babel_db", "NOTIFY CONVERSATIONS");
        }
        a(EsProvider.a(EsProvider.f, i));
        a(EsProvider.a(EsProvider.g, i));
        a(EsProvider.a(EsProvider.h, i));
        a(b(i));
    }

    public static void a(int i, ach ach1)
    {
        Object obj;
        Object obj1;
        aow aow1;
        String s;
        String s1;
        aoa aoa1 = dcn.e(i);
        if (aoa1 == null)
        {
            eev.g("Babel_db", "EsConversationsData.processMmsNotification: no account");
            return;
        }
        aow1 = new aow(g.nU, aoa1.h());
        s = due.a(ach1.d(), "UTF-8");
        byte abyte0[] = ach1.g();
        s1 = due.a(abyte0, "UTF-8");
        obj = ach1.c();
        if (obj != null)
        {
            obj = ((ace) (obj)).c();
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
        long l1 = ach1.f();
        long l2 = ach1.e();
        boolean flag = a(g.m(((String) (obj1))));
        Rfc822Token arfc822token[];
        int j;
        if (due.e() && !flag)
        {
            ach1 = new ContentValues();
            ach1.put("content_location", s);
            ach1.put("transaction_id", s1);
            ach1.put("from_address", ((String) (obj1)));
            ach1.put("message_size", Long.valueOf(l1));
            ach1.put("expiry", Long.valueOf(l2));
            l1 = aow1.a(ach1);
            RealTimeChatService.a(aoa1.h(), s, abyte0, l1, true);
            return;
        } else
        {
            a(aow1, s, s1, ((String) (obj1)), flag, l1, l2, 0, l.gq);
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
        int i = due.c(l1);
        eev.e("Babel_db", (new StringBuilder(70)).append("Message purging: deleted ").append(i).append(" old sms/mms messages in telephony").toString());
        if (i > 0)
        {
            Object obj = dcn.l();
            if (obj != null)
            {
                obj = new aow(g.nU, ((aoa) (obj)).h());
                int j = ((aow) (obj)).l(l1 * 1000L);
                eev.e("Babel_db", (new StringBuilder(69)).append("Message purging: deleted ").append(j).append(" old sms/mms messages in Hangouts").toString());
                c(((aow) (obj)));
            }
        }
    }

    public static void a(Context context, int i)
    {
        if (a)
        {
            eev.b("Babel_db", "broadcastDatasetChanged");
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
        a(g.nU, Integer.parseInt(uri.getQueryParameter("account_id")));
_L3:
        return;
_L2:
        g.nU.getContentResolver().notifyChange(uri, null);
          goto _L3
        uri;
        obj;
        JVM INSTR monitorexit ;
        throw uri;
        f.add(uri);
          goto _L3
    }

    public static void a(aoa aoa1)
    {
        if (a)
        {
            eev.b("Babel_db", "NOTIFY CONVERSATION");
        }
        a(EsProvider.a(EsProvider.g, aoa1.h()));
        a(b(aoa1.h()));
    }

    public static void a(aoa aoa1, long l1, boolean flag, int i)
    {
        if (l1 >= 0L) goto _L2; else goto _L1
_L1:
        eev.g("Babel_db", (new StringBuilder(75)).append("displayMmsDownloadFailure: invalid notification row id ").append(l1).toString());
_L4:
        return;
_L2:
        Object obj;
        aoa1 = new aow(g.nU, aoa1.h());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        obj = aoa1.e();
        String as[] = aou.a;
        String s = String.valueOf("_id=");
        obj = ((apv) (obj)).a("mms_notification_inds", as, (new StringBuilder(String.valueOf(s).length() + 20)).append(s).append(l1).toString(), null, null);
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (((Cursor) (obj)).moveToFirst())
        {
            a(((aow) (aoa1)), ((Cursor) (obj)).getString(0), ((Cursor) (obj)).getString(1), ((Cursor) (obj)).getString(2), false, ((Cursor) (obj)).getLong(3), ((Cursor) (obj)).getLong(4), i, l.gq);
            aoa1.m(l1);
        }
        ((Cursor) (obj)).close();
        return;
        aoa1;
        ((Cursor) (obj)).close();
        throw aoa1;
        ContentValues contentvalues = new ContentValues();
        apv apv1;
        String s1;
        int j;
        if (i == 0)
        {
            j = dsu.e.ordinal();
        } else
        {
            j = dsu.d.ordinal();
        }
        contentvalues.put("status", Integer.valueOf(j));
        contentvalues.put("sending_error", Integer.valueOf(i));
        apv1 = aoa1.e();
        s1 = String.valueOf("_id=");
        apv1.a("messages", contentvalues, (new StringBuilder(String.valueOf(s1).length() + 20)).append(s1).append(l1).toString(), null);
        b(aoa1, l1);
        return;
    }

    public static void a(aoa aoa1, Intent intent)
    {
        String s;
        SmsMessage asmsmessage[];
        asmsmessage = android.provider.Telephony.Sms.Intents.getMessagesFromIntent(intent);
        s = intent.getStringExtra("format");
        if (asmsmessage == null || asmsmessage.length <= 0)
        {
            eev.g("Babel_db", "processReceivedSms: null or zero message");
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
            catch (aoa aoa1)
            {
                eev.g("Babel_db", "processReceivedSms: NPE inside SmsMessage");
                return;
            }
            i++;
        } while (true);
        if (!due.i()) goto _L2; else goto _L1
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
            eev.e("Babel", (new StringBuilder(String.valueOf(s1).length() + 9)).append("dumpSms: ").append(s1).toString(), ((Throwable) (obj)));
        }
_L2:
        Exception exception;
        if (asmsmessage[0].getMessageClass() == android.telephony.SmsMessage.MessageClass.CLASS_0)
        {
            intent = asmsmessage[0];
            obj = g.nU;
            ((Context) (obj)).startActivity((new Intent(((Context) (obj)), com/google/android/apps/hangouts/phone/ClassZeroActivity)).putExtra("pdu", intent.getPdu()).putExtra("format", s).putExtra("account_id", aoa1.h()).setFlags(0x18000000));
            return;
        } else
        {
            a(asmsmessage, aoa1, intent.getIntExtra("errorCode", 0), ((Boolean) (null)));
            aoc.a(g.nU, aoa1.h(), "received_sms_count_since_last_upload");
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

    public static void a(aoa aoa1, Intent intent, boolean flag)
    {
        a(aoa1, (Uri)intent.getParcelableExtra("uri"), intent.getLongExtra("notification_row_id", -1L), ((Boolean) (null)), flag, false);
    }

    private static void a(aoa aoa1, Uri uri, long l1, Boolean boolean1, boolean flag, boolean flag1)
    {
        if (uri != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        aow aow1 = new aow(g.nU, aoa1.h());
        Object obj;
        String s;
        Object obj1;
        Object obj3;
        dtl dtl1;
        List list;
        String s1;
        String s2;
        String s3;
        List list1;
        dsu dsu1;
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
                aow1.m(l1);
                s = null;
            } else
            {
                s = aow1.n(l1);
                aow1.f(l1);
            }
        } else
        {
            s = null;
        }
        dtl1 = due.e(uri);
        if (dtl1 == null)
        {
            eev.g("Babel_db", "EsConversationsData.processReceivedMms: failed to load mms");
            return;
        }
        if (dtl1.w.size() <= 0)
        {
            eev.g("Babel_db", "EsConversationsData.processReceivedMms: MMS message has no part");
            return;
        }
        list = due.a(dtl1.r);
        if (list == null || list.size() <= 0)
        {
            eev.g("Babel_db", "EsConversationsData.processReceivedMms: MMS message has no recipient");
            return;
        }
        if (flag1)
        {
            obj = aow1.f().b();
            obj1 = null;
        } else
        {
            obj = due.a(list, dtl1.m);
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                cgd cgd1 = g.m(((String) (obj)));
                obj1 = obj;
                obj = cgd1;
            } else
            {
                Object obj2 = null;
                obj1 = obj;
                obj = obj2;
            }
        }
        if (obj == null)
        {
            aoa1 = String.valueOf("EsConversationsData.processReceivedMms: MMS has no From: id=");
            l1 = dtl1.m;
            int i = dtl1.n;
            long l2 = dtl1.r;
            eev.g("Babel_db", (new StringBuilder(String.valueOf(aoa1).length() + 68)).append(aoa1).append(l1).append(" type=").append(i).append(" thread_id=").append(l2).toString());
            return;
        }
        l3 = dtl1.q;
        flag1 = a(((cgd) (obj)));
        if (flag1)
        {
            obj3 = obj;
        } else
        {
            obj3 = null;
        }
        s1 = due.a(aow1, ((cgd) (obj3)), list);
        if (TextUtils.isEmpty(s1))
        {
            eev.g("Babel_db", "EsConversationsData.processNewMms: empty conversation id");
            return;
        }
        flag2 = RealTimeChatService.d(aoa1, s1);
        obj3 = boolean1;
        if (boolean1 == null)
        {
            obj3 = Boolean.valueOf(flag2);
        }
        due.a(uri, g.a(((Boolean) (obj3)), false));
        j = dtl1.k();
        flag3 = dtl1.i();
        if (j > 1 || j > 0 && !flag3)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        boolean1 = new dgk();
        s2 = aow.g();
        s3 = dtl1.e();
        list1 = dtl1.l();
        dsu1 = dsu.e;
        s4 = g.a(new String[] {
            uri.toString()
        });
        k = dtl1.s;
        l4 = dtl1.h();
        s5 = dtl1.o;
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
        (new dkp(s1, ((cgd) (obj)), l3, s2, null, s3, list1, false, dsu1, 0, 3, null, s4, 0L, k, l4, s5, j, null, 0, 0L)).a(1).a(((String) (obj1))).b(due.a(list, ((String) (obj1)))).a(aow1, boolean1);
        aow1.a();
        aow1.h(s1, l3);
        aow1.m(s1, dtl1.r);
        if (flag1 || flag2)
        {
            break MISSING_BLOCK_LABEL_610;
        }
        cfo.a(g.nU, aoa1.h(), false);
        if (!g.a(((Boolean) (obj3)), false)) goto _L4; else goto _L3
_L3:
        aow1.a(s1, l3, false, "processnewsms");
_L7:
        aow1.b();
        aow1.c();
        d(aow1, s1);
        if (!TextUtils.equals(s1, s) && l1 > 0L && !flag)
        {
            RealTimeChatService.a(s, aoa1, new aor(((String) (obj1))));
        }
        b(uri);
        if (obj1 == null) goto _L1; else goto _L5
_L5:
        aoc.a(g.nU, aoa1.h(), "received_mms_count_since_last_upload");
        return;
_L4:
        if (!flag1) goto _L7; else goto _L6
_L6:
        aow1.w(s1);
          goto _L7
        aoa1;
        aow1.c();
        throw aoa1;
    }

    public static void a(aoa aoa1, dgk dgk1, String s)
    {
        aoa1 = new aow(g.nU, aoa1.h());
        aoa1.e(s, 0);
        a(dgk1, ((aow) (aoa1)), s);
    }

    public static void a(aoa aoa1, String s, int i)
    {
        (new aow(g.nU, aoa1.h())).e(s, i);
    }

    public static void a(aoa aoa1, String s, String s1)
    {
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        aoa1 = new aow(g.nU, aoa1.h());
        aoa1.a();
        aoa1.b(s, s1);
        aoa1.b();
        aoa1.c();
        return;
        s;
        aoa1.c();
        throw s;
        eev.g("Babel_db", "revertConversationName: empty name");
        return;
    }

    public static void a(aoa aoa1, String s, String s1, String s2)
    {
        gdv.b("Expected condition to be false", TextUtils.isEmpty(s1));
        if (g.c(s2) || "hangouts/gv_voicemail".equals(s2))
        {
            RealTimeChatService.r(aoa1, s1);
        } else
        if (g.d(s2))
        {
            RealTimeChatService.f(aoa1, s, s1);
            return;
        }
    }

    public static void a(aow aow1)
    {
        aow1.v();
        d(aow1);
    }

    public static void a(aow aow1, long l1)
    {
        aow1.a();
        String s = (String)aow1.c(l1).first;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        aow1.f(l1);
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
        aow1.e().a("conversations", contentvalues, "conversation_id=? AND snippet_message_row_id=?", new String[] {
            s, String.valueOf(l1)
        });
        aow1.b();
        aow1.c();
        Exception exception;
        if (s != null)
        {
            d(aow1, s);
            return;
        } else
        {
            d(aow1);
            return;
        }
        exception;
        aow1.c();
        throw exception;
    }

    private static void a(aow aow1, long l1, dgk dgk1, apk apk1)
    {
        Object obj = f(aow1, apk1.b);
        long l2 = aow1.b(apk1.b, 1000);
        if (apk1.z == 1)
        {
            String s = apk1.o;
            if ("hangouts/location".equals(s))
            {
                s = "image/jpeg";
            }
            dgk1.a((new djf(apk1.b, apk1.a, l2)).a((String[])((List) (obj)).toArray(new String[((List) (obj)).size()])).a(apk1.C).b(apk1.a()).c(apk1.j).d(s).a(apk1.A).b(apk1.B).c(apk1.D).e(apk1.G).d(apk1.H).a(l1).a());
        } else
        if (apk1.z == 0)
        {
            long l3 = due.a(g.nU, ((List) (obj)));
            String s1 = aow1.Y(apk1.b);
            obj = ((List) (obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                String s2 = (String)((Iterator) (obj)).next();
                dgk1.a((new djn(apk1.b, apk1.a, l2)).a(s2).b(apk1.a()).a(l3).c(s1).b(l1).a());
            }
        } else
        {
            int i = apk1.z;
            eev.g("Babel_db", (new StringBuilder(50)).append("Resending unknown type of SMS message: ").append(i).toString());
            return;
        }
        aow1.a(l1, dsu.c, l2);
    }

    private static void a(aow aow1, aoz aoz1, long l1, boolean flag, dgk dgk1)
    {
        apk apk1 = aow1.b(l1);
        if (apk1 == null || apk1.b == null)
        {
            eev.f("Babel_db", (new StringBuilder(36)).append("No such message ").append(l1).toString());
            return;
        }
        if (a)
        {
            String s = String.valueOf("sending queued message type: ");
            String s1 = String.valueOf(apk1.g);
            String s2 = apk1.b;
            long l2 = apk1.h;
            eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 49 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append(" conversationId: ").append(s2).append(" timestamp: ").append(l2).toString());
        }
        switch (aos.a[apk1.g.ordinal()])
        {
        default:
            aow1 = String.valueOf(apk1.g);
            eev.g("Babel", (new StringBuilder(String.valueOf(aow1).length() + 30)).append("unknown message type to send: ").append(aow1).toString());
            return;

        case 1: // '\001'
            if (g.d(apk1.x))
            {
                a(aow1, l1, dgk1, apk1);
                return;
            }
            if (apk1.f == dsu.e)
            {
                aow1 = String.valueOf(apk1.a);
                if (aow1.length() != 0)
                {
                    aow1 = "Skip sending message since it is already on server:".concat(aow1);
                } else
                {
                    aow1 = new String("Skip sending message since it is already on server:");
                }
                eev.f("Babel_db", aow1);
                return;
            }
            dja.a(aow1, dgk1, apk1, aoz1);
            long l3 = 1000L * System.currentTimeMillis();
            if (flag)
            {
                dgk1 = apk1.j;
                aoz1 = dgk1;
                if (dgk1 == null)
                {
                    aoz1 = apk1.k;
                }
                aow1.a(apk1.b, l3, apk1.i, 6, apk1.o, aow1.f().b(), apk1.e, aoz1, l1, apk1.z, 0);
            }
            aoz1 = dsu.b;
            if (!flag)
            {
                l3 = -1L;
            }
            aow1.a(l1, aoz1, l3);
            return;

        case 2: // '\002'
            a(dgk1, apk1, true);
            return;

        case 3: // '\003'
            a(dgk1, apk1, false);
            return;

        case 4: // '\004'
        case 5: // '\005'
            aow1 = aow1.K(apk1.F);
            dgk1.a(new cvw(apk1.a, apk1.b, aow1, apk1.h));
            return;

        case 6: // '\006'
            dgk1.a(new cwt(apk1.a, apk1.b, apk1.E, null));
            return;
        }
    }

    public static void a(aow aow1, cxr cxr1, dgk dgk1)
    {
        if (eev.a("Babel_db", 3))
        {
            String s = String.valueOf(cxr1.getClass().getSimpleName());
            if (s.length() != 0)
            {
                s = "processServerResponse of type ".concat(s);
            } else
            {
                s = new String("processServerResponse of type ");
            }
            eev.c("Babel_db", s);
        }
        cxr1.f = false;
        cxr1.a(aow1, dgk1);
        if (!cxr1.f)
        {
            aow1 = String.valueOf(cxr1.getClass().getSimpleName());
            if (aow1.length() != 0)
            {
                aow1 = "did not call through to super -- ".concat(aow1);
            } else
            {
                aow1 = new String("did not call through to super -- ");
            }
            throw new IllegalStateException(aow1);
        } else
        {
            return;
        }
    }

    public static void a(aow aow1, dgk dgk1, int i)
    {
        ede ede1;
        ede1 = null;
        if (edc.b())
        {
            ede1 = (new ede()).a("request_more_conversations").b((new StringBuilder(22)).append("filterMode=").append(i).toString()).a(aow1.f());
        }
        aow1.a();
        long l2 = aow1.b(i);
        if (l2 != -2L) goto _L2; else goto _L1
_L1:
        if (ede1 == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        ede1.b("continuationEndTimeStamp=exhausted").b("notifyExhausted").b();
_L5:
        aow1.b();
        aow1.c();
        if (ede1 != null)
        {
            ede1.b();
        }
        return;
_L2:
        long l3 = aoc.a(g.nU, aow1.f().h(), "last_successful_sync_time", 0L);
        long l1;
        l1 = l2;
        if (l2 != -1L)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        l1 = aow1.a(i);
        if (a)
        {
            eev.b("Babel_db", (new StringBuilder(52)).append("requesting conversations before ").append(l1).toString());
        }
        if (eev.a("Babel_db", 3))
        {
            eev.c("Babel_db", (new StringBuilder(124)).append("create SRC from scroll back, filter=").append(i).append(", oldestConversationTimestamp=").append(l1).append(", suppressNotification=true").toString());
        }
        if (ede1 == null) goto _L4; else goto _L3
_L3:
        ede1.b((new StringBuilder(45)).append("continuationEndTimeStamp=").append(l1).toString());
          goto _L4
_L6:
        if (ede1 == null)
        {
            break MISSING_BLOCK_LABEL_284;
        }
        ede1.b("calledSRC");
        dgk1.a(new cxl(l1, i));
          goto _L5
        dgk1;
        aow1.c();
        throw dgk1;
_L7:
        if (ede1 == null)
        {
            break MISSING_BLOCK_LABEL_320;
        }
        ede1.b("empty");
        if (eev.a("Babel_db", 3))
        {
            eev.c("Babel_db", "requestMoreConversations - db empty, warm sync executing doing nothing");
        }
          goto _L5
_L4:
        if (l1 <= 0L && l3 == 0L && i == 1) goto _L7; else goto _L6
    }

    public static void a(aow aow1, dgk dgk1, boolean flag, boolean flag1, String s)
    {
        eev.c("Babel_db", "requestWarmSync");
        aow1.a();
        long l1 = aoc.a(g.nU, aow1.f().h(), "last_successful_sync_time", 0L);
        if (l1 != 0L) goto _L2; else goto _L1
_L1:
        if (a)
        {
            s = String.valueOf(aow1.f().a());
            eev.b("Babel_db", (new StringBuilder(String.valueOf(s).length() + 58)).append("Warm sync fall back to cold sync for: ").append(s).append(", create SRC request").toString());
        }
        dgk1.a(new cxl(5, null));
        dgk1.a(new cxl(6, null));
_L6:
        aow1.b();
        aow1.c();
        if (g.a(g.nU, "babel_gsi_atwarmsync", true) && !aow1.f().o())
        {
            RealTimeChatService.a(aow1.f());
        }
        return;
_L2:
        Object obj;
        LinkedList linkedlist;
        Iterator iterator;
        List list = aow1.d(l1);
        linkedlist = new LinkedList();
        obj = new LinkedList();
        iterator = list.iterator();
        Object obj1 = null;
_L5:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        String s1;
        Object obj4;
        obj4 = (Pair)iterator.next();
        s1 = (String)((Pair) (obj4)).first;
        obj4 = (String)((Pair) (obj4)).second;
        if (a)
        {
            eev.c("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 38 + String.valueOf(obj4).length())).append("Warm sync new event since last sync: ").append(s1).append(" ").append(((String) (obj4))).toString());
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_323;
        }
        if (((String) (obj1)).equals(s1))
        {
            break MISSING_BLOCK_LABEL_503;
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_347;
        }
        linkedlist.add(new cwn(((String) (obj1)), ((List) (obj))));
        obj1 = new LinkedList();
        obj = s1;
_L7:
        ((List) (obj1)).add(obj4);
        Object obj2 = obj1;
        obj1 = obj;
        obj = obj2;
          goto _L5
_L4:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_409;
        }
        linkedlist.add(new cwn(((String) (obj1)), ((List) (obj))));
        s = new cxk(l1, linkedlist, aow1.l(), flag, flag1, s);
        if (eev.a("Babel_db", 3))
        {
            eev.c("Babel_db", (new StringBuilder(101)).append("SyncAllNewEventsRequest ").append(l1).append(" noMissedEventsExpected=").append(flag).append(" suppressNotifications=").append(flag1).toString());
        }
        dgk1.a(s);
          goto _L6
        dgk1;
        aow1.c();
        throw dgk1;
        Object obj3 = obj;
        obj = obj1;
        obj1 = obj3;
          goto _L7
    }

    private static void a(aow aow1, dmo dmo1)
    {
        if (!aow1.f().b().equals(dmo1.d))
        {
            aow1 = new dnt(dmo1.c, dmo1.d, dmo1.e);
            ((aru)hlp.a(g.nU, aru)).a(aow1);
            RealTimeChatService.a(aow1);
        }
    }

    public static void a(aow aow1, dmw dmw, dgk dgk1, long l1, long l2, long l3)
    {
        if (!(dmw instanceof dng)) goto _L2; else goto _L1
_L1:
        Object obj = (dng)dmw;
        if (!((dng) (obj)).q) goto _L4; else goto _L3
_L3:
        if (a(aow1, ((dng) (obj)).c, ((dng) (obj)).e, dgk1, ((dng) (obj)))) goto _L6; else goto _L5
_L5:
        if (a)
        {
            aow1 = ((dng) (obj)).c;
            dmw = ((dng) (obj)).m;
            l1 = ((dng) (obj)).e;
            eev.b("Babel_db", (new StringBuilder(String.valueOf(aow1).length() + 68 + String.valueOf(dmw).length())).append("processEvent saving event ").append(aow1).append(" eventId: ").append(dmw).append(" timestamp: ").append(l1).toString());
        }
_L13:
        return;
_L4:
        dmw = aow1.f().b();
        if (!((dng) (obj)).d.a()) goto _L8; else goto _L7
_L7:
        eev.g("Babel_db", "Sender id for unpersisted event should not be empty");
_L11:
        boolean flag = false;
_L10:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (a)
        {
            aow1 = ((dng) (obj)).c;
            dmw = ((dng) (obj)).m;
            l1 = ((dng) (obj)).e;
            eev.b("Babel_db", (new StringBuilder(String.valueOf(aow1).length() + 78 + String.valueOf(dmw).length())).append("Unable to process unpersisted event ").append(aow1).append(" eventId: ").append(dmw).append(" timestamp: ").append(l1).toString());
            return;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (((dng) (obj)).d.equals(dmw))
        {
            break; /* Loop/switch isn't completed */
        }
        apm apm1 = aow1.a(((dng) (obj)).d, false, 1);
        if (apm1 != null && !aow.a(apm1.a))
        {
            if (a)
            {
                dmw = ((dng) (obj)).c;
                String s4 = apm1.a;
                eev.b("Babel_db", (new StringBuilder(String.valueOf(dmw).length() + 43 + String.valueOf(s4).length())).append("unpersisted conversation ").append(dmw).append(" exists locally as").append(s4).toString());
            }
            obj.c = apm1.a;
        } else
        {
            if (eev.a("Babel_db", 3))
            {
                String s = ((dng) (obj)).c;
                eev.c("Babel_db", (new StringBuilder(String.valueOf(s).length() + 36)).append("conversation ").append(s).append(" does not exist locally").toString());
            }
            aow1.a(((dng) (obj)).c, ((dng) (obj)).e, ((dng) (obj)).d);
            aow1.E(((dng) (obj)).c);
            aow1.a(((dng) (obj)).c, g.a(((dng) (obj)).d, null, null, null, null, null));
            ArrayList arraylist = new ArrayList();
            arraylist.add(((dng) (obj)).d);
            arraylist.add(dmw);
            dgk1.a(g.nU, aow1, ((dng) (obj)).c, arraylist);
            b(aow1, ((dng) (obj)).c);
        }
        flag = true;
        if (true) goto _L10; else goto _L9
_L9:
        if (eev.a("Babel_db", 3))
        {
            dmw = String.valueOf(((dng) (obj)).c);
            if (dmw.length() != 0)
            {
                dmw = "Only self user Id is present, cannot determine conversation for ".concat(dmw);
            } else
            {
                dmw = new String("Only self user Id is present, cannot determine conversation for ");
            }
            eev.c("Babel_db", dmw);
        }
        if (true) goto _L11; else goto _L6
_L6:
        dgk1.a(g.nU, aow1, ((dng) (obj)).c, ((dng) (obj)).a());
        if (!(obj instanceof dmo))
        {
            break; /* Loop/switch isn't completed */
        }
        dmw = (dmo)obj;
        if (a)
        {
            String s1 = dmw.b();
            if (s1 != null)
            {
                String s5 = String.valueOf(aow1.f().a());
                eev.b("Babel_Stress", (new StringBuilder(String.valueOf(s5).length() + 34 + String.valueOf(s1).length())).append("Received stress message push for ").append(s5).append(":").append(s1).toString());
            }
        }
        (new dkp(dmw, true, l1, l2, l3, 0L)).a(aow1, dgk1);
        a(aow1, ((dmo) (dmw)));
        if (!aow1.f().b().equals(((dmo) (dmw)).d))
        {
            ((bwz)hlp.a(g.nU, bwz)).a(aow1.f().h(), bxa.b);
        }
_L14:
        if (((dng) (obj)).o)
        {
            aow1.g(((dng) (obj)).c, ((dng) (obj)).e);
            return;
        }
        if (true) goto _L13; else goto _L12
_L12:
        if (!(obj instanceof dnk))
        {
            break MISSING_BLOCK_LABEL_955;
        }
        dnk dnk1 = (dnk)obj;
        if (a)
        {
            dmw = String.valueOf("processMembershipChange conversationId: ");
            String s6 = String.valueOf(dnk1.c);
            if (s6.length() != 0)
            {
                dmw = dmw.concat(s6);
            } else
            {
                dmw = new String(dmw);
            }
            eev.b("Babel_db", dmw);
        }
        dmw = dnk1.c;
        aow1.a();
        a(aow1, dnk1, dgk1, true);
        aow1.b();
        aow1.c();
        eev.c("Babel_db", "updating conversation (name/avatars) because of a memebership change.");
        b(aow1, dnk1.c);
        d(aow1);
        d(aow1, dmw);
        c(aow1, dmw);
          goto _L14
        dmw;
        aow1.c();
        throw dmw;
label0:
        {
            if (!(obj instanceof dnd))
            {
                break label0;
            }
            (new dkq((dnd)obj)).a(aow1, dgk1);
        }
          goto _L14
        if (!(obj instanceof dnh))
        {
            break MISSING_BLOCK_LABEL_1056;
        }
        dmw = (dnh)obj;
        aow1.a();
        boolean flag1;
        flag1 = a(aow1, ((dnh) (dmw)), dgk1);
        aow1.b();
        aow1.c();
        if (flag1)
        {
            d(aow1, ((dnh) (dmw)).c);
        }
        (new dks((dnh)obj)).c(aow1);
          goto _L14
        dmw;
        aow1.c();
        throw dmw;
        if (obj instanceof dnm)
        {
            (new dkt((dnm)obj)).c(aow1);
        }
          goto _L14
_L2:
        String s3;
        if (!(dmw instanceof dnt))
        {
            break MISSING_BLOCK_LABEL_1467;
        }
        obj = (dnt)dmw;
        if (a)
        {
            dmw = String.valueOf("processWatermarkNotification ConversationId: ");
            String s2 = ((dnt) (obj)).c;
            l1 = ((dnt) (obj)).e;
            eev.b("Babel_db", (new StringBuilder(String.valueOf(dmw).length() + 32 + String.valueOf(s2).length())).append(dmw).append(s2).append(" Timestamp: ").append(l1).toString());
        }
        s3 = ((dnt) (obj)).c;
        aow1.a();
        if (!a) goto _L16; else goto _L15
_L15:
        if (!aow1.f().b().equals(((dnt) (obj)).d)) goto _L18; else goto _L17
_L17:
        dmw = "self";
_L19:
        String s7 = String.valueOf("processWatermarkNotificationInTransaction  conversationId: ");
        String s10 = ((dnt) (obj)).c;
        l1 = ((dnt) (obj)).e;
        String s11 = String.valueOf(new Date(((dnt) (obj)).e / 1000L));
        eev.b("Babel_db", (new StringBuilder(String.valueOf(s7).length() + 45 + String.valueOf(s10).length() + String.valueOf(dmw).length() + String.valueOf(s11).length())).append(s7).append(s10).append(" chatId: ").append(dmw).append(" timestamp: ").append(l1).append("  (").append(s11).append(")").toString());
_L16:
        if (!aow1.f().b().equals(((dnt) (obj)).d))
        {
            break MISSING_BLOCK_LABEL_1435;
        }
        aow1.a(((dnt) (obj)).c, ((dnt) (obj)).e, false, "WatermarkNotification");
        if (!dcz.v(aow1.f().h()))
        {
            dgk1.f();
        }
_L20:
        aow1.b();
        aow1.c();
        d(aow1, s3);
        return;
_L18:
        dmw = ((dnt) (obj)).d.b;
          goto _L19
        ((aru)hlp.a(g.nU, aru)).a(((dnt) (obj)));
        RealTimeChatService.a(((dnt) (obj)));
          goto _L20
        dmw;
        aow1.c();
        throw dmw;
        if ((dmw instanceof dnj) && dcz.v(aow1.f().h()))
        {
            a(aow1, (dnj)dmw, dgk1);
            return;
        }
        if (!(dmw instanceof dnc))
        {
            break MISSING_BLOCK_LABEL_1575;
        }
        if (!a(aow1.f(), (dnc)dmw))
        {
            g.a(aow1.f(), 1839);
            return;
        }
        dmw = (dnc)dmw;
        aow1.a();
        flag1 = a(aow1, ((dnc) (dmw)), 0L, ((String) (null)), dgk1, ((aov) (null)), false);
        aow1.b();
        aow1.c();
        if (!flag1) goto _L13; else goto _L21
_L21:
        d(aow1);
        return;
        dmw;
        aow1.c();
        throw dmw;
        if (!(dmw instanceof dnq))
        {
            break MISSING_BLOCK_LABEL_1847;
        }
        dmw = (dnq)dmw;
        if (a)
        {
            dgk1 = String.valueOf("processFocus conversationId: ");
            obj = ((dnq) (dmw)).c;
            s3 = String.valueOf(((dnq) (dmw)).d);
            int i = ((dnq) (dmw)).a;
            l1 = ((dnq) (dmw)).e;
            String s8 = String.valueOf(new Date(((dnq) (dmw)).e / 1000L));
            eev.b("Babel_db", (new StringBuilder(String.valueOf(dgk1).length() + 68 + String.valueOf(obj).length() + String.valueOf(s3).length() + String.valueOf(s8).length())).append(dgk1).append(((String) (obj))).append(" senderId: ").append(s3).append(" type: ").append(i).append(" and timestamp ").append(l1).append("  (").append(s8).append(")").toString());
        }
        aow1.a();
        if (((dnq) (dmw)).c != null) goto _L23; else goto _L22
_L22:
        eev.g("Babel_db", "Received a Presence message without conversation id");
_L25:
        aow1.b();
        aow1.c();
        return;
_L23:
        dgk1 = ((dnq) (dmw)).c;
        if (aow1.f().b().equals(((dnq) (dmw)).d)) goto _L25; else goto _L24
_L24:
        obj = ((dnq) (dmw)).d;
        if (1 == ((dnq) (dmw)).a)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        RealTimeChatService.a(dgk1, ((cgd) (obj)), flag1);
          goto _L25
        dmw;
        aow1.c();
        throw dmw;
        if (!(dmw instanceof dnr))
        {
            break MISSING_BLOCK_LABEL_2140;
        }
        dmw = (dnr)dmw;
        if (a)
        {
            dgk1 = String.valueOf("processTyping senderId: ");
            obj = String.valueOf(((dnr) (dmw)).d);
            s3 = ((dnr) (dmw)).c;
            int j = ((dnr) (dmw)).a;
            l1 = ((dnr) (dmw)).e;
            String s9 = String.valueOf(new Date(((dnr) (dmw)).e / 1000L));
            eev.b("Babel_db", (new StringBuilder(String.valueOf(dgk1).length() + 70 + String.valueOf(obj).length() + String.valueOf(s3).length() + String.valueOf(s9).length())).append(dgk1).append(((String) (obj))).append(" conversationId: ").append(s3).append(" type: ").append(j).append(" timestamp ").append(l1).append("  (").append(s9).append(")").toString());
        }
        aow1.a();
        dgk1 = aow1.f();
        if (dgk1.b().equals(((dnr) (dmw)).d)) goto _L27; else goto _L26
_L26:
        obj = ((dnr) (dmw)).c;
        if (obj != null) goto _L29; else goto _L28
_L28:
        eev.f("Babel_db", "attempt to process typing for a nonexistent conversation id [null]");
_L27:
        aow1.b();
        aow1.c();
        return;
_L29:
        cgd cgd1;
        s3 = aow1.a(((dnr) (dmw)).d);
        cgd1 = ((dnr) (dmw)).d;
        l1 = ((dnr) (dmw)).e;
        if (((dnr) (dmw)).a == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        RealTimeChatService.a(dgk1, ((String) (obj)), cgd1, s3, l1, flag1);
          goto _L27
        dmw;
        aow1.c();
        throw dmw;
        aow1 = String.valueOf(dmw.getClass());
        eev.f("Babel_db", (new StringBuilder(String.valueOf(aow1).length() + 41)).append("Unexpected update type from babel server ").append(aow1).toString());
        return;
    }

    public static void a(aow aow1, dng dng1, dgk dgk1, long l1, long l2, long l3)
    {
        if (dng1 instanceof dmo)
        {
            dng1 = (dmo)dng1;
            (new dkp(dng1, false, l1, 0L, l2, l3)).b(aow1, dgk1);
            a(aow1, ((dmo) (dng1)));
        } else
        {
            if (dng1 instanceof dnk)
            {
                a(aow1, (dnk)dng1, dgk1, false);
                return;
            }
            if (dng1 instanceof dnd)
            {
                (new dkq((dnd)dng1)).b(aow1, dgk1);
                return;
            }
            if (dng1 instanceof dnh)
            {
                a(aow1, (dnh)dng1, dgk1);
                return;
            }
            if (dng1 instanceof dnm)
            {
                (new dkt((dnm)dng1)).d(aow1);
                return;
            }
        }
    }

    private static void a(aow aow1, dnj dnj1, dgk dgk1)
    {
        if (a)
        {
            eev.b("Babel_db", "processMarkEventObservedNotification");
        }
        aow1.a();
        if (a)
        {
            eev.b("Babel_db", "processMarkEventObservedNotificationInTransaction");
        }
        dgk1.f();
        aow1.a(dnj1.a);
        if (g.a(g.nU, "babel_meo_logging", false))
        {
            g.a(aow1.f().h(), 2678, dnj1.a());
        }
        aow1.b();
        aow1.c();
        for (dnj1 = dnj1.b.iterator(); dnj1.hasNext(); d(aow1, (String)dnj1.next())) { }
        break MISSING_BLOCK_LABEL_124;
        dnj1;
        aow1.c();
        throw dnj1;
    }

    private static void a(aow aow1, dnk dnk1, dgk dgk1, boolean flag)
    {
        long l1;
        l1 = dnk1.e;
        Object obj;
        if (a)
        {
            String s = dnk1.c;
            int i = dnk1.a;
            String s2 = String.valueOf(dnk1.d);
            if (dnk1.v == null)
            {
                obj = "(null)";
            } else
            {
                obj = Integer.valueOf(dnk1.v.size());
            }
            obj = String.valueOf(obj);
            eev.b("Babel_db", (new StringBuilder(String.valueOf(s).length() + 119 + String.valueOf(s2).length() + String.valueOf(obj).length())).append("processMembershipChange conversationId: ").append(s).append(" type: ").append(i).append(" sender: ").append(s2).append(" participant count: ").append(((String) (obj))).append(" timestamp: ").append(l1).toString());
        }
        if (dnk1.v.size() == 0)
        {
            obj = String.valueOf(dnk1.c);
            if (((String) (obj)).length() != 0)
            {
                obj = "empty participants in membership change ".concat(((String) (obj)));
            } else
            {
                obj = new String("empty participants in membership change ");
            }
            eev.g("Babel_db", ((String) (obj)));
        }
        dnk1.a;
        JVM INSTR tableswitch 1 2: default 224
    //                   1 265
    //                   2 445;
           goto _L1 _L2 _L3
_L1:
        eev.f("Babel_db", "Ignoring unsupported membership change event");
_L5:
        return;
_L2:
        Object obj1;
        String s1;
        dsu dsu1;
        cgd cgd2;
        boolean flag1;
        if (RealTimeChatService.d(aow1.f(), dnk1.c) || dnk1.d.a(aow1.f().b()))
        {
            flag1 = false;
        } else
        {
            flag1 = true;
        }
        if (flag)
        {
            cgd cgd1;
            for (Iterator iterator = dnk1.v.iterator(); iterator.hasNext(); aow1.a(dnk1.c, cgd1, true))
            {
                cgd1 = (cgd)iterator.next();
            }

        }
        obj1 = aow1.a(dnk1.c, dnk1.v);
        l1 = aow1.a(dnk1.c, dnk1.m, dsu.e, dnk1.d, dsv.m, l1, dnk1.n, dnk1.f, null, ((String) (obj1)));
        aow1.a(dnk1.c, dnk1.e, dnk1.n, 4, dnk1.d, l1, dsu.e, null, ((String) (obj1)));
        if (flag1)
        {
            dgk1.a(dnk1.e);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        dgk1 = null;
        if (dnk1.v.size() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = (cgd)dnk1.v.get(0);
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (flag && aow1.f().b().equals(obj1))
        {
            if (dnk1.c != null)
            {
                aow1.j(dnk1.c);
                flag1 = true;
            } else
            {
                eev.f("Babel_db", "attempt to process presence for a nonexistant conversation id [null]");
                flag1 = false;
            }
        } else
        {
            if (flag)
            {
                aow1.a(dnk1.c, ((cgd) (obj1)), false);
            }
            dgk1 = new ArrayList();
            dgk1.add(obj1);
            dgk1 = aow1.a(dnk1.c, dgk1);
            flag1 = false;
        }
_L6:
        if (!flag1)
        {
            s1 = dnk1.c;
            dsu1 = dsu.e;
            cgd2 = dnk1.d;
            if (dnk1.b == 1)
            {
                obj1 = dsv.o;
            } else
            {
                obj1 = dsv.l;
            }
            aow1.a(s1, String.valueOf(l1), dsu1, cgd2, ((dsv) (obj1)), l1, dnk1.n, dnk1.f, null, dgk1);
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
        flag1 = false;
          goto _L6
        if (true) goto _L5; else goto _L7
_L7:
    }

    public static void a(aow aow1, String s)
    {
        aow1.ae(s);
        d(aow1);
    }

    public static void a(aow aow1, String s, long l1)
    {
        aow1.k(s, -1L);
        if ((4L & l1) != 0L)
        {
            (new dck(s)).a(aow1);
        }
        if ((2L & l1) != 0L)
        {
            RealTimeChatService.a(aow1, s, null);
        }
        d(aow1);
    }

    public static void a(aow aow1, String s, aoz aoz1, long l1, dgk dgk1, long l2, 
            long l3)
    {
        long l4;
        if (eev.a("Babel_db", 3))
        {
            eev.c("Babel_db", (new StringBuilder(55)).append("resendMessageLocally messageRowId: ").append(l1).toString());
        }
        aow1.a();
        l4 = SystemClock.elapsedRealtime();
        apk apk1;
        apk1 = aow1.b(l1);
        a(aow1, aoz1, l1, true, dgk1);
        aow1.b();
        aow1.c();
        if (apk1 != null && apk1.a != null)
        {
            l1 = SystemClock.elapsedRealtime();
            int i = aow1.f().h();
            aoz1 = (new cab()).a(s);
            if (aow.a(apk1.a))
            {
                aoz1.b(apk1.a);
            } else
            {
                aoz1.c(apk1.a);
            }
            h.a(i, l2 / 1000L, 10, aoz1.a(302));
            h.a(i, l3 / 1000L, 10, aoz1.a(205));
            h.a(i, l4, 10, aoz1.a(105));
            h.a(i, l1, 10, aoz1.a(106));
        }
        d(aow1, s);
        return;
        s;
        aow1.c();
        throw s;
    }

    public static void a(aow aow1, String s, dgk dgk1)
    {
        aow1.a();
        Object obj = aow1.f(s);
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = String.valueOf("Requested older events for an unknown conversation Account:");
        String s1 = String.valueOf(eev.b(aow1.f().a()));
        eev.f("Babel_db", (new StringBuilder(String.valueOf(obj).length() + 16 + String.valueOf(s1).length() + String.valueOf(s).length())).append(((String) (obj))).append(s1).append(" conversationId:").append(s).toString());
        s = new cwg(s, true, true, false, null, -1L, null, 0L, null);
_L3:
        dgk1.a(s);
        aow1.b();
        aow1.c();
        return;
_L2:
        if (!((aoz) (obj)).p)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        if (eev.a("Babel_db", 3))
        {
            eev.c("Babel_db", (new StringBuilder(String.valueOf(s).length() + 78)).append("Skip requesting old events for conversation ").append(s).append(" since it already has oldest event").toString());
        }
        aow1.b();
        aow1.c();
        return;
        if (eev.a("Babel_db", 3))
        {
            String s2 = String.valueOf(Arrays.toString(((aoz) (obj)).f));
            long l1 = ((aoz) (obj)).g;
            eev.c("Babel_db", (new StringBuilder(String.valueOf(s2).length() + 74 + String.valueOf(s).length())).append("requesting events before token ").append(s2).append(" eventId ").append(l1).append(" conversation ").append(s).toString());
        }
        s = new cwg(s, false, true, false, ((aoz) (obj)).f, ((aoz) (obj)).g, null, 0L, null);
          goto _L3
        s;
        aow1.c();
        throw s;
    }

    public static void a(aow aow1, String s, String s1, Uri uri, long l1, long l2, 
            boolean flag, long l3, long l4)
    {
        Object obj;
        aow1.a();
        obj = aow1.f(s, s1);
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = String.valueOf("processSmsMmsSendResponse: received response for nonexistant  clientGeneratedId ");
        s1 = String.valueOf(s1);
        if (s1.length() == 0) goto _L4; else goto _L3
_L3:
        s1 = ((String) (obj)).concat(s1);
_L5:
        eev.g("Babel_db", s1);
_L6:
        aow1.b();
        aow1.c();
        d(aow1, s);
        b(uri);
        return;
_L4:
        s1 = new String(((String) (obj)));
          goto _L5
        s;
        aow1.c();
        throw s;
_L2:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        a(aow1.f(), uri, l3, Boolean.valueOf(true), false, true);
        aow1.a(s, g.a(((Long) (obj)), 0L), l2, 0L);
        aow1.a(s, s1, uri, l1);
        aow1.h(s, l2);
        aow1.m(s, l4);
          goto _L6
    }

    public static void a(aow aow1, String s, String s1, dsu dsu1, int i)
    {
        aow1.a(s, s1, dsu1, i);
    }

    private static void a(aow aow1, String s, String s1, String s2, boolean flag, long l1, long l2, int i, int j)
    {
        aoa aoa1;
        aoa1 = aow1.f();
        Object obj1 = g.nU;
        Object obj2 = ((Context) (obj1)).getResources();
        cgd cgd1;
        if (!TextUtils.isEmpty(s2))
        {
            cgd1 = g.m(s2);
            cgd cgd2;
            if (flag)
            {
                cgd2 = cgd1;
            } else
            {
                cgd2 = null;
            }
            s2 = due.a(aow1, cgd2, s2);
        } else
        {
            s2 = due.h();
            cgd1 = ((cfz) (s2)).b;
            s2 = due.a(aow1, flag, Arrays.asList(new cfz[] {
                s2
            }));
        }
        if (TextUtils.isEmpty(s2))
        {
            eev.g("Babel_db", "EsConversationsData.storeMmsNotificationMessage: failed to get conv.");
            return;
        }
        long l3 = aow1.b(s2, 1000);
        Object obj = String.valueOf(String.valueOf(due.b(l1)));
        String s3 = String.valueOf(((Resources) (obj2)).getString(l.fb));
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
        obj1 = aow.g();
        obj2 = g.a(((String) (obj)), 2);
        if (i == 0)
        {
            obj = dsu.e;
        } else
        {
            obj = dsu.d;
        }
        (new dkp(s2, cgd1, l3, ((String) (obj1)), ((List) (obj2)), null, null, false, ((dsu) (obj)), i, 3, null, g.a(new String[] {
            s, s1
        }), 0L, 0, 0L, null, 2, null, 0, 0L)).a(2).a(aow1, new dgk());
        aow1.a();
        aow1.g(s2, l3);
        if (!flag) goto _L2; else goto _L1
_L1:
        aow1.w(s2);
_L4:
        aow1.b();
        aow1.c();
        return;
_L2:
        if (RealTimeChatService.d(aow1.f(), s2)) goto _L4; else goto _L3
_L3:
        cfo.a(g.nU, aoa1.h(), false);
          goto _L4
        s;
        aow1.c();
        throw s;
    }

    public static void a(aow aow1, String s, List list)
    {
        if (eev.a("Babel_db", 3))
        {
            String s1 = String.valueOf(list);
            eev.c("Babel_db", (new StringBuilder(String.valueOf(s).length() + 87 + String.valueOf(s1).length())).append("forking a new conversation for an existing conversation ").append(s).append(" with additional participants: ").append(s1).toString());
        }
        List list1 = aow1.J(s);
        list1.addAll(list);
        RealTimeChatService.a(aow1.f(), g.a(list1), s);
    }

    public static void a(aow aow1, String s, List list, dgk dgk1)
    {
        Object obj;
        Object obj1;
        eed eed1;
        dbl dbl1;
        boolean flag2;
        if (eev.a("Babel_db", 3))
        {
            obj = String.valueOf(s);
            if (((String) (obj)).length() != 0)
            {
                obj = "inviteParticipantsLocally: conversationId=".concat(((String) (obj)));
            } else
            {
                obj = new String("inviteParticipantsLocally: conversationId=");
            }
            eev.c("Babel_db", ((String) (obj)));
        }
        aow1.a();
        eed1 = aow1.L(s);
        flag2 = aow.b(s);
        obj = new ArrayList();
        obj1 = new ArrayList();
        list = list.iterator();
_L3:
        if (!list.hasNext()) goto _L2; else goto _L1
_L1:
        dbl1 = (dbl)list.next();
        if (dbl1.c == null || flag2)
        {
            break MISSING_BLOCK_LABEL_161;
        }
        ((List) (obj)).add(dbl.b(dbl1.c, dbl1.e));
          goto _L3
        s;
        aow1.c();
        throw s;
        cgd cgd1 = dbl1.b();
        boolean flag = false;
        Iterator iterator = eed1.iterator();
_L5:
        boolean flag1 = flag;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        if (!((cgd)iterator.next()).a(cgd1))
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
        if (dbl1.d != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag1 || !flag) goto _L7; else goto _L6
_L6:
        ((List) (obj)).add(dbl1);
_L7:
        if (flag) goto _L3; else goto _L8
_L8:
        ((List) (obj1)).add(dbl1);
          goto _L3
        String s1;
        long l1;
        long l2;
        if (dbl1.a != null && !dbl1.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        break MISSING_BLOCK_LABEL_229;
_L2:
        list = aow1.f().b();
        s1 = aow1.b(s, ((List) (obj1)));
        if (((List) (obj1)).size() > 0)
        {
            l1 = aow1.O(s);
            aow1.a(s, aow.g(), dsu.d, list, dsv.m, l1, -1L, 10, null, s1);
        }
        if (((List) (obj)).size() != 0)
        {
            break MISSING_BLOCK_LABEL_368;
        }
        aow1.b();
        aow1.c();
        return;
        obj1 = aow1.b(s, ((List) (obj)));
        s1 = aow.g();
        l1 = aow1.O(s);
        l2 = aow1.a(s, s1, dsu.b, list, dsv.m, l1, -1L, 10, null, ((String) (obj1)));
        aow1.a(s, l1, -1L, 4, aow1.f().b(), l2, dsu.b, null, ((String) (obj1)));
        if (!aow.a(s))
        {
            dgk1.a(new cvw(s1, s, ((List) (obj)), l1));
        }
        aow1.b();
        aow1.c();
        return;
          goto _L3
    }

    private static void a(aow aow1, String s, List list, List list1)
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
            eev.b("Babel_db", s1);
        }
        for (list = list.iterator(); list.hasNext(); aow1.a(s, (cfz)list.next())) { }
        if (list1 != null)
        {
            for (list = list1.iterator(); list.hasNext(); aow1.a(s, (aif)list.next())) { }
        } else
        {
            aow1.I(s);
        }
        b(aow1, s);
    }

    private static void a(aow aow1, String s, boolean flag)
    {
        if (a)
        {
            eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 25)).append("processPendingMute ").append(s).append(" ").append(flag).toString());
        }
        aow1 = aow1.f();
        byte byte0;
        if (flag)
        {
            byte0 = 10;
        } else
        {
            byte0 = 30;
        }
        RealTimeChatService.a(aow1, s, byte0);
    }

    public static void a(aow aow1, String s, byte abyte0[], long l1)
    {
        long l2 = aow1.h(s);
        if (l1 <= l2 || l2 == 0L)
        {
            aow1.a(s, abyte0, l1);
        }
    }

    private static void a(aow aow1, List list)
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
            Object obj = (cfz)list.next();
            String s = ((cfz) (obj)).f();
            if (s != null)
            {
                contentvalues.clear();
                obj = ((cfz) (obj)).b;
                contentvalues.put("phone_id", s);
                as[0] = ((cgd) (obj)).b;
                aow1.e().a("participants", contentvalues, "chat_id=?", as);
            }
        } while (true);
    }

    public static void a(aow aow1, List list, String s, String s1, long l1, long l2)
    {
        Object obj;
        String s2;
        Iterator iterator;
        boolean flag;
        boolean flag1;
        boolean flag5;
        if (eev.a("Babel_db", 3))
        {
            eev.c("Babel_db", "processContactErrorInTransaction");
        }
        obj = new ArrayList();
        s2 = aow1.c(s, list);
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
        list = (dbk)iterator.next();
        if (((dbk) (list)).b == 3)
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
            if (((dbk) (list)).b == 4)
            {
                flag4 = true;
                flag2 = flag5;
                flag3 = flag1;
            }
        }
        list = ((dbk) (list)).a;
        if (TextUtils.isEmpty(((dbl) (list)).a)) goto _L2; else goto _L1
_L1:
        list = cgd.a(((dbl) (list)).a);
_L4:
        flag5 = flag2;
        flag1 = flag3;
        flag = flag4;
        if (aow1.b(list) == null)
        {
            ((List) (obj)).add(list);
            flag5 = flag2;
            flag1 = flag3;
            flag = flag4;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (TextUtils.isEmpty(((dbl) (list)).b))
        {
            break; /* Loop/switch isn't completed */
        }
        list = cgd.b(((dbl) (list)).b);
        if (true) goto _L4; else goto _L3
_L3:
        eev.g("Babel_db", "processContactErrorInTransaction: server sends empty ids!");
        flag5 = flag2;
        flag1 = flag3;
        flag = flag4;
        if (true) goto _L6; else goto _L5
_L5:
        if (((List) (obj)).size() > 0)
        {
            list = new dgk();
            list.a(aow1.f());
            list.a(g.nU, aow1, s, ((List) (obj)));
            list.e();
        }
        obj = dsv.f;
        if (!flag) goto _L8; else goto _L7
_L7:
        list = dsv.n;
_L10:
        aow1.a(s, s1, dsu.e, aow1.f().b(), list, l1, l2, 30, null, s2);
        aow1.a(s, s1, dsu.d, 0);
        return;
_L8:
        list = ((List) (obj));
        if (flag1)
        {
            list = ((List) (obj));
            if (!flag5)
            {
                list = dsv.p;
            }
        }
        if (true) goto _L10; else goto _L9
_L9:
    }

    public static void a(dgk dgk1, aow aow1, String s)
    {
        aoz aoz1 = aow1.e(s);
        Cursor cursor = aow1.a(s, dsu.b, new String[] {
            "_id"
        });
        if (!a) goto _L2; else goto _L1
_L1:
        if (cursor != null) goto _L4; else goto _L3
_L3:
        int i = -1;
_L6:
        eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 51)).append("sendUnsentMessages ").append(s).append(" cursor ").append(i).append(" message rows").toString());
_L2:
        aow1.a();
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
                    eev.b("Babel_db", (new StringBuilder(String.valueOf(s).length() + 54)).append("sendUnsentMessages ").append(s).append(" sending msgID ").append(l1).toString());
                }
                a(aow1, aoz1, cursor.getLong(0), false, dgk1);
            } while (cursor.moveToNext());
        }
        dgk1.a(new cwq(s, aow1.W(s)));
        aow1.b();
        aow1.c();
        if (cursor != null)
        {
            cursor.close();
        }
        return;
_L4:
        i = cursor.getCount();
        if (true) goto _L6; else goto _L5
_L5:
        dgk1;
        aow1.c();
        throw dgk1;
        dgk1;
        aow1 = cursor;
_L8:
        if (aow1 != null)
        {
            aow1.close();
        }
        throw dgk1;
        dgk1;
        aow1 = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static void a(dgk dgk1, apk apk1, boolean flag)
    {
        byte byte0 = 2;
        String s = apk1.a;
        apk1 = apk1.b;
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
        dgk1.a(new cwo(s, apk1, i, byte0));
    }

    public static void a(dgk dgk1, String s, long l1)
    {
        if (eev.a("Babel_db", 3))
        {
            String s1 = String.valueOf(s);
            if (s1.length() != 0)
            {
                s1 = "requesting conversation metadata for ".concat(s1);
            } else
            {
                s1 = new String("requesting conversation metadata for ");
            }
            eev.c("Babel_db", s1);
        }
        dgk1.a(new cwg(s, true, false, false, null, 0L, null, l1, null));
    }

    public static void a(String s, int i, dgk dgk1)
    {
        if (eev.a("Babel_db", 3))
        {
            String s1 = String.valueOf("sendTypingRequestLocally  conversationId: ");
            eev.c("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 24 + String.valueOf(s).length())).append(s1).append(s).append(" typingType: ").append(i).toString());
        }
        dgk1.a(new cxi(s, i));
    }

    public static void a(String s, boolean flag, int i, dgk dgk1)
    {
        if (eev.a("Babel_db", 3))
        {
            eev.c("Babel_db", (new StringBuilder(String.valueOf(s).length() + 61)).append("sendPresenceRequestLocally: conversationId: ").append(s).append(" isFocused: ").append(flag).toString());
        }
        dgk1.a(new cxd(s, flag, i));
    }

    private static void a(List list, String s)
    {
        Object obj;
        for (list = list.iterator(); list.hasNext(); RealTimeChatService.a(((dnt) (obj))))
        {
            obj = (dbb)list.next();
            if (a)
            {
                String s1 = String.valueOf(((dbb) (obj)).a.b);
                long l1 = ((dbb) (obj)).b;
                eev.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 82 + String.valueOf(s).length())).append("process userReadState  chatId: ").append(s1).append("  conversationId: ").append(s).append("  timestamp: ").append(l1).toString());
            }
            obj = new dnt(s, ((dbb) (obj)).a, ((dbb) (obj)).b);
            ((aru)hlp.a(g.nU, aru)).a(((dnt) (obj)));
        }

    }

    public static void a(SmsMessage asmsmessage[], aoa aoa1, int i, Boolean boolean1)
    {
        aow aow1;
        String s2;
        boolean flag;
        Context context = g.nU;
        ContentValues contentvalues = due.a(context, asmsmessage, i);
        String s = contentvalues.getAsString("address");
        String s1 = contentvalues.getAsString("body");
        if (TextUtils.isEmpty(s) || TextUtils.isEmpty(s1))
        {
            eev.g("Babel_db", "EsConversationsData.storeSmsMessage: empty sender or body");
            return;
        }
        aow1 = new aow(g.nU, aoa1.h());
        cgd cgd1 = g.m(s);
        flag = a(cgd1);
        Object obj;
        if (flag)
        {
            obj = cgd1;
        } else
        {
            obj = null;
        }
        s2 = due.a(aow1, ((cgd) (obj)), s);
        if (TextUtils.isEmpty(s2))
        {
            eev.g("Babel_db", "EsConversationsData.storeSmsMessage: empty conversation id");
            return;
        }
        boolean flag1 = RealTimeChatService.d(aoa1, s2);
        obj = boolean1;
        if (boolean1 == null)
        {
            obj = Boolean.valueOf(flag1);
        }
        long l1 = g.a(due.a(asmsmessage[0], aow1.b(s2, 1000) / 1000L), 0L);
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
            eev.g("Babel_db", "storeSmsMessage: failed to insert SMS to telephony");
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
        (new dkp(s2, cgd1, l2, aow.g(), null, s1, null, false, dsu.e, 0, 3, null, asmsmessage, l1, 0, 0L, null, 2, null, 0, 0L)).a(0).a(s).a(aow1, new dgk());
        aow1.a();
        aow1.h(s2, l2);
        asmsmessage = contentvalues.getAsInteger("reply_path_present");
        boolean1 = contentvalues.getAsString("service_center");
        if (asmsmessage == null) goto _L2; else goto _L1
_L1:
        if (g.a(asmsmessage, 0) != 1) goto _L2; else goto _L3
_L3:
        aow1.i(s2, boolean1);
_L6:
        aow1.m(s2, g.a(contentvalues.getAsLong("thread_id"), 0L));
        if (flag || flag1)
        {
            break MISSING_BLOCK_LABEL_427;
        }
        cfo.a(g.nU, aoa1.h(), false);
        if (!g.a(((Boolean) (obj)), false)) goto _L5; else goto _L4
_L4:
        aow1.a(s2, l2, false, "storesms");
_L8:
        aow1.b();
        aow1.c();
        d(aow1, s2);
        return;
_L2:
        aow1.i(s2, null);
          goto _L6
        asmsmessage;
        aow1.c();
        throw asmsmessage;
_L5:
        if (!flag) goto _L8; else goto _L7
_L7:
        aow1.w(s2);
          goto _L8
    }

    public static boolean a(aoa aoa1, dnc dnc1)
    {
        if (aoa1 == null || dnc1 == null)
        {
            return false;
        }
        aoa1 = aoa1.b();
        for (dnc1 = dnc1.f.iterator(); dnc1.hasNext();)
        {
            if (aoa1.equals((cgd)dnc1.next()))
            {
                return true;
            }
        }

        return false;
    }

    public static boolean a(aow aow1, dnc dnc1, long l1, String s, dgk dgk1, aov aov1, boolean flag)
    {
        if (eev.a("Babel_db", 3))
        {
            String s1 = String.valueOf("processConversationInTransaction conversationId: ");
            String s2 = dnc1.c;
            String s3 = dnc1.i;
            int i = dnc1.f.size();
            int j = dnc1.j;
            int k = dnc1.k;
            String s4 = String.valueOf(Arrays.toString(dnc1.l));
            boolean flag2 = dnc1.o;
            Object obj;
            int i1;
            int j1;
            long l2;
            boolean flag4;
            if (dnc1.n == null)
            {
                obj = null;
            } else
            {
                obj = Long.valueOf(dnc1.n.b);
            }
            obj = String.valueOf(obj);
            i1 = dnc1.p;
            l2 = dnc1.s;
            j1 = dnc1.q;
            flag4 = dnc1.w;
            eev.c("Babel_db", (new StringBuilder(String.valueOf(s1).length() + 308 + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s).length() + String.valueOf(s4).length() + String.valueOf(obj).length())).append(s1).append(s2).append(", clientGeneratedId: ").append(s3).append(", requestClientGeneratedId: ").append(s).append(", participantCount: ").append(i).append(", notificationLevel: ").append(j).append(", status: ").append(k).append(", view: ").append(s4).append(", hasActiveHangout: ").append(flag2).append(", selfReadState.latestReadTimestamp: ").append(((String) (obj))).append(", otrStatus: ").append(i1).append(", sortTimestamp: ").append(l2).append(", otrToggle: ").append(j1).append(", isTemporary: ").append(flag4).toString());
        }
        if (!flag && dnc1.k == 1 && aow1.t(dnc1.c) == 1 && dnc1.l != null && dnc1.l.length > 0 && dnc1.l[0] == 2)
        {
            aow1.C(dnc1.c);
            return true;
        }
        if (l1 > 0L)
        {
            if (a)
            {
                eev.b("Babel", (new StringBuilder(71)).append("got upperBoundTimestamp ").append(l1).append(" calling deleteConversation").toString());
            }
            aow1.d(dnc1.c, l1);
            if (dnc1.s <= l1)
            {
                if (a)
                {
                    eev.b("Babel", "upperBoundTimestamp >= timestamp, returning");
                }
                return false;
            }
        }
        if (dnc1.a != 1) goto _L2; else goto _L1
_L1:
        Object obj1;
        Iterator iterator;
        obj1 = aow1.f().b();
        iterator = dnc1.f.iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L3
_L3:
        cgd cgd1 = (cgd)iterator.next();
        if (cgd1.equals(obj1)) goto _L5; else goto _L4
_L4:
        obj1 = aow1.a(cgd1, true, 1);
        if (obj1 == null) goto _L2; else goto _L6
_L6:
        obj1 = ((apm) (obj1)).a;
_L12:
        boolean flag1;
        Object obj2 = aow1.a(dnc1.c, s, dnc1.i, ((String) (obj1)));
        obj1 = ((aph) (obj2)).a;
        flag1 = false;
        if (((aph) (obj2)).b)
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
                s = ((ape) (obj1)).a;
            }
            flag3 = ((aph) (obj2)).b;
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
            eev.b("Babel_db", s);
        }
        if (obj1 == null)
        {
            s = null;
        } else
        {
            s = ((ape) (obj1)).a;
            aow1.p(s);
        }
        if (s == null) goto _L8; else goto _L7
_L7:
        if (!dnc1.c.equals(s))
        {
            flag1 = true;
        }
        if (!flag1 && ((ape) (obj1)).b != null && Arrays.equals(((ape) (obj1)).b, dnc1.t))
        {
            if (a)
            {
                aow1 = String.valueOf(g.a(((ape) (obj1)).b));
                if (aow1.length() != 0)
                {
                    aow1 = "Skipping update ".concat(aow1);
                } else
                {
                    aow1 = new String("Skipping update ");
                }
                eev.b("Babel_db", aow1);
            }
            a(dnc1.g, dnc1.c);
            if (aov1 != null)
            {
                aov1.a = ((ape) (obj1)).a;
            }
            return false;
        }
        aow1.a(s, ((ape) (obj1)).c, dnc1);
        aow1.I(dnc1.c);
_L10:
        dgk1.a(g.nU, aow1, dnc1.c, dnc1.f);
        aow1.a(dnc1.c, dnc1.y, dnc1.x);
        aow1.a(dnc1.f, dnc1.h, dnc1.c);
        if (dnc1.h != null)
        {
            obj1 = dnc1.h.iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                cty cty1 = (cty)((Iterator) (obj1)).next();
                if (cty1.a != null && !TextUtils.isEmpty(cty1.c))
                {
                    aow1.a(cty1);
                }
            } while (true);
        }
        break; /* Loop/switch isn't completed */
_L8:
        aow1.a(dnc1);
        if (dnc1.k == 1)
        {
            dgk1.a(dnc1.e);
        }
        if (true) goto _L10; else goto _L9
_L9:
        b(aow1, dnc1.c);
        if (flag1)
        {
            RealTimeChatService.g(aow1.f(), s, dnc1.c);
            a(dgk1, aow1, dnc1.c);
        }
        if (s != null && aow1.X(dnc1.c))
        {
            if (aov1 != null)
            {
                aov1.a = dnc1.c;
            }
            return false;
        }
        if (dnc1.n != null)
        {
            aow1.a(dnc1.c, dnc1.n.b, false, "serverresponse");
        }
        a(dnc1.g, dnc1.c);
        aow1.a(dnc1.p, dnc1.q, 1L + aow1.y(dnc1.c), dnc1.c);
        aow1.h(dnc1.c, dnc1.s);
        aow1.a(dnc1.c, dnc1.v);
        aow1.a(dnc1.c, dnc1.w);
        if (flag)
        {
            if (dnc1.l != null && dnc1.l.length > 0 && dnc1.l[0] == 2)
            {
                RealTimeChatService.a(aow1.f(), dnc1.c, dnc1.e, false);
            }
            if (dnc1.k == 1)
            {
                dgk1.a(new cwu(dnc1.c));
                aow1.ad(dnc1.c);
            }
        }
        if (aov1 != null)
        {
            aov1.a = dnc1.c;
        }
        aow.a(aow1, dnc1.c);
        return true;
_L2:
        obj1 = null;
        if (true) goto _L12; else goto _L11
_L11:
    }

    private static boolean a(aow aow1, dnh dnh1, dgk dgk1)
    {
        if (a)
        {
            String s = String.valueOf("processHangoutEventInTransaction conversationId: ");
            String s1 = dnh1.c;
            int i = dnh1.b;
            int k = dnh1.a;
            long l1 = dnh1.w;
            String s2 = dnh1.x;
            String s3 = String.valueOf(dnh1.v.toString());
            eev.b("Babel_db", (new StringBuilder(String.valueOf(s).length() + 101 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s).append(s1).append(" mediaType: ").append(i).append(" event type ").append(k).append(" duration ").append(l1).append(" transfer ").append(s2).append(" participants: ").append(s3).toString());
        }
        dsv dsv1;
        byte byte1;
        int i1;
        boolean flag;
        long l2;
        boolean flag1;
        if (dnh1.b == 2)
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
        i1 = dnh1.f;
        dsv1 = null;
        byte byte0;
        long l3;
        long l4;
        boolean flag2;
        if (dnh1.a == 1)
        {
            dsv1 = dsv.i;
            i1 = 10;
            flag1 = true;
        } else
        if (dnh1.a == 0 && dnh1.x != null && aow1.t(dnh1.x) == 2)
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
            aoz aoz1 = aow1.e(dnh1.c);
            Object obj1 = null;
            Object obj = obj1;
            if (aoz1.b == 1)
            {
                cgd cgd1 = aow1.f().b();
                obj = obj1;
                if (cgd1.a(dnh1.d))
                {
                    int j = dnh1.v.size();
                    int j1;
                    if (j > 0)
                    {
                        obj = dnh1.v.iterator();
                        do
                        {
                            j1 = j;
                            if (!((Iterator) (obj)).hasNext())
                            {
                                break;
                            }
                            if (cgd1.a((cgd)((Iterator) (obj)).next()))
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
                        obj = aoz1.h.iterator();
                        do
                        {
                            if (!((Iterator) (obj)).hasNext())
                            {
                                break;
                            }
                            cgd cgd2 = ((cfz)((Iterator) (obj)).next()).b;
                            if (!cgd1.a(cgd2))
                            {
                                arraylist.add(cgd2);
                            }
                        } while (true);
                        obj = obj1;
                        if (arraylist.size() == 1)
                        {
                            obj = aow1.a(dnh1.c, arraylist);
                        }
                    }
                }
            }
            obj1 = obj;
            if (obj == null)
            {
                obj1 = aow1.a(dnh1.c, dnh1.v);
            }
            l2 = aow1.a(dnh1.c, dnh1.m, dsu.e, dnh1.d, dsv1, dnh1.e, dnh1.n, 0L, i1, null, ((String) (obj1)), byte1, null);
            if (i1 == 10)
            {
                dgk1.f();
            } else
            {
                dgk1.a(dnh1.e);
            }
        }
        dnh1.a;
        JVM INSTR lookupswitch 2: default 596
    //                   1: 624
    //                   5: 791;
           goto _L1 _L2 _L3
_L1:
        aow1.a(byte1, dnh1.e, dnh1.c);
        return flag1;
_L2:
        dgk1 = aow1.f().b();
        flag2 = dnh1.v.contains(dgk1);
        l3 = aow1.m(dnh1.c);
        if (dnh1.e > l3)
        {
            if (flag2)
            {
                dgk1 = dnh1.c;
                l3 = dnh1.e;
                l4 = dnh1.n;
                if (flag)
                {
                    byte0 = 11;
                } else
                {
                    byte0 = 8;
                }
                aow1.a(dgk1, l3, l4, byte0, null, l2, dsu.e, null, null);
            } else
            {
                dgk1 = dnh1.c;
                l3 = dnh1.e;
                l4 = dnh1.n;
                if (flag)
                {
                    byte0 = 10;
                } else
                {
                    byte0 = 1;
                }
                aow1.a(dgk1, l3, l4, byte0, null, l2, dsu.e, null, null);
            }
        }
        byte1 = 0;
        RealTimeChatService.a(dnh1.c, null);
        continue; /* Loop/switch isn't completed */
_L3:
        RealTimeChatService.a(dnh1.c, dnh1.v);
        if (true) goto _L1; else goto _L4
_L4:
    }

    public static boolean a(aow aow1, String s, long l1, dgk dgk1, dng dng1)
    {
        aoz aoz1 = aow1.f(s);
        if (aoz1 != null)
        {
            if (a)
            {
                boolean flag = aoz1.e;
                eev.b("Babel_db", (new StringBuilder(String.valueOf(s).length() + 52)).append("conversation ").append(s).append(" exists locally,  metadataPresent ").append(flag).toString());
            }
        } else
        {
            if (eev.a("Babel_db", 3))
            {
                eev.c("Babel_db", (new StringBuilder(String.valueOf(s).length() + 36)).append("conversation ").append(s).append(" does not exist locally").toString());
            }
            if (l1 == 0L)
            {
                l1 = 0L;
            } else
            {
                l1--;
            }
            aow1.a(s, l1);
        }
        if (aoz1 == null || !aoz1.e)
        {
            dgk1.a(new cwg(s, true, true, true, null, 0L, null, 0L, dng1));
            return false;
        } else
        {
            return true;
        }
    }

    public static boolean a(cgd cgd1)
    {
        if (cgd1 == null)
        {
            return false;
        } else
        {
            int i = dcn.l().h();
            return (new aow(g.nU, i)).F(cgd1.b);
        }
    }

    public static int b(aow aow1, edb edb1)
    {
        int i;
        i = 0;
        aow1.a();
        if (edb1 != null) goto _L2; else goto _L1
_L1:
        i = aow1.x(null);
_L6:
        aow1.b();
        aow1.c();
        return i;
_L2:
        edb1 = edb1.iterator();
_L4:
        int j;
        if (!edb1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        j = aow1.x((String)edb1.next());
        i += j;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
        edb1;
        aow1.c();
        throw edb1;
    }

    private static Uri b(int i)
    {
        android.net.Uri.Builder builder = b.buildUpon();
        builder.appendQueryParameter("account_id", (new StringBuilder(11)).append(i).toString());
        return builder.build();
    }

    public static String b(aoa aoa1, String s, String s1, String s2)
    {
        gdv.b("Expected condition to be false", TextUtils.isEmpty(s1));
        String s4 = (new aow(g.nU, aoa1.h())).ab(s1);
        String s3 = s4;
        if (TextUtils.isEmpty(s4))
        {
            a(aoa1, s, s1, s2);
            s3 = null;
        }
        return s3;
    }

    private static String b(aow aow1, String s, List list)
    {
        StringBuilder stringbuilder = new StringBuilder();
        aoa aoa1 = aow1.f();
        cgd cgd1 = aoa1.b();
        aow1 = aow1.f(s);
        boolean flag;
        boolean flag1;
        if (aow1 == null || ((aoz) (aow1)).b == 1 || ((aoz) (aow1)).b == 2 && g.d(((aoz) (aow1)).c) || aoa1.D() && aoa1.F())
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
                aow1 = (cfz)s.next();
                if (((cfz) (aow1)).d != null)
                {
                    aow1 = ((cfz) (aow1)).e;
                } else
                {
                    if (((cfz) (aow1)).b == null)
                    {
                        continue;
                    }
                    if (!flag && ((cfz) (aow1)).b.equals(cgd1) && list.size() > 1)
                    {
                        flag = true;
                        continue;
                    }
                    if (c == null)
                    {
                        String s1 = eey.g();
                        c = s1;
                        if (s1 == null)
                        {
                            c = "";
                        }
                    }
                    if (!flag && TextUtils.equals(aow1.f(), c))
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
                    aow1 = g.a(aow1, flag2);
                }
                if (!TextUtils.isEmpty(aow1))
                {
                    if (stringbuilder.length() > 0)
                    {
                        stringbuilder.append(", ");
                    }
                    stringbuilder.append(aow1);
                }
                continue;
            }
            return stringbuilder.toString();
        } while (true);
    }

    public static String b(aow aow1, boolean flag, String s, List list, List list1, List list2, aot aot1, int i, 
            int j, boolean flag1, dgk dgk1, String s1)
    {
        if (eev.a("Babel_db", 3))
        {
            int k = list.size();
            eev.c("Babel_db", (new StringBuilder(52)).append("createConversationLocally:  num invitees ").append(k).toString());
        }
        int i1 = 0;
        int k1 = 0;
        boolean flag2 = false;
        int j1 = 0;
        Object obj1 = aow1.f();
        Object obj = ((aoa) (obj1)).b();
        int l1 = list.size() - 1;
        while (l1 >= 0) 
        {
            Object obj2 = (cfz)list.get(l1);
            Object obj3 = ((cfz)list.get(l1)).b;
            boolean flag3;
            int j2;
            long l2;
            if (!((cgd) (obj)).a(((cgd) (obj3)).b, ((cgd) (obj3)).a))
            {
                boolean flag4 = TextUtils.isEmpty(((cfz) (obj2)).f());
                boolean flag5 = TextUtils.isEmpty(((cgd) (obj3)).a);
                flag2 = ((cfz) (obj2)).i() | flag2;
                int i2 = g.a(((cfz) (obj2))) | j1;
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
                if (((aoa) (obj1)).r() && (i != 1 || flag2 || j1 != 0))
                {
                    i1 = 3;
                } else
                {
                    i1 = ((aoa) (obj1)).a(0);
                }
            } else
            {
                i1 = 1;
            }
        } else
        {
            i1 = j;
        }
        if (aot1 == aot.a) goto _L2; else goto _L1
_L1:
        if (i != 2) goto _L4; else goto _L3
_L3:
        if (k1 != 0)
        {
            obj = aow1.a(list, i1);
        } else
        if (flag3)
        {
            obj = aow1.b(list);
        } else
        {
            obj = null;
        }
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj1 = aow1.e(((String) (obj)));
            j = ((aoz) (obj1)).r;
            l2 = ((aoz) (obj1)).q;
        } else
        {
            j = 0;
            l2 = 0L;
        }
        if (obj != null) goto _L6; else goto _L5
_L4:
        if (list.size() == 1 && (list1 == null || list1.size() == 0) && i == 1)
        {
            obj1 = ((cfz)list.get(0)).b;
            if (obj1 == null || ((cgd) (obj1)).a())
            {
                eev.g("Babel_db", "Server returned a conversation with empty participantId");
                j = 0;
                l2 = 0L;
                obj = null;
                continue; /* Loop/switch isn't completed */
            }
            if (((cgd) (obj)).a(((cgd) (obj1)).b, ((cgd) (obj1)).a))
            {
                eev.g("Babel_db", "Trying to start a one on one with self");
                j = 0;
                l2 = 0L;
                obj = null;
                continue; /* Loop/switch isn't completed */
            }
            obj1 = aow1.a(((cgd) (obj1)), false, i1);
            if (obj1 != null)
            {
                obj = ((apm) (obj1)).a;
                l2 = ((apm) (obj1)).c;
                j = ((apm) (obj1)).d;
                continue; /* Loop/switch isn't completed */
            }
        }
          goto _L2
_L5:
        if (k1 != 0)
        {
            obj = aow.h();
        } else
        {
            obj = aow.g();
        }
        obj1 = String.valueOf(obj);
        if (((String) (obj1)).length() != 0)
        {
            obj1 = "Creating new conversation no match found. generated id: ".concat(((String) (obj1)));
        } else
        {
            obj1 = new String("Creating new conversation no match found. generated id: ");
        }
        eev.c("Babel_db", ((String) (obj1)));
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
        obj1 = aow1.a(i, i1, 1000L * l2, ((String) (obj)), j1);
        aow1.E(((String) (obj1)));
        a(aow1, ((String) (obj1)), list, list1);
        obj2 = list.iterator();
        do
        {
            if (!((Iterator) (obj2)).hasNext())
            {
                break;
            }
            if (!((cfz)((Iterator) (obj2)).next()).g())
            {
                continue;
            }
            aow.b(aow1, ((String) (obj1)));
            break;
        } while (true);
        aow.a(aow1, ((String) (obj1)));
        if (j != 0 && dgk1 != null)
        {
            obj2 = new ArrayList();
            for (list = list.iterator(); list.hasNext(); ((List) (obj2)).add(obj3))
            {
                obj3 = (cfz)list.next();
                if (list2 != null)
                {
                    if (((cfz) (obj3)).E == null)
                    {
                        obj3.E = new HashSet();
                    }
                    ((cfz) (obj3)).E.addAll(list2);
                }
            }

            if (list1 != null)
            {
                for (list = list1.iterator(); list.hasNext(); ((List) (obj2)).add(g.b(list1.b(), list1.d())))
                {
                    list1 = (aif)list.next();
                }

            }
            s = new cvz(((String) (obj)), i, i1, s, ((List) (obj2)), s1);
            if (aot1 == aot.c)
            {
                if (a)
                {
                    eev.b("Babel_db", "CreateConversationLocally -- calling GetConversationRequest");
                }
                dgk1.a(new cwg(s));
            } else
            {
                if (a)
                {
                    eev.b("Babel_db", "CreateConversationLocally -- calling CreateConversationRequest");
                }
                dgk1.a(s);
            }
        }
        i = 1;
        s = ((String) (obj1));
_L7:
        if (i != 0)
        {
            d(aow1, s);
        }
        return s;
_L6:
        if (eev.a("Babel_db", 3))
        {
            s = String.valueOf(obj);
            if (s.length() != 0)
            {
                s = "Using existing conversation ".concat(s);
            } else
            {
                s = new String("Using existing conversation ");
            }
            eev.c("Babel_db", s);
        }
        aow1.k(((String) (obj)), 0xffffffff80000001L);
        if (!flag && j == 2)
        {
            RealTimeChatService.a(aow1.f(), ((String) (obj)), l2, false);
        }
        if (k1 != 0 && flag1)
        {
            a(aow1, list);
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
        contentresolver = g.nU.getContentResolver();
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
            a(g.nU, Integer.parseInt(uri.getQueryParameter("account_id")));
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
                dur.b(byte0, due.c(uri));
                return;
            }
        }
    }

    public static void b(aoa aoa1, Intent intent)
    {
        SmsMessage smsmessage = due.a(intent);
        if (smsmessage == null)
        {
            eev.g("Babel_db", "EsConversationsData.processSmsDeliveryReport: empty report message");
        } else
        {
            long l1 = ContentUris.parseId(intent.getData());
            if (l1 < 0L)
            {
                eev.g("Babel_db", "EsConversationsData.processSmsDeliveryReport: can't find message");
                return;
            }
            int i;
            long l2;
            try
            {
                i = smsmessage.getStatus();
            }
            // Misplaced declaration of an exception variable
            catch (aoa aoa1)
            {
                eev.g("Babel_db", "processSmsDeliveryReport: NPE inside SmsMessage");
                return;
            }
            l2 = System.currentTimeMillis();
            aoa1 = new aow(g.nU, aoa1.h());
            aoa1.a(l1, i, 1000L * l2);
            b(((aow) (aoa1)), l1);
            aoa1 = g.h(aoa1.g(l1));
            if (aoa1 != null)
            {
                due.a(aoa1, i, l2);
                return;
            }
        }
    }

    public static void b(aoa aoa1, String s)
    {
        Object obj;
        obj = null;
        if (TextUtils.isEmpty(s))
        {
            eev.g("Babel_db", "receiveSmsFromDumpFile: empty dump file name");
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
        eev.g("Babel_db", "receiveSmsFromDumpFile: empty data");
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
        aoa1;
        try
        {
            s.close();
            throw aoa1;
        }
        // Misplaced declaration of an exception variable
        catch (aoa aoa1) { }
        // Misplaced declaration of an exception variable
        catch (aoa aoa1) { }
        s = String.valueOf(aoa1);
        eev.e("Babel_db", (new StringBuilder(String.valueOf(s).length() + 24)).append("receiveSmsFromDumpFile: ").append(s).toString(), aoa1);
        return;
_L1:
        a(s, aoa1, 0, ((Boolean) (null)));
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
        catch (aoa aoa1)
        {
            s = String.valueOf(aoa1);
            eev.e("Babel_db", (new StringBuilder(String.valueOf(s).length() + 24)).append("receiveMmsFromDumpFile: ").append(s).toString(), aoa1);
            return;
        }
        s = ((String) (obj));
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_317;
        }
        s = (new acq(abyte0)).a();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_328;
        }
        if (s instanceof acx)
        {
            break MISSING_BLOCK_LABEL_380;
        }
        eev.g("Babel_db", "receiveMmsFromDumpFile: failed to parse PDU");
        return;
        s = due.a(g.nU, (acx)s);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_404;
        }
        eev.g("Babel_db", "receiveMmsFromDumpFile: failed to persist PDU");
        return;
        a(aoa1, s, -1L, ((Boolean) (null)), true, false);
        return;
        aoa1 = String.valueOf(s);
        if (aoa1.length() != 0)
        {
            aoa1 = "receiveSmsFromDumpFile: invalid dump file name ".concat(aoa1);
        } else
        {
            aoa1 = new String("receiveSmsFromDumpFile: invalid dump file name ");
        }
        eev.g("Babel_db", aoa1);
        return;
    }

    public static void b(aow aow1)
    {
        eev.c("Babel_db", "NOTIFY ALL PARTICIPANTS");
        anr.a(aow1.f(), null);
    }

    public static void b(aow aow1, long l1)
    {
        apk apk1 = aow1.b(l1);
        if (apk1 != null)
        {
            d(aow1, apk1.b);
        }
    }

    public static void b(aow aow1, String s)
    {
        Object obj2;
        Object obj3;
        StringBuilder stringbuilder;
        int i;
        obj2 = aow1.J(s);
        stringbuilder = new StringBuilder();
        i = 0;
        obj3 = doy.a();
        Object obj4;
        Iterator iterator;
        obj4 = new LinkedList();
        iterator = ((List) (obj2)).iterator();
        Object obj = null;
_L3:
        Object obj1;
        cfz cfz1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_176;
        }
        cfz1 = (cfz)iterator.next();
        aow1.a(((doy) (obj3)), cfz1);
        obj1 = cfz1.h;
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            break MISSING_BLOCK_LABEL_134;
        }
        if (cfz1.b.equals(aow1.f().b()))
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
        if (!cfz1.b.equals(aow1.f().b()))
        {
            ((List) (obj4)).add(cfz1.e);
        }
        continue; /* Loop/switch isn't completed */
        aow1;
        ((doy) (obj3)).b();
        throw aow1;
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
        ((doy) (obj3)).b();
        obj3 = stringbuilder.toString();
        obj2 = b(aow1, s, ((List) (obj2)));
        if (eev.a("Babel_db", 3))
        {
            obj1 = String.valueOf(obj2);
            if (((String) (obj1)).length() != 0)
            {
                obj1 = "generated name ".concat(((String) (obj1)));
            } else
            {
                obj1 = new String("generated name ");
            }
            eev.c("Babel_db", ((String) (obj1)));
            obj1 = String.valueOf(obj3);
            if (((String) (obj1)).length() != 0)
            {
                obj1 = "packed participant urls ".concat(((String) (obj1)));
            } else
            {
                obj1 = new String("packed participant urls ");
            }
            eev.c("Babel_db", ((String) (obj1)));
        }
        aow1.b(s, ((String) (obj2)), ((String) (obj3)), ((String) (obj)));
        return;
        i++;
        continue; /* Loop/switch isn't completed */
        obj = obj1;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public static void b(aow aow1, String s, long l1)
    {
        aow1.k(s, 0xffffffff80000000L);
        if ((8L & l1) != 0L)
        {
            a(aow1, s, true);
        }
        if ((16L & l1) != 0L)
        {
            a(aow1, s, false);
        }
        if ((4L & l1) != 0L)
        {
            long l2 = aow1.m(s);
            if (a)
            {
                eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 64)).append("processPendingArchive ").append(s).append(" ").append(l2).append(" ").append(l2).toString());
            }
            RealTimeChatService.a(aow1.f(), s, l2, true);
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
                eev.b("Babel", s1);
            }
            RealTimeChatService.h(aow1.f(), s);
        }
        if ((2L & l1) != 0L)
        {
            l1 = aow1.m(s);
            if (a)
            {
                eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 63)).append("processPendingDelete ").append(s).append(" ").append(l1).append(" ").append(l1).toString());
            }
            RealTimeChatService.a(aow1.f(), s, l1);
        }
    }

    public static void b(aow aow1, String s, dgk dgk1)
    {
        if (eev.a("Babel_db", 3))
        {
            String s1 = String.valueOf(s);
            if (s1.length() != 0)
            {
                s1 = "leaveConversationLocally: conversationId=".concat(s1);
            } else
            {
                s1 = new String("leaveConversationLocally: conversationId=");
            }
            eev.c("Babel_db", s1);
        }
        aow1.a();
        aow1.r(s);
        if (!aow.a(s))
        {
            break MISSING_BLOCK_LABEL_84;
        }
        aow1.l(s, 1L);
_L1:
        aow1.b();
        aow1.c();
        d(aow1);
        return;
        aow1.D(s);
        dgk1.a(cws.a(aow.g(), s));
          goto _L1
        s;
        aow1.c();
        throw s;
    }

    public static int c(aow aow1, edb edb1)
    {
        int i;
        i = 0;
        aow1.a();
        if (edb1 != null) goto _L2; else goto _L1
_L1:
        i = aow1.S(null);
_L6:
        aow1.b();
        aow1.c();
        return i;
_L2:
        edb1 = edb1.iterator();
_L4:
        int j;
        if (!edb1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        j = aow1.S((String)edb1.next());
        i += j;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
        edb1;
        aow1.c();
        throw edb1;
    }

    public static void c()
    {
        int i = due.f();
        eev.e("Babel_db", (new StringBuilder(64)).append("Message purging: deleted ").append(i).append(" media messages in telephony").toString());
        if (i > 0)
        {
            Object obj = dcn.l();
            if (obj != null)
            {
                obj = new aow(g.nU, ((aoa) (obj)).h());
                int j = ((aow) (obj)).u();
                eev.e("Babel_db", (new StringBuilder(63)).append("Message purging: deleted ").append(j).append(" media messages in Hangouts").toString());
                c(((aow) (obj)));
            }
        }
    }

    public static void c(aow aow1)
    {
        eev.c("Babel_db", "NOTIFY ALL MESSAGES");
        d(aow1, null);
    }

    public static void c(aow aow1, String s)
    {
        String s1 = String.valueOf(s);
        if (s1.length() != 0)
        {
            s1 = "NOTIFY PARTICIPANTS, conversation_id=".concat(s1);
        } else
        {
            s1 = new String("NOTIFY PARTICIPANTS, conversation_id=");
        }
        eev.c("Babel_db", s1);
        g.nU.getContentResolver().notifyChange(EsProvider.a(EsProvider.f, aow1.f().h()), null);
        anr.a(aow1.f(), s);
    }

    private static boolean c(Uri uri)
    {
        return uri != null && b.getPath().equals(uri.getPath());
    }

    public static void d(aow aow1)
    {
        a(aow1.f().h());
    }

    public static void d(aow aow1, String s)
    {
        aoa aoa1;
        if (eev.a("Babel_db", 3))
        {
            Object obj = String.valueOf(s);
            if (((String) (obj)).length() != 0)
            {
                obj = "NOTIFY MESSAGES, conversation_id=".concat(((String) (obj)));
            } else
            {
                obj = new String("NOTIFY MESSAGES, conversation_id=");
            }
            eev.c("Babel_db", ((String) (obj)));
        }
        aoa1 = aow1.f();
        a(EsProvider.a(EsProvider.f, aoa1.h()));
        obj = null;
        if (s != null)
        {
            obj = aow1.af(s);
        }
        if (obj != null && ((Set) (obj)).size() > 0)
        {
            for (aow1 = ((Set) (obj)).iterator(); aow1.hasNext(); a(EsProvider.a(aoa1, (String)aow1.next()))) { }
        } else
        if (s != null)
        {
            a(EsProvider.a(aoa1, s));
        }
        a(EsProvider.b(aoa1, s));
        a(b(aoa1.h()));
    }

    public static void e(aow aow1)
    {
        a(aow1.f());
    }

    public static void e(aow aow1, String s)
    {
        if (eev.a("Babel_db", 3))
        {
            String s1 = String.valueOf(s);
            if (s1.length() != 0)
            {
                s1 = "NOTIFY EVENT SUGGESTIONS, conversation_id=".concat(s1);
            } else
            {
                s1 = new String("NOTIFY EVENT SUGGESTIONS, conversation_id=");
            }
            eev.c("Babel_db", s1);
        }
        a(EsProvider.a(aow1.f().h(), s));
    }

    public static List f(aow aow1, String s)
    {
        s = aow1.J(s);
        aow1 = new ArrayList();
        s = s.iterator();
        do
        {
            if (!s.hasNext())
            {
                break;
            }
            String s1 = ((cfz)s.next()).f();
            if (!TextUtils.isEmpty(s1))
            {
                aow1.add(s1.trim());
            }
        } while (true);
        return aow1;
    }

    static 
    {
        Object obj = eev.d;
        obj = EsProvider.a;
        b = Uri.parse((new StringBuilder(String.valueOf(obj).length() + 12)).append("receiver://").append(((String) (obj))).append("/").toString());
    }
}
