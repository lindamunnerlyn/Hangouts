// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iiu extends kwm
{

    private static volatile iiu c[];
    public iit a[];
    public iiw b;

    public iiu()
    {
        a = iit.a();
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static iiu[] a()
    {
        if (c == null)
        {
            synchronized (kwq.a)
            {
                if (c == null)
                {
                    c = new iiu[0];
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
                    iit iit1 = a[k];
                    j = i;
                    if (iit1 != null)
                    {
                        j = i + kwk.d(1, iit1);
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
                iit aiit[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aiit = new iit[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aiit, 0, j);
                    k = j;
                }
                for (; k < aiit.length - 1; k++)
                {
                    aiit[k] = new iit();
                    kwj1.a(aiit[k]);
                    kwj1.a();
                }

                aiit[k] = new iit();
                kwj1.a(aiit[k]);
                a = aiit;
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new iiw();
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
                iit iit1 = a[i];
                if (iit1 != null)
                {
                    kwk1.b(1, iit1);
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
