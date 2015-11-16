// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class gyc
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
    private final gyn d[] = new gyn[5];
    private byte e[];
    private ArrayList f;
    private final ByteOrder g;
    private byte h[];

    gyc(ByteOrder byteorder)
    {
        f = new ArrayList();
        g = byteorder;
    }

    protected gym a(gym gym1)
    {
        Object obj1 = null;
        Object obj = obj1;
        if (gym1 != null)
        {
            int i = gym1.a();
            obj = obj1;
            if (gym1 != null)
            {
                obj = obj1;
                if (gym.a(i))
                {
                    gyn gyn1 = d[i];
                    obj = gyn1;
                    if (gyn1 == null)
                    {
                        obj = new gyn(i);
                        d[i] = ((gyn) (obj));
                    }
                    obj = ((gyn) (obj)).a(gym1);
                }
            }
        }
        return ((gym) (obj));
    }

    protected gym a(short word0, int i)
    {
        gyn gyn1 = d[i];
        if (gyn1 == null)
        {
            return null;
        } else
        {
            return gyn1.a(word0);
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

    protected void a(gyn gyn1)
    {
        d[gyn1.c()] = gyn1;
    }

    void a(byte abyte0[])
    {
        h = abyte0;
    }

    byte[] a()
    {
        return h;
    }

    protected byte[] a(int i)
    {
        return (byte[])f.get(i);
    }

    protected gyn b(int i)
    {
        if (gym.a(i))
        {
            return d[i];
        } else
        {
            return null;
        }
    }

    protected void b(short word0, int i)
    {
        gyn gyn1 = d[i];
        if (gyn1 == null)
        {
            return;
        } else
        {
            gyn1.b(word0);
            return;
        }
    }

    protected void b(byte abyte0[])
    {
        e = abyte0;
    }

    boolean b()
    {
        return h != null;
    }

    protected byte[] c()
    {
        return e;
    }

    protected boolean d()
    {
        return e != null;
    }

    protected int e()
    {
        return f.size();
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
        if (!(obj instanceof gyc)) goto _L4; else goto _L5
_L5:
        obj = (gyc)obj;
        flag = flag1;
        if (((gyc) (obj)).g != g) goto _L4; else goto _L6
_L6:
        flag = flag1;
        if (((gyc) (obj)).f.size() != f.size()) goto _L4; else goto _L7
_L7:
        flag = flag1;
        if (!Arrays.equals(((gyc) (obj)).e, e)) goto _L4; else goto _L8
_L8:
        int i = 0;
_L10:
        if (i >= f.size())
        {
            break MISSING_BLOCK_LABEL_150;
        }
        flag = flag1;
        if (!Arrays.equals((byte[])((gyc) (obj)).f.get(i), (byte[])f.get(i))) goto _L4; else goto _L9
_L9:
        i++;
          goto _L10
        i = 0;
_L14:
        if (i >= 5) goto _L12; else goto _L11
_L11:
        gyn gyn1;
        gyn gyn2;
        gyn1 = ((gyc) (obj)).b(i);
        gyn2 = b(i);
        if (gyn1 == gyn2 || gyn1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!gyn1.equals(gyn2)) goto _L4; else goto _L13
_L13:
        i++;
          goto _L14
_L12:
        return true;
    }

    protected boolean f()
    {
        return !f.isEmpty();
    }

    protected ByteOrder g()
    {
        return g;
    }

    protected List h()
    {
        ArrayList arraylist1 = new ArrayList();
        gyn agyn[] = d;
        int j = agyn.length;
        for (int i = 0; i < j; i++)
        {
            gyn gyn1 = agyn[i];
            if (gyn1 == null)
            {
                continue;
            }
            gym agym[] = gyn1.b();
            if (agym != null)
            {
                Collections.addAll(arraylist1, agym);
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
