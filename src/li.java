// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObserver;
import android.support.v4.view.ViewPager;

public final class li extends DataSetObserver
{

    final ViewPager a;

    public li(ViewPager viewpager)
    {
        a = viewpager;
        super();
    }

    public void onChanged()
    {
        a.d();
    }

    public void onInvalidated()
    {
        a.d();
    }
}
