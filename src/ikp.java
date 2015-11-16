// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ikp extends kwm
{

    public ikm a;
    public String b;
    public String c;
    public ijr d[];

    public ikp()
    {
        a = null;
        b = null;
        c = null;
        d = ijr.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.b(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.b(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                for (j = 0; j < d.length;)
                {
                    ijr ijr1 = d[j];
                    int k = i;
                    if (ijr1 != null)
                    {
                        k = i + kwk.d(4, ijr1);
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

            case 10: // '\n'
                if (a == null)
                {
                    a = new ikm();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                b = kwj1.j();
                break;

            case 26: // '\032'
                c = kwj1.j();
                break;

            case 34: // '"'
                int k = kwx.a(kwj1, 34);
                ijr aijr[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                aijr = new ijr[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(d, 0, aijr, 0, j);
                    k = j;
                }
                for (; k < aijr.length - 1; k++)
                {
                    aijr[k] = new ijr();
                    kwj1.a(aijr[k]);
                    kwj1.a();
                }

                aijr[k] = new ijr();
                kwj1.a(aijr[k]);
                d = aijr;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (c != null)
        {
            kwk1.a(3, c);
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                ijr ijr1 = d[i];
                if (ijr1 != null)
                {
                    kwk1.b(4, ijr1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
