// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewParent;

final class yh
    implements Runnable
{

    final yg a;

    yh(yg yg1)
    {
        a = yg1;
        super();
    }

    public void run()
    {
        a.c.getParent().requestDisallowInterceptTouchEvent(true);
    }
}
