// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jhn extends kwm
{

    public jhh a;
    public jif b;
    public jhh c[];
    public jdl responseHeader;

    public jhn()
    {
        responseHeader = null;
        a = null;
        b = null;
        c = jhh.a();
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
                    jhh jhh1 = c[j];
                    int k = i;
                    if (jhh1 != null)
                    {
                        k = i + kwk.d(4, jhh1);
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
                if (responseHeader == null)
                {
                    responseHeader = new jdl();
                }
                kwj1.a(responseHeader);
                break;

            case 18: // '\022'
                if (a == null)
                {
                    a = new jhh();
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
                jhh ajhh[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                ajhh = new jhh[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, ajhh, 0, j);
                    k = j;
                }
                for (; k < ajhh.length - 1; k++)
                {
                    ajhh[k] = new jhh();
                    kwj1.a(ajhh[k]);
                    kwj1.a();
                }

                ajhh[k] = new jhh();
                kwj1.a(ajhh[k]);
                c = ajhh;
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
        if (b != null)
        {
            kwk1.b(3, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                jhh jhh1 = c[i];
                if (jhh1 != null)
                {
                    kwk1.b(4, jhh1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
