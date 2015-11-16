// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class izz extends kwm
{

    private static volatile izz c[];
    public iyy a;
    public iyx b[];

    public izz()
    {
        a = null;
        b = iyx.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static izz[] a()
    {
        if (c == null)
        {
            synchronized (kwq.a)
            {
                if (c == null)
                {
                    c = new izz[0];
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
                    iyx iyx1 = b[j];
                    int k = i;
                    if (iyx1 != null)
                    {
                        k = i + kwk.d(2, iyx1);
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
                if (a == null)
                {
                    a = new iyy();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                iyx aiyx[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aiyx = new iyx[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, aiyx, 0, j);
                    k = j;
                }
                for (; k < aiyx.length - 1; k++)
                {
                    aiyx[k] = new iyx();
                    kwj1.a(aiyx[k]);
                    kwj1.a();
                }

                aiyx[k] = new iyx();
                kwj1.a(aiyx[k]);
                b = aiyx;
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
                iyx iyx1 = b[i];
                if (iyx1 != null)
                {
                    kwk1.b(2, iyx1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
