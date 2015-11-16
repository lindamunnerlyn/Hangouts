// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.hangouts.content.EsProvider;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class cdr extends ceb
{

    private static final boolean s;
    public dqc a;
    public CharSequence b;
    public String c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;
    public String i;
    public long j;
    public String k;
    public String l;
    public String m;
    public dqb n;

    public cdr(Cursor cursor, int i1)
    {
        Object obj;
        Object obj1;
        String s1;
        String s2;
        int j1;
        obj = cda.a(cursor, 8, 9);
        obj1 = cursor.getString(7);
        s1 = cursor.getString(18);
        long l1 = cursor.getLong(20);
        o = new cda(((String) (obj1)), s1, cursor.getInt(10), ((String) (obj)), cursor.getLong(11), false, 0, cursor.getString(21), cursor.getInt(22), l1);
        r = cursor.getString(1);
        s1 = cursor.getString(0);
        a = dqc.values()[cursor.getInt(4)];
        e = cursor.getInt(14);
        p = cej.a(e);
        k = cursor.getString(26);
        l = cursor.getString(11);
        obj = cursor.getString(3);
        h = cursor.getString(15);
        m = cursor.getString(2);
        obj1 = cursor.getString(16);
        s2 = cursor.getString(17);
        j1 = cursor.getInt(23);
        f = cursor.getInt(19);
        int k1;
        boolean flag;
        if (2 == f)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        if (!g.d(e) || g) goto _L2; else goto _L1
_L1:
        b = ((CharSequence) (obj));
        obj1 = cursor.getString(5);
        obj = obj1;
        if (obj1 == null)
        {
            obj1 = cursor.getString(6);
            obj = obj1;
            if ("hangouts/location".equals(cursor.getString(13)))
            {
                obj = ebr.a(((String) (obj1)));
            }
        }
        j1 = a(cursor.getString(13));
        if (obj == null || !((String) (obj)).contains(drk.a)) goto _L4; else goto _L3
_L3:
        obj1 = drk.b(((String) (obj))).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break MISSING_BLOCK_LABEL_710;
            }
            obj = (drl)((Iterator) (obj1)).next();
        } while (!g.b(((drl) (obj)).b));
_L6:
        if (obj != null)
        {
            obj1 = ((drl) (obj)).a;
            j1 = a(((drl) (obj)).b);
            obj = obj1;
        } else
        {
            obj = null;
            j1 = 0;
        }
_L4:
label0:
        {
            k1 = j1;
            if (j1 != 1)
            {
                break label0;
            }
            k1 = j1;
            if (obj == null)
            {
                break label0;
            }
            if (!((String) (obj)).contains(EsProvider.b(g.nS)))
            {
                k1 = j1;
                if (!((String) (obj)).startsWith("sticker://"))
                {
                    break label0;
                }
            }
            k1 = 7;
        }
        d = k1;
        c = ((String) (obj));
        if (o.c && e == 3)
        {
            if (s1 == null)
            {
                q = r;
            } else
            {
                q = s1;
            }
        } else
        {
            q = a(s1, r, o, i1);
            if (r == null)
            {
                r = o.f;
            }
            if (q == null)
            {
                q = o.f;
            }
        }
        i = cursor.getString(24);
        j = cursor.getLong(25);
        n = dqb.values()[cursor.getInt(12)];
        if (s)
        {
            cursor = String.valueOf(r);
            dqc dqc1;
            String s3;
            String s4;
            if (cursor.length() != 0)
            {
                cursor = "Message Line from ".concat(cursor);
            } else
            {
                cursor = new String("Message Line from ");
            }
            ebw.b("Babel", cursor);
        }
        return;
_L2:
        dqc1 = a;
        s3 = h;
        s4 = m;
        switch (cds.a[dqc1.ordinal()])
        {
        default:
            obj = g.a(dqc1, dbf.e(i1), dqb.e, s3, s4, ((String) (obj1)), s2, j1, true);
            break;

        case 1: // '\001'
        case 2: // '\002'
            break;

        case 3: // '\003'
            break MISSING_BLOCK_LABEL_692;
        }
