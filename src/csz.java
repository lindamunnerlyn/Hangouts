// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

final class csz extends dhy
{

    final csy a;

    csz(csy csy1)
    {
        a = csy1;
        super();
    }

    public void a(aoa aoa1, String s, cgd cgd1, String s1, long l, boolean flag)
    {
        l = TimeUnit.MICROSECONDS.toMillis(l);
        a.a(aoa1.h(), cgd1.a, cvc.f, Long.valueOf(l));
    }
}
