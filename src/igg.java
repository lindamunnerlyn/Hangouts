// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class igg extends kwm
{

    private static volatile igg d[];
    public Double a;
    public String b;
    public igi c[];

    public igg()
    {
        a = null;
        b = null;
        c = igi.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static igg[] a()
    {
        if (d == null)
        {
            synchronized (kwq.a)
            {
                if (d == null)
                {
                    d = new igg[0];
                }
            }
        }
        return d;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        a.doubleValue();
        int j = i + (kwk.f(1) + 8);
        i = j;
        if (b != null)
        {
            i = j + kwk.b(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    igi igi1 = c[j];
                    int k = i;
                    if (igi1 != null)
                    {
                        k = i + kwk.d(3, igi1);
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

            case 9: // '\t'
                a = Double.valueOf(kwj1.b());
                break;

            case 18: // '\022'
                b = kwj1.j();
                break;

            case 26: // '\032'
                int k = kwx.a(kwj1, 26);
                igi aigi[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                aigi = new igi[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, aigi, 0, j);
                    k = j;
                }
                for (; k < aigi.length - 1; k++)
                {
                    aigi[k] = new igi();
                    kwj1.a(aigi[k]);
                    kwj1.a();
                }

                aigi[k] = new igi();
                kwj1.a(aigi[k]);
                c = aigi;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        kwk1.a(1, a.doubleValue());
        if (b != null)
        {
            kwk1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                igi igi1 = c[i];
                if (igi1 != null)
                {
                    kwk1.b(3, igi1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
