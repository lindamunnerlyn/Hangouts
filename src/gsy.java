// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import com.google.android.libraries.social.actionbar.ActionBarSpinner;

public final class gsy
    implements SpinnerAdapter
{

    final SpinnerAdapter a;
    final ActionBarSpinner b;
    private int c;

    public gsy(ActionBarSpinner actionbarspinner, SpinnerAdapter spinneradapter)
    {
        b = actionbarspinner;
        super();
        c = -1;
        a = spinneradapter;
    }

    public void a()
    {
        c = -1;
    }

    public void a(int i)
    {
        c = i;
    }

    public int getCount()
    {
        return a.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        return a.getDropDownView(i, view, viewgroup);
    }

    public Object getItem(int i)
    {
        if (c != -1)
        {
            i = c;
        }
        return a.getItem(i);
    }

    public long getItemId(int i)
    {
        if (c != -1)
        {
            i = c;
        }
        return a.getItemId(i);
    }

    public int getItemViewType(int i)
    {
        if (c != -1)
        {
            i = c;
        }
        return a.getItemViewType(i);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (c != -1)
        {
            i = c;
        }
        return a.getView(i, view, viewgroup);
    }

    public int getViewTypeCount()
    {
        return a.getViewTypeCount();
    }

    public boolean hasStableIds()
    {
        return a.hasStableIds();
    }

    public boolean isEmpty()
    {
        return a.isEmpty();
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        a.registerDataSetObserver(datasetobserver);
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        a.unregisterDataSetObserver(datasetobserver);
    }
}
