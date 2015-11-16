// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

public final class dzv
{

    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public long g;

    public dzv()
    {
    }

    public String toString()
    {
        return String.format(Locale.US, "cell signal: %d%%, wifi signal: %d%%, wifi signal handoff: %d%%, wifi link speed: %dMbps, wifi link speed handoff: %dMbps", new Object[] {
            Integer.valueOf(a), Integer.valueOf(b), Integer.valueOf(c), Integer.valueOf(d), Integer.valueOf(e)
        });
    }
}
