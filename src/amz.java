// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.apps.hangouts.content.EsProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public final class amz
{

    private ana a;
    private ani b;
    private String c;
    private final eay d;
    private final eay e;

    public amz()
    {
        this(null);
    }

    public amz(ana ana1)
    {
        d = new eay();
        e = new eay();
        a = ana1;
    }

    public static ceu a(ani ani1, Cursor cursor)
    {
        String s = cursor.getString(0);
        String s1 = cursor.getString(2);
        String s2 = cursor.getString(1);
        String s3 = cursor.getString(3);
        String s4 = cursor.getString(10);
        String s5 = cursor.getString(4);
        String s6 = cursor.getString(5);
        String s7 = cursor.getString(6);
        String s8 = cursor.getString(7);
        int i = cursor.getInt(14);
        String s9 = cursor.getString(11);
        Boolean boolean1 = null;
        if (cursor.getInt(9) != 0)
        {
            boolean1 = Boolean.TRUE;
        }
        cursor = g.a(cfa.values()[cursor.getInt(8)], s1, s2, s3, s4, s5, s6, s7, s8, s9, boolean1, i);
        ((aqs)hgx.a(g.nS, aqs)).a(ani1).a(cursor, s);
        return cursor;
    }

    public static em a(ani ani1, String s, int i)
    {
        String s2 = null;
        Object obj = ani1.b().b;
        String s1;
        String as[];
        if (i == anb.a)
        {
            s1 = "(chat_id!=? OR chat_id IS NULL)  AND active=1";
            as = new String[1];
            as[0] = ((String) (obj));
            s2 = "first_name ASC";
        } else
        {
            as = null;
            s1 = null;
        }
        obj = new ArrayList();
        Collections.addAll(((Collection) (obj)), s.split("\\|"));
        s = EsProvider.a(ani1, ((ArrayList) (obj)));
        return new cnh(g.nS, ani1, s, anc.a, s1, as, s2);
    }

    public static void a(ani ani1, String s)
    {
        ani1 = EsProvider.d(ani1, s);
        g.nS.getContentResolver().notifyChange(ani1, null);
    }

    public static int b(ani ani1, String s)
    {
        return b(ani1, s, anb.a);
    }

    private static int b(ani ani1, String s, int i)
    {
        Object obj = null;
        String s2 = ani1.b().b;
        String s1;
        String as[];
        if (i == anb.a)
        {
            s1 = "(chat_id!=? OR chat_id IS NULL)  AND active=1";
            as = new String[1];
            as[0] = s2;
        } else
        {
            as = null;
            s1 = null;
        }
        s = EsProvider.d(ani1, s);
        ani1 = obj;
        s = g.nS.getContentResolver().query(s, new String[] {
            "count(*) as count"
        }, s1, as, null);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        ani1 = s;
        if (!s.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_104;
        }
        ani1 = s;
        i = s.getInt(0);
        if (s != null)
        {
            s.close();
        }
        return i;
        if (s != null)
        {
            s.close();
        }
        return 0;
        s;
        if (ani1 != null)
        {
            ani1.close();
        }
        throw s;
    }

    public static amz c(ani ani1, String s)
    {
        String s1 = null;
        amz amz1 = new amz();
        amz1.d(ani1, s);
        int i = anb.a;
        Object obj = amz1.b;
        String s2 = amz1.c;
        String s3 = ((ani) (obj)).b().b;
        if (i == anb.a)
        {
            ani1 = "(chat_id!=? OR chat_id IS NULL)  AND active=1";
            s = new String[1];
            s[0] = s3;
            s1 = "first_name ASC";
        } else
        {
            s = null;
            ani1 = null;
        }
        obj = EsProvider.d(((ani) (obj)), s2);
        ani1 = g.nS.getContentResolver().query(((android.net.Uri) (obj)), anc.a, ani1, s, s1);
        if (ani1 == null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        amz1.a(ani1);
        ani1.close();
        return amz1;
        s;
        ani1.close();
        throw s;
    }

    private void g()
    {
        if (a != null)
        {
            a.a();
        }
    }

    public em a(int i)
    {
        return a(b, c, i);
    }

    public String a()
    {
        return c;
    }

    public void a(Cursor cursor)
    {
        d.clear();
        e.clear();
        if (cursor != null && cursor.moveToFirst())
        {
            do
            {
                ceu ceu1 = a(b, cursor);
                boolean flag;
                if (cursor.getInt(13) == 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag && !c(ceu1.b))
                {
                    e.put(ceu1.b, ceu1);
                }
                d.put(ceu1.b, ceu1);
            } while (cursor.moveToNext());
        }
        g();
    }

    public boolean a(cey cey1)
    {
        return d.containsKey(cey1);
    }

    public ceu b(cey cey1)
    {
        return (ceu)d.get(cey1);
    }

    public Collection b()
    {
        return d.values();
    }

    public Collection c()
    {
        return e.values();
    }

    public boolean c(cey cey1)
    {
        return b.b().a(cey1);
    }

    public String d(cey cey1)
    {
        cey1 = (ceu)d.get(cey1);
        if (cey1 != null)
        {
            return ((ceu) (cey1)).h;
        } else
        {
            return null;
        }
    }

    public void d(ani ani1, String s)
    {
        if (b != ani1 || !TextUtils.equals(c, s))
        {
            b = ani1;
            c = s;
            d.clear();
            e.clear();
            g();
        }
    }

    public boolean d()
    {
        return d.size() == 0;
    }

    public String e(cey cey1)
    {
        cey1 = (ceu)d.get(cey1);
        if (cey1 != null)
        {
            return ((ceu) (cey1)).e;
        } else
        {
            return null;
        }
    }

    public ArrayList e()
    {
        if (d.isEmpty())
        {
            return null;
        } else
        {
            return new ArrayList(d.values());
        }
    }

    public boolean f()
    {
        Iterator iterator;
        int i;
        iterator = d.entrySet().iterator();
        i = 0;
_L7:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        java.util.Map.Entry entry;
        entry = (java.util.Map.Entry)iterator.next();
        if (c((cey)entry.getKey()))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((ceu)entry.getValue()).D == cew.b) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (i <= 0) goto _L3; else goto _L5
_L5:
        return true;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
