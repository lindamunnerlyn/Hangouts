// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import android.support.v4.view.ViewPager;
import com.google.android.apps.hangouts.conversation.v2.stickerpicker.impl.SlidingTabLayout;

final class bde extends AsyncTask
{

    final int a;
    final ad b;
    final bdc c;

    bde(bdc bdc1, int i, ad ad1)
    {
        c = bdc1;
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
        bdc.a(c, new bdf(c, b.getChildFragmentManager(), b));
        bdc.c(c).a(bdc.b(c));
        bdc.a(c).a(bdc.c(c));
        bdc.c(c).a(bdc.b(c).a, false);
        bdc.b(c).f();
        bdc.c(c).setVisibility(0);
        bdc.a(c).setVisibility(0);
    }
}
