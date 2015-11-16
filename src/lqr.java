// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lqr
{

    final lnn a;
    final Integer b;
    final lqq c[];
    final int d;
    final lqp e;

    lqr(lqp lqp1)
    {
        e = lqp1;
        super();
        a = lqp1.a;
        b = lqp1.b;
        c = lqp1.c;
        d = lqp1.d;
    }

    boolean a(lqp lqp1)
    {
        if (lqp1 != e)
        {
            return false;
        }
        lqp1.a = a;
        lqp1.b = b;
        lqp1.c = c;
        if (d < lqp1.d)
        {
            lqp1.e = true;
        }
        lqp1.d = d;
        return true;
    }
}
