// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.KeyEvent;

public final class il
{

    static final io a;

    public static boolean a(KeyEvent keyevent)
    {
        return a.a(keyevent.getMetaState(), 1);
    }

    public static boolean b(KeyEvent keyevent)
    {
        return a.b(keyevent.getMetaState());
    }

    public static void c(KeyEvent keyevent)
    {
        a.a(keyevent);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new in();
        } else
        {
            a = new io();
        }
    }
}
