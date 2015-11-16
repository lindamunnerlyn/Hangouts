// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iom extends kwm
{

    public String a;
    public String b;
    public Long c;
    public ion d[];

    public iom()
    {
        a = null;
        b = null;
        c = null;
        d = ion.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.b(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.e(3, c.longValue());
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                for (j = 0; j < d.length;)
                {
                    ion ion1 = d[j];
                    int k = i;
                    if (ion1 != null)
                    {
                        k = i + kwk.d(4, ion1);
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
                a = kwj1.j();
                break;

            case 18: // '\022'
                b = kwj1.j();
                break;

            case 24: // '\030'
                c = Long.valueOf(kwj1.e());
                break;

            case 34: // '"'
                int k = kwx.a(kwj1, 34);
                ion aion[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                aion = new ion[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(d, 0, aion, 0, j);
                    k = j;
                }
                for (; k < aion.length - 1; k++)
                {
                    aion[k] = new ion();
                    kwj1.a(aion[k]);
                    kwj1.a();
                }

                aion[k] = new ion();
                kwj1.a(aion[k]);
                d = aion;
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
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (c != null)
        {
            kwk1.b(3, c.longValue());
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                ion ion1 = d[i];
                if (ion1 != null)
                {
                    kwk1.b(4, ion1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
