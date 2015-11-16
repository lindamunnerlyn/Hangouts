// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ikg extends koj
{

    private static volatile ikg f[];
    public ikc a;
    public ikc b[];
    public ikd c;
    public ikr d[];
    public iki e;

    public ikg()
    {
        a = null;
        b = ikc.a();
        c = null;
        d = ikr.a();
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ikg[] a()
    {
        if (f == null)
        {
            synchronized (kon.a)
            {
                if (f == null)
                {
                    f = new ikg[0];
                }
            }
        }
        return f;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    ikc ikc1 = b[j];
                    int k = i;
                    if (ikc1 != null)
                    {
                        k = i + koh.d(2, ikc1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (c != null)
        {
            i = j + koh.d(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (l >= d.length)
                    {
                        break;
                    }
                    ikr ikr1 = d[l];
                    j = i;
                    if (ikr1 != null)
                    {
                        j = i + koh.d(4, ikr1);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (e != null)
        {
            i = j + koh.d(5, e);
        }
        return i;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int i = kog1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(kog1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (a == null)
                {
                    a = new ikc();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                int l = kou.b(kog1, 18);
                ikc aikc[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aikc = new ikc[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aikc, 0, j);
                    l = j;
                }
                for (; l < aikc.length - 1; l++)
                {
                    aikc[l] = new ikc();
                    kog1.a(aikc[l]);
                    kog1.a();
                }

                aikc[l] = new ikc();
                kog1.a(aikc[l]);
                b = aikc;
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new ikd();
                }
                kog1.a(c);
                break;

            case 34: // '"'
                int i1 = kou.b(kog1, 34);
                ikr aikr[];
                int k;
                if (d == null)
                {
                    k = 0;
                } else
                {
                    k = d.length;
                }
                aikr = new ikr[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(d, 0, aikr, 0, k);
                    i1 = k;
                }
                for (; i1 < aikr.length - 1; i1++)
                {
                    aikr[i1] = new ikr();
                    kog1.a(aikr[i1]);
                    kog1.a();
                }

                aikr[i1] = new ikr();
                kog1.a(aikr[i1]);
                d = aikr;
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new iki();
                }
                kog1.a(e);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                ikc ikc1 = b[i];
                if (ikc1 != null)
                {
                    koh1.b(2, ikc1);
                }
            }

        }
        if (c != null)
        {
            koh1.b(3, c);
        }
        if (d != null && d.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < d.length; j++)
            {
                ikr ikr1 = d[j];
                if (ikr1 != null)
                {
                    koh1.b(4, ikr1);
                }
            }

        }
        if (e != null)
        {
            koh1.b(5, e);
        }
        super.writeTo(koh1);
    }
}
