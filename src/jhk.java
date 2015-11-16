// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jhk extends kwm
{

    public jhh a;
    public jhj b;
    public Boolean c;
    public jif d;
    public jhh e[];
    public jdk requestHeader;

    public jhk()
    {
        requestHeader = null;
        a = null;
        b = null;
        c = null;
        d = null;
        e = jhh.a();
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
            c.booleanValue();
            j = i + (kwk.f(4) + 1);
        }
        i = j;
        if (d != null)
        {
            i = j + kwk.d(5, d);
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                for (j = 0; j < e.length;)
                {
                    jhh jhh1 = e[j];
                    int k = i;
                    if (jhh1 != null)
                    {
                        k = i + kwk.d(6, jhh1);
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
                    a = new jhh();
                }
                kwj1.a(a);
                break;

            case 26: // '\032'
                if (b == null)
                {
                    b = new jhj();
                }
                kwj1.a(b);
                break;

            case 32: // ' '
                c = Boolean.valueOf(kwj1.i());
                break;

            case 42: // '*'
                if (d == null)
                {
                    d = new jif();
                }
                kwj1.a(d);
                break;

            case 50: // '2'
                int k = kwx.a(kwj1, 50);
                jhh ajhh[];
                int j;
                if (e == null)
                {
                    j = 0;
                } else
                {
                    j = e.length;
                }
                ajhh = new jhh[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(e, 0, ajhh, 0, j);
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
                e = ajhh;
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
        if (c != null)
        {
            kwk1.a(4, c.booleanValue());
        }
        if (d != null)
        {
            kwk1.b(5, d);
        }
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                jhh jhh1 = e[i];
                if (jhh1 != null)
                {
                    kwk1.b(6, jhh1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
