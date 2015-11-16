// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lfh extends lex
{

    private static final long serialVersionUID = 0x8c2c82ce195505fbL;
    private final long a;

    public lfh(ldi ldi, long l)
    {
        super(ldi);
        a = l;
    }

    public long a(long l, int i)
    {
        return h.a(l, (long)i * a);
    }

    public long a(long l, long l1)
    {
        long l2 = a;
        if (l2 != 1L)
        {
            if (l1 == 1L)
            {
                l1 = l2;
            } else
            if (l1 == 0L || l2 == 0L)
            {
                l1 = 0L;
            } else
            {
                long l3 = l1 * l2;
                if (l3 / l2 != l1 || l1 == 0x8000000000000000L && l2 == -1L || l2 == 0x8000000000000000L && l1 == -1L)
                {
                    throw new ArithmeticException((new StringBuilder(76)).append("Multiplication overflows a long: ").append(l1).append(" * ").append(l2).toString());
                }
                l1 = l3;
            }
        }
        return h.a(l, l1);
    }

    public final boolean c()
    {
        return true;
    }

    public final long d()
    {
        return a;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof lfh)
            {
                if (super.d != ((lex) (obj = (lfh)obj)).d || a != ((lfh) (obj)).a)
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
        long l = a;
        return (int)(l ^ l >>> 32) + super.d.hashCode();
    }
}
