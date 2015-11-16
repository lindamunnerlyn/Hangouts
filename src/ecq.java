// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public final class ecq
    implements ListAdapter
{

    private ecp a;
    private LayoutInflater b;

    public ecq(LayoutInflater layoutinflater)
    {
        a = edr.a();
        b = layoutinflater;
    }

    public boolean areAllItemsEnabled()
    {
        return true;
    }

    public int getCount()
    {
        return a.a().size();
    }

    public Object getItem(int i)
    {
        Iterator iterator = a.a().entrySet().iterator();
        for (int j = 0; iterator.hasNext(); j++)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (i == j)
            {
                return entry;
            }
        }

        return null;
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = b.inflate(g.fE, viewgroup, false);
        }
        Object obj = (java.util.Map.Entry)getItem(i);
        if (obj != null)
        {
            TextView textview = (TextView)view1.findViewById(h.fY);
            TextView textview1 = (TextView)view1.findViewById(h.fZ);
            view = (TextView)view1.findViewById(h.ga);
            viewgroup = (TextView)view1.findViewById(h.gb);
            ImageView imageview = (ImageView)view1.findViewById(h.P);
            textview.setText((CharSequence)((java.util.Map.Entry) (obj)).getKey());
            i = ((eef)((java.util.Map.Entry) (obj)).getValue()).i();
            textview1.setText((new StringBuilder(21)).append("refcount: ").append(i).toString());
            obj = ((eef)((java.util.Map.Entry) (obj)).getValue()).f();
            i = ((Bitmap) (obj)).getWidth();
            int j = ((Bitmap) (obj)).getHeight();
            view.setText((new StringBuilder(23)).append(i).append("x").append(j).toString());
            viewgroup.setText(obj.toString());
            imageview.setImageDrawable(new BitmapDrawable(((Bitmap) (obj))));
        }
        return view1;
    }

    public int getViewTypeCount()
    {
        return 1;
    }

    public boolean hasStableIds()
    {
        return false;
    }

    public boolean isEmpty()
    {
        return getCount() != 0;
    }

    public boolean isEnabled(int i)
    {
        return true;
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
    }
}
