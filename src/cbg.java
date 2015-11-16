// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class cbg extends BaseAdapter
{

    private final List a = new ArrayList();
    private boolean b;
    private final gmo c;
    private final hgx d;
    private final Activity e;

    public cbg(hhu hhu1)
    {
        e = hhu1.getActivity();
        d = hhu1.getBinder();
        c = (gmo)d.a(gmo);
    }

    public void a()
    {
        a.clear();
        Object obj = d.c(cbh);
        Collections.sort(((List) (obj)));
        ani ani = dbf.e(c.a());
        obj = ((List) (obj)).iterator();
        int i = -1;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            cbh cbh1 = (cbh)((Iterator) (obj)).next();
            cbh1.a(ani);
            if (cbh1.g())
            {
                int j = cbh1.d();
                if (j != i && i != -1)
                {
                    a.add(new cbm());
                }
                a.add(cbh1);
                i = j;
            }
        } while (true);
        notifyDataSetChanged();
    }

    public void a(boolean flag)
    {
        if (b != flag)
        {
            b = flag;
            Iterator iterator = a.iterator();
            while (iterator.hasNext()) 
            {
                ((cbh)iterator.next()).a(flag);
            }
        }
    }

    public final boolean areAllItemsEnabled()
    {
        return false;
    }

    public final int getCount()
    {
        return a.size();
    }

    public final Object getItem(int i)
    {
        return a.get(i);
    }

    public final long getItemId(int i)
    {
        return (long)((cbh)a.get(i)).c();
    }

    public final int getItemViewType(int i)
    {
        return !((cbh)a.get(i)).g() ? 0 : 1;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        return ((cbh)a.get(i)).a(e, view, viewgroup);
    }

    public final int getViewTypeCount()
    {
        return 2;
    }

    public final boolean hasStableIds()
    {
        return false;
    }

    public final boolean isEmpty()
    {
        return a.isEmpty();
    }

    public final boolean isEnabled(int i)
    {
        return ((cbh)a.get(i)).g();
    }
}
