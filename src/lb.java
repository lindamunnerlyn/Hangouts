// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.view.ViewPager;

public final class lb
    implements Runnable
{

    final ViewPager a;

    public lb(ViewPager viewpager)
    {
        a = viewpager;
        super();
    }

    public void run()
    {
        ViewPager.a(a);
        a.e();
    }
}
