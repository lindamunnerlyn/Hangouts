// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class igm extends kwm
{

    private static volatile igm d[];
    public Double a;
    public String b;
    public igo c[];

    public igm()
    {
        a = null;
        b = null;
        c = igo.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static igm[] a()
    {
        if (d == null)
        {
            synchronized (kwq.a)
            {
                if (d == null)
                {
                    d = new igm[0];
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
                    igo igo1 = c[j];
                    int k = i;
                    if (igo1 != null)
                    {
                        k = i + kwk.d(3, igo1);
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
                igo aigo[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                aigo = new igo[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, aigo, 0, j);
                    k = j;
                }
                for (; k < aigo.length - 1; k++)
                {
                    aigo[k] = new igo();
                    kwj1.a(aigo[k]);
                    kwj1.a();
                }

                aigo[k] = new igo();
                kwj1.a(aigo[k]);
                c = aigo;
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
                igo igo1 = c[i];
                if (igo1 != null)
                {
                    kwk1.b(3, igo1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
