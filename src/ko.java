// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewConfiguration;

public final class ko
{

    static final ks a;

    public static int a(ViewConfiguration viewconfiguration)
    {
        return a.a(viewconfiguration);
    }

    public static boolean b(ViewConfiguration viewconfiguration)
    {
        return a.b(viewconfiguration);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new kr();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new kq();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            a = new kp();
        } else
        {
            a = new ks();
        }
    }
}
