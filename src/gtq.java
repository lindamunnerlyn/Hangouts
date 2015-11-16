// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class gtq
{

    private static final byte a[] = {
        65, 83, 67, 73, 73, 0, 0, 0
    };
    private static final byte b[] = {
        74, 73, 83, 0, 0, 0, 0, 0
    };
    private static final byte c[] = {
        85, 78, 73, 67, 79, 68, 69, 0
    };
    private final gub d[] = new gub[5];
    private byte e[];
    private ArrayList f;
    private final ByteOrder g;

    gtq(ByteOrder byteorder)
    {
        f = new ArrayList();
        g = byteorder;
    }

    protected gua a(gua gua1)
    {
        Object obj1 = null;
        Object obj = obj1;
        if (gua1 != null)
        {
            int i = gua1.a();
            obj = obj1;
            if (gua1 != null)
            {
                obj = obj1;
                if (gua.a(i))
                {
                    gub gub1 = d[i];
                    obj = gub1;
                    if (gub1 == null)
                    {
                        obj = new gub(i);
                        d[i] = ((gub) (obj));
                    }
                    obj = ((gub) (obj)).a(gua1);
                }
            }
        }
        return ((gua) (obj));
    }

    protected gua a(short word0, int i)
    {
        gub gub1 = d[i];
        if (gub1 == null)
        {
            return null;
        } else
        {
            return gub1.a(word0);
        }
    }

    protected void a(int i, byte abyte0[])
    {
        if (i < f.size())
        {
            f.set(i, abyte0);
            return;
        }
        for (int j = f.size(); j < i; j++)
        {
            f.add(null);
        }

        f.add(abyte0);
    }

    protected void a(gub gub1)
    {
        d[gub1.c()] = gub1;
    }

    protected void a(byte abyte0[])
    {
        e = abyte0;
    }

    protected byte[] a()
    {
        return e;
    }

    protected byte[] a(int i)
    {
        return (byte[])f.get(i);
    }

    protected gub b(int i)
    {
        if (gua.a(i))
        {
            return d[i];
        } else
        {
            return null;
        }
    }

    protected void b(short word0, int i)
    {
        gub gub1 = d[i];
        if (gub1 == null)
        {
            return;
        } else
        {
            gub1.b(word0);
            return;
        }
    }

    protected boolean b()
    {
        return e != null;
    }

    protected int c()
    {
        return f.size();
    }

    protected boolean d()
    {
        return !f.isEmpty();
    }

    protected ByteOrder e()
    {
        return g;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (this != obj) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (obj == null) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (!(obj instanceof gtq)) goto _L4; else goto _L5
_L5:
        obj = (gtq)obj;
        flag = flag1;
        if (((gtq) (obj)).g != g) goto _L4; else goto _L6
_L6:
        flag = flag1;
        if (((gtq) (obj)).f.size() != f.size()) goto _L4; else goto _L7
_L7:
        flag = flag1;
        if (!Arrays.equals(((gtq) (obj)).e, e)) goto _L4; else goto _L8
_L8:
        int i = 0;
_L10:
        if (i >= f.size())
        {
            break MISSING_BLOCK_LABEL_150;
        }
        flag = flag1;
        if (!Arrays.equals((byte[])((gtq) (obj)).f.get(i), (byte[])f.get(i))) goto _L4; else goto _L9
_L9:
        i++;
          goto _L10
        i = 0;
_L14:
        if (i >= 5) goto _L12; else goto _L11
_L11:
        gub gub1;
        gub gub2;
        gub1 = ((gtq) (obj)).b(i);
        gub2 = b(i);
        if (gub1 == gub2 || gub1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!gub1.equals(gub2)) goto _L4; else goto _L13
_L13:
        i++;
          goto _L14
_L12:
        return true;
    }

    protected List f()
    {
        ArrayList arraylist1 = new ArrayList();
        gub agub[] = d;
        int j = agub.length;
        for (int i = 0; i < j; i++)
        {
            gub gub1 = agub[i];
            if (gub1 == null)
            {
                continue;
            }
            gua agua[] = gub1.b();
            if (agua != null)
            {
                Collections.addAll(arraylist1, agua);
            }
        }

        ArrayList arraylist = arraylist1;
        if (arraylist1.isEmpty())
        {
            arraylist = null;
        }
        return arraylist;
    }

    public int hashCode()
    {
        return (((g.hashCode() + 527) * 31 + f.hashCode()) * 31 + Arrays.hashCode(e)) * 31 + Arrays.hashCode(d);
    }

}
