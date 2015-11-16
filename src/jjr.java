// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jjr extends kwm
{

    public Boolean a;
    public Boolean b;
    public jjs c;
    public Integer d;
    public int e[];

    public jjr()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = kwx.a;
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
            a.booleanValue();
            i = j + (kwk.f(1) + 1);
        }
        j = i;
        if (b != null)
        {
            b.booleanValue();
            j = i + (kwk.f(2) + 1);
        }
        int k = j;
        if (c != null)
        {
            k = j + kwk.d(3, c);
        }
        i = k;
        if (d != null)
        {
            i = k + kwk.f(4, d.intValue());
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                int l = 0;
                for (j = ((flag) ? 1 : 0); j < e.length; j++)
                {
                    l += kwk.e(e[j]);
                }

                j = i + l + e.length * 1;
            }
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

            case 16: // '\020'
                b = Boolean.valueOf(kwj1.i());
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new jjs();
                }
                kwj1.a(c);
                break;

            case 32: // ' '
                d = Integer.valueOf(kwj1.l());
                break;

            case 40: // '('
                int l = kwx.a(kwj1, 40);
                int ai[];
                int j;
                if (e == null)
                {
                    j = 0;
                } else
                {
                    j = e.length;
                }
                ai = new int[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(e, 0, ai, 0, j);
                    l = j;
                }
                for (; l < ai.length - 1; l++)
                {
                    ai[l] = kwj1.f();
                    kwj1.a();
                }

                ai[l] = kwj1.f();
                e = ai;
                break;

            case 42: // '*'
                int j1 = kwj1.c(kwj1.p());
                int k = kwj1.r();
                int i1;
                for (i1 = 0; kwj1.q() > 0; i1++)
                {
                    kwj1.f();
                }

                kwj1.e(k);
                int ai1[];
                if (e == null)
                {
                    k = 0;
                } else
                {
                    k = e.length;
                }
                ai1 = new int[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(e, 0, ai1, 0, k);
                    i1 = k;
                }
                for (; i1 < ai1.length; i1++)
                {
                    ai1[i1] = kwj1.f();
                }

                e = ai1;
                kwj1.d(j1);
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
        if (c != null)
        {
            kwk1.b(3, c);
        }
        if (d != null)
        {
            kwk1.c(4, d.intValue());
        }
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                kwk1.a(5, e[i]);
            }

        }
        super.writeTo(kwk1);
    }
}
