// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.util.List;

public class ehs extends ViewPager
{

    private boolean a;
    private eht b;

    public ehs(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = true;
        b(2);
        b = new eht();
        super.a(b);
    }

    public final void a(lg lg)
    {
        throw new UnsupportedOperationException("This method has been disabled, please use addOnPageChangeListener instead");
    }

    public void b(lg lg)
    {
        b.a.add(lg);
    }

    public void b(boolean flag)
    {
        a = flag;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return a && super.onInterceptTouchEvent(motionevent);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return a && super.onTouchEvent(motionevent);
    }
}
