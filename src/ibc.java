// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ibc extends koj
{

    private static volatile ibc d[];
    public Double a;
    public String b;
    public ibe c[];

    public ibc()
    {
        a = null;
        b = null;
        c = ibe.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ibc[] a()
    {
        if (d == null)
        {
            synchronized (kon.a)
            {
                if (d == null)
                {
                    d = new ibc[0];
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
                    ibe ibe1 = c[j];
                    int k = i;
                    if (ibe1 != null)
                    {
                        k = i + koh.d(3, ibe1);
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
                ibe aibe[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                aibe = new ibe[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, aibe, 0, j);
                    k = j;
                }
                for (; k < aibe.length - 1; k++)
                {
                    aibe[k] = new ibe();
                    kog1.a(aibe[k]);
                    kog1.a();
                }

                aibe[k] = new ibe();
                kog1.a(aibe[k]);
                c = aibe;
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
                ibe ibe1 = c[i];
                if (ibe1 != null)
                {
                    koh1.b(3, ibe1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
