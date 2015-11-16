// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hvp extends kwm
{

    private static volatile hvp h[];
    public hwx a;
    public String b;
    public String c;
    public String d;
    public String e;
    public hvs f[];
    public hvq g[];

    public hvp()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = hvs.a();
        g = hvq.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static hvp[] a()
    {
        if (h == null)
        {
            synchronized (kwq.a)
            {
                if (h == null)
                {
                    h = new hvp[0];
                }
            }
        }
        return h;
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
            i = j + kwk.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.b(2, b);
        }
        int l = j;
        if (c != null)
        {
            l = j + kwk.b(3, c);
        }
        i = l;
        if (d != null)
        {
            i = l + kwk.b(4, d);
        }
        j = i;
        if (f != null)
        {
            j = i;
            if (f.length > 0)
            {
                for (j = 0; j < f.length;)
                {
                    hvs hvs1 = f[j];
                    l = i;
                    if (hvs1 != null)
                    {
                        l = i + kwk.d(5, hvs1);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        i = j;
        if (e != null)
        {
            i = j + kwk.b(6, e);
        }
        l = i;
        if (g != null)
        {
            l = i;
            if (g.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    l = i;
                    if (k >= g.length)
                    {
                        break;
                    }
                    hvq hvq1 = g[k];
                    l = i;
                    if (hvq1 != null)
                    {
                        l = i + kwk.d(7, hvq1);
                    }
                    k++;
                    i = l;
                } while (true);
            }
        }
        return l;
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
                    a = new hwx();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                b = kwj1.j();
                break;

            case 26: // '\032'
                c = kwj1.j();
                break;

            case 34: // '"'
                d = kwj1.j();
                break;

            case 42: // '*'
                int l = kwx.a(kwj1, 42);
                hvs ahvs[];
                int j;
                if (f == null)
                {
                    j = 0;
                } else
                {
                    j = f.length;
                }
                ahvs = new hvs[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(f, 0, ahvs, 0, j);
                    l = j;
                }
                for (; l < ahvs.length - 1; l++)
                {
                    ahvs[l] = new hvs();
                    kwj1.a(ahvs[l]);
                    kwj1.a();
                }

                ahvs[l] = new hvs();
                kwj1.a(ahvs[l]);
                f = ahvs;
                break;

            case 50: // '2'
                e = kwj1.j();
                break;

            case 58: // ':'
                int i1 = kwx.a(kwj1, 58);
                hvq ahvq[];
                int k;
                if (g == null)
                {
                    k = 0;
                } else
                {
                    k = g.length;
                }
                ahvq = new hvq[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(g, 0, ahvq, 0, k);
                    i1 = k;
                }
                for (; i1 < ahvq.length - 1; i1++)
                {
                    ahvq[i1] = new hvq();
                    kwj1.a(ahvq[i1]);
                    kwj1.a();
                }

                ahvq[i1] = new hvq();
                kwj1.a(ahvq[i1]);
                g = ahvq;
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
            kwk1.a(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c);
        }
        if (d != null)
        {
            kwk1.a(4, d);
        }
        if (f != null && f.length > 0)
        {
            for (int i = 0; i < f.length; i++)
            {
                hvs hvs1 = f[i];
                if (hvs1 != null)
                {
                    kwk1.b(5, hvs1);
                }
            }

        }
        if (e != null)
        {
            kwk1.a(6, e);
        }
        if (g != null && g.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < g.length; j++)
            {
                hvq hvq1 = g[j];
                if (hvq1 != null)
                {
                    kwk1.b(7, hvq1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
