// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import sy;
import ta;
import tc;
import tp;
import vk;

public final class ExpandedMenuView extends ListView
    implements android.widget.AdapterView.OnItemClickListener, ta, tp
{

    private static final int a[] = {
        0x10100d4, 0x1010129
    };
    private sy b;

    public ExpandedMenuView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x1010074);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset);
        setOnItemClickListener(this);
        context = vk.a(context, attributeset, a, i);
        if (context.g(0))
        {
            setBackgroundDrawable(context.a(0));
        }
        if (context.g(1))
        {
            setDivider(context.a(1));
        }
        context.b();
    }

    public void a(sy sy1)
    {
        b = sy1;
    }

    public boolean a(tc tc1)
    {
        return b.a(tc1, 0);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a((tc)getAdapter().getItem(i));
    }

}
