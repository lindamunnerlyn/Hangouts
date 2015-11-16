// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

public final class dzr
    implements ListAdapter
{

    private dzp a;
    private LayoutInflater b;

    public dzr(LayoutInflater layoutinflater)
    {
        dzn dzn = ean.a().b();
        if (dzn instanceof dzp)
        {
            a = (dzp)dzn;
            b = layoutinflater;
            return;
        } else
        {
            throw new IllegalStateException("Can't make an ICS adapter when lower than ICS");
        }
    }

    public boolean areAllItemsEnabled()
    {
        return true;
    }

    public int getCount()
    {
        int i = 0;
        int j = 0;
        for (; i < a.b().size(); i++)
        {
            int k = a.b().keyAt(i);
            j += ((dzq)a.b().get(k)).a;
        }

        return j;
    }

    public Object getItem(int i)
    {
        SparseArray sparsearray = a.b();
        int j = 0;
        int k = 0;
        for (; j < sparsearray.size(); j++)
        {
            dzq dzq1 = (dzq)sparsearray.get(sparsearray.keyAt(j));
            if (dzq1.a + k > i)
            {
                return dzq1.b[i - k];
            }
            k++;
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
            view1 = b.inflate(g.fG, viewgroup, false);
        }
        view = (Bitmap)getItem(i);
        if (view != null)
        {
            viewgroup = (TextView)view1.findViewById(h.gq);
            TextView textview = (TextView)view1.findViewById(h.gr);
            TextView textview1 = (TextView)view1.findViewById(h.gs);
            TextView textview2 = (TextView)view1.findViewById(h.gt);
            ImageView imageview = (ImageView)view1.findViewById(h.P);
            viewgroup.setText("");
            textview.setText("");
            i = view.getWidth();
            int j = view.getHeight();
            textview1.setText((new StringBuilder(23)).append(i).append("x").append(j).toString());
            textview2.setText(view.toString());
            imageview.setImageDrawable(new BitmapDrawable(view));
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
