// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.concurrent.Executors;

public final class aly
{

    public static final String a = alw.getName();
    private static alx b;

    public static void a(Context context, hgx hgx1)
    {
        if (b == null)
        {
            b = new alx();
        }
        hgx1.a(alw, new alz("babel_", context, Executors.newSingleThreadExecutor()));
    }

}
