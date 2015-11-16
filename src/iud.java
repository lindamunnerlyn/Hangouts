// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iud extends kwm
{

    private static volatile iud c[];
    public String a;
    public int b[];

    public iud()
    {
        a = null;
        b = kwx.a;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static iud[] a()
    {
        if (c == null)
        {
            synchronized (kwq.a)
            {
                if (c == null)
                {
                    c = new iud[0];
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
            i = j + kwk.b(62, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                j = i + b.length * 4 + b.length * 2;
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

            case 498: 
                a = kwj1.j();
                break;

            case 509: 
                int l = kwx.a(kwj1, 509);
                int ai[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ai = new int[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, ai, 0, j);
                    l = j;
                }
                for (; l < ai.length - 1; l++)
                {
                    ai[l] = kwj1.h();
                    kwj1.a();
                }

                ai[l] = kwj1.h();
                b = ai;
                break;

            case 506: 
                int k = kwj1.p();
                int j1 = kwj1.c(k);
                int i1 = k / 4;
                int ai1[];
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                ai1 = new int[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, ai1, 0, k);
                    i1 = k;
                }
                for (; i1 < ai1.length; i1++)
                {
                    ai1[i1] = kwj1.h();
                }

                b = ai1;
                kwj1.d(j1);
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(62, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                kwk1.b(63, b[i]);
            }

        }
        super.writeTo(kwk1);
    }
}
