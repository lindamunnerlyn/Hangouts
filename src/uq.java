// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

public final class uq extends PopupWindow
{

    private static final boolean a;
    private boolean b;

    public uq(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = vk.a(context, attributeset, ro.bh, i);
        if (context.g(ro.bj))
        {
            boolean flag = context.a(ro.bj, false);
            if (a)
            {
                b = flag;
            } else
            {
                ox.a(this, flag);
            }
        }
        setBackgroundDrawable(context.a(ro.bi));
        context.b();
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        context = android/widget/PopupWindow.getDeclaredField("mAnchor");
        context.setAccessible(true);
        attributeset = android/widget/PopupWindow.getDeclaredField("mOnScrollChangedListener");
        attributeset.setAccessible(true);
        attributeset.set(this, new ur(context, this, (android.view.ViewTreeObserver.OnScrollChangedListener)attributeset.get(this)));
        return;
        context;
    }

    public void showAsDropDown(View view, int i, int j)
    {
        int k = j;
        if (a)
        {
            k = j;
            if (b)
            {
                k = j - view.getHeight();
            }
        }
        super.showAsDropDown(view, i, k);
    }

    public void showAsDropDown(View view, int i, int j, int k)
    {
        int l = j;
        if (a)
        {
            l = j;
            if (b)
            {
                l = j - view.getHeight();
            }
        }
        super.showAsDropDown(view, i, l, k);
    }

    public void update(View view, int i, int j, int k, int l)
    {
        if (a && b)
        {
            j -= view.getHeight();
        }
        super.update(view, i, j, k, l);
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
