// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class dur
{

    private static final ScheduledExecutorService B = Executors.newSingleThreadScheduledExecutor();
    private static final String C[] = {
        "count()"
    };
    private static List D = null;
    private static final boolean a = false;
    private static final String b;
    private static final String c;
    private static final String d;
    private static volatile int e;
    private static volatile int f;
    private static volatile int g;
    private static volatile long h;
    private static volatile long i;
    private static volatile int j;
    private static volatile long k;
    private static volatile int l;
    private static final Uri m;
    private static final Uri n;
    private static eds o[] = {
        new eds(), new eds()
    };
    private static final Map p = new HashMap();
    private final boolean A;
    private final Context q;
    private final aoa r;
    private final aow s;
    private final hd t = new hd();
    private final hd u = new hd();
    private final gz v = new gz();
    private final long w;
    private boolean x;
    private boolean y;
    private volatile boolean z;

    dur(aow aow1, long l1, boolean flag)
    {
        q = g.nU;
        s = aow1;
        r = aow1.f();
        w = l1;
        z = false;
        A = flag;
    }

    private static int a(Cursor cursor)
    {
        int j1 = 0;
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (!cursor.moveToFirst()) goto _L2; else goto _L3
_L3:
        int i1 = cursor.getInt(0);
        j1 = i1;
        if (cursor != null)
        {
            cursor.close();
            j1 = i1;
        }
_L5:
        return j1;
_L2:
        if (cursor == null) goto _L5; else goto _L4
_L4:
        cursor.close();
        return 0;
        Exception exception;
        exception;
        if (cursor != null)
        {
            cursor.close();
        }
        throw exception;
    }

    private int a(String s1, String s2, String as[])
    {
        int k1 = as.length;
        int i1 = 0;
        int j1 = 0;
        for (; i1 < k1; i1 += 128)
        {
            int l1 = Math.min(i1 + 128, k1);
            String s3 = String.format(Locale.US, "%s IN %s", new Object[] {
                s2, due.a(l1 - i1)
            });
            String as1[] = (String[])Arrays.copyOfRange(as, i1, l1);
            j1 += s.e().a(s1, s3, as1);
        }

        return j1;
    }

    static long a(Uri uri)
    {
        return b(uri);
    }

    private long a(dtl dtl1)
    {
        if (dtl1.w.size() <= 0)
        {
            int i1 = r.h();
            eev.f("Babel_SMS", (new StringBuilder(53)).append("SmsSyncManager A#").append(i1).append(": MMS message has no part").toString());
        }
        Object obj3 = a(dtl1.r);
        if (obj3 == null || ((List) (obj3)).size() <= 0)
        {
            int j1 = r.h();
            eev.g("Babel_SMS", (new StringBuilder(58)).append("SmsSyncManager A#").append(j1).append(": MMS message has no recipient").toString());
            return -1L;
        }
        if (c(1, dtl1.m))
        {
            return -1L;
        }
        cgd cgd1;
        Object obj;
        int k1;
        int l1;
        long l2;
        long l3;
        if (dtl1.n != 1)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        Object obj1;
        Object obj2;
        String s1;
        String s2;
        ContentValues contentvalues;
        boolean flag;
        if (k1 == 0)
        {
            obj = due.a(a(dtl1.r), dtl1.m);
        } else
        {
            obj = null;
        }
        cgd1 = null;
        if (k1 == 0) goto _L2; else goto _L1
_L1:
        if (r != null)
        {
            cgd1 = r.b();
        } else
        {
            cgd1 = null;
        }
_L4:
        if (cgd1 == null)
        {
            k1 = r.h();
            l2 = dtl1.m;
            l1 = dtl1.n;
            l3 = dtl1.r;
            eev.g("Babel_SMS", (new StringBuilder(124)).append("SmsSyncManager A#").append(k1).append(": found MMS has no From: id=").append(l2).append(" type=").append(l1).append(" thread_id=").append(l3).toString());
            return -1L;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            cgd1 = g.m(((String) (obj)));
        }
        if (true) goto _L4; else goto _L3
_L3:
        flag = aoq.a(cgd1);
        l2 = dtl1.r;
        if (flag)
        {
            obj1 = cgd1;
        } else
        {
            obj1 = null;
        }
        s1 = a(l2, ((cgd) (obj1)));
        if (s1 == null)
        {
            k1 = r.h();
            l2 = dtl1.r;
            eev.g("Babel_SMS", (new StringBuilder(95)).append("SmsSyncManager A#").append(k1).append(": failed to create conversation for mms thread ").append(l2).toString());
            return -1L;
        }
        s2 = aow.g();
        contentvalues = new ContentValues();
        contentvalues.put("message_id", s2);
        contentvalues.put("conversation_id", s1);
        contentvalues.put("transport_type", Integer.valueOf(3));
        if (k1 != 0)
        {
            l1 = dsv.b.ordinal();
        } else
        {
            l1 = dsv.c.ordinal();
        }
        contentvalues.put("type", Integer.valueOf(l1));
        contentvalues.put("author_chat_id", cgd1.b);
        contentvalues.put("author_gaia_id", cgd1.a);
        obj2 = dtl1.e();
        obj1 = obj2;
        if (obj2 != null)
        {
            obj1 = obj2;
            if (((String) (obj2)).length() > l)
            {
                obj1 = ((String) (obj2)).substring(0, l);
            }
        }
        contentvalues.put("text", ((String) (obj1)));
        contentvalues.put("local_url", dtl1.f());
        contentvalues.put("attachment_content_type", dtl1.g());
        contentvalues.put("width_pixels", Integer.valueOf(0));
        contentvalues.put("height_pixels", Integer.valueOf(0));
        contentvalues.put("status", Integer.valueOf(dsu.e.ordinal()));
        contentvalues.put("timestamp", Long.valueOf(dtl1.q));
        contentvalues.put("notification_level", Integer.valueOf(-1));
        contentvalues.put("expiration_timestamp", Long.valueOf(0x7fffffffffffffffL));
        obj2 = String.valueOf(m);
        l2 = dtl1.m;
        contentvalues.put("external_ids", g.a(new String[] {
            Uri.parse((new StringBuilder(String.valueOf(obj2).length() + 21)).append(((String) (obj2))).append("/").append(l2).toString()).toString()
        }));
        if (k1 == 0) goto _L6; else goto _L5
_L5:
        contentvalues.put("sms_raw_recipients", TextUtils.join(",", ((Iterable) (obj3))));
_L8:
        contentvalues.put("sms_priority", Integer.valueOf(dtl1.s));
        contentvalues.put("mms_subject", dtl1.o);
        contentvalues.put("sms_message_status", Integer.valueOf(-1));
        contentvalues.put("sms_type", Integer.valueOf(1));
        contentvalues.put("sms_message_size", Long.valueOf(dtl1.h()));
        contentvalues.put("persisted", Boolean.valueOf(true));
        l2 = s.e().a("messages", contentvalues);
        if (l2 == -1L)
        {
            k1 = r.h();
            eev.g("Babel_SMS", (new StringBuilder(65)).append("SmsSyncManager A#").append(k1).append(": failed to insert message into table").toString());
            return -1L;
        }
        break; /* Loop/switch isn't completed */
_L6:
        contentvalues.put("sms_raw_sender", ((String) (obj)));
        if (((List) (obj3)).size() > 1)
        {
            contentvalues.put("sms_raw_recipients", due.a(((List) (obj3)), ((String) (obj))));
        }
        if (true) goto _L8; else goto _L7
_L7:
        if (dtl1.k() > 1)
        {
            obj = dtl1.d().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                obj2 = (dtm)((Iterator) (obj)).next();
                if (((dtm) (obj2)).b())
                {
                    obj3 = new apl();
                    obj3.a = s1;
                    obj3.b = s2;
                    obj3.c = ((dtm) (obj2)).d().toString();
                    obj3.d = ((dtm) (obj2)).i;
                    obj3.e = 0;
                    obj3.f = 0;
                    s.a(((apl) (obj3)));
                }
            } while (true);
        }
        y = y | dtl1.v;
        k1 = 2;
        if (dtl1.j() > 1 || dtl1.k() != 1 || !g.b(dtl1.g())) goto _L10; else goto _L9
_L9:
        k1 = 3;
_L12:
        a(s1, cgd1, ((String) (obj1)), dtl1.f(), dtl1.q, l2, k1, dtl1.g(), 1, dtl1.u, dtl1.r);
        return l2;
_L10:
        if (dtl1.w.size() > 1 || g.e(dtl1.g()))
        {
            k1 = 9;
        }
        if (true) goto _L12; else goto _L11
_L11:
    }

    static Uri a(String s1)
    {
        s1 = g.h(s1);
        if (!TextUtils.isEmpty(s1) && s1.startsWith("content://"))
        {
            return Uri.parse(s1);
        } else
        {
            return null;
        }
    }

    public static String a()
    {
        return b;
    }

    private String a(long l1, cgd cgd1)
    {
        Object obj = null;
        String s1 = (String)t.a(l1);
        if (s1 != null)
        {
            cgd1 = s1;
        } else
        {
            Object obj2 = a(l1);
            if (obj2 == null || ((List) (obj2)).size() <= 0)
            {
                int i1 = r.h();
                eev.g("Babel_SMS", (new StringBuilder(89)).append("SmsSyncManager A#").append(i1).append(": could not find recipients for threadId ").append(l1).toString());
                return null;
            }
            Object obj1 = new ArrayList();
            Object obj3;
            for (Iterator iterator = ((List) (obj2)).iterator(); iterator.hasNext(); ((ArrayList) (obj1)).add(obj3))
            {
                obj3 = (String)iterator.next();
                obj3 = g.a(g.nU, ((String) (obj3)), null, null);
                if (cgd1 != null && cgd1.a(((cfz) (obj3)).b))
                {
                    obj3.i = Boolean.TRUE;
                }
            }

            byte byte0;
            boolean flag;
            if (((List) (obj2)).size() > 1)
            {
                byte0 = 2;
            } else
            {
                byte0 = 1;
            }
            obj2 = s;
            if (cgd1 != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj1 = aoq.b(((aow) (obj2)), flag, null, ((List) (obj1)), null, null, aot.b, byte0, 3, true, null, null);
            cgd1 = obj;
            if (obj1 != null)
            {
                t.a(l1, obj1);
                return ((String) (obj1));
            }
        }
        return cgd1;
    }

    static String a(String s1, String s2, long l1, long l2)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(s1);
        if (l1 > 0L)
        {
            stringbuilder.append(" AND ").append(s2).append(">=").append(l1);
        }
        if (l2 > 0L)
        {
            stringbuilder.append(" AND ").append(s2).append("<=").append(l2);
        }
        return stringbuilder.toString();
    }

    private List a(long l1)
    {
        List list1 = (List)u.a(l1);
        List list = list1;
        if (list1 == null)
        {
            list1 = due.a(l1);
            list = list1;
            if (list1 != null)
            {
                list = list1;
                if (list1.size() > 0)
                {
                    u.a(l1, list1);
                    list = list1;
                }
            }
        }
        list1 = list;
        if (list == null)
        {
            if (D == null)
            {
                ArrayList arraylist = new ArrayList();
                D = arraylist;
                arraylist.add(due.h().c);
            }
            list1 = D;
        }
        return list1;
    }

    public static void a(int i1, long l1)
    {
        gdv.a(i1, 0, 1);
        eds aeds[] = o;
        aeds;
        JVM INSTR monitorenter ;
        if (l1 < 0L)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        o[i1].b(l1);
        aeds;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        aeds;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void a(aoa aoa1)
    {
        gdv.b("Expected non-null", aoa1);
        if (!aoa1.f())
        {
            aoa1.T();
            return;
        }
        if (a)
        {
            int i1 = aoa1.h();
            eev.b("Babel_SMS", (new StringBuilder(47)).append("SmsSyncManager A#").append(i1).append(": scheduled cleanse").toString());
        }
        B.execute(new dut(aoa1));
    }

    public static void a(aoa aoa1, boolean flag, long l1)
    {
        gdv.b("Expected non-null", aoa1);
        if (aoa1.f()) goto _L2; else goto _L1
_L1:
        aoa1.S();
_L11:
        return;
_L2:
        Object obj;
        obj = aoa1.a();
        obj = (List)p.get(obj);
        if (obj == null) goto _L4; else goto _L3
_L3:
        obj = ((List) (obj)).iterator();
_L7:
        if (!((Iterator) (obj)).hasNext()) goto _L4; else goto _L5
_L5:
        if (!((dvb)((Iterator) (obj)).next()).a) goto _L7; else goto _L6
_L6:
        int i1 = 1;
_L9:
        Map map;
        if (i1 != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (a)
        {
            i1 = aoa1.h();
            Object obj1;
            List list;
            dvb dvb1;
            String s1;
            if (flag)
            {
                obj1 = " full";
            } else
            {
                obj1 = "";
            }
            eev.b("Babel_SMS", (new StringBuilder(String.valueOf(obj1).length() + 81)).append("SmsSyncManager A#").append(i1).append(": scheduled").append(((String) (obj1))).append(" sync in ").append(l1).append(" milliseconds").toString());
        }
        dvb1 = new dvb(aoa1, flag);
        s1 = aoa1.a();
        map = p;
        map;
        JVM INSTR monitorenter ;
        list = (List)p.get(s1);
        obj1 = list;
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_246;
        }
        obj1 = new ArrayList();
        p.put(s1, obj1);
        ((List) (obj1)).add(dvb1);
        map;
        JVM INSTR monitorexit ;
        b(aoa1.a());
        B.schedule(dvb1, l1, TimeUnit.MILLISECONDS);
        return;
_L4:
        i1 = 0;
        if (true) goto _L9; else goto _L8
_L8:
        if (true) goto _L11; else goto _L10
_L10:
        aoa1;
        map;
        JVM INSTR monitorexit ;
        throw aoa1;
    }

    static void a(dur dur1)
    {
        dur1.z = true;
    }

    private void a(hd hd1)
    {
        int i1;
        int k1;
        k1 = hd1.a();
        i1 = 0;
_L4:
        if (i1 >= k1) goto _L2; else goto _L1
_L1:
        Object obj;
        int l1 = Math.min(i1 + 128, k1) - i1;
        obj = String.format(Locale.US, "%s != '%s' AND %s IN %s", new Object[] {
            "ct", "application/smil", "mid", due.a(l1)
        });
        String as[] = new String[l1];
        for (int j1 = 0; j1 < l1; j1++)
        {
            as[j1] = Long.toString(((dtl)hd1.a(i1 + j1)).m);
        }

        obj = g.a(q.getContentResolver(), due.b, dtm.a, ((String) (obj)), as, null);
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        dtm dtm1;
        dtl dtl1;
        do
        {
            if (!((Cursor) (obj)).moveToNext())
            {
                break MISSING_BLOCK_LABEL_194;
            }
            dtm1 = dtm.a(((Cursor) (obj)), false);
            dtl1 = (dtl)hd1.a(dtm1.h);
        } while (dtl1 == null);
        dtl1.a(dtm1);
          goto _L3
        hd1;
        ((Cursor) (obj)).close();
        throw hd1;
        ((Cursor) (obj)).close();
        i1 += 128;
          goto _L4
_L2:
    }

    private void a(String s1, cgd cgd1, String s2, String s3, long l1, long l2, int i1, String s4, int j1, boolean flag, long l3)
    {
        duu duu2 = (duu)v.get(s1);
        duu duu1 = duu2;
        if (duu2 == null)
        {
            duu1 = new duu();
            v.put(s1, duu1);
        }
        if (l1 >= duu1.c)
        {
            duu1.a(cgd1, s2, s3, l1, l2, i1, s4, j1, l3);
        }
        if (flag && l1 >= duu1.i)
        {
            duu1.a(l1);
        }
    }

    static void a(String s1, dvb dvb1)
    {
        Map map = p;
        map;
        JVM INSTR monitorenter ;
        s1 = (List)p.get(s1);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        s1.remove(dvb1);
        map;
        JVM INSTR monitorexit ;
        return;
        s1;
        map;
        JVM INSTR monitorexit ;
        throw s1;
    }

    private static void a(List list, hd hd1, dtj dtj1)
    {
        if (dtj1.a() == 1)
        {
            hd1.b(dtj1.b(), (dtl)dtj1);
            return;
        } else
        {
            list.add((dtn)dtj1);
            return;
        }
    }

    private boolean a(int i1, long l1, dva dva1)
    {
        Object obj1;
        Object obj2;
        hd hd1;
        ArrayList arraylist;
        ArrayList arraylist1;
        HashSet hashset;
        HashSet hashset1;
        int k1;
        int i2;
        boolean flag;
        long l4;
        boolean flag2;
        gdv.b("Expected non-null", dva1);
        dva1.a();
        if (a || A)
        {
            int j1 = r.h();
            eev.b("Babel_SMS", (new StringBuilder(99)).append("SmsSyncManager A#").append(j1).append(": batch started with size = ").append(i1).append(", last ts = ").append(l1).toString());
        }
        l4 = SystemClock.elapsedRealtime();
        flag2 = true;
        k1 = 0;
        flag = false;
        i2 = 0;
        obj2 = null;
        obj1 = null;
        arraylist1 = new ArrayList();
        hd1 = new hd();
        arraylist = new ArrayList();
        hashset = new HashSet();
        hashset1 = new HashSet();
        Object obj = new duw(s, w, l1);
        Object obj3 = new duz(w, l1);
        obj2 = ((duv) (obj3)).a();
        obj1 = ((duv) (obj)).a();
        int j2;
        int k2;
        k2 = 0;
        j2 = 0;
_L15:
        boolean flag1 = flag2;
        if (j2 + k2 >= j) goto _L2; else goto _L1
_L1:
        flag1 = flag2;
        if (k1 + i2 >= i1) goto _L2; else goto _L3
_L3:
        if (obj2 != null || obj1 != null) goto _L5; else goto _L4
_L4:
        flag1 = false;
_L2:
        a(hd1);
        long l5;
        ((duv) (obj)).b();
        ((duv) (obj3)).b();
        l5 = SystemClock.elapsedRealtime();
        s.a();
        obj2 = arraylist1.iterator();
        i1 = ((flag) ? 1 : 0);
_L10:
        if (!((Iterator) (obj2)).hasNext()) goto _L7; else goto _L6
_L6:
        obj3 = (dtn)((Iterator) (obj2)).next();
        if (((dtn) (obj3)).n == null)
        {
            int l2 = r.h();
            eev.f("Babel_SMS", (new StringBuilder(45)).append("SmsSyncManager A#").append(l2).append(": empty sms body.").toString());
            obj3.n = "";
        }
        if (TextUtils.isEmpty(((dtn) (obj3)).m))
        {
            int i3 = r.h();
            eev.f("Babel_SMS", (new StringBuilder(48)).append("SmsSyncManager A#").append(i3).append(": empty sms address.").toString());
            obj3.m = due.h().c;
        }
        flag2 = c(0, ((dtn) (obj3)).o);
        if (!flag2) goto _L9; else goto _L8
_L8:
        l1 = -1L;
_L41:
        if (l1 > 0L)
        {
            i1++;
        }
          goto _L10
_L5:
        if (obj2 == null && obj1 != null) goto _L12; else goto _L11
_L11:
        if (obj1 == null || obj2 == null) goto _L14; else goto _L13
_L13:
        if (((dtj) (obj1)).c() <= ((dtj) (obj2)).c()) goto _L14; else goto _L12
_L12:
        arraylist.add((dux)obj1);
        dva1.a(((dtj) (obj1)).c());
        obj1 = ((duv) (obj)).a();
        i2++;
        j2++;
          goto _L15
_L51:
        if (obj1 == null || obj2 == null) goto _L17; else goto _L16
_L16:
        if (((dtj) (obj1)).c() >= ((dtj) (obj2)).c()) goto _L17; else goto _L18
_L18:
        a(((List) (arraylist1)), hd1, ((dtj) (obj2)));
        dva1.a(((dtj) (obj2)).c());
        obj2 = ((duv) (obj3)).a();
        k1++;
        k2++;
          goto _L15
_L17:
        Object obj4;
        Object obj5;
        l1 = ((dtj) (obj1)).c();
        dva1.a(l1);
        obj5 = ((duv) (obj3)).a();
        obj4 = ((duv) (obj)).a();
        if (obj5 == null) goto _L20; else goto _L19
_L19:
        if (((dtj) (obj5)).c() == l1) goto _L21; else goto _L20
_L20:
        if (obj4 == null) goto _L23; else goto _L22
_L22:
        if (((dtj) (obj4)).c() == l1) goto _L21; else goto _L23
_L23:
        if (((dtj) (obj2)).equals(obj1)) goto _L25; else goto _L24
_L24:
        arraylist.add((dux)obj1);
        i2++;
        a(((List) (arraylist1)), hd1, ((dtj) (obj2)));
        int j3 = k1 + 1;
        k1 = i2;
        i2 = j3;
          goto _L26
_L21:
        hashset1.clear();
        hashset1.add(obj2);
        obj2 = obj5;
        k2++;
_L28:
        if (obj2 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((dtj) (obj2)).c() != l1)
        {
            break; /* Loop/switch isn't completed */
        }
        hashset1.add(obj2);
        obj2 = ((duv) (obj3)).a();
        k2++;
        if (true) goto _L28; else goto _L27
_L27:
        hashset.clear();
        hashset.add(obj1);
        obj1 = obj4;
        j2++;
_L30:
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((dtj) (obj1)).c() != l1)
        {
            break; /* Loop/switch isn't completed */
        }
        hashset.add(obj1);
        obj1 = ((duv) (obj)).a();
        j2++;
        if (true) goto _L30; else goto _L29
_L29:
        obj4 = hashset.iterator();
_L31:
        do
        {
            if (!((Iterator) (obj4)).hasNext())
            {
                break MISSING_BLOCK_LABEL_943;
            }
            obj5 = (dtj)((Iterator) (obj4)).next();
        } while (hashset1.contains(obj5));
        arraylist.add((dux)obj5);
        i2++;
          goto _L31
        obj4 = hashset1.iterator();
_L34:
        if (!((Iterator) (obj4)).hasNext()) goto _L15; else goto _L32
_L32:
        obj5 = (dtj)((Iterator) (obj4)).next();
        if (hashset.contains(obj5)) goto _L34; else goto _L33
_L33:
        a(((List) (arraylist1)), hd1, ((dtj) (obj5)));
        k1++;
          goto _L34
        obj1;
        dva1 = null;
        obj = null;
_L50:
        obj2 = String.valueOf(obj1);
        eev.e("Babel_SMS", (new StringBuilder(String.valueOf(obj2).length() + 47)).append("SmsSyncManager: Something's seriously wrong -- ").append(((String) (obj2))).toString(), ((Throwable) (obj1)));
        if (obj != null)
        {
            ((duv) (obj)).b();
        }
        if (dva1 != null)
        {
            dva1.b();
        }
        return false;
        dva1;
        obj = null;
_L49:
        obj2 = String.valueOf(dva1);
        eev.e("Babel_SMS", (new StringBuilder(String.valueOf(obj2).length() + 43)).append("SmsSyncManager: unexpected failure in scan ").append(((String) (obj2))).toString(), dva1);
        if (obj1 != null)
        {
            ((duv) (obj1)).b();
        }
        if (obj != null)
        {
            ((duv) (obj)).b();
        }
        return false;
        dva1;
        obj = null;
        obj1 = obj2;
_L48:
        if (obj1 != null)
        {
            ((duv) (obj1)).b();
        }
        if (obj != null)
        {
            ((duv) (obj)).b();
        }
        throw dva1;
_L9:
        int k3;
        String s1;
        int l3;
        long l6;
        boolean flag3;
        if (((dtn) (obj3)).r != 1)
        {
            k3 = 1;
        } else
        {
            k3 = 0;
        }
        obj = null;
        if (k3 == 0) goto _L36; else goto _L35
_L35:
        if (r == null) goto _L38; else goto _L37
_L37:
        obj = r.b();
_L43:
        if (obj != null) goto _L40; else goto _L39
_L39:
        k3 = r.h();
        l1 = ((dtn) (obj3)).o;
        l3 = ((dtn) (obj3)).r;
        l6 = ((dtn) (obj3)).s;
        eev.g("Babel_SMS", (new StringBuilder(127)).append("SmsSyncManager A#").append(k3).append(": found SMS has no address: id=").append(l1).append(" type=").append(l3).append(" thread_id=").append(l6).toString());
        l1 = -1L;
          goto _L41
_L36:
        if (TextUtils.isEmpty(((dtn) (obj3)).m)) goto _L43; else goto _L42
_L42:
        obj = g.m(((dtn) (obj3)).m);
          goto _L43
_L40:
        flag3 = aoq.a(((cgd) (obj)));
        l1 = ((dtn) (obj3)).s;
        if (flag3)
        {
            obj1 = obj;
        } else
        {
            obj1 = null;
        }
        obj1 = a(l1, ((cgd) (obj1)));
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_1464;
        }
        k3 = r.h();
        l1 = ((dtn) (obj3)).s;
        eev.g("Babel_SMS", (new StringBuilder(95)).append("SmsSyncManager A#").append(k3).append(": failed to create conversation for sms thread ").append(l1).toString());
        l1 = -1L;
          goto _L41
        obj4 = new ContentValues();
        ((ContentValues) (obj4)).put("message_id", aow.g());
        ((ContentValues) (obj4)).put("conversation_id", ((String) (obj1)));
        ((ContentValues) (obj4)).put("transport_type", Integer.valueOf(3));
        if (k3 == 0) goto _L45; else goto _L44
