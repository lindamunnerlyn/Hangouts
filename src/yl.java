// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.PopupWindow;

final class yl
    implements Runnable
{

    final ya a;

    yl(ya ya1)
    {
        a = ya1;
        super();
    }

    public void run()
    {
        if (ya.a(a) != null && ya.a(a).getCount() > ya.a(a).getChildCount() && ya.a(a).getChildCount() <= a.b)
        {
            ya.b(a).setInputMethodMode(2);
            a.c();
        }
    }
}
