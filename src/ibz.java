// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ibz extends kwm
{

    public ipk a;
    public Boolean b;
    public Boolean c;
    public ipd d[];
    public ipd e[];

    public ibz()
    {
        a = null;
        b = null;
        c = null;
        d = ipd.a();
        e = ipd.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.d(1, a);
        }
        int i1 = i;
        if (b != null)
        {
            b.booleanValue();
            i1 = i + (kwk.f(2) + 1);
        }
        j = i1;
        if (c != null)
        {
            c.booleanValue();
            j = i1 + (kwk.f(3) + 1);
        }
        i = j;
        if (d != null)
        {
            i = j;
            if (d.length > 0)
            {
                i = j;
                for (int k = 0; k < d.length;)
                {
                    ipd ipd1 = d[k];
                    i1 = i;
                    if (ipd1 != null)
                    {
                        i1 = i + kwk.d(4, ipd1);
                    }
                    k++;
                    i = i1;
                }

            }
        }
        i1 = i;
        if (e != null)
        {
            i1 = i;
            if (e.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    i1 = i;
                    if (l >= e.length)
                    {
                        break;
                    }
                    ipd ipd2 = e[l];
                    i1 = i;
                    if (ipd2 != null)
                    {
                        i1 = i + kwk.d(5, ipd2);
                    }
                    l++;
                    i = i1;
                } while (true);
            }
        }
        return i1;
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int i = kwj1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(kwj1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (a == null)
                {
                    a = new ipk();
                }
                kwj1.a(a);
                break;

            case 16: // '\020'
                b = Boolean.valueOf(kwj1.i());
                break;

            case 24: // '\030'
                c = Boolean.valueOf(kwj1.i());
                break;

            case 34: // '"'
                int l = kwx.a(kwj1, 34);
                ipd aipd[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                aipd = new ipd[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(d, 0, aipd, 0, j);
                    l = j;
                }
                for (; l < aipd.length - 1; l++)
                {
                    aipd[l] = new ipd();
                    kwj1.a(aipd[l]);
                    kwj1.a();
                }

                aipd[l] = new ipd();
                kwj1.a(aipd[l]);
                d = aipd;
                break;

            case 42: // '*'
                int i1 = kwx.a(kwj1, 42);
                ipd aipd1[];
                int k;
                if (e == null)
                {
                    k = 0;
                } else
                {
                    k = e.length;
                }
                aipd1 = new ipd[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(e, 0, aipd1, 0, k);
                    i1 = k;
                }
                for (; i1 < aipd1.length - 1; i1++)
                {
                    aipd1[i1] = new ipd();
                    kwj1.a(aipd1[i1]);
                    kwj1.a();
                }

                aipd1[i1] = new ipd();
                kwj1.a(aipd1[i1]);
                e = aipd1;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (b != null)
        {
            kwk1.a(2, b.booleanValue());
        }
        if (c != null)
        {
            kwk1.a(3, c.booleanValue());
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                ipd ipd1 = d[i];
                if (ipd1 != null)
                {
                    kwk1.b(4, ipd1);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < e.length; j++)
            {
                ipd ipd2 = e[j];
                if (ipd2 != null)
                {
                    kwk1.b(5, ipd2);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