_L44:
        l3 = dsv.b.ordinal();
_L46:
        ((ContentValues) (obj4)).put("type", Integer.valueOf(l3));
        ((ContentValues) (obj4)).put("author_chat_id", ((cgd) (obj)).b);
        ((ContentValues) (obj4)).put("author_gaia_id", ((cgd) (obj)).a);
        obj5 = ((dtn) (obj3)).n;
        ((ContentValues) (obj4)).put("text", ((String) (obj5)));
        ((ContentValues) (obj4)).put("status", Integer.valueOf(dsu.e.ordinal()));
        ((ContentValues) (obj4)).put("timestamp", Long.valueOf(((dtn) (obj3)).p));
        ((ContentValues) (obj4)).put("notification_level", Integer.valueOf(-1));
        ((ContentValues) (obj4)).put("expiration_timestamp", Long.valueOf(0x7fffffffffffffffL));
        s1 = String.valueOf(n);
        l1 = ((dtn) (obj3)).o;
        ((ContentValues) (obj4)).put("external_ids", g.a(new String[] {
            Uri.parse((new StringBuilder(String.valueOf(s1).length() + 21)).append(s1).append("/").append(l1).toString()).toString()
        }));
        ((ContentValues) (obj4)).put("sms_timestamp_sent", Long.valueOf(((dtn) (obj3)).q));
        if (k3 == 0)
        {
            break MISSING_BLOCK_LABEL_1864;
        }
        ((ContentValues) (obj4)).put("sms_raw_recipients", ((dtn) (obj3)).m);
