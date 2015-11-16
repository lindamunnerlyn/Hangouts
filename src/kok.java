// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public final class kok
{

    public final int a = 11;
    public final Class b;
    public final int c;
    public final boolean d = false;

    private kok(int i, Class class1, int j)
    {
        b = class1;
        c = j;
    }

    private Object a(kog kog1)
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
        JVM INSTR tableswitch 10 11: default 221
    //                   10 128
    //                   11 150;
           goto _L1 _L2 _L3
_L1:
        int i = a;
        throw new IllegalArgumentException((new StringBuilder(24)).append("Unknown type ").append(i).toString());
_L2:
        kop kop1;
        try
        {
            kop1 = (kop)((Class) (obj)).newInstance();
            kog1.a(kop1, kou.b(c));
        }
        // Misplaced declaration of an exception variable
        catch (kog kog1)
        {
            obj = String.valueOf(obj);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 33)).append("Error creating instance of class ").append(((String) (obj))).toString(), kog1);
        }
        // Misplaced declaration of an exception variable
        catch (kog kog1)
        {
            obj = String.valueOf(obj);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 33)).append("Error creating instance of class ").append(((String) (obj))).toString(), kog1);
        }
        // Misplaced declaration of an exception variable
        catch (kog kog1)
        {
            throw new IllegalArgumentException("Error reading extension field", kog1);
        }
        return kop1;
_L3:
        kop1 = (kop)((Class) (obj)).newInstance();
        kog1.a(kop1);
        return kop1;
    }

    public static kok a(Class class1, long l)
    {
        return new kok(11, class1, (int)l);
    }

    private int b(Object obj)
    {
        int i = kou.b(c);
        switch (a)
        {
        default:
            i = a;
            throw new IllegalArgumentException((new StringBuilder(24)).append("Unknown type ").append(i).toString());

        case 10: // '\n'
            return koh.c(i, (kop)obj);

        case 11: // '\013'
            return koh.d(i, (kop)obj);
        }
    }

    private void b(Object obj, koh koh1)
    {
        koh1.g(c);
        a;
        JVM INSTR tableswitch 10 11: default 114
    //                   10 80
    //                   11 105;
           goto _L1 _L2 _L3
_L1:
        int i = a;
        throw new IllegalArgumentException((new StringBuilder(24)).append("Unknown type ").append(i).toString());
_L2:
        try
        {
            obj = (kop)obj;
            int j = kou.b(c);
            koh1.a(((kop) (obj)));
            koh1.g(j, 4);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalStateException(((Throwable) (obj)));
        }
_L3:
        koh1.b((kop)obj);
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
                kos kos1 = (kos)list.get(i);
                if (kos1.b.length != 0)
                {
                    byte abyte0[] = kos1.b;
                    arraylist.add(a(kog.a(abyte0, 0, abyte0.length)));
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
            kos kos2 = (kos)list.get(list.size() - 1);
            list = b;
            byte abyte1[] = kos2.b;
            return list.cast(a(kog.a(abyte1, 0, abyte1.length)));
        }
    }

    void a(Object obj, koh koh1)
    {
        if (d)
        {
            int j = Array.getLength(obj);
            for (int i = 0; i < j; i++)
            {
                Object obj1 = Array.get(obj, i);
                if (obj1 != null)
                {
                    b(obj1, koh1);
                }
            }

        } else
        {
            b(obj, koh1);
        }
    }
}
