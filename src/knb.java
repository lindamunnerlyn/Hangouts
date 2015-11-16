// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class knb extends kwm
{

    public Long a;
    public knd b[];
    public knc c[];
    public Integer d;
    public Integer e;

    public knb()
    {
        a = null;
        b = knd.a();
        c = knc.a();
        d = null;
        e = null;
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
            j = i + kwk.e(1, a.longValue());
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
                    knd knd1 = b[j];
                    int k = i;
                    if (knd1 != null)
                    {
                        k = i + kwk.d(2, knd1);
                    }
                    j++;
                    i = k;
                }

            }
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (l >= c.length)
                    {
                        break;
                    }
                    knc knc1 = c[l];
                    j = i;
                    if (knc1 != null)
                    {
                        j = i + kwk.d(3, knc1);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.e(4, d.intValue());
        }
        j = i;
        if (e != null)
        {
            j = i + kwk.e(5, e.intValue());
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
                a = Long.valueOf(kwj1.e());
                break;

            case 18: // '\022'
                int l = kwx.a(kwj1, 18);
                knd aknd[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aknd = new knd[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aknd, 0, j);
                    l = j;
                }
                for (; l < aknd.length - 1; l++)
                {
                    aknd[l] = new knd();
                    kwj1.a(aknd[l]);
                    kwj1.a();
                }

                aknd[l] = new knd();
                kwj1.a(aknd[l]);
                b = aknd;
                break;

            case 26: // '\032'
                int i1 = kwx.a(kwj1, 26);
                knc aknc[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                aknc = new knc[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, aknc, 0, k);
                    i1 = k;
                }
                for (; i1 < aknc.length - 1; i1++)
                {
                    aknc[i1] = new knc();
                    kwj1.a(aknc[i1]);
                    kwj1.a();
                }

                aknc[i1] = new knc();
                kwj1.a(aknc[i1]);
                c = aknc;
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
        if (a != null)
        {
            kwk1.b(1, a.longValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                knd knd1 = b[i];
                if (knd1 != null)
                {
                    kwk1.b(2, knd1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                knc knc1 = c[j];
                if (knc1 != null)
                {
                    kwk1.b(3, knc1);
                }
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
