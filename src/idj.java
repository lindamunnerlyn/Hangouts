// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class idj extends kwm
{

    private static volatile idj e[];
    public String a;
    public idv b[];
    public idy c[];
    public igd d[];

    public idj()
    {
        a = null;
        b = idv.a();
        c = idy.a();
        d = igd.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static idj[] a()
    {
        if (e == null)
        {
            synchronized (kwq.a)
            {
                if (e == null)
                {
                    e = new idj[0];
                }
            }
        }
        return e;
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
            i = j + kwk.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    idv idv1 = b[j];
                    int i1 = i;
                    if (idv1 != null)
                    {
                        i1 = i + kwk.d(2, idv1);
                    }
                    j++;
                    i = i1;
                }

                j = i;
            }
        }
        i = j;
        if (c != null)
        {
            i = j;
            if (c.length > 0)
            {
                i = j;
                for (int k = 0; k < c.length;)
                {
                    idy idy1 = c[k];
                    int j1 = i;
                    if (idy1 != null)
                    {
                        j1 = i + kwk.d(3, idy1);
                    }
                    k++;
                    i = j1;
                }

            }
        }
        int k1 = i;
        if (d != null)
        {
            k1 = i;
            if (d.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    k1 = i;
                    if (l >= d.length)
                    {
                        break;
                    }
                    igd igd1 = d[l];
                    k1 = i;
                    if (igd1 != null)
                    {
                        k1 = i + kwk.d(4, igd1);
                    }
                    l++;
                    i = k1;
                } while (true);
            }
        }
        return k1;
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
                a = kwj1.j();
                break;

            case 18: // '\022'
                int i1 = kwx.a(kwj1, 18);
                idv aidv[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aidv = new idv[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aidv, 0, j);
                    i1 = j;
                }
                for (; i1 < aidv.length - 1; i1++)
                {
                    aidv[i1] = new idv();
                    kwj1.a(aidv[i1]);
                    kwj1.a();
                }

                aidv[i1] = new idv();
                kwj1.a(aidv[i1]);
                b = aidv;
                break;

            case 26: // '\032'
                int j1 = kwx.a(kwj1, 26);
                idy aidy[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                aidy = new idy[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, aidy, 0, k);
                    j1 = k;
                }
                for (; j1 < aidy.length - 1; j1++)
                {
                    aidy[j1] = new idy();
                    kwj1.a(aidy[j1]);
                    kwj1.a();
                }

                aidy[j1] = new idy();
                kwj1.a(aidy[j1]);
                c = aidy;
                break;

            case 34: // '"'
                int k1 = kwx.a(kwj1, 34);
                igd aigd[];
                int l;
                if (d == null)
                {
                    l = 0;
                } else
                {
                    l = d.length;
                }
                aigd = new igd[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(d, 0, aigd, 0, l);
                    k1 = l;
                }
                for (; k1 < aigd.length - 1; k1++)
                {
                    aigd[k1] = new igd();
                    kwj1.a(aigd[k1]);
                    kwj1.a();
                }

                aigd[k1] = new igd();
                kwj1.a(aigd[k1]);
                d = aigd;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                idv idv1 = b[i];
                if (idv1 != null)
                {
                    kwk1.b(2, idv1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = 0; j < c.length; j++)
            {
                idy idy1 = c[j];
                if (idy1 != null)
                {
                    kwk1.b(3, idy1);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < d.length; k++)
            {
                igd igd1 = d[k];
                if (igd1 != null)
                {
                    kwk1.b(4, igd1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
