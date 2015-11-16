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

public final class ecv
    implements ListAdapter
{

    private ect a;
    private LayoutInflater b;

    public ecv(LayoutInflater layoutinflater)
    {
        ecr ecr = edr.a().b();
        if (ecr instanceof ect)
        {
            a = (ect)ecr;
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
            j += ((ecu)a.b().get(k)).a;
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
            ecu ecu1 = (ecu)sparsearray.get(sparsearray.keyAt(j));
            if (ecu1.a + k > i)
            {
                return ecu1.b[i - k];
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
            view1 = b.inflate(g.fE, viewgroup, false);
        }
        view = (Bitmap)getItem(i);
        if (view != null)
        {
            viewgroup = (TextView)view1.findViewById(h.fY);
            TextView textview = (TextView)view1.findViewById(h.fZ);
            TextView textview1 = (TextView)view1.findViewById(h.ga);
            TextView textview2 = (TextView)view1.findViewById(h.gb);
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