_L5:
        if (obj != null)
        {
            obj = cdu.a(((String) (obj)));
        } else
        {
            obj = null;
        }
          goto _L1
        Log.wtf("Babel", "Message with deprecated membership change type");
        obj = null;
          goto _L5
        obj = null;
          goto _L6
    }

    private static int a(String s1)
    {
        if (g.b(s1))
        {
            return 1;
        }
        if (g.c(s1))
        {
            return 2;
        }
        if (g.d(s1))
        {
            return 3;
        }
        if ("hangouts/location".equals(s1))
        {
            return 4;
        }
        return !g.e(s1) ? 0 : 6;
    }

    static ccy a(int i1, boolean flag, boolean flag1, boolean flag2)
    {
        ArrayList arraylist = new ArrayList();
        android.net.Uri uri = EsProvider.a(EsProvider.j, i1);
        ContentResolver contentresolver = g.nS.getContentResolver();
        Object obj;
        if (!flag2)
        {
            String s1 = ank.e(g.nS, i1).b;
            if (dbq.t(i1))
            {
                obj = cdt.c;
            } else
            {
                obj = cdt.b;
            }
            arraylist.addAll(a(contentresolver.query(uri, cdt.a, ((String) (obj)), new String[] {
                s1
            }, "merge_key, timestamp DESC"), i1));
        } else
        {
            long l2 = g.a(g.nS, "babel_business_renotification_lookback_ms", djk.p);
            obj = new aoe(g.nS, i1);
            Object obj1 = ((aoe) (obj)).i();
            long l3 = System.currentTimeMillis();
            obj1 = ((List) (obj1)).iterator();
            while (((Iterator) (obj1)).hasNext()) 
            {
                String s2 = (String)((Iterator) (obj1)).next();
                Object obj2 = ((aoe) (obj)).c(s2, (l3 - l2) * 1000L);
                long l1;
                if (((List) (obj2)).size() > 0)
                {
                    l1 = ((aos)((List) (obj2)).get(0)).h;
                } else
                {
                    l1 = (l3 - l2) * 1000L;
                }
                obj2 = ank.e(g.nS, i1).b;
                arraylist.addAll(a(contentresolver.query(uri, cdt.a, cdt.d, new String[] {
                    s2, obj2, String.valueOf(l1)
                }, "merge_key, timestamp DESC"), i1));
            }
        }
        obj = new aog();
        if (dbq.t(i1))
        {
            a(i1, ((List) (arraylist)), 459, 407, 465, flag, flag1, ((aog) (obj)));
        } else
        {
            a(i1, ((List) (arraylist)), 456, 404, 462, flag, flag1, ((aog) (obj)));
        }
        obj = arraylist.iterator();
        for (i1 = 0; ((Iterator) (obj)).hasNext(); i1 = ((cda)((Iterator) (obj)).next()).i + i1) { }
        return new ccy(i1, arraylist);
    }

    private static List a(Cursor cursor, int i1)
    {
        ArrayList arraylist = new ArrayList();
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (!cursor.moveToFirst()) goto _L4; else goto _L3
_L3:
        if (s)
        {
            ebw.b("Babel", "Some unseen message notifications.");
        }
          goto _L5
_L25:
        Object obj1;
        cdr cdr1;
        cdr1 = new cdr(cursor, i1);
        obj1 = dbf.e(i1);
        Object obj;
        String s1;
        String s2;
        String s3;
        int j1;
        boolean flag;
        boolean flag1;
        if (cdr1.o != null && cdr1.o.a != null && RealTimeChatService.d(((ani) (obj1)), cdr1.o.a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (g.e(cdr1.e) || cdr1.r != null && cdr1.q != null && cdr1.b != null && cdr1.o.f != null)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (dbq.t(i1) && flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (j1 != 0)
        {
            break MISSING_BLOCK_LABEL_292;
        }
        if (cdr1.r == null)
        {
            obj1 = " null authorFullName ";
        } else
        {
            obj1 = "";
        }
        if (cdr1.q == null)
        {
            s1 = " null authorDisplayName ";
        } else
        {
            s1 = "";
        }
        if (cdr1.b == null)
        {
            s2 = " null text ";
        } else
        {
            s2 = "";
        }
        if (cdr1.o.f == null)
        {
            s3 = " null groupConversationName ";
        } else
        {
            s3 = "";
        }
        ebw.c("Babel", (new StringBuilder(String.valueOf(obj1).length() + 29 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append("Skipping notification because").append(((String) (obj1))).append(s1).append(s2).append(s3).toString());
        if (!flag) goto _L7; else goto _L6
_L6:
        obj1 = String.valueOf(cdr1.o.a);
        if (((String) (obj1)).length() == 0) goto _L9; else goto _L8
_L8:
        obj1 = "Skipping notification because the user focuses in the conversation: ".concat(((String) (obj1)));
_L20:
        ebw.c("Babel", ((String) (obj1)));
          goto _L7
_L21:
        if (j1 == 0) goto _L11; else goto _L10
_L10:
        if (obj == null) goto _L13; else goto _L12
_L12:
        obj1 = obj;
        if (TextUtils.equals(cdr1.o.b, ((cda) (obj)).b)) goto _L14; else goto _L13
_L13:
        if (!ebw.a("Babel", 3)) goto _L16; else goto _L15
_L15:
        if (obj != null) goto _L18; else goto _L17
_L17:
        obj = "null";
_L22:
        obj1 = cdr1.o.a;
        ebw.c("Babel", (new StringBuilder(String.valueOf(obj).length() + 44 + String.valueOf(obj1).length())).append("[Notifications] conversationId: ").append(((String) (obj))).append(" newConvId: ").append(((String) (obj1))).toString());
_L16:
        obj1 = cdr1.o;
        j1 = 0;
        while (j1 < arraylist.size() && ((cda) (obj1)).g < ((cda)arraylist.get(j1)).g) 
        {
            j1++;
        }
          goto _L19
_L9:
        obj1 = new String("Skipping notification because the user focuses in the conversation: ");
          goto _L20
        obj;
        cursor.close();
        throw obj;
_L28:
        j1 = 0;
          goto _L21
_L18:
        obj = ((cda) (obj)).a;
          goto _L22
_L19:
        if (j1 >= arraylist.size()) goto _L24; else goto _L23
_L23:
        arraylist.add(j1, obj1);
        obj = obj1;
_L26:
        ((cda) (obj)).h.add(cdr1);
        obj.i = ((cda) (obj)).i + 1;
_L11:
        flag1 = cursor.moveToNext();
        if (flag1) goto _L25; else goto _L4
_L4:
        cursor.close();
_L2:
        return arraylist;
_L24:
        arraylist.add(obj1);
_L14:
        obj = obj1;
          goto _L26
_L5:
        obj = null;
          goto _L25
_L7:
        if (j1 == 0 || flag) goto _L28; else goto _L27
_L27:
        j1 = 1;
          goto _L21
    }

    private static void a(int i1, String s1, long l1, aog aog1, byy byy1)
    {
        aoe aoe1 = new aoe(g.nS, i1);
        aog1.k = aoe1.v(s1);
        aog1.j = aoe1.u(s1);
        aog1.i = l1;
        byy1.a(aog1);
    }

    static void a(int i1, List list, int j1, int k1, int l1, boolean flag, boolean flag1, aog aog1)
    {
        int i2 = list.size();
        if (i2 > 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!flag) goto _L4; else goto _L3
_L3:
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        long l2;
        l2 = 0L;
        obj2 = "";
        obj = "";
        obj1 = "";
        obj3 = "";
        l1 = 0;
_L6:
        if (l1 >= i2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!(((cda)list.get(l1)).h.get(0) instanceof cdr))
        {
            break MISSING_BLOCK_LABEL_530;
        }
        cdr cdr1 = (cdr)((cda)list.get(l1)).h.get(0);
        long l3 = Long.parseLong(cdr1.l);
        if (l2 >= l3)
        {
            break MISSING_BLOCK_LABEL_530;
        }
        obj3 = cdr1.k;
        obj2 = ((cda)list.get(l1)).a;
        obj = cdr1.h;
        obj1 = cdr1.m;
        l2 = l3;
_L7:
        l1++;
        String s1 = ((String) (obj3));
        Object obj5 = obj;
        obj = obj2;
        obj3 = obj1;
        obj1 = obj5;
        obj2 = s1;
        if (true) goto _L6; else goto _L5
_L5:
        list = new cey(((String) (obj1)), ((String) (obj3)));
        flag = dbf.e(i1).b().a(list);
        if (!TextUtils.isEmpty(((CharSequence) (obj2))) && !flag)
        {
            list = (new byy()).c(((String) (obj2)));
            if (!flag1)
            {
                j1 = k1;
            }
            list = list.a(j1).a(((String) (obj)));
            if (i2 == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            list = list.a(flag);
            if (aog1 != null)
            {
                a(i1, ((String) (obj)), l2, aog1, ((byy) (list)));
            }
            h.a(i1, SystemClock.elapsedRealtime(), 10, list);
            return;
        }
          goto _L1
_L4:
        j1 = 0;
        while (j1 < i2) 
        {
            if (!TextUtils.isEmpty(((cda)list.get(j1)).a))
            {
                obj = ((cda)list.get(j1)).h;
                k1 = 0;
                while (k1 < ((List) (obj)).size()) 
                {
                    if (!(((List) (obj)).get(k1) instanceof cdr))
                    {
                        continue;
                    }
                    obj1 = (cdr)((List) (obj)).get(k1);
                    if (TextUtils.isEmpty(((cdr) (obj1)).k))
                    {
                        continue;
                    }
                    obj2 = (new byy()).a(l1).c(((cdr) (obj1)).k).a(((cda)list.get(j1)).a);
                    if (i2 == 1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    obj2 = ((byy) (obj2)).a(flag);
                    if (aog1 != null)
                    {
                        a(i1, ((cda)list.get(j1)).a, Long.parseLong(((cdr) (obj1)).l), aog1, ((byy) (obj2)));
                    }
                    h.a(i1, SystemClock.elapsedRealtime(), 10, ((byy) (obj2)));
                    k1++;
                }
            }
            j1++;
        }
          goto _L1
        String s2 = ((String) (obj3));
        obj3 = obj;
        Object obj4 = obj2;
        obj = obj1;
        obj1 = s2;
        obj2 = obj3;
        obj3 = obj4;
          goto _L7
    }

    static 
    {
        s = cdu.b;
    }
}
