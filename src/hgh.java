// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

public final class hgh
{

    private final int a = 26;
    private final int b = -1;
    private String c;

    public hgh(String s)
    {
        c = s;
    }

    public String toString()
    {
        return String.format(Locale.US, "GmsFailureEvent gmsApi=%d, statusCode=%d", new Object[] {
            Integer.valueOf(a), Integer.valueOf(b)
        });
    }
}
