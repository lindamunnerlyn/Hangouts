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

public final class ccl extends BaseAdapter
{

    private final List a = new ArrayList();
    private boolean b;
    private final gqu c;
    private final hlp d;
    private final Activity e;

    public ccl(hmm hmm1)
    {
        e = hmm1.getActivity();
        d = hmm1.getBinder();
        c = (gqu)d.a(gqu);
    }

    public void a()
    {
        a.clear();
        Object obj = d.c(ccm);
        Collections.sort(((List) (obj)));
        aoa aoa = dcn.e(c.a());
        obj = ((List) (obj)).iterator();
        int i = -1;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            ccm ccm1 = (ccm)((Iterator) (obj)).next();
            ccm1.a(aoa);
            if (ccm1.g())
            {
                int j = ccm1.d();
                if (j != i && i != -1)
                {
                    a.add(new ccr());
                }
                a.add(ccm1);
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
                ((ccm)iterator.next()).a(flag);
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
        return (long)((ccm)a.get(i)).c();
    }

    public final int getItemViewType(int i)
    {
        return !((ccm)a.get(i)).g() ? 0 : 1;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        return ((ccm)a.get(i)).a(e, view, viewgroup);
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
        return ((ccm)a.get(i)).g();
    }
}
