// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

final class ti extends FrameLayout
    implements vv
{

    final CollapsibleActionView a;

    ti(View view)
    {
        super(view.getContext());
        a = (CollapsibleActionView)view;
        addView(view);
    }

    public void a()
    {
        a.onActionViewExpanded();
    }

    public void b()
    {
        a.onActionViewCollapsed();
    }

    View c()
    {
        return (View)a;
    }
}
