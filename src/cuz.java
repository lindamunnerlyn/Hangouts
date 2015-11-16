// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.database.Cursor;
import java.util.EnumMap;

public final class cuz
    implements ctu
{

    private static final cvc c[] = cvc.values();
    public final int a;
    public final String b;
    private final EnumMap d = new EnumMap(cvc);

    public cuz(int i, String s)
    {
        a = i;
        b = s;
    }

    private int a(cvc cvc1, int i)
    {
        return g.a((Integer)a(cvc1), 0);
    }

    private Object a(cvc cvc1)
    {
        long l = System.currentTimeMillis();
        cva cva1 = (cva)d.get(cvc1);
        if (a(cvc1, cva1, l))
        {
            return cva1.b;
        } else
        {
            return null;
        }
    }

    private void a(String s, cvc cvc1, StringBuilder stringbuilder)
    {
        cvc1 = (cva)d.get(cvc1);
        if (cvc1 != null)
        {
            stringbuilder.append(s).append(':').append(((cva) (cvc1)).b).append('(').append(((cva) (cvc1)).a).append(") ");
        }
    }

    private static boolean a(cvc cvc1, cva cva1, long l)
    {
        return cva1 != null && cvc1.b(cva1.a, l);
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

    private boolean b(cvc cvc1, Object obj, long l)
    {
        cva cva1 = (cva)d.get(cvc1);
        if (cva1 != null)
        {
            if (l < cva1.a)
            {
                return false;
            }
            cva1.a = l;
            if (cva1.a(obj))
            {
                return false;
            }
            if (cvc1 == cvc.f && cva1.b != null && obj != null && !a((Long)obj, (Long)cva1.b, l))
            {
                return false;
            }
            cva1.b = obj;
        } else
        {
            obj = new cva(obj, l);
            d.put(cvc1, obj);
        }
        return true;
    }

    public int a(Cursor cursor)
    {
        int j = 0;
        cvc acvc[] = c;
        int l = acvc.length;
        for (int i = 0; i < l;)
        {
            cvc cvc1 = acvc[i];
            long l1 = cvc1.a(cursor);
            int k = j;
            if (l1 > 0L)
            {
                k = j;
                if (b(cvc1, cvc1.b(cursor), l1))
                {
                    k = j | cvc1.j;
                }
            }
            i++;
            j = k;
        }

        return j;
    }

    public int a(dba dba1, int i)
    {
        int k = 0;
        cvc acvc[] = c;
        int i1 = acvc.length;
        for (int j = 0; j < i1;)
        {
            cvc cvc1 = acvc[j];
            int l = k;
            if (cvc1.a(i))
            {
                l = k;
                if (b(cvc1, dba1.a(cvc1), dba1.a))
                {
                    l = k | cvc1.j;
                }
            }
            j++;
            k = l;
        }

        return k;
    }

    public String a()
    {
        return (String)a(cvc.c);
    }

    public void a(int i, ContentValues contentvalues)
    {
        long l = System.currentTimeMillis();
        cvc acvc[] = c;
        int k = acvc.length;
        for (int j = 0; j < k; j++)
        {
            cvc cvc1 = acvc[j];
            if (!cvc1.a(i))
            {
                continue;
            }
            cva cva1 = (cva)d.get(cvc1);
            if (cva1 != null)
            {
                cvc1.a(cva1.b, cva1.a, l, contentvalues);
            }
        }

    }

    public boolean a(int i, long l)
    {
        cvc acvc[] = c;
        int k = acvc.length;
        for (int j = 0; j < k; j++)
        {
            cvc cvc1 = acvc[j];
            if (!cvc1.a(i))
            {
                continue;
            }
            cva cva1 = (cva)d.get(cvc1);
            if (cva1 == null || !cvc1.a(cva1.a, l))
            {
                return false;
            }
        }

        return true;
    }

    public boolean a(cvc cvc1, Object obj, long l)
    {
        if (cvc1 == cvc.f)
        {
            cvc1 = (Long)obj;
            obj = (cva)d.get(cvc.f);
            if (obj == null)
            {
                return false;
            }
            if (((cva) (obj)).b == null)
            {
                return false;
            }
            if (!a(((Long) (cvc1)), (Long)((cva) (obj)).b, l))
            {
                return false;
            } else
            {
                obj.b = cvc1;
                return true;
            }
        } else
        {
            return b(cvc1, obj, l);
        }
    }

    public int b()
    {
        return a(cvc.e, 0);
    }

    public int b(int i, long l)
    {
        cvc acvc[] = c;
        int i1 = acvc.length;
        int k = 0;
        int j = 0;
        for (; k < i1; k++)
        {
            cvc cvc1 = acvc[k];
            if (cvc1.a(i) && a(cvc1, (cva)d.get(cvc1), l))
            {
                j = cvc1.j | j;
            }
        }

        return j;
    }

    public int c()
    {
        return a(cvc.d, 0);
    }

    public long d()
    {
        return g.a((Long)a(cvc.f), 0L);
    }

    public boolean e()
    {
        return g.a((Boolean)a(cvc.a), false);
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("Presence [");
        a("reachable", cvc.a, stringbuilder);
        a("available", cvc.b, stringbuilder);
        a("callType", cvc.d, stringbuilder);
        a("deviceStatus", cvc.e, stringbuilder);
        a("lastSeen", cvc.f, stringbuilder);
        a("statusMessage", cvc.c, stringbuilder);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

}
