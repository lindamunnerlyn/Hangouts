// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.database.DataSetObserver;
import android.support.v7.internal.widget.ActivityChooserView;
import android.widget.FrameLayout;
import android.widget.ImageView;

public final class up extends DataSetObserver
{

    final ActivityChooserView a;

    public up(ActivityChooserView activitychooserview)
    {
        a = activitychooserview;
        super();
    }

    public void onChanged()
    {
        super.onChanged();
        ActivityChooserView activitychooserview = a;
        int i;
        int j;
        if (activitychooserview.a.getCount() > 0)
        {
            activitychooserview.d.setEnabled(true);
        } else
        {
            activitychooserview.d.setEnabled(false);
        }
        i = activitychooserview.a.c();
        j = activitychooserview.a.d();
        if (i == 1 || i > 1 && j > 0)
        {
            activitychooserview.e.setVisibility(0);
            Object obj = activitychooserview.a.b();
            android.content.pm.PackageManager packagemanager = activitychooserview.getContext().getPackageManager();
            activitychooserview.f.setImageDrawable(((ResolveInfo) (obj)).loadIcon(packagemanager));
            if (activitychooserview.l != 0)
            {
                obj = ((ResolveInfo) (obj)).loadLabel(packagemanager);
                obj = activitychooserview.getContext().getString(activitychooserview.l, new Object[] {
                    obj
                });
                activitychooserview.e.setContentDescription(((CharSequence) (obj)));
            }
        } else
        {
            activitychooserview.e.setVisibility(8);
        }
        if (activitychooserview.e.getVisibility() == 0)
        {
            activitychooserview.b.setBackgroundDrawable(activitychooserview.c);
            return;
        } else
        {
            activitychooserview.b.setBackgroundDrawable(null);
            return;
        }
    }
}
