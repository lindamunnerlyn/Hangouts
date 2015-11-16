// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ida extends kwm
{

    public Boolean a;
    public idc b;
    public long c[];
    public String d;
    public Integer e;
    public String f;
    public idb g;

    public ida()
    {
        a = null;
        b = null;
        c = kwx.b;
        d = null;
        e = null;
        f = null;
        g = null;
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
            a.booleanValue();
            j = i + (kwk.f(1) + 1);
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.d(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                int k = 0;
                for (j = ((flag) ? 1 : 0); j < c.length; j++)
                {
                    k += kwk.b(c[j]);
                }

                j = i + k + c.length * 1;
            }
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.b(4, d);
        }
        j = i;
        if (e != null)
        {
            j = i + kwk.e(5, e.intValue());
        }
        i = j;
        if (g != null)
        {
            i = j + kwk.d(6, g);
        }
        j = i;
        if (f != null)
        {
            j = i + kwk.b(7, f);
        }
        return j;
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

            case 8: // '\b'
                a = Boolean.valueOf(kwj1.i());
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new idc();
                }
                kwj1.a(b);
                break;

            case 24: // '\030'
                int l = kwx.a(kwj1, 24);
                long al[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                al = new long[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, al, 0, j);
                    l = j;
                }
                for (; l < al.length - 1; l++)
                {
                    al[l] = kwj1.e();
                    kwj1.a();
                }

                al[l] = kwj1.e();
                c = al;
                break;

            case 26: // '\032'
                int j1 = kwj1.c(kwj1.p());
                int k = kwj1.r();
                int i1;
                for (i1 = 0; kwj1.q() > 0; i1++)
                {
                    kwj1.e();
                }

                kwj1.e(k);
                long al1[];
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                al1 = new long[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, al1, 0, k);
                    i1 = k;
                }
                for (; i1 < al1.length; i1++)
                {
                    al1[i1] = kwj1.e();
                }

                c = al1;
                kwj1.d(j1);
                break;

            case 34: // '"'
                d = kwj1.j();
                break;

            case 40: // '('
                e = Integer.valueOf(kwj1.f());
                break;

            case 50: // '2'
                if (g == null)
                {
                    g = new idb();
                }
                kwj1.a(g);
                break;

            case 58: // ':'
                f = kwj1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.booleanValue());
        }
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                kwk1.b(3, c[i]);
            }

        }
        if (d != null)
        {
            kwk1.a(4, d);
        }
        if (e != null)
        {
            kwk1.a(5, e.intValue());
        }
        if (g != null)
        {
            kwk1.b(6, g);
        }
        if (f != null)
        {
            kwk1.a(7, f);
        }
        super.writeTo(kwk1);
    }
}
