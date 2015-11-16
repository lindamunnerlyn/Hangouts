// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iih extends kwm
{

    private static volatile iih c[];
    public iig a[];
    public iij b;

    public iih()
    {
        a = iig.a();
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static iih[] a()
    {
        if (c == null)
        {
            synchronized (kwq.a)
            {
                if (c == null)
                {
                    c = new iih[0];
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
                    iig iig1 = a[k];
                    j = i;
                    if (iig1 != null)
                    {
                        j = i + kwk.d(1, iig1);
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
                int k = kwx.a(kwj1, 10);
                iig aiig[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aiig = new iig[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aiig, 0, j);
                    k = j;
                }
                for (; k < aiig.length - 1; k++)
                {
                    aiig[k] = new iig();
                    kwj1.a(aiig[k]);
                    kwj1.a();
                }

                aiig[k] = new iig();
                kwj1.a(aiig[k]);
                a = aiig;
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new iij();
                }
                kwj1.a(b);
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
                iig iig1 = a[i];
                if (iig1 != null)
                {
                    kwk1.b(1, iig1);
                }
            }

        }
        if (b != null)
        {
            kwk1.b(2, b);
        }
        super.writeTo(kwk1);
    }
}
