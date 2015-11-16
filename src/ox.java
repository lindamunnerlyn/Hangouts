// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.PopupWindow;

public final class ox
{

    static final pc a;

    public static void a(PopupWindow popupwindow)
    {
        a.a(popupwindow, 2);
    }

    public static void a(PopupWindow popupwindow, View view, int i, int j, int k)
    {
        a.a(popupwindow, view, i, j, k);
    }

    public static void a(PopupWindow popupwindow, boolean flag)
    {
        a.a(popupwindow, flag);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 23)
        {
            a = new oz();
        } else
        if (i >= 21)
        {
            a = new oy();
        } else
        if (i >= 19)
        {
            a = new pb();
        } else
        if (i >= 9)
        {
            a = new pa();
        } else
        {
            a = new pc();
        }
    }
}
