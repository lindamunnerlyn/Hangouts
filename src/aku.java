// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public final class aku
{

    public final long a;
    public final byte b[];
    final ajl c;

    public aku(ajl ajl, long l, String s, jmk jmk1)
    {
        c = ajl;
        super();
        g.d(jmk1.a.a.equals(s), "CallerIdPhone number does not match token data");
        b = kws.toByteArray(jmk1);
        a = (TimeUnit.MICROSECONDS.toMillis(g.a(jmk1.c, 0L)) + l) - ajs.a;
    }
}
