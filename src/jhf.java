// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jhf extends kwm
{

    public jhc a;
    public jif b;
    public jhc c[];
    public jdk requestHeader;

    public jhf()
    {
        requestHeader = null;
        a = null;
        b = null;
        c = jhc.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (requestHeader != null)
        {
            i = j + kwk.d(1, requestHeader);
        }
        j = i;
        if (a != null)
        {
            j = i + kwk.d(2, a);
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.d(3, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    jhc jhc1 = c[j];
                    int k = i;
                    if (jhc1 != null)
                    {
                        k = i + kwk.d(4, jhc1);
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
                if (requestHeader == null)
                {
                    requestHeader = new jdk();
                }
                kwj1.a(requestHeader);
                break;

            case 18: // '\022'
                if (a == null)
                {
                    a = new jhc();
                }
                kwj1.a(a);
                break;

            case 26: // '\032'
                if (b == null)
                {
                    b = new jif();
                }
                kwj1.a(b);
                break;

            case 34: // '"'
                int k = kwx.a(kwj1, 34);
                jhc ajhc[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                ajhc = new jhc[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, ajhc, 0, j);
                    k = j;
                }
                for (; k < ajhc.length - 1; k++)
                {
                    ajhc[k] = new jhc();
                    kwj1.a(ajhc[k]);
                    kwj1.a();
                }

                ajhc[k] = new jhc();
                kwj1.a(ajhc[k]);
                c = ajhc;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (requestHeader != null)
        {
            kwk1.b(1, requestHeader);
        }
        if (a != null)
        {
            kwk1.b(2, a);
        }
        if (b != null)
        {
            kwk1.b(3, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                jhc jhc1 = c[i];
                if (jhc1 != null)
                {
                    kwk1.b(4, jhc1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
