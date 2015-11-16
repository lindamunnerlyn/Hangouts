// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class fdt extends fdj
{

    public byte a[];
    public byte b[][];
    public boolean c;

    public fdt()
    {
        a = fdq.h;
        b = fdq.g;
        c = false;
        o = null;
        p = -1;
    }

    protected int a()
    {
        boolean flag = false;
        int j = super.a();
        int i = j;
        if (!Arrays.equals(a, fdq.h))
        {
            i = j + fdi.b(1, a);
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
                        j1 = k + fdi.a(abyte0);
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
            i = j + (fdi.c(3) + 1);
        }
        return i;
    }

    public fdo a(fdh fdh1)
    {
        do
        {
            int i = fdh1.a();
            switch (i)
            {
            default:
                if (a(fdh1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                a = fdh1.h();
                break;

            case 18: // '\022'
                int k = fdq.a(fdh1, 18);
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
                    abyte0[k] = fdh1.h();
                    fdh1.a();
                }

                abyte0[k] = fdh1.h();
                b = abyte0;
                break;

            case 24: // '\030'
                c = fdh1.f();
                break;
            }
        } while (true);
    }

    public void a(fdi fdi1)
    {
        if (!Arrays.equals(a, fdq.h))
        {
            fdi1.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                byte abyte0[] = b[i];
                if (abyte0 != null)
                {
                    fdi1.a(2, abyte0);
                }
            }

        }
        if (c)
        {
            fdi1.a(3, c);
        }
        super.a(fdi1);
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
            if (obj instanceof fdt)
            {
                obj = (fdt)obj;
                flag = flag1;
                if (Arrays.equals(a, ((fdt) (obj)).a))
                {
                    flag = flag1;
                    if (fdm.a(b, ((fdt) (obj)).b))
                    {
                        flag = flag1;
                        if (c == ((fdt) (obj)).c)
                        {
                            return a(((fdj) (obj)));
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
        int j = fdm.a(b);
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
