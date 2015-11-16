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

public final class anr
{

    private ans a;
    private aoa b;
    private String c;
    private final eec d;
    private final eec e;

    public anr()
    {
        this(null);
    }

    public anr(ans ans1)
    {
        d = new eec();
        e = new eec();
        a = ans1;
    }

    public static cfz a(aoa aoa1, Cursor cursor)
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
        cursor = g.a(cgf.values()[cursor.getInt(8)], s1, s2, s3, s4, s5, s6, s7, s8, s9, boolean1, i);
        ((arj)hlp.a(g.nU, arj)).a(aoa1).a(cursor, s);
        return cursor;
    }

    public static em a(aoa aoa1, String s, int i)
    {
        String s2 = null;
        Object obj = aoa1.b().b;
        String s1;
        String as[];
        if (i == ant.a)
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
        s = EsProvider.a(aoa1, ((ArrayList) (obj)));
        return new coz(g.nU, aoa1, s, anu.a, s1, as, s2);
    }

    public static void a(aoa aoa1, String s)
    {
        aoa1 = EsProvider.c(aoa1, s);
        g.nU.getContentResolver().notifyChange(aoa1, null);
    }

    public static int b(aoa aoa1, String s)
    {
        return b(aoa1, s, ant.a);
    }

    private static int b(aoa aoa1, String s, int i)
    {
        Object obj = null;
        String s2 = aoa1.b().b;
        String s1;
        String as[];
        if (i == ant.a)
        {
            s1 = "(chat_id!=? OR chat_id IS NULL)  AND active=1";
            as = new String[1];
            as[0] = s2;
        } else
        {
            as = null;
            s1 = null;
        }
        s = EsProvider.c(aoa1, s);
        aoa1 = obj;
        s = g.nU.getContentResolver().query(s, new String[] {
            "count(*) as count"
        }, s1, as, null);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        aoa1 = s;
        if (!s.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_104;
        }
        aoa1 = s;
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
        if (aoa1 != null)
        {
            aoa1.close();
        }
        throw s;
    }

    public static anr c(aoa aoa1, String s)
    {
        String s1 = null;
        anr anr1 = new anr();
        anr1.d(aoa1, s);
        int i = ant.a;
        Object obj = anr1.b;
        String s2 = anr1.c;
        String s3 = ((aoa) (obj)).b().b;
        if (i == ant.a)
        {
            aoa1 = "(chat_id!=? OR chat_id IS NULL)  AND active=1";
            s = new String[1];
            s[0] = s3;
            s1 = "first_name ASC";
        } else
        {
            s = null;
            aoa1 = null;
        }
        obj = EsProvider.c(((aoa) (obj)), s2);
        aoa1 = g.nU.getContentResolver().query(((android.net.Uri) (obj)), anu.a, aoa1, s, s1);
        if (aoa1 == null)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        anr1.a(aoa1);
        aoa1.close();
        return anr1;
        s;
        aoa1.close();
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
                cfz cfz1 = a(b, cursor);
                boolean flag;
                if (cursor.getInt(13) == 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag && !c(cfz1.b))
                {
                    e.put(cfz1.b, cfz1);
                }
                d.put(cfz1.b, cfz1);
            } while (cursor.moveToNext());
        }
        g();
    }

    public boolean a(cgd cgd1)
    {
        return d.containsKey(cgd1);
    }

    public cfz b(cgd cgd1)
    {
        return (cfz)d.get(cgd1);
    }

    public Collection b()
    {
        return d.values();
    }

    public Collection c()
    {
        return e.values();
    }

    public boolean c(cgd cgd1)
    {
        return b.b().a(cgd1);
    }

    public String d(cgd cgd1)
    {
        cgd1 = (cfz)d.get(cgd1);
        if (cgd1 != null)
        {
            return ((cfz) (cgd1)).h;
        } else
        {
            return null;
        }
    }

    public void d(aoa aoa1, String s)
    {
        if (b != aoa1 || !TextUtils.equals(c, s))
        {
            b = aoa1;
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

    public String e(cgd cgd1)
    {
        cgd1 = (cfz)d.get(cgd1);
        if (cgd1 != null)
        {
            return ((cfz) (cgd1)).e;
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
        if (c((cgd)entry.getKey()))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((cfz)entry.getValue()).D == cgb.b) goto _L4; else goto _L3
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
