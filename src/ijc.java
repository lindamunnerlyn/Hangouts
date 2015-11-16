// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ijc extends kwm
{

    private static volatile ijc c[];
    public ijg a[];
    public Integer b;

    public ijc()
    {
        a = ijg.a();
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ijc[] a()
    {
        if (c == null)
        {
            synchronized (kwq.a)
            {
                if (c == null)
                {
                    c = new ijc[0];
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
                    ijg ijg1 = a[k];
                    j = i;
                    if (ijg1 != null)
                    {
                        j = i + kwk.d(1, ijg1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.e(2, b.intValue());
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
                ijg aijg[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aijg = new ijg[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aijg, 0, j);
                    k = j;
                }
                for (; k < aijg.length - 1; k++)
                {
                    aijg[k] = new ijg();
                    kwj1.a(aijg[k]);
                    kwj1.a();
                }

                aijg[k] = new ijg();
                kwj1.a(aijg[k]);
                a = aijg;
                break;

            case 16: // '\020'
                b = Integer.valueOf(kwj1.f());
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
                ijg ijg1 = a[i];
                if (ijg1 != null)
                {
                    kwk1.b(1, ijg1);
                }
            }

        }
        if (b != null)
        {
            kwk1.a(2, b.intValue());
        }
        super.writeTo(kwk1);
    }
}
