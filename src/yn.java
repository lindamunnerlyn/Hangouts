// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.PopupWindow;

final class yn
    implements Runnable
{

    final yc a;

    yn(yc yc1)
    {
        a = yc1;
        super();
    }

    public void run()
    {
        if (yc.a(a) != null && yc.a(a).getCount() > yc.a(a).getChildCount() && yc.a(a).getChildCount() <= a.b)
        {
            yc.b(a).setInputMethodMode(2);
            a.c();
        }
    }
}
