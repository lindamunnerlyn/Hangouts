// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kbb extends kwm
{

    public int a[];
    public float b[];
    public Boolean c;
    public String d;
    public String e;
    public ltc f;

    public kbb()
    {
        a = kwx.a;
        b = kwx.c;
        c = null;
        d = null;
        e = null;
        f = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = 0;
        int k = super.computeSerializedSize();
        int j;
        if (a != null && a.length > 0)
        {
            j = 0;
            for (; i < a.length; i++)
            {
                j += kwk.e(a[i]);
            }

            j = k + j + a.length * 1;
        } else
        {
            j = k;
        }
        i = j;
        if (b != null)
        {
            i = j;
            if (b.length > 0)
            {
                i = j + b.length * 4 + b.length * 1;
            }
        }
        j = i;
        if (c != null)
        {
            c.booleanValue();
            j = i + (kwk.f(3) + 1);
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.b(4, d);
        }
        j = i;
        if (e != null)
        {
            j = i + kwk.b(5, e);
        }
        i = j;
        if (f != null)
        {
            i = j + kwk.d(15, f);
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

            case 8: // '\b'
                int j1 = kwx.a(kwj1, 8);
                int ai[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                ai = new int[j1 + j];
                j1 = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, ai, 0, j);
                    j1 = j;
                }
                for (; j1 < ai.length - 1; j1++)
                {
                    ai[j1] = kwj1.f();
                    kwj1.a();
                }

                ai[j1] = kwj1.f();
                a = ai;
                break;

            case 10: // '\n'
                int j2 = kwj1.c(kwj1.p());
                int k = kwj1.r();
                int k1;
                for (k1 = 0; kwj1.q() > 0; k1++)
                {
                    kwj1.f();
                }

                kwj1.e(k);
                int ai1[];
                if (a == null)
                {
                    k = 0;
                } else
                {
                    k = a.length;
                }
                ai1 = new int[k1 + k];
                k1 = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, ai1, 0, k);
                    k1 = k;
                }
                for (; k1 < ai1.length; k1++)
                {
                    ai1[k1] = kwj1.f();
                }

                a = ai1;
                kwj1.d(j2);
                break;

            case 21: // '\025'
                int l1 = kwx.a(kwj1, 21);
                float af[];
                int l;
                if (b == null)
                {
                    l = 0;
                } else
                {
                    l = b.length;
                }
                af = new float[l1 + l];
                l1 = l;
                if (l != 0)
                {
                    System.arraycopy(b, 0, af, 0, l);
                    l1 = l;
                }
                for (; l1 < af.length - 1; l1++)
                {
                    af[l1] = kwj1.c();
                    kwj1.a();
                }

                af[l1] = kwj1.c();
                b = af;
                break;

            case 18: // '\022'
                int i1 = kwj1.p();
                int k2 = kwj1.c(i1);
                int i2 = i1 / 4;
                float af1[];
                if (b == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = b.length;
                }
                af1 = new float[i2 + i1];
                i2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(b, 0, af1, 0, i1);
                    i2 = i1;
                }
                for (; i2 < af1.length; i2++)
                {
                    af1[i2] = kwj1.c();
                }

                b = af1;
                kwj1.d(k2);
                break;

            case 24: // '\030'
                c = Boolean.valueOf(kwj1.i());
                break;

            case 34: // '"'
                d = kwj1.j();
                break;

            case 42: // '*'
                e = kwj1.j();
                break;

            case 122: // 'z'
                if (f == null)
                {
                    f = new ltc();
                }
                kwj1.a(f);
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
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                kwk1.a(2, b[j]);
            }

        }
        if (c != null)
        {
            kwk1.a(3, c.booleanValue());
        }
        if (d != null)
        {
            kwk1.a(4, d);
        }
        if (e != null)
        {
            kwk1.a(5, e);
        }
        if (f != null)
        {
            kwk1.b(15, f);
        }
        super.writeTo(kwk1);
    }
}
