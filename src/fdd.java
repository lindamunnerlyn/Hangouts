// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fdd extends fdj
{

    public fde a[];

    public fdd()
    {
        a = fde.b();
        o = null;
        p = -1;
    }

    public static fdd a(byte abyte0[])
    {
        return (fdd)fdo.a(new fdd(), abyte0, abyte0.length);
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
                    fde fde1 = a[j];
                    k = i;
                    if (fde1 != null)
                    {
                        k = i + fdi.b(1, fde1);
                    }
                    j++;
                    i = k;
                } while (true);
            }
        }
        return k;
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
                int k = fdq.a(fdh1, 10);
                fde afde[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                afde = new fde[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, afde, 0, j);
                    k = j;
                }
                for (; k < afde.length - 1; k++)
                {
                    afde[k] = new fde();
                    fdh1.a(afde[k]);
                    fdh1.a();
                }

                afde[k] = new fde();
                fdh1.a(afde[k]);
                a = afde;
                break;
            }
        } while (true);
    }

    public void a(fdi fdi1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                fde fde1 = a[i];
                if (fde1 != null)
                {
                    fdi1.a(1, fde1);
                }
            }

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
            if (obj instanceof fdd)
            {
                obj = (fdd)obj;
                flag = flag1;
                if (fdm.a(a, ((fdd) (obj)).a))
                {
                    return a(((fdj) (obj)));
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return (fdm.a(a) + 527) * 31 + c();
    }
}
