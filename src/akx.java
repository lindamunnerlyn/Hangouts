// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public final class akx
{

    public final long a;
    public final byte b[];
    final ajo c;

    public akx(ajo ajo, long l, String s, jfu jfu1)
    {
        c = ajo;
        super();
        g.b(jfu1.a.a.equals(s), "CallerIdPhone number does not match token data");
        b = kop.toByteArray(jfu1);
        a = (TimeUnit.MICROSECONDS.toMillis(g.a(jfu1.c, 0L)) + l) - ajv.a;
    }
}
