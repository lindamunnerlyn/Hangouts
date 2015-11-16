// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public final class kwn
{

    public final int a = 11;
    public final Class b;
    public final int c;
    public final boolean d = false;

    private kwn(int i, Class class1, int j)
    {
        b = class1;
        c = j;
    }

    private Object a(kwj kwj1)
    {
        Object obj;
        if (d)
        {
            obj = b.getComponentType();
        } else
        {
            obj = b;
        }
        a;
        JVM INSTR tableswitch 10 11: default 220
    //                   10 128
    //                   11 149;
           goto _L1 _L2 _L3
_L1:
        int i = a;
        throw new IllegalArgumentException((new StringBuilder(24)).append("Unknown type ").append(i).toString());
_L2:
        kws kws1;
        try
        {
            kws1 = (kws)((Class) (obj)).newInstance();
            kwj1.a(kws1, c >>> 3);
        }
        // Misplaced declaration of an exception variable
        catch (kwj kwj1)
        {
            obj = String.valueOf(obj);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 33)).append("Error creating instance of class ").append(((String) (obj))).toString(), kwj1);
        }
        // Misplaced declaration of an exception variable
        catch (kwj kwj1)
        {
            obj = String.valueOf(obj);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 33)).append("Error creating instance of class ").append(((String) (obj))).toString(), kwj1);
        }
        // Misplaced declaration of an exception variable
        catch (kwj kwj1)
        {
            throw new IllegalArgumentException("Error reading extension field", kwj1);
        }
        return kws1;
_L3:
        kws1 = (kws)((Class) (obj)).newInstance();
        kwj1.a(kws1);
        return kws1;
    }

    public static kwn a(Class class1, long l)
    {
        return new kwn(11, class1, (int)l);
    }

    private int b(Object obj)
    {
        int i = c >>> 3;
        switch (a)
        {
        default:
            i = a;
            throw new IllegalArgumentException((new StringBuilder(24)).append("Unknown type ").append(i).toString());

        case 10: // '\n'
            return kwk.c(i, (kws)obj);

        case 11: // '\013'
            return kwk.d(i, (kws)obj);
        }
    }

    private void b(Object obj, kwk kwk1)
    {
        kwk1.g(c);
        a;
        JVM INSTR tableswitch 10 11: default 113
    //                   10 80
    //                   11 104;
           goto _L1 _L2 _L3
_L1:
        int i = a;
        throw new IllegalArgumentException((new StringBuilder(24)).append("Unknown type ").append(i).toString());
_L2:
        try
        {
            obj = (kws)obj;
            int j = c;
            kwk1.a(((kws) (obj)));
            kwk1.g(j >>> 3, 4);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalStateException(((Throwable) (obj)));
        }
_L3:
        kwk1.b((kws)obj);
        return;
    }

    int a(Object obj)
    {
        int i = 0;
        int k;
        if (d)
        {
            int l = Array.getLength(obj);
            int j = 0;
            do
            {
                k = i;
                if (j >= l)
                {
                    break;
                }
                k = i;
                if (Array.get(obj, j) != null)
                {
                    k = i + b(Array.get(obj, j));
                }
                j++;
                i = k;
            } while (true);
        } else
        {
            k = b(obj);
        }
        return k;
    }

    final Object a(List list)
    {
        boolean flag = false;
        if (list != null) goto _L2; else goto _L1
_L1:
        list = null;
_L4:
        return list;
_L2:
label0:
        {
            if (!d)
            {
                break label0;
            }
            ArrayList arraylist = new ArrayList();
            for (int i = 0; i < list.size(); i++)
            {
                kwv kwv1 = (kwv)list.get(i);
                if (kwv1.b.length != 0)
                {
                    byte abyte0[] = kwv1.b;
                    arraylist.add(a(kwj.a(abyte0, 0, abyte0.length)));
                }
            }

            int k = arraylist.size();
            if (k == 0)
            {
                return null;
            }
            Object obj = b.cast(Array.newInstance(b.getComponentType(), k));
            int j = ((flag) ? 1 : 0);
            do
            {
                list = ((List) (obj));
                if (j >= k)
                {
                    break;
                }
                Array.set(obj, j, arraylist.get(j));
                j++;
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (list.isEmpty())
        {
            return null;
        } else
        {
            kwv kwv2 = (kwv)list.get(list.size() - 1);
            list = b;
            byte abyte1[] = kwv2.b;
            return list.cast(a(kwj.a(abyte1, 0, abyte1.length)));
        }
    }

    void a(Object obj, kwk kwk1)
    {
        if (d)
        {
            int j = Array.getLength(obj);
            for (int i = 0; i < j; i++)
            {
                Object obj1 = Array.get(obj, i);
                if (obj1 != null)
                {
                    b(obj1, kwk1);
                }
            }

        } else
        {
            b(obj, kwk1);
        }
    }
}
