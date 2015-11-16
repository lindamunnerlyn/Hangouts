// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class acn
{

    int a;
    int b;
    final ack c;

    acn(ack ack1)
    {
        c = ack1;
        super();
    }

    int a()
    {
        if (b != ack.a(c).a)
        {
            throw new RuntimeException("BUG: Invalid call to getLength()");
        } else
        {
            return c.b - a;
        }
    }
}
