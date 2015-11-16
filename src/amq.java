// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.concurrent.Executors;

public final class amq
{

    public static final String a = amo.getName();
    private static amp b;

    public static void a(Context context, hlp hlp1)
    {
        if (b == null)
        {
            b = new amp();
        }
        hlp1.a(amo, new amr("babel_", context, Executors.newSingleThreadExecutor()));
    }

}
