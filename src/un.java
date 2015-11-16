// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObserver;
import android.support.v7.internal.widget.ActivityChooserView;

public final class un extends DataSetObserver
{

    final ActivityChooserView a;

    public un(ActivityChooserView activitychooserview)
    {
        a = activitychooserview;
        super();
    }

    public void onChanged()
    {
        super.onChanged();
        ActivityChooserView.c(a);
    }
}
