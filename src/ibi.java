// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ibi extends koj
{

    private static volatile ibi d[];
    public Double a;
    public String b;
    public ibk c[];

    public ibi()
    {
        a = null;
        b = null;
        c = ibk.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ibi[] a()
    {
        if (d == null)
        {
            synchronized (kon.a)
            {
                if (d == null)
                {
                    d = new ibi[0];
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
        int j = i + (koh.f(1) + 8);
        i = j;
        if (b != null)
        {
            i = j + koh.b(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    ibk ibk1 = c[j];
                    int k = i;
                    if (ibk1 != null)
                    {
                        k = i + koh.d(3, ibk1);
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

            case 9: // '\t'
                a = Double.valueOf(kog1.b());
                break;

            case 18: // '\022'
                b = kog1.j();
                break;

            case 26: // '\032'
                int k = kou.b(kog1, 26);
                ibk aibk[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                aibk = new ibk[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, aibk, 0, j);
                    k = j;
                }
                for (; k < aibk.length - 1; k++)
                {
                    aibk[k] = new ibk();
                    kog1.a(aibk[k]);
                    kog1.a();
                }

                aibk[k] = new ibk();
                kog1.a(aibk[k]);
                c = aibk;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        koh1.a(1, a.doubleValue());
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                ibk ibk1 = c[i];
                if (ibk1 != null)
                {
                    koh1.b(3, ibk1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
