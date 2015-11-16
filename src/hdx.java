// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class hdx
{

    public static final String a = hdv.getName();
    private static hdw b;

    public static void a(Context context, hlp hlp1)
    {
        if (b == null)
        {
            b = new hdw();
        }
        hlp1.a(hdv, new hdv(context));
    }

}
