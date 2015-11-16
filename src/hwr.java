// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hwr extends kwm
{

    public Boolean a;
    public hwt b[];
    public String c[];

    public hwr()
    {
        a = null;
        b = hwt.a();
        c = kwx.f;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            a.booleanValue();
            i = j + (kwk.f(1) + 1);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    hwt hwt1 = b[j];
                    int k = i;
                    if (hwt1 != null)
                    {
                        k = i + kwk.d(2, hwt1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (c != null)
        {
            i = j;
            if (c.length > 0)
            {
                int l = 0;
                int i1 = 0;
                for (i = ((flag) ? 1 : 0); i < c.length;)
                {
                    String s = c[i];
                    int k1 = l;
                    int j1 = i1;
                    if (s != null)
                    {
                        j1 = i1 + 1;
                        k1 = l + kwk.a(s);
                    }
                    i++;
                    l = k1;
                    i1 = j1;
                }

                i = j + l + i1 * 1;
            }
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

            case 8: // '\b'
                a = Boolean.valueOf(kwj1.i());
                break;

            case 18: // '\022'
                int l = kwx.a(kwj1, 18);
                hwt ahwt[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ahwt = new hwt[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, ahwt, 0, j);
                    l = j;
                }
                for (; l < ahwt.length - 1; l++)
                {
                    ahwt[l] = new hwt();
                    kwj1.a(ahwt[l]);
                    kwj1.a();
                }

                ahwt[l] = new hwt();
                kwj1.a(ahwt[l]);
                b = ahwt;
                break;

            case 26: // '\032'
                int i1 = kwx.a(kwj1, 26);
                String as[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                as = new String[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, as, 0, k);
                    i1 = k;
                }
                for (; i1 < as.length - 1; i1++)
                {
                    as[i1] = kwj1.j();
                    kwj1.a();
                }

                as[i1] = kwj1.j();
                c = as;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.a(1, a.booleanValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                hwt hwt1 = b[i];
                if (hwt1 != null)
                {
                    kwk1.b(2, hwt1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                String s = c[j];
                if (s != null)
                {
                    kwk1.a(3, s);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