_L47:
        ((ContentValues) (obj4)).put("sms_message_status", Integer.valueOf(((dtn) (obj3)).t));
        ((ContentValues) (obj4)).put("sms_type", Integer.valueOf(0));
        ((ContentValues) (obj4)).put("persisted", Boolean.valueOf(true));
        l1 = s.e().a("messages", ((ContentValues) (obj4)));
        if (l1 != -1L)
        {
            break MISSING_BLOCK_LABEL_1938;
        }
        k3 = r.h();
        eev.g("Babel_SMS", (new StringBuilder(61)).append("SmsSyncManager A#").append(k3).append(": failed to insert sms into table").toString());
        l1 = -1L;
          goto _L41
_L45:
        l3 = dsv.c.ordinal();
          goto _L46
        ((ContentValues) (obj4)).put("sms_raw_sender", ((dtn) (obj3)).m);
          goto _L47
        dva1;
        obj = String.valueOf(dva1);
        eev.e("Babel_SMS", (new StringBuilder(String.valueOf(obj).length() + 45)).append("SmsSyncManager: unexpected failure in db txn ").append(((String) (obj))).toString(), dva1);
        s.c();
        return false;
        x = x | ((dtn) (obj3)).v;
        a(((String) (obj1)), ((cgd) (obj)), ((String) (obj5)), null, ((dtn) (obj3)).p, l1, 2, null, 0, ((dtn) (obj3)).u, ((dtn) (obj3)).s);
          goto _L41
        dva1;
        s.c();
        throw dva1;
