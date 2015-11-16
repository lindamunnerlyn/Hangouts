// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

public final class hky
{

    public final String a;
    public final String b;
    public final int c;
    public final int d = 1;
    public final int e;

    public hky(String s, String s1, int i, int j, int k)
    {
        a = s;
        b = s1;
        c = i;
        e = k;
    }

    public String toString()
    {
        return String.format(Locale.US, "DatabaseUpgradeFailureEvent: partitionName=%s, oldVersion=%d, newVersion=%d, failureVersion=%d", new Object[] {
            b, Integer.valueOf(c), Integer.valueOf(d), Integer.valueOf(e)
        });
    }
}
