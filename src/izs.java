// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class izs extends kwm
{

    public kbm a;
    public String b;
    public Boolean c;
    public kbm d[];
    public jch e;
    public jdk requestHeader;

    public izs()
    {
        requestHeader = null;
        a = null;
        b = null;
        c = null;
        d = kbm.a();
        e = null;
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
        int k = j;
        if (b != null)
        {
            k = j + kwk.b(3, b);
        }
        i = k;
        if (c != null)
        {
            c.booleanValue();
            i = k + (kwk.f(4) + 1);
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                for (j = 0; j < d.length;)
                {
                    kbm kbm1 = d[j];
                    int l = i;
                    if (kbm1 != null)
                    {
                        l = i + kwk.d(5, kbm1);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        i = j;
        if (e != null)
        {
            i = j + kwk.d(6, e);
        }
        return i;
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
                    a = new kbm();
                }
                kwj1.a(a);
                break;

            case 26: // '\032'
                b = kwj1.j();
                break;

            case 32: // ' '
                c = Boolean.valueOf(kwj1.i());
                break;

            case 42: // '*'
                int k = kwx.a(kwj1, 42);
                kbm akbm[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                akbm = new kbm[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(d, 0, akbm, 0, j);
                    k = j;
                }
                for (; k < akbm.length - 1; k++)
                {
                    akbm[k] = new kbm();
                    kwj1.a(akbm[k]);
                    kwj1.a();
                }

                akbm[k] = new kbm();
                kwj1.a(akbm[k]);
                d = akbm;
                break;

            case 50: // '2'
                if (e == null)
                {
                    e = new jch();
                }
                kwj1.a(e);
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
            kwk1.a(3, b);
        }
        if (c != null)
        {
            kwk1.a(4, c.booleanValue());
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                kbm kbm1 = d[i];
                if (kbm1 != null)
                {
                    kwk1.b(5, kbm1);
                }
            }

        }
        if (e != null)
        {
            kwk1.b(6, e);
        }
        super.writeTo(kwk1);
    }
}
