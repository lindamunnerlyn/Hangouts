// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class fgr extends fgh
{

    public byte a[];
    public byte b[][];
    public boolean c;

    public fgr()
    {
        a = fgo.h;
        b = fgo.g;
        c = false;
        o = null;
        p = -1;
    }

    protected int a()
    {
        boolean flag = false;
        int j = super.a();
        int i = j;
        if (!Arrays.equals(a, fgo.h))
        {
            i = j + fgg.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                int k = 0;
                int l = 0;
                for (j = ((flag) ? 1 : 0); j < b.length;)
                {
                    byte abyte0[] = b[j];
                    int j1 = k;
                    int i1 = l;
                    if (abyte0 != null)
                    {
                        i1 = l + 1;
                        j1 = k + fgg.a(abyte0);
                    }
                    j++;
                    k = j1;
                    l = i1;
                }

                j = i + k + l * 1;
            }
        }
        i = j;
        if (c)
        {
            i = j + (fgg.c(3) + 1);
        }
        return i;
    }

    public fgm a(fgf fgf1)
    {
        do
        {
            int i = fgf1.a();
            switch (i)
            {
            default:
                if (a(fgf1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                a = fgf1.h();
                break;

            case 18: // '\022'
                int k = fgo.a(fgf1, 18);
                byte abyte0[][];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                abyte0 = new byte[k + j][];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, abyte0, 0, j);
                    k = j;
                }
                for (; k < abyte0.length - 1; k++)
                {
                    abyte0[k] = fgf1.h();
                    fgf1.a();
                }

                abyte0[k] = fgf1.h();
                b = abyte0;
                break;

            case 24: // '\030'
                c = fgf1.f();
                break;
            }
        } while (true);
    }

    public void a(fgg fgg1)
    {
        if (!Arrays.equals(a, fgo.h))
        {
            fgg1.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                byte abyte0[] = b[i];
                if (abyte0 != null)
                {
                    fgg1.a(2, abyte0);
                }
            }

        }
        if (c)
        {
            fgg1.a(3, c);
        }
        super.a(fgg1);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj instanceof fgr)
            {
                obj = (fgr)obj;
                flag = flag1;
                if (Arrays.equals(a, ((fgr) (obj)).a))
                {
                    flag = flag1;
                    if (fgk.a(b, ((fgr) (obj)).b))
                    {
                        flag = flag1;
                        if (c == ((fgr) (obj)).c)
                        {
                            return a(((fgh) (obj)));
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        int i = Arrays.hashCode(a);
        int j = fgk.a(b);
        char c1;
        if (c)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        return (c1 + ((i + 527) * 31 + j) * 31) * 31 + c();
    }
}
