// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import android.support.v4.view.ViewPager;
import com.google.android.apps.hangouts.conversation.v2.stickerpicker.impl.SlidingTabLayout;

final class bdu extends AsyncTask
{

    final int a;
    final ad b;
    final bds c;

    bdu(bds bds1, int i, ad ad1)
    {
        c = bds1;
        a = i;
        b = ad1;
        super();
    }

    public Object doInBackground(Object aobj[])
    {
        c.a(a);
        return null;
    }

    public void onPostExecute(Object obj)
    {
        bds.a(c, new bdv(c, b.getChildFragmentManager(), b));
        bds.c(c).a(bds.b(c));
        bds.a(c).a(bds.c(c));
        bds.c(c).a(bds.b(c).a, false);
        bds.b(c).f();
        bds.c(c).setVisibility(0);
        bds.a(c).setVisibility(0);
    }
}
