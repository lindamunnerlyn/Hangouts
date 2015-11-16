// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;

public final class hdm extends IOException
{

    private final int a;
    private final String b = null;

    public hdm(int i, String s)
    {
        super((new StringBuilder(String.valueOf(null).length() + 13)).append(i).append(": ").append(null).toString());
        a = i;
    }

    public int a()
    {
        return a;
    }
}
