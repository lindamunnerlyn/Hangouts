// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lrq extends kwm
{

    private static volatile lrq f[];
    public float a[];
    public float b[];
    public float c[];
    public Integer d;
    public Integer e;

    public lrq()
    {
        a = kwx.c;
        b = kwx.c;
        c = kwx.c;
        d = null;
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lrq[] a()
    {
        if (f == null)
        {
            synchronized (kwq.a)
            {
                if (f == null)
                {
                    f = new lrq[0];
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
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j;
            if (a.length > 0)
            {
                i = j + a.length * 4 + a.length * 1;
            }
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                j = i + b.length * 4 + b.length * 1;
            }
        }
        i = j;
        if (c != null)
        {
            i = j;
            if (c.length > 0)
            {
                i = j + c.length * 4 + c.length * 1;
            }
        }
        j = i;
        if (d != null)
        {
            j = i + kwk.e(4, d.intValue());
        }
        i = j;
        if (e != null)
        {
            i = j + kwk.e(5, e.intValue());
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

            case 13: // '\r'
                int l1 = kwx.a(kwj1, 13);
                float af[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                af = new float[l1 + j];
                l1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, af, 0, j);
                    l1 = j;
                }
                for (; l1 < af.length - 1; l1++)
                {
                    af[l1] = kwj1.c();
                    kwj1.a();
                }

                af[l1] = kwj1.c();
                a = af;
                break;

            case 10: // '\n'
                int k = kwj1.p();
                int j3 = kwj1.c(k);
                int i2 = k / 4;
                float af1[];
                if (a == null)
                {
                    k = 0;
                } else
                {
                    k = a.length;
                }
                af1 = new float[i2 + k];
                i2 = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, af1, 0, k);
                    i2 = k;
                }
                for (; i2 < af1.length; i2++)
                {
                    af1[i2] = kwj1.c();
                }

                a = af1;
                kwj1.d(j3);
                break;

            case 21: // '\025'
                int j2 = kwx.a(kwj1, 21);
                float af2[];
                int l;
                if (b == null)
                {
                    l = 0;
                } else
                {
                    l = b.length;
                }
                af2 = new float[j2 + l];
                j2 = l;
                if (l != 0)
                {
                    System.arraycopy(b, 0, af2, 0, l);
                    j2 = l;
                }
                for (; j2 < af2.length - 1; j2++)
                {
                    af2[j2] = kwj1.c();
                    kwj1.a();
                }

                af2[j2] = kwj1.c();
                b = af2;
                break;

            case 18: // '\022'
                int i1 = kwj1.p();
                int k3 = kwj1.c(i1);
                int k2 = i1 / 4;
                float af3[];
                if (b == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = b.length;
                }
                af3 = new float[k2 + i1];
                k2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(b, 0, af3, 0, i1);
                    k2 = i1;
                }
                for (; k2 < af3.length; k2++)
                {
                    af3[k2] = kwj1.c();
                }

                b = af3;
                kwj1.d(k3);
                break;

            case 29: // '\035'
                int l2 = kwx.a(kwj1, 29);
                float af4[];
                int j1;
                if (c == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = c.length;
                }
                af4 = new float[l2 + j1];
                l2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(c, 0, af4, 0, j1);
                    l2 = j1;
                }
                for (; l2 < af4.length - 1; l2++)
                {
                    af4[l2] = kwj1.c();
                    kwj1.a();
                }

                af4[l2] = kwj1.c();
                c = af4;
                break;

            case 26: // '\032'
                int k1 = kwj1.p();
                int l3 = kwj1.c(k1);
                int i3 = k1 / 4;
                float af5[];
                if (c == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = c.length;
                }
                af5 = new float[i3 + k1];
                i3 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(c, 0, af5, 0, k1);
                    i3 = k1;
                }
                for (; i3 < af5.length; i3++)
                {
                    af5[i3] = kwj1.c();
                }

                c = af5;
                kwj1.d(l3);
                break;

            case 32: // ' '
                d = Integer.valueOf(kwj1.f());
                break;

            case 40: // '('
                e = Integer.valueOf(kwj1.f());
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
                kwk1.a(1, a[i]);
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = 0; j < b.length; j++)
            {
                kwk1.a(2, b[j]);
            }

        }
        if (c != null && c.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < c.length; k++)
            {
                kwk1.a(3, c[k]);
            }

        }
        if (d != null)
        {
            kwk1.a(4, d.intValue());
        }
        if (e != null)
        {
            kwk1.a(5, e.intValue());
        }
        super.writeTo(kwk1);
    }
}
