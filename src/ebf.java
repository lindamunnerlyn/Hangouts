// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

final class ebf extends dgp
{

    final ebe a;

    ebf(ebe ebe1)
    {
        a = ebe1;
        super();
    }

    public void a(ani ani1, String s, cey cey1, String s1, long l, boolean flag)
    {
        l = TimeUnit.MICROSECONDS.toMillis(l);
        a.a(ani1.h(), cey1.a, csz.f, Long.valueOf(l));
    }
}
