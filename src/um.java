// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.internal.widget.ActivityChooserView;
import android.view.View;

public final class um extends ye
{

    final ActivityChooserView a;

    public um(ActivityChooserView activitychooserview, View view)
    {
        a = activitychooserview;
        super(view);
    }

    public ya a()
    {
        return ActivityChooserView.b(a);
    }

    protected boolean b()
    {
        a.a();
        return true;
    }

    protected boolean c()
    {
        a.b();
        return true;
    }
}
