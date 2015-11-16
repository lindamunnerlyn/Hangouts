// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.internal.widget.ActivityChooserView;
import android.view.View;

public final class uo extends yg
{

    final ActivityChooserView a;

    public uo(ActivityChooserView activitychooserview, View view)
    {
        a = activitychooserview;
        super(view);
    }

    public yc a()
    {
        return a.d();
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