_L7:
        k3 = 0;
_L52:
        if (k3 < hd1.a())
        {
            if (a((dtl)hd1.a(k3)) > 0L)
            {
                i1++;
            }
            break MISSING_BLOCK_LABEL_2427;
        }
        k3 = a("messages", "_id", a(((List) (arraylist))));
        k();
        s.b();
        s.c();
        aoq.d(s);
        dva1.c = j2;
        dva1.d = k2;
        dva1.e = k1;
        dva1.f = i1;
        dva1.g = i2;
        dva1.h = k3;
        l1 = SystemClock.elapsedRealtime();
        dva1.a = l1 - l4;
        dva1.b = l1 - l5;
        if (a || A)
        {
            i1 = r.h();
            dva1 = String.valueOf(dva1.toString());
            eev.b("Babel_SMS", (new StringBuilder(String.valueOf(dva1).length() + 42)).append("SmsSyncManager A#").append(i1).append(": batch done. ").append(dva1).toString());
        }
        return flag1;
        dva1;
        obj2 = null;
        obj1 = obj;
        obj = obj2;
          goto _L48
        dva1;
        obj1 = obj;
        obj = obj3;
          goto _L48
        obj3;
        obj1 = dva1;
        obj2 = obj;
        dva1 = ((dva) (obj3));
        obj = obj1;
        obj1 = obj2;
          goto _L48
        dva1;
          goto _L48
        dva1;
        obj2 = null;
        obj1 = obj;
        obj = obj2;
          goto _L49
        dva1;
        obj1 = obj;
        obj = obj3;
          goto _L49
        obj1;
        dva1 = null;
          goto _L50
        obj1;
        dva1 = ((dva) (obj3));
          goto _L50
