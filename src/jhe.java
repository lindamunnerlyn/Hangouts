// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jhe extends kwm
{

    public jhc a;
    public String b;
    public jif c;
    public jhc d[];
    public jdl responseHeader;

    public jhe()
    {
        responseHeader = null;
        a = null;
        b = null;
        c = null;
        d = jhc.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (responseHeader != null)
        {
            i = j + kwk.d(1, responseHeader);
        }
        j = i;
        if (a != null)
        {
            j = i + kwk.d(2, a);
        }
        int k = j;
        if (c != null)
        {
            k = j + kwk.d(3, c);
        }
        i = k;
        if (b != null)
        {
            i = k + kwk.b(4, b);
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                for (j = 0; j < d.length;)
                {
                    jhc jhc1 = d[j];
                    int l = i;
                    if (jhc1 != null)
                    {
                        l = i + kwk.d(5, jhc1);
                    }
                    j++;
                    i = l;
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
                if (responseHeader == null)
                {
                    responseHeader = new jdl();
                }
                kwj1.a(responseHeader);
                break;

            case 18: // '\022'
                if (a == null)
                {
                    a = new jhc();
                }
                kwj1.a(a);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new jif();
                }
                kwj1.a(c);
                break;

            case 34: // '"'
                b = kwj1.j();
                break;

            case 42: // '*'
                int k = kwx.a(kwj1, 42);
                jhc ajhc[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                ajhc = new jhc[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(d, 0, ajhc, 0, j);
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
                d = ajhc;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (responseHeader != null)
        {
            kwk1.b(1, responseHeader);
        }
        if (a != null)
        {
            kwk1.b(2, a);
        }
        if (c != null)
        {
            kwk1.b(3, c);
        }
        if (b != null)
        {
            kwk1.a(4, b);
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                jhc jhc1 = d[i];
                if (jhc1 != null)
                {
                    kwk1.b(5, jhc1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
