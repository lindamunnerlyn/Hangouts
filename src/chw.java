// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.peoplelistv2.impl.ScrollViewCustom;

public final class chw
    implements Runnable
{

    final ScrollViewCustom a;

    public chw(ScrollViewCustom scrollviewcustom)
    {
        a = scrollviewcustom;
        super();
    }

    public void run()
    {
        int i = a.getChildAt(0).getMeasuredHeight();
        int j = ScrollViewCustom.b(a);
        a.smoothScrollTo(0, Math.max(0, i - j));
        a.getChildAt(a.getChildCount() - 1).requestFocus();
    }
}
