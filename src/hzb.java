// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hzb extends koj
{

    private static volatile hzb c[];
    public String a;
    public hzc b[];

    public hzb()
    {
        a = null;
        b = hzc.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static hzb[] a()
    {
        if (c == null)
        {
            synchronized (kon.a)
            {
                if (c == null)
                {
                    c = new hzb[0];
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
            i = j + koh.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    hzc hzc1 = b[j];
                    int k = i;
                    if (hzc1 != null)
                    {
                        k = i + koh.d(2, hzc1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int i = kog1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(kog1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                a = kog1.j();
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                hzc ahzc[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ahzc = new hzc[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, ahzc, 0, j);
                    k = j;
                }
                for (; k < ahzc.length - 1; k++)
                {
                    ahzc[k] = new hzc();
                    kog1.a(ahzc[k]);
                    kog1.a();
                }

                ahzc[k] = new hzc();
                kog1.a(ahzc[k]);
                b = ahzc;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                hzc hzc1 = b[i];
                if (hzc1 != null)
                {
                    koh1.b(2, hzc1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
