// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.TextView;
import com.google.android.apps.hangouts.phone.DebugBitmapsActivity;

public final class cmy
    implements ExpandableListAdapter
{

    final DebugBitmapsActivity a;
    private ecq b;
    private ecv c;
    private cmz d;

    public cmy(DebugBitmapsActivity debugbitmapsactivity)
    {
        a = debugbitmapsactivity;
        super();
        b = new ecq(debugbitmapsactivity.getLayoutInflater());
        try
        {
            c = new ecv(debugbitmapsactivity.getLayoutInflater());
        }
        catch (IllegalStateException illegalstateexception) { }
        d = new cmz(debugbitmapsactivity);
    }

    public boolean areAllItemsEnabled()
    {
        return true;
    }

    public Object getChild(int i, int j)
    {
        i;
        JVM INSTR tableswitch 0 2: default 28
    //                   0 30
    //                   1 39
    //                   2 55;
           goto _L1 _L2 _L3 _L4
_L1:
        return null;
_L2:
        return b.getItem(j);
_L3:
        if (c != null)
        {
            return c.getItem(j);
        }
          goto _L1
_L4:
        return d.getItem(j);
    }

    public long getChildId(int i, int j)
    {
        return (long)j;
    }

    public View getChildView(int i, int j, boolean flag, View view, ViewGroup viewgroup)
    {
        i;
        JVM INSTR tableswitch 0 2: default 28
    //                   0 30
    //                   1 43
    //                   2 63;
           goto _L1 _L2 _L3 _L4
_L1:
        return null;
_L2:
        return b.getView(j, view, viewgroup);
_L3:
        if (c != null)
        {
            return c.getView(j, view, viewgroup);
        }
          goto _L1
_L4:
        return d.getView(j, view, viewgroup);
    }

    public int getChildrenCount(int i)
    {
        i;
        JVM INSTR tableswitch 0 2: default 28
    //                   0 30
    //                   1 38
    //                   2 53;
           goto _L1 _L2 _L3 _L4
_L1:
        return 0;
_L2:
        return b.getCount();
_L3:
        if (c != null)
        {
            return c.getCount();
        }
          goto _L1
_L4:
        return d.getCount();
    }

    public long getCombinedChildId(long l, long l1)
    {
        return 1000L * l + l1;
    }

    public long getCombinedGroupId(long l)
    {
        return l;
    }

    public Object getGroup(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return b;

        case 1: // '\001'
            return c;

        case 2: // '\002'
            return d;
        }
    }

    public int getGroupCount()
    {
        return 3;
    }

    public long getGroupId(int i)
    {
        return (long)i;
    }

    public View getGroupView(int i, boolean flag, View view, ViewGroup viewgroup)
    {
        viewgroup = (TextView)view;
        view = viewgroup;
        if (viewgroup == null)
        {
            view = new TextView(a);
            view.setTextSize(2, 36F);
        }
        switch (i)
        {
        default:
            return view;

        case 0: // '\0'
            view.setText("   Cached Bitmaps");
            return view;

        case 1: // '\001'
            view.setText("   Pooled Bitmaps");
            return view;

        case 2: // '\002'
            view.setText("   Default Bitmaps");
            break;
        }
        return view;
    }

    public boolean hasStableIds()
    {
        return false;
    }

    public boolean isChildSelectable(int i, int j)
    {
        return true;
    }

    public boolean isEmpty()
    {
        return false;
    }

    public void onGroupCollapsed(int i)
    {
    }

    public void onGroupExpanded(int i)
    {
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
    }
}
