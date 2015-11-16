// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hzg extends kwm
{

    public hzk a[];
    public hzv b;
    public hzj c;

    public hzg()
    {
        a = hzk.a();
        b = null;
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= a.length)
                    {
                        break;
                    }
                    hzk hzk1 = a[k];
                    j = i;
                    if (hzk1 != null)
                    {
                        j = i + kwk.d(1, hzk1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.d(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i + kwk.d(3, c);
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
                int k = kwx.a(kwj1, 10);
                hzk ahzk[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                ahzk = new hzk[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, ahzk, 0, j);
                    k = j;
                }
                for (; k < ahzk.length - 1; k++)
                {
                    ahzk[k] = new hzk();
                    kwj1.a(ahzk[k]);
                    kwj1.a();
                }

                ahzk[k] = new hzk();
                kwj1.a(ahzk[k]);
                a = ahzk;
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new hzv();
                }
                kwj1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new hzj();
                }
                kwj1.a(c);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                hzk hzk1 = a[i];
                if (hzk1 != null)
                {
                    kwk1.b(1, hzk1);
                }
            }

        }
        if (b != null)
        {
            kwk1.b(2, b);
        }
        if (c != null)
        {
            kwk1.b(3, c);
        }
        super.writeTo(kwk1);
    }
}
