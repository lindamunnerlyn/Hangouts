// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kqq extends kwm
{

    public Long a;
    public kqs b[];
    public kqr c[];
    public Integer d;
    public Integer e;

    public kqq()
    {
        a = null;
        b = kqs.a();
        c = kqr.a();
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
                    kqs kqs1 = b[j];
                    int k = i;
                    if (kqs1 != null)
                    {
                        k = i + kwk.d(2, kqs1);
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
                    kqr kqr1 = c[l];
                    j = i;
                    if (kqr1 != null)
                    {
                        j = i + kwk.d(3, kqr1);
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
                kqs akqs[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                akqs = new kqs[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, akqs, 0, j);
                    l = j;
                }
                for (; l < akqs.length - 1; l++)
                {
                    akqs[l] = new kqs();
                    kwj1.a(akqs[l]);
                    kwj1.a();
                }

                akqs[l] = new kqs();
                kwj1.a(akqs[l]);
                b = akqs;
                break;

            case 26: // '\032'
                int i1 = kwx.a(kwj1, 26);
                kqr akqr[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                akqr = new kqr[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, akqr, 0, k);
                    i1 = k;
                }
                for (; i1 < akqr.length - 1; i1++)
                {
                    akqr[i1] = new kqr();
                    kwj1.a(akqr[i1]);
                    kwj1.a();
                }

                akqr[i1] = new kqr();
                kwj1.a(akqr[i1]);
                c = akqr;
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
                kqs kqs1 = b[i];
                if (kqs1 != null)
                {
                    kwk1.b(2, kqs1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                kqr kqr1 = c[j];
                if (kqr1 != null)
                {
                    kwk1.b(3, kqr1);
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
