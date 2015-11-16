// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class kvh extends kts
{

    private static final int b[];
    private static final long serialVersionUID = 1L;
    private final int c;
    private final kts d;
    private final kts e;
    private final int f;
    private int g;

    static kts a(kvh kvh1)
    {
        return kvh1.d;
    }

    static kts b(kvh kvh1)
    {
        return kvh1.e;
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    public int a()
    {
        return c;
    }

    protected int a(int i, int j, int k)
    {
        if (j + k <= f)
        {
            return d.a(i, j, k);
        }
        if (j >= f)
        {
            return e.a(i, j - f, k);
        } else
        {
            int l = f - j;
            i = d.a(i, j, l);
            return e.a(i, 0, k - l);
        }
    }

    protected void a(byte abyte0[], int i, int j, int k)
    {
        if (i + k <= f)
        {
            d.a(abyte0, i, j, k);
            return;
        }
        if (i >= f)
        {
            e.a(abyte0, i - f, j, k);
            return;
        } else
        {
            int l = f - i;
            d.a(abyte0, i, j, l);
            e.a(abyte0, 0, j + l, k - l);
            return;
        }
    }

    void b(OutputStream outputstream, int i, int j)
    {
        if (i + j <= f)
        {
            d.b(outputstream, i, j);
            return;
        }
        if (i >= f)
        {
            e.b(outputstream, i - f, j);
            return;
        } else
        {
            int k = f - i;
            d.b(outputstream, i, k);
            e.b(outputstream, 0, j - k);
            return;
        }
    }

    public ktt c()
    {
        return new kvj(this);
    }

    public boolean equals(Object obj)
    {
        boolean flag2 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        int i;
        flag = flag2;
        if (!(obj instanceof kts))
        {
            continue;
        }
        obj = (kts)obj;
        flag = flag2;
        if (c != ((kts) (obj)).a())
        {
            continue;
        }
        if (c == 0)
        {
            return true;
        }
        if (g == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i = ((kts) (obj)).g();
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag2;
        if (g != i) goto _L4; else goto _L3
_L3:
        kvi kvi1 = new kvi(this);
        kuz kuz1 = (kuz)kvi1.next();
        kvi kvi2 = new kvi(((kts) (obj)));
        obj = (kuz)kvi2.next();
        int j = 0;
        int k = 0;
        int l = 0;
        do
        {
            int k1 = kuz1.a() - k;
            int i1 = ((kuz) (obj)).a() - j;
            int j1 = Math.min(k1, i1);
            boolean flag1;
            if (k == 0)
            {
                flag1 = kuz1.a(((kuz) (obj)), j, j1);
            } else
            {
                flag1 = ((kuz) (obj)).a(kuz1, k, j1);
            }
            flag = flag2;
            if (!flag1)
            {
                continue;
            }
            l += j1;
            if (l >= c)
            {
                if (l == c)
                {
                    return true;
                } else
                {
                    throw new IllegalStateException();
                }
            }
            if (j1 == k1)
            {
                kuz1 = (kuz)kvi1.next();
                k = 0;
            } else
            {
                k += j1;
            }
            if (j1 == i1)
            {
                obj = (kuz)kvi2.next();
                j = 0;
            } else
            {
                j += j1;
            }
        } while (true);
        if (true) goto _L4; else goto _L5
_L5:
    }

    public ktu f()
    {
        return new ktu(new kvk(this));
    }

    protected int g()
    {
        return g;
    }

    public int hashCode()
    {
        int j = g;
        int i = j;
        if (j == 0)
        {
            int k = a(c, 0, c);
            i = k;
            if (k == 0)
            {
                i = 1;
            }
            g = i;
        }
        return i;
    }

    public Iterator iterator()
    {
        return c();
    }

    Object writeReplace()
    {
        return new kuz(e());
    }

    static 
    {
        int i = 1;
        ArrayList arraylist = new ArrayList();
        int k = 1;
        do
        {
            int l = k;
            if (i <= 0)
            {
                break;
            }
            arraylist.add(Integer.valueOf(i));
            k = i;
            i = l + i;
        } while (true);
        arraylist.add(Integer.valueOf(0x7fffffff));
        b = new int[arraylist.size()];
        for (int j = 0; j < b.length; j++)
        {
            b[j] = ((Integer)arraylist.get(j)).intValue();
        }

    }
}
