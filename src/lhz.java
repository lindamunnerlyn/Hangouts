// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lhz extends kwm
{

    public String a;
    public String b;
    public String c[];
    public Boolean d;

    public lhz()
    {
        a = null;
        b = null;
        c = kwx.f;
        d = null;
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
            i = j + kwk.b(1, a);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                int k = 0;
                int l = 0;
                for (j = ((flag) ? 1 : 0); j < c.length;)
                {
                    String s = c[j];
                    int j1 = k;
                    int i1 = l;
                    if (s != null)
                    {
                        i1 = l + 1;
                        j1 = k + kwk.a(s);
                    }
                    j++;
                    k = j1;
                    l = i1;
                }

                j = i + k + l * 1;
            }
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.b(3, b);
        }
        j = i;
        if (d != null)
        {
            d.booleanValue();
            j = i + (kwk.f(4) + 1);
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
                int k = kwx.a(kwj1, 18);
                String as[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                as = new String[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, as, 0, j);
                    k = j;
                }
                for (; k < as.length - 1; k++)
                {
                    as[k] = kwj1.j();
                    kwj1.a();
                }

                as[k] = kwj1.j();
                c = as;
                break;

            case 26: // '\032'
                b = kwj1.j();
                break;

            case 32: // ' '
                d = Boolean.valueOf(kwj1.i());
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
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                String s = c[i];
                if (s != null)
                {
                    kwk1.a(2, s);
                }
            }

        }
        if (b != null)
        {
            kwk1.a(3, b);
        }
        if (d != null)
        {
            kwk1.a(4, d.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
