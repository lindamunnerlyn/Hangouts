// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.database.Cursor;
import java.util.EnumMap;

public final class csw
    implements crk
{

    private static final csz c[] = csz.values();
    public final int a;
    public final String b;
    private final EnumMap d = new EnumMap(csz);

    public csw(int i, String s)
    {
        a = i;
        b = s;
    }

    private int a(csz csz1, int i)
    {
        return g.a((Integer)a(csz1), 0);
    }

    private Object a(csz csz1)
    {
        csx csx1 = (csx)d.get(csz1);
        if (a(csz1, csx1, System.currentTimeMillis()))
        {
            return csx1.b;
        } else
        {
            return null;
        }
    }

    private void a(String s, csz csz1, StringBuilder stringbuilder)
    {
        csz1 = (csx)d.get(csz1);
        if (csz1 == null)
        {
            return;
        }
        if (stringbuilder.length() > 0)
        {
            stringbuilder.append(", ");
        }
        stringbuilder.append(s).append(':').append(((csx) (csz1)).b).append('(').append(((csx) (csz1)).a).append(')');
    }

    private static boolean a(csz csz1, csx csx1, long l)
    {
        return csx1 != null && csz1.b(csx1.a, l);
    }

    private static boolean a(Long long1, Long long2, long l)
    {
label0:
        {
            boolean flag1 = false;
            long l1 = g.a(long1, 0L);
            long l2 = g.a(long2, 0L);
            if (l1 <= l2)
            {
                boolean flag;
                if (l2 <= 0L || l <= 0L)
                {
                    flag = false;
                } else
                if (0xfffffffffff24460L < l - l2)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    break label0;
                }
            }
            flag1 = true;
        }
        return flag1;
    }

    private boolean b(csz csz1, Object obj, long l)
    {
        csx csx1 = (csx)d.get(csz1);
        if (csx1 != null)
        {
            if (l < csx1.a)
            {
                return false;
            }
            csx1.a = l;
            if (csx1.a(obj))
            {
                return false;
            }
            if (csz1 == csz.f && csx1.b != null && obj != null && !a((Long)obj, (Long)csx1.b, l))
            {
                return false;
            }
            csx1.b = obj;
        } else
        {
            obj = new csx(obj, l);
            d.put(csz1, obj);
        }
        return true;
    }

    public int a(Cursor cursor)
    {
        int j = 0;
        csz acsz[] = c;
        int l = acsz.length;
        for (int i = 0; i < l;)
        {
            csz csz1 = acsz[i];
            long l1 = csz1.a(cursor);
            int k = j;
            if (l1 > 0L)
            {
                k = j;
                if (b(csz1, csz1.b(cursor), l1))
                {
                    k = j | csz1.j;
                }
            }
            i++;
            j = k;
        }

        return j;
    }

    public int a(czu czu1, int i)
    {
        int k = 0;
        csz acsz[] = c;
        int i1 = acsz.length;
        for (int j = 0; j < i1;)
        {
            csz csz1 = acsz[j];
            int l = k;
            if (csz1.a(i))
            {
                l = k;
                if (b(csz1, czu1.a(csz1), czu1.a))
                {
                    l = k | csz1.j;
                }
            }
            j++;
            k = l;
        }

        return k;
    }

    public String a()
    {
        return (String)a(csz.c);
    }

    public void a(int i, ContentValues contentvalues)
    {
        long l = System.currentTimeMillis();
        csz acsz[] = c;
        int k = acsz.length;
        for (int j = 0; j < k; j++)
        {
            csz csz1 = acsz[j];
            if (!csz1.a(i))
            {
                continue;
            }
            csx csx1 = (csx)d.get(csz1);
            if (csx1 != null)
            {
                csz1.a(csx1.b, csx1.a, l, contentvalues);
            }
        }

    }

    public boolean a(int i, long l)
    {
        csz acsz[] = c;
        int k = acsz.length;
        for (int j = 0; j < k; j++)
        {
            csz csz1 = acsz[j];
            if (!csz1.a(i))
            {
                continue;
            }
            csx csx1 = (csx)d.get(csz1);
            if (csx1 == null || !csz1.a(csx1.a, l))
            {
                return false;
            }
        }

        return true;
    }

    public boolean a(csz csz1, Object obj, long l)
    {
        if (csz1 == csz.f)
        {
            csz1 = (Long)obj;
            obj = (csx)d.get(csz.f);
            if (obj == null)
            {
                return false;
            }
            if (((csx) (obj)).b == null)
            {
                return false;
            }
            if (!a(((Long) (csz1)), (Long)((csx) (obj)).b, l))
            {
                return false;
            } else
            {
                obj.b = csz1;
                return true;
            }
        } else
        {
            return b(csz1, obj, l);
        }
    }

    public int b()
    {
        return a(csz.e, 0);
    }

    public int b(int i, long l)
    {
        csz acsz[] = c;
        int i1 = acsz.length;
        int k = 0;
        int j = 0;
        for (; k < i1; k++)
        {
            csz csz1 = acsz[k];
            if (csz1.a(i) && a(csz1, (csx)d.get(csz1), l))
            {
                j = csz1.j | j;
            }
        }

        return j;
    }

    public int c()
    {
        return a(csz.d, 0);
    }

    public long d()
    {
        return g.a((Long)a(csz.f), 0L);
    }

    public boolean e()
    {
        return g.a((Boolean)a(csz.a), false);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("Presence [");
        a("reachable", csz.a, stringbuilder);
        a("available", csz.b, stringbuilder);
        a("callType", csz.d, stringbuilder);
        a("deviceStatus", csz.e, stringbuilder);
        a("lastSeen", csz.f, stringbuilder);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

}
