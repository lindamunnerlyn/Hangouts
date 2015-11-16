// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lif extends kwm
{

    public String a;
    public lhc b;
    public lig c[];

    public lif()
    {
        a = null;
        b = null;
        c = lig.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + kwk.b(1, a);
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
                for (j = 0; j < c.length;)
                {
                    lig lig1 = c[j];
                    int k = i;
                    if (lig1 != null)
                    {
                        k = i + kwk.d(3, lig1);
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
                a = kwj1.j();
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new lhc();
                }
                kwj1.a(b);
                break;

            case 26: // '\032'
                int k = kwx.a(kwj1, 26);
                lig alig[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                alig = new lig[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, alig, 0, j);
                    k = j;
                }
                for (; k < alig.length - 1; k++)
                {
                    alig[k] = new lig();
                    kwj1.a(alig[k]);
                    kwj1.a();
                }

                alig[k] = new lig();
                kwj1.a(alig[k]);
                c = alig;
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
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                lig lig1 = c[i];
                if (lig1 != null)
                {
                    kwk1.b(3, lig1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
