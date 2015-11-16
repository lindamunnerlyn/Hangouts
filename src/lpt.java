// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lpt extends lpj
{

    private static final long serialVersionUID = 0xd384bef1064f7503L;
    private final int b = 100;

    public lpt(lnr lnr1, lns lns, int i)
    {
        super(lnr1, lns);
    }

    public long a(long l, int i)
    {
        long l1 = i;
        long l2 = b;
        return super.a.a(l, l1 * l2);
    }

    public long a(long l, long l1)
    {
        int i;
        long l2;
        i = b;
        l2 = l1;
        i;
        JVM INSTR tableswitch -1 1: default 36
    //                   -1 93
    //                   0 155
    //                   1 144;
           goto _L1 _L2 _L3 _L4
_L4:
        break; /* Loop/switch isn't completed */
_L1:
        l2 = (long)i * l1;
        if (l2 / (long)i != l1)
        {
            throw new ArithmeticException((new StringBuilder(67)).append("Multiplication overflows a long: ").append(l1).append(" * ").append(i).toString());
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (l1 == 0x8000000000000000L)
        {
            throw new ArithmeticException((new StringBuilder(67)).append("Multiplication overflows a long: ").append(l1).append(" * ").append(i).toString());
        }
        l2 = -l1;
_L6:
        return super.a.a(l, l2);
_L3:
        l2 = 0L;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public long d()
    {
        return super.a.d() * (long)b;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof lpt)
            {
                if (!super.a.equals(((lpj) (obj = (lpt)obj)).a) || super.d != ((lph) (obj)).d || b != ((lpt) (obj)).b)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        long l = b;
        return (int)(l ^ l >>> 32) + super.d.hashCode() + super.a.hashCode();
    }
}
