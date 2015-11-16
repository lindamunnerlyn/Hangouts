// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gac
{

    public static final String a = fzs.getName();
    public static final String b = fzu.getName();
    private static gab c;

    public static void a(Context context, hlp hlp1)
    {
        if (c == null)
        {
            c = new gab();
        }
        hlp1.a(fzu, new gaa(context));
    }

    public static void a(hlp hlp1)
    {
        if (c == null)
        {
            c = new gab();
        }
        hlp1.a(fzs, new fzz());
    }

}
