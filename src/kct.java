// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kct extends kwm
{

    private static volatile kct c[];
    public kcj a;
    public kcu b[];

    public kct()
    {
        a = null;
        b = kcu.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kct[] a()
    {
        if (c == null)
        {
            synchronized (kwq.a)
            {
                if (c == null)
                {
                    c = new kct[0];
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
                    kcu kcu1 = b[j];
                    int k = i;
                    if (kcu1 != null)
                    {
                        k = i + kwk.d(2, kcu1);
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
                    a = new kcj();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                kcu akcu[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                akcu = new kcu[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, akcu, 0, j);
                    k = j;
                }
                for (; k < akcu.length - 1; k++)
                {
                    akcu[k] = new kcu();
                    kwj1.a(akcu[k]);
                    kwj1.a();
                }

                akcu[k] = new kcu();
                kwj1.a(akcu[k]);
                b = akcu;
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
                kcu kcu1 = b[i];
                if (kcu1 != null)
                {
                    kwk1.b(2, kcu1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