_L25:
        k3 = k1;
        k1 = i2;
        i2 = k3;
          goto _L26
_L14:
        if (obj1 == null && obj2 != null) goto _L18; else goto _L51
_L26:
        obj2 = obj5;
        k3 = i2;
        k2++;
        j2++;
        obj1 = obj4;
        i2 = k1;
        k1 = k3;
          goto _L15
_L38:
        obj = null;
          goto _L43
        k3++;
          goto _L52
    }

    static boolean a(aow aow1)
    {
        return b(aow1);
    }

    private static String[] a(List list)
    {
        String as[] = new String[list.size()];
        for (int i1 = 0; i1 < as.length; i1++)
        {
            as[i1] = Long.toString(((dux)list.get(i1)).d());
        }

        return as;
    }

    static int b(dur dur1)
    {
        return dur1.j();
    }

    private static long b(Uri uri)
    {
        if (uri == null)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        long l1 = ContentUris.parseId(uri);
        return l1;
        uri;
_L2:
        return -1L;
        uri;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String b()
    {
        return c;
    }

    public static void b(int i1, long l1)
    {
        gdv.a(i1, 0, 1);
        eds aeds[] = o;
        aeds;
        JVM INSTR monitorenter ;
        if (l1 < 0L)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        o[i1].c(l1);
        aeds;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        aeds;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void b(aoa aoa1)
    {
        a(aoa1, false, 0L);
    }

    private static void b(String s1)
    {
        Map map = p;
        map;
        JVM INSTR monitorenter ;
        Iterator iterator = p.keySet().iterator();
_L2:
        Object obj;
        do
        {
            do
            {
                if (!iterator.hasNext())
                {
                    break MISSING_BLOCK_LABEL_100;
                }
                obj = (String)iterator.next();
            } while (TextUtils.equals(s1, ((CharSequence) (obj))));
            obj = (List)p.get(obj);
        } while (obj == null);
        obj = ((List) (obj)).iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            ((dvb)((Iterator) (obj)).next()).a();
        }
        if (true) goto _L2; else goto _L1
_L1:
        s1;
        map;
        JVM INSTR monitorexit ;
        throw s1;
        map;
        JVM INSTR monitorexit ;
    }

    private static boolean b(aow aow1)
    {
        Object obj = g.nU;
        int i1;
        int k1;
        i1 = a(aow1.e().a("messages", C, d, null, null));
        k1 = a(g.a(((Context) (obj)).getContentResolver(), n, C, b, null, null)) + a(g.a(((Context) (obj)).getContentResolver(), m, C, c, null, null));
        SQLiteException sqliteexception;
        int l1;
        boolean flag;
        boolean flag1;
        if (i1 == k1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!a)
        {
            flag1 = flag;
            if (flag)
            {
                break MISSING_BLOCK_LABEL_246;
            }
        }
        l1 = aow1.f().h();
        if (flag)
        {
            obj = ": ";
        } else
        {
            obj = ": NOT IN SYNC, ";
        }
        eev.b("Babel_SMS", (new StringBuilder(String.valueOf(obj).length() + 69)).append("SmsSyncManager A#").append(l1).append(((String) (obj))).append("local = ").append(i1).append(", remote = ").append(k1).toString());
        return flag;
        sqliteexception;
        int j1 = aow1.f().h();
        aow1 = String.valueOf(sqliteexception);
        eev.e("Babel_SMS", (new StringBuilder(String.valueOf(aow1).length() + 53)).append("SmsSyncManager A#").append(j1).append(": failed to query counts ").append(aow1).toString(), sqliteexception);
        flag1 = true;
        return flag1;
    }

    static String c()
    {
        return d;
    }

    public static void c(aoa aoa1)
    {
        a(aoa1, true, 0L);
    }

    private static boolean c(int i1, long l1)
    {
        gdv.a(i1, 0, 1);
        boolean flag;
        synchronized (o)
        {
            flag = o[i1].a(l1);
        }
        return flag;
        exception;
        aeds;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static Uri d()
    {
        return n;
    }

    static Uri e()
    {
        return m;
    }

    static boolean f()
    {
        return a;
    }

    static long g()
    {
        return k;
    }

    static void h()
    {
        i();
    }

    private static void i()
    {
        e = g.a(g.nU, "babel_sms_sync_first_batch_size", 100);
        f = g.a(g.nU, "babel_sms_sync_subsequent_batch_size_min", 100);
        g = g.a(g.nU, "babel_sms_sync_subsequent_batch_size_max", 1000);
        h = g.a(g.nU, "babel_sms_sync_subsequent_batch_time_limit", 2000L);
        i = g.a(g.nU, "babel_sms_incremental_sync_batch_interval_in_millis", 1000L);
        j = g.a(g.nU, "babel_sms_sync_batch_max_messages_to_scan", 2000);
        k = g.a(g.nU, "babel_sms_full_sync_backoff_time_millis", 0x36ee80L);
        l = g.a(g.nU, "babel_mms_text_limit", 2000);
    }

    private int j()
    {
        dva dva1;
        int l1;
        int k2;
        int l2;
        int i3;
        int j3;
        long l6;
        long l9;
        long l10;
        boolean flag;
        if (a || A)
        {
            int i1 = r.h();
            long l5 = w;
            eev.b("Babel_SMS", (new StringBuilder(60)).append("SmsSyncManager A#").append(i1).append(": sync from ").append(l5).toString());
        }
        l9 = System.currentTimeMillis();
        l10 = SystemClock.elapsedRealtime();
        dva1 = new dva();
        j3 = e;
        l1 = 0;
        k2 = 0;
        l2 = 0;
        i3 = 0;
        l6 = -1L;
        x = false;
        y = false;
        flag = true;
_L8:
        int j1;
        int k4;
        int l4;
        int i5;
        j1 = i3;
        k4 = l2;
        l4 = k2;
        i5 = l1;
        if (z) goto _L2; else goto _L1
_L1:
        int k3;
        int l3;
        int i4;
        int j4;
        boolean flag1;
        flag1 = a(j3, l6, dva1);
        k3 = l1 + dva1.c;
        l3 = k2 + dva1.d;
        i4 = l2 + dva1.f;
        j4 = i3 + dva1.h;
        flag = flag1;
        j1 = j4;
        k4 = i4;
        l4 = l3;
        i5 = k3;
        if (!flag1) goto _L2; else goto _L3
_L3:
        if (dva1.b > 0L) goto _L5; else goto _L4
_L4:
        j1 = e;
_L6:
        long l8 = dva1.i / 1000L;
        flag = flag1;
        i3 = j4;
        l6 = l8;
        l2 = i4;
        k2 = l3;
        l1 = k3;
        j3 = j1;
        if (i <= 0L)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            Thread.sleep(i);
        }
        catch (InterruptedException interruptedexception)
        {
            flag = flag1;
            i3 = j4;
            l6 = l8;
            l2 = i4;
            k2 = l3;
            l1 = k3;
            j3 = j1;
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        i3 = j4;
        l6 = l8;
        l2 = i4;
        k2 = l3;
        l1 = k3;
        j3 = j1;
        continue; /* Loop/switch isn't completed */
_L5:
        int i2 = (int)(((double)(dva1.h + dva1.f) / (double)dva1.b) * (double)h);
        if (i2 < f)
        {
            j1 = f;
        } else
        {
            j1 = i2;
            if (i2 > g)
            {
                j1 = g;
            }
        }
        if (true) goto _L6; else goto _L2
_L2:
        if (!flag)
        {
            if (x)
            {
                due.d(n);
            }
            if (y)
            {
                due.d(m);
            }
            if (a || A)
            {
                int j2 = r.h();
                long l7 = SystemClock.elapsedRealtime();
                eev.b("Babel_SMS", (new StringBuilder(168)).append("SmsSyncManager A#").append(j2).append(": sync done in ").append(l7 - l10).append(" millis, scanned ").append(i5).append(" local msgs, ").append(l4).append(" remote msgs, ").append(k4).append(" added, ").append(j1).append(" deleted.").toString());
            }
            ((gqz)hlp.a(g.nU, gqz)).b(r.h()).c("sms_last_sync_time_millis", l9).d();
            return k4 + j1;
        }
        if (a || A)
        {
            int k1 = r.h();
            eev.b("Babel_SMS", (new StringBuilder(42)).append("SmsSyncManager A#").append(k1).append(": sync aborted").toString());
        }
        return -1;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void k()
    {
        Iterator iterator = v.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            duu duu1 = (duu)v.get(s1);
            if (!duu1.k)
            {
                s.a(s1, duu1.c, -1L, duu1.f, duu1.g, duu1.a, duu1.b, duu1.e, duu1.d, duu1.h, 0);
                s.i(s1, duu1.c);
                s.a(s1, duu1.i, false, "smssync");
                s.m(s1, duu1.j);
                duu1.k = true;
            }
        } while (true);
    }

    static 
    {
        Object obj = eev.r;
        b = String.format(Locale.US, "(%s IN (%d, %d))", new Object[] {
            "type", Integer.valueOf(1), Integer.valueOf(2)
        });
        c = String.format(Locale.US, "((%s IN (%d, %d)) AND (%s IN (%d, %d)))", new Object[] {
            "msg_box", Integer.valueOf(1), Integer.valueOf(2), "m_type", Integer.valueOf(128), Integer.valueOf(132)
        });
        d = String.format(Locale.US, "((%s=%d) AND (%s=%d OR %s=%d) AND (%s=%d))", new Object[] {
            "transport_type", Integer.valueOf(3), "sms_type", Integer.valueOf(0), "sms_type", Integer.valueOf(1), "status", Integer.valueOf(dsu.e.ordinal())
        });
        i();
        g.a(g.nU).a(new dus());
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            obj = android.provider.Telephony.Mms.CONTENT_URI;
        } else
        {
            obj = Uri.parse("content://mms");
        }
        m = ((Uri) (obj));
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            obj = android.provider.Telephony.Sms.CONTENT_URI;
        } else
        {
            obj = Uri.parse("content://sms");
        }
        n = ((Uri) (obj));
    }
}
