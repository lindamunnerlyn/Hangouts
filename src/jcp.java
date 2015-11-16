// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jcp extends kwm
{

    public Boolean a;
    public Boolean b;
    public iyk c[];
    public jbw d;
    public jao e;
    public iyl f;
    public iyj g;
    public iws h;
    public jfa i;
    public jbe j;

    public jcp()
    {
        a = null;
        b = null;
        c = iyk.a();
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int l = k;
        if (a != null)
        {
            a.booleanValue();
            l = k + (kwk.f(1) + 1);
        }
        k = l;
        if (b != null)
        {
            b.booleanValue();
            k = l + (kwk.f(2) + 1);
        }
        l = k;
        if (c != null)
        {
            l = k;
            if (c.length > 0)
            {
                for (l = 0; l < c.length;)
                {
                    iyk iyk1 = c[l];
                    int i1 = k;
                    if (iyk1 != null)
                    {
                        i1 = k + kwk.d(3, iyk1);
                    }
                    l++;
                    k = i1;
                }

                l = k;
            }
        }
        k = l;
        if (d != null)
        {
            k = l + kwk.d(4, d);
        }
        l = k;
        if (e != null)
        {
            l = k + kwk.d(5, e);
        }
        k = l;
        if (f != null)
        {
            k = l + kwk.d(6, f);
        }
        l = k;
        if (g != null)
        {
            l = k + kwk.d(7, g);
        }
        k = l;
        if (h != null)
        {
            k = l + kwk.d(8, h);
        }
        l = k;
        if (i != null)
        {
            l = k + kwk.d(9, i);
        }
        k = l;
        if (j != null)
        {
            k = l + kwk.d(10, j);
        }
        return k;
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int k = kwj1.a();
            switch (k)
            {
            default:
                if (super.storeUnknownField(kwj1, k))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                a = Boolean.valueOf(kwj1.i());
                break;

            case 16: // '\020'
                b = Boolean.valueOf(kwj1.i());
                break;

            case 26: // '\032'
                int i1 = kwx.a(kwj1, 26);
                iyk aiyk[];
                int l;
                if (c == null)
                {
                    l = 0;
                } else
                {
                    l = c.length;
                }
                aiyk = new iyk[i1 + l];
                i1 = l;
                if (l != 0)
                {
                    System.arraycopy(c, 0, aiyk, 0, l);
                    i1 = l;
                }
                for (; i1 < aiyk.length - 1; i1++)
                {
                    aiyk[i1] = new iyk();
                    kwj1.a(aiyk[i1]);
                    kwj1.a();
                }

                aiyk[i1] = new iyk();
                kwj1.a(aiyk[i1]);
                c = aiyk;
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new jbw();
                }
                kwj1.a(d);
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new jao();
                }
                kwj1.a(e);
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new iyl();
                }
                kwj1.a(f);
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new iyj();
                }
                kwj1.a(g);
                break;

            case 66: // 'B'
                if (h == null)
                {
                    h = new iws();
                }
                kwj1.a(h);
                break;

            case 74: // 'J'
                if (i == null)
                {
                    i = new jfa();
                }
                kwj1.a(i);
                break;

            case 82: // 'R'
                if (j == null)
                {
                    j = new jbe();
                }
                kwj1.a(j);
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
            kwk1.a(2, b.booleanValue());
        }
        if (c != null && c.length > 0)
        {
            for (int k = 0; k < c.length; k++)
            {
                iyk iyk1 = c[k];
                if (iyk1 != null)
                {
                    kwk1.b(3, iyk1);
                }
            }

        }
        if (d != null)
        {
            kwk1.b(4, d);
        }
        if (e != null)
        {
            kwk1.b(5, e);
        }
        if (f != null)
        {
            kwk1.b(6, f);
        }
        if (g != null)
        {
            kwk1.b(7, g);
        }
        if (h != null)
        {
            kwk1.b(8, h);
        }
        if (i != null)
        {
            kwk1.b(9, i);
        }
        if (j != null)
        {
            kwk1.b(10, j);
        }
        super.writeTo(kwk1);
    }
}
