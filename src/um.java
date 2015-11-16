// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObserver;
import android.support.v7.internal.widget.ActivityChooserView;

public final class um extends DataSetObserver
{

    final ActivityChooserView a;

    public um(ActivityChooserView activitychooserview)
    {
        a = activitychooserview;
        super();
    }

    public void onChanged()
    {
        super.onChanged();
        a.a.notifyDataSetChanged();
    }

    public void onInvalidated()
    {
        super.onInvalidated();
        a.a.notifyDataSetInvalidated();
    }
}
