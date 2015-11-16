// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kes extends kwm
{

    public Double a;
    public Double b;
    public Double c;
    public ker d[];

    public kes()
    {
        a = null;
        b = null;
        c = null;
        d = ker.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            a.doubleValue();
            i = j + (kwk.f(1) + 8);
        }
        j = i;
        if (b != null)
        {
            b.doubleValue();
            j = i + (kwk.f(2) + 8);
        }
        i = j;
        if (c != null)
        {
            c.doubleValue();
            i = j + (kwk.f(3) + 8);
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                for (j = 0; j < d.length;)
                {
                    ker ker1 = d[j];
                    int k = i;
                    if (ker1 != null)
                    {
                        k = i + kwk.d(4, ker1);
                    }
                    j++;
                    i = k;
                }

                j = i;
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

            case 9: // '\t'
                a = Double.valueOf(kwj1.b());
                break;

            case 17: // '\021'
                b = Double.valueOf(kwj1.b());
                break;

            case 25: // '\031'
                c = Double.valueOf(kwj1.b());
                break;

            case 34: // '"'
                int k = kwx.a(kwj1, 34);
                ker aker[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                aker = new ker[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(d, 0, aker, 0, j);
                    k = j;
                }
                for (; k < aker.length - 1; k++)
                {
                    aker[k] = new ker();
                    kwj1.a(aker[k]);
                    kwj1.a();
                }

                aker[k] = new ker();
                kwj1.a(aker[k]);
                d = aker;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.doubleValue());
        }
        if (b != null)
        {
            kwk1.a(2, b.doubleValue());
        }
        if (c != null)
        {
            kwk1.a(3, c.doubleValue());
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                ker ker1 = d[i];
                if (ker1 != null)
                {
                    kwk1.b(4, ker1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
