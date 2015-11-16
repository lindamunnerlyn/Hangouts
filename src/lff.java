// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class lff extends lfg
{

    private final int b;
    private final ldh c;

    public lff(lcz lcz, ldh ldh1, ldh ldh2)
    {
        super(lcz, ldh1);
        if (!ldh2.c())
        {
            throw new IllegalArgumentException("Range duration field must be precise");
        }
        b = (int)(ldh2.d() / super.a);
        if (b < 2)
        {
            throw new IllegalArgumentException("The effective range must be at least 2");
        } else
        {
            c = ldh2;
            return;
        }
    }

    public int a(long l)
    {
        if (l >= 0L)
        {
            return (int)((l / super.a) % (long)b);
        } else
        {
            return (b - 1) + (int)(((1L + l) / super.a) % (long)b);
        }
    }

    public long b(long l, int i)
    {
        h.a(this, i, g(), h());
        return (long)(i - a(l)) * a + l;
    }

    public ldh e()
    {
        return c;
    }

    public int h()
    {
        return b - 1;
    }
}
