// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewParent;

final class yf
    implements Runnable
{

    final ye a;

    yf(ye ye1)
    {
        a = ye1;
        super();
    }

    public void run()
    {
        ye.a(a).getParent().requestDisallowInterceptTouchEvent(true);
    }
}
