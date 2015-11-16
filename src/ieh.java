// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ieh extends kwm
{

    private static volatile ieh c[];
    public String a;
    public iei b[];

    public ieh()
    {
        a = null;
        b = iei.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ieh[] a()
    {
        if (c == null)
        {
            synchronized (kwq.a)
            {
                if (c == null)
                {
                    c = new ieh[0];
                }
            }
        }
        return c;
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
                    iei iei1 = b[j];
                    int k = i;
                    if (iei1 != null)
                    {
                        k = i + kwk.d(2, iei1);
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
                int k = kwx.a(kwj1, 18);
                iei aiei[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aiei = new iei[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aiei, 0, j);
                    k = j;
                }
                for (; k < aiei.length - 1; k++)
                {
                    aiei[k] = new iei();
                    kwj1.a(aiei[k]);
                    kwj1.a();
                }

                aiei[k] = new iei();
                kwj1.a(aiei[k]);
                b = aiei;
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
                iei iei1 = b[i];
                if (iei1 != null)
                {
                    kwk1.b(2, iei1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
