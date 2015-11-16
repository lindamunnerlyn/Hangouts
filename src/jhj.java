// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jhj extends kwm
{

    public jhc a;
    public jce b[];
    public Boolean c;
    public Boolean d;
    public Boolean e;

    public jhj()
    {
        a = null;
        b = jce.a();
        c = null;
        d = null;
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    jce jce1 = b[j];
                    int k = i;
                    if (jce1 != null)
                    {
                        k = i + kwk.d(2, jce1);
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
            c.booleanValue();
            i = j + (kwk.f(3) + 1);
        }
        j = i;
        if (d != null)
        {
            d.booleanValue();
            j = i + (kwk.f(4) + 1);
        }
        i = j;
        if (e != null)
        {
            e.booleanValue();
            i = j + (kwk.f(5) + 1);
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
                if (a == null)
                {
                    a = new jhc();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                jce ajce[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ajce = new jce[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, ajce, 0, j);
                    k = j;
                }
                for (; k < ajce.length - 1; k++)
                {
                    ajce[k] = new jce();
                    kwj1.a(ajce[k]);
                    kwj1.a();
                }

                ajce[k] = new jce();
                kwj1.a(ajce[k]);
                b = ajce;
                break;

            case 24: // '\030'
                c = Boolean.valueOf(kwj1.i());
                break;

            case 32: // ' '
                d = Boolean.valueOf(kwj1.i());
                break;

            case 40: // '('
                e = Boolean.valueOf(kwj1.i());
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
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                jce jce1 = b[i];
                if (jce1 != null)
                {
                    kwk1.b(2, jce1);
                }
            }

        }
        if (c != null)
        {
            kwk1.a(3, c.booleanValue());
        }
        if (d != null)
        {
            kwk1.a(4, d.booleanValue());
        }
        if (e != null)
        {
            kwk1.a(5, e.booleanValue());
        }
        super.writeTo(kwk1);
    }
}
