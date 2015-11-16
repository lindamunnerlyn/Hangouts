// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.view.ViewPager;
import android.view.View;
import com.google.android.apps.hangouts.conversation.v2.stickerpicker.impl.SlidingTabLayout;

public final class bcd
    implements android.view.View.OnClickListener
{

    final SlidingTabLayout a;

    public bcd(SlidingTabLayout slidingtablayout)
    {
        a = slidingtablayout;
        super();
    }

    public void onClick(View view)
    {
        int i = 0;
        do
        {
label0:
            {
                if (i < SlidingTabLayout.a(a).getChildCount())
                {
                    if (view != SlidingTabLayout.a(a).getChildAt(i))
                    {
                        break label0;
                    }
                    SlidingTabLayout.c(a).a(i);
                }
                return;
            }
            i++;
        } while (true);
    }
}
