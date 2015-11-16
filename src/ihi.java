// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ihi extends kwm
{

    public ijl a;
    public ihj b;
    public ijl c[];

    public ihi()
    {
        a = null;
        b = null;
        c = ijl.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + kwk.d(1, a);
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
                    ijl ijl1 = c[j];
                    int k = i;
                    if (ijl1 != null)
                    {
                        k = i + kwk.d(3, ijl1);
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
                    a = new ijl();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new ihj();
                }
                kwj1.a(b);
                break;

            case 26: // '\032'
                int k = kwx.a(kwj1, 26);
                ijl aijl[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                aijl = new ijl[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, aijl, 0, j);
                    k = j;
                }
                for (; k < aijl.length - 1; k++)
                {
                    aijl[k] = new ijl();
                    kwj1.a(aijl[k]);
                    kwj1.a();
                }

                aijl[k] = new ijl();
                kwj1.a(aijl[k]);
                c = aijl;
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
            kwk1.b(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                ijl ijl1 = c[i];
                if (ijl1 != null)
                {
                    kwk1.b(3, ijl1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
