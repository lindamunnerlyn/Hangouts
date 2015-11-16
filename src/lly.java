// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.chromium.base.CommandLine;

public final class lly
{

    private static final llw a;

    public static llw a()
    {
        return a;
    }

    static 
    {
        Object obj;
        if (CommandLine.c().a())
        {
            obj = new llx();
        } else
        {
            obj = new llw((byte)0);
        }
        a = ((llw) (obj));
    }
}
