// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lis extends kwm
{

    private static volatile lis d[];
    public String a;
    public lio b[];
    public lhc c;

    public lis()
    {
        a = null;
        b = lio.a();
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static lis[] a()
    {
        if (d == null)
        {
            synchronized (kwq.a)
            {
                if (d == null)
                {
                    d = new lis[0];
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
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    lio lio1 = b[j];
                    int k = i;
                    if (lio1 != null)
                    {
                        k = i + kwk.d(2, lio1);
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
            i = j + kwk.d(3, c);
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
                a = kwj1.j();
                break;

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                lio alio[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                alio = new lio[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, alio, 0, j);
                    k = j;
                }
                for (; k < alio.length - 1; k++)
                {
                    alio[k] = new lio();
                    kwj1.a(alio[k]);
                    kwj1.a();
                }

                alio[k] = new lio();
                kwj1.a(alio[k]);
                b = alio;
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new lhc();
                }
                kwj1.a(c);
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
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                lio lio1 = b[i];
                if (lio1 != null)
                {
                    kwk1.b(2, lio1);
                }
            }

        }
        if (c != null)
        {
            kwk1.b(3, c);
        }
        super.writeTo(kwk1);
    }
}
