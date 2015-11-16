// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ExpandableListView;
import com.google.android.apps.hangouts.phone.ViewVCardActivity;

public final class cpm
    implements android.widget.ExpandableListView.OnChildClickListener
{

    final ViewVCardActivity a;

    public cpm(ViewVCardActivity viewvcardactivity)
    {
        a = viewvcardactivity;
        super();
    }

    public boolean onChildClick(ExpandableListView expandablelistview, View view, int i, int j, long l)
    {
        return !ViewVCardActivity.a(a);
    }
}
