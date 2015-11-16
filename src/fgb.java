// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fgb extends fgh
{

    public fgc a[];

    public fgb()
    {
        a = fgc.b();
        o = null;
        p = -1;
    }

    public static fgb a(byte abyte0[])
    {
        return (fgb)fgm.a(new fgb(), abyte0, abyte0.length);
    }

    protected int a()
    {
        int i = super.a();
        int k = i;
        if (a != null)
        {
            k = i;
            if (a.length > 0)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= a.length)
                    {
                        break;
                    }
                    fgc fgc1 = a[j];
                    k = i;
                    if (fgc1 != null)
                    {
                        k = i + fgg.b(1, fgc1);
                    }
                    j++;
                    i = k;
                } while (true);
            }
        }
        return k;
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
                int k = fgo.a(fgf1, 10);
                fgc afgc[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                afgc = new fgc[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, afgc, 0, j);
                    k = j;
                }
                for (; k < afgc.length - 1; k++)
                {
                    afgc[k] = new fgc();
                    fgf1.a(afgc[k]);
                    fgf1.a();
                }

                afgc[k] = new fgc();
                fgf1.a(afgc[k]);
                a = afgc;
                break;
            }
        } while (true);
    }

    public void a(fgg fgg1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                fgc fgc1 = a[i];
                if (fgc1 != null)
                {
                    fgg1.a(1, fgc1);
                }
            }

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
            if (obj instanceof fgb)
            {
                obj = (fgb)obj;
                flag = flag1;
                if (fgk.a(a, ((fgb) (obj)).a))
                {
                    return a(((fgh) (obj)));
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return (fgk.a(a) + 527) * 31 + c();
    }
}
