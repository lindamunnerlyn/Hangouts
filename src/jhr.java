// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jhr extends kwm
{

    public jhh a[];
    public jif b;
    public jib c[];
    public jdl responseHeader;

    public jhr()
    {
        responseHeader = null;
        a = jhh.a();
        b = null;
        c = jib.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (responseHeader != null)
        {
            i = j + kwk.d(1, responseHeader);
        }
        j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                for (j = 0; j < a.length;)
                {
                    jhh jhh1 = a[j];
                    int l = i;
                    if (jhh1 != null)
                    {
                        l = i + kwk.d(2, jhh1);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.d(3, b);
        }
        int i1 = i;
        if (c != null)
        {
            i1 = i;
            if (c.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    i1 = i;
                    if (k >= c.length)
                    {
                        break;
                    }
                    jib jib1 = c[k];
                    i1 = i;
                    if (jib1 != null)
                    {
                        i1 = i + kwk.d(4, jib1);
                    }
                    k++;
                    i = i1;
                } while (true);
            }
        }
        return i1;
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
                int l = kwx.a(kwj1, 18);
                jhh ajhh[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                ajhh = new jhh[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, ajhh, 0, j);
                    l = j;
                }
                for (; l < ajhh.length - 1; l++)
                {
                    ajhh[l] = new jhh();
                    kwj1.a(ajhh[l]);
                    kwj1.a();
                }

                ajhh[l] = new jhh();
                kwj1.a(ajhh[l]);
                a = ajhh;
                break;

            case 26: // '\032'
                if (b == null)
                {
                    b = new jif();
                }
                kwj1.a(b);
                break;

            case 34: // '"'
                int i1 = kwx.a(kwj1, 34);
                jib ajib[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                ajib = new jib[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, ajib, 0, k);
                    i1 = k;
                }
                for (; i1 < ajib.length - 1; i1++)
                {
                    ajib[i1] = new jib();
                    kwj1.a(ajib[i1]);
                    kwj1.a();
                }

                ajib[i1] = new jib();
                kwj1.a(ajib[i1]);
                c = ajib;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (responseHeader != null)
        {
            kwk1.b(1, responseHeader);
        }
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                jhh jhh1 = a[i];
                if (jhh1 != null)
                {
                    kwk1.b(2, jhh1);
                }
            }

        }
        if (b != null)
        {
            kwk1.b(3, b);
        }
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                jib jib1 = c[j];
                if (jib1 != null)
                {
                    kwk1.b(4, jib1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
