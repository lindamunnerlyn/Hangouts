// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ivk extends kwm
{

    private static volatile ivk l[];
    public String a;
    public int b[];
    public String c;
    public String d;
    public Boolean e;
    public Boolean f;
    public Boolean g;
    public Integer h;
    public Boolean i;
    public Boolean j;
    public Boolean k;

    public ivk()
    {
        a = null;
        b = kwx.a;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ivk[] a()
    {
        if (l == null)
        {
            synchronized (kwq.a)
            {
                if (l == null)
                {
                    l = new ivk[0];
                }
            }
        }
        return l;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (a != null)
        {
            i1 = j1 + kwk.b(1, a);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + kwk.b(2, d);
        }
        i1 = j1;
        if (e != null)
        {
            e.booleanValue();
            i1 = j1 + (kwk.f(3) + 1);
        }
        j1 = i1;
        if (f != null)
        {
            f.booleanValue();
            j1 = i1 + (kwk.f(4) + 1);
        }
        i1 = j1;
        if (g != null)
        {
            g.booleanValue();
            i1 = j1 + (kwk.f(5) + 1);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + kwk.e(6, h.intValue());
        }
        i1 = j1;
        if (i != null)
        {
            i.booleanValue();
            i1 = j1 + (kwk.f(7) + 1);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1;
            if (b.length > 0)
            {
                int k1 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < b.length; j1++)
                {
                    k1 += kwk.e(b[j1]);
                }

                j1 = i1 + k1 + b.length * 1;
            }
        }
        i1 = j1;
        if (j != null)
        {
            j.booleanValue();
            i1 = j1 + (kwk.f(9) + 1);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + kwk.b(10, c);
        }
        i1 = j1;
        if (k != null)
        {
            k.booleanValue();
            i1 = j1 + (kwk.f(11) + 1);
        }
        return i1;
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int i1 = kwj1.a();
            switch (i1)
            {
            default:
                if (super.storeUnknownField(kwj1, i1))
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
                d = kwj1.j();
                break;

            case 24: // '\030'
                e = Boolean.valueOf(kwj1.i());
                break;

            case 32: // ' '
                f = Boolean.valueOf(kwj1.i());
                break;

            case 40: // '('
                g = Boolean.valueOf(kwj1.i());
                break;

            case 48: // '0'
                h = Integer.valueOf(kwj1.f());
                break;

            case 56: // '8'
                i = Boolean.valueOf(kwj1.i());
                break;

            case 64: // '@'
                int l1 = kwx.a(kwj1, 64);
                int ai[];
                int j1;
                if (b == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = b.length;
                }
                ai = new int[l1 + j1];
                l1 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(b, 0, ai, 0, j1);
                    l1 = j1;
                }
                for (; l1 < ai.length - 1; l1++)
                {
                    ai[l1] = kwj1.f();
                    kwj1.a();
                }

                ai[l1] = kwj1.f();
                b = ai;
                break;

            case 66: // 'B'
                int j2 = kwj1.c(kwj1.p());
                int k1 = kwj1.r();
                int i2;
                for (i2 = 0; kwj1.q() > 0; i2++)
                {
                    kwj1.f();
                }

                kwj1.e(k1);
                int ai1[];
                if (b == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = b.length;
                }
                ai1 = new int[i2 + k1];
                i2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(b, 0, ai1, 0, k1);
                    i2 = k1;
                }
                for (; i2 < ai1.length; i2++)
                {
                    ai1[i2] = kwj1.f();
                }

                b = ai1;
                kwj1.d(j2);
                break;

            case 72: // 'H'
                j = Boolean.valueOf(kwj1.i());
                break;

            case 82: // 'R'
                c = kwj1.j();
                break;

            case 88: // 'X'
                k = Boolean.valueOf(kwj1.i());
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a);
        }
        if (d != null)
        {
            kwk1.a(2, d);
        }
        if (e != null)
        {
            kwk1.a(3, e.booleanValue());
        }
        if (f != null)
        {
            kwk1.a(4, f.booleanValue());
        }
        if (g != null)
        {
            kwk1.a(5, g.booleanValue());
        }
        if (h != null)
        {
            kwk1.a(6, h.intValue());
        }
        if (i != null)
        {
            kwk1.a(7, i.booleanValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i1 = 0; i1 < b.length; i1++)
            {
                kwk1.a(8, b[i1]);
            }

        }
        if (j != null)
        {
            kwk1.a(9, j.booleanValue());
        }
        if (c != null)
        {
            kwk1.a(10, c);
        }
        if (k != null)
        {
            kwk1.a(11, k.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
