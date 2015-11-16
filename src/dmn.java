// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class dmn
{

    public static final String a = dml.getName();
    private static dmm b;

    public static void a(Context context, hlp hlp1)
    {
        if (b == null)
        {
            b = new dmm();
        }
        hlp1.a(dml, b.a(context));
    }

}
