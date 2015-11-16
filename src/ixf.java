// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ixf extends kwm
{

    public jce a[];
    public jce b[];
    public izq c[];
    public izr d;

    public ixf()
    {
        a = jce.a();
        b = jce.a();
        c = izq.a();
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                for (j = 0; j < a.length;)
                {
                    jce jce1 = a[j];
                    int k = i;
                    if (jce1 != null)
                    {
                        k = i + kwk.d(1, jce1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (b != null)
        {
            i = j;
            if (b.length > 0)
            {
                i = j;
                for (j = 0; j < b.length;)
                {
                    jce jce2 = b[j];
                    int l = i;
                    if (jce2 != null)
                    {
                        l = i + kwk.d(2, jce2);
                    }
                    j++;
                    i = l;
                }

            }
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                int i1 = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (i1 >= c.length)
                    {
                        break;
                    }
                    izq izq1 = c[i1];
                    j = i;
                    if (izq1 != null)
                    {
                        j = i + kwk.d(3, izq1);
                    }
                    i1++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.d(4, d);
        }
        return i;
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
                int i1 = kwx.a(kwj1, 10);
                jce ajce[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                ajce = new jce[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, ajce, 0, j);
                    i1 = j;
                }
                for (; i1 < ajce.length - 1; i1++)
                {
                    ajce[i1] = new jce();
                    kwj1.a(ajce[i1]);
                    kwj1.a();
                }

                ajce[i1] = new jce();
                kwj1.a(ajce[i1]);
                a = ajce;
                break;

            case 18: // '\022'
                int j1 = kwx.a(kwj1, 18);
                jce ajce1[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                ajce1 = new jce[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, ajce1, 0, k);
                    j1 = k;
                }
                for (; j1 < ajce1.length - 1; j1++)
                {
                    ajce1[j1] = new jce();
                    kwj1.a(ajce1[j1]);
                    kwj1.a();
                }

                ajce1[j1] = new jce();
                kwj1.a(ajce1[j1]);
                b = ajce1;
                break;

            case 26: // '\032'
                int k1 = kwx.a(kwj1, 26);
                izq aizq[];
                int l;
                if (c == null)
                {
                    l = 0;
                } else
                {
                    l = c.length;
                }
                aizq = new izq[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(c, 0, aizq, 0, l);
                    k1 = l;
                }
                for (; k1 < aizq.length - 1; k1++)
                {
                    aizq[k1] = new izq();
                    kwj1.a(aizq[k1]);
                    kwj1.a();
                }

                aizq[k1] = new izq();
                kwj1.a(aizq[k1]);
                c = aizq;
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new izr();
                }
                kwj1.a(d);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                jce jce1 = a[i];
                if (jce1 != null)
                {
                    kwk1.b(1, jce1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                jce jce2 = b[j];
                if (jce2 != null)
                {
                    kwk1.b(2, jce2);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < c.length; k++)
            {
                izq izq1 = c[k];
                if (izq1 != null)
                {
                    kwk1.b(3, izq1);
                }
            }

        }
        if (d != null)
        {
            kwk1.b(4, d);
        }
        super.writeTo(kwk1);
    }
}
