// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.widget.DrawerLayout;
import android.view.View;

public final class og extends hp
{

    final DrawerLayout b;

    public og(DrawerLayout drawerlayout)
    {
        b = drawerlayout;
        super();
    }

    public void a(View view, mq mq1)
    {
        super.a(view, mq1);
        if (!DrawerLayout.l(view))
        {
            mq1.c(null);
        }
    }
}
