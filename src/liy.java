// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class liy extends kwm
{

    public lkp a;
    public liz b[];
    public lhc c;
    public int d[];
    public Integer e;

    public liy()
    {
        a = null;
        b = liz.a();
        c = null;
        d = kwx.a;
        e = null;
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
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    liz liz1 = b[j];
                    int k = i;
                    if (liz1 != null)
                    {
                        k = i + kwk.d(2, liz1);
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
            i = j + kwk.d(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                int l = 0;
                for (j = ((flag) ? 1 : 0); j < d.length; j++)
                {
                    l += kwk.e(d[j]);
                }

                j = i + l + d.length * 1;
            }
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

            case 10: // '\n'
                if (a == null)
                {
                    a = new lkp();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                int i1 = kwx.a(kwj1, 18);
                liz aliz[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aliz = new liz[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aliz, 0, j);
                    i1 = j;
                }
                for (; i1 < aliz.length - 1; i1++)
                {
                    aliz[i1] = new liz();
                    kwj1.a(aliz[i1]);
                    kwj1.a();
                }

                aliz[i1] = new liz();
                kwj1.a(aliz[i1]);
                b = aliz;
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new lhc();
                }
                kwj1.a(c);
                break;

            case 32: // ' '
                int j1 = kwx.a(kwj1, 32);
                int ai[];
                int k;
                if (d == null)
                {
                    k = 0;
                } else
                {
                    k = d.length;
                }
                ai = new int[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(d, 0, ai, 0, k);
                    j1 = k;
                }
                for (; j1 < ai.length - 1; j1++)
                {
                    ai[j1] = kwj1.f();
                    kwj1.a();
                }

                ai[j1] = kwj1.f();
                d = ai;
                break;

            case 34: // '"'
                int l1 = kwj1.c(kwj1.p());
                int l = kwj1.r();
                int k1;
                for (k1 = 0; kwj1.q() > 0; k1++)
                {
                    kwj1.f();
                }

                kwj1.e(l);
                int ai1[];
                if (d == null)
                {
                    l = 0;
                } else
                {
                    l = d.length;
                }
                ai1 = new int[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(d, 0, ai1, 0, l);
                    k1 = l;
                }
                for (; k1 < ai1.length; k1++)
                {
                    ai1[k1] = kwj1.f();
                }

                d = ai1;
                kwj1.d(l1);
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
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                liz liz1 = b[i];
                if (liz1 != null)
                {
                    kwk1.b(2, liz1);
                }
            }

        }
        if (c != null)
        {
            kwk1.b(3, c);
        }
        if (d != null && d.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < d.length; j++)
            {
                kwk1.a(4, d[j]);
            }

        }
        if (e != null)
        {
            kwk1.a(5, e.intValue());
        }
        super.writeTo(kwk1);
    }
}
