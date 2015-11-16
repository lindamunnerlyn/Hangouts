// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class fne extends BaseAdapter
{

    private static final int a;
    private fmv b;
    private String c;
    private fni d;
    private fng e;
    private int f;
    private LayoutInflater g;
    private int h;
    private Context i;
    private ArrayList j;
    private boolean k;
    private boolean l;
    private boolean m;
    private fmu n;

    public fne(Context context, int i1, fni fni1, fng fng1)
    {
        j = new ArrayList();
        k = true;
        l = true;
        i = context;
        if (i1 == -1)
        {
            i1 = a;
        }
        f = i1;
        g = LayoutInflater.from(context);
        if (fni1 == null)
        {
            fni1 = new fnf(this);
        }
        d = fni1;
        e = fng1;
        i1 = g.rs;
        fni1 = context.obtainStyledAttributes((new TypedValue()).data, new int[] {
            i1
        });
        h = fni1.getColor(0, context.getResources().getColor(g.ru));
        fni1.recycle();
        n = new fmu(context);
    }

    public static List a(List list, fqu fqu1, fqu fqu2)
    {
        String s;
        int j1;
        int l1;
        if (fqu2 != null)
        {
            fqu2 = fqu2.a();
        } else
        {
            fqu2 = null;
        }
        if (fqu1 != null)
        {
            s = fqu1.a();
        } else
        {
            s = null;
        }
        j1 = -1;
        l1 = -1;
        for (int i1 = 0; i1 < list.size();)
        {
            fqu fqu3 = (fqu)list.get(i1);
            int k1 = l1;
            if (l1 < 0)
            {
                k1 = l1;
                if (fqu3.a().equals(fqu2))
                {
                    k1 = i1;
                }
            }
            l1 = j1;
            if (j1 < 0)
            {
                l1 = j1;
                if (fqu3.a().equals(s))
                {
                    l1 = i1;
                }
            }
            i1++;
            j1 = l1;
            l1 = k1;
        }

        if (l1 >= 0)
        {
            list.remove(l1);
        }
        if (j1 < 0 && s != null && !s.equals(fqu2))
        {
            list.add(fqu1);
        }
        return list;
    }

    private boolean b(int i1)
    {
        byte byte0;
        if (k)
        {
            byte0 = -2;
        } else
        {
            byte0 = -1;
        }
        return l && i1 == byte0 + getCount();
    }

    private boolean c(int i1)
    {
        return k && i1 == getCount() - 1;
    }

    public fqu a(int i1)
    {
        while (b(i1) || c(i1) || j == null) 
        {
            return null;
        }
        return (fqu)j.get(i1);
    }

    public void a()
    {
        if (!k)
        {
            k = true;
            notifyDataSetChanged();
        }
    }

    public void a(fmv fmv1)
    {
        b = fmv1;
    }

    public void a(List list)
    {
        if (m)
        {
            j.clear();
            if (list != null)
            {
                fqu fqu1;
                for (list = list.iterator(); list.hasNext(); j.add(fqu1))
                {
                    fqu1 = (fqu)list.next();
                }

            }
            notifyDataSetChanged();
        } else
        {
            j = n.a(list);
        }
        notifyDataSetChanged();
    }

    public void b()
    {
        m = true;
    }

    public int getCount()
    {
        int j1 = 1;
        int k1 = 0;
        int i1;
        if (k)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (!l)
        {
            j1 = 0;
        }
        if (j != null)
        {
            k1 = j.size();
        }
        return i1 + j1 + k1;
    }

    public Object getItem(int i1)
    {
        return a(i1);
    }

    public long getItemId(int i1)
    {
        long l2 = -1L;
        long l1;
        if (c(i1))
        {
            l1 = -2L;
        } else
        {
            l1 = l2;
            if (!b(i1))
            {
                l1 = l2;
                if (j != null)
                {
                    return (long)((fqu)j.get(i1)).a().hashCode();
                }
            }
        }
        return l1;
    }

    public int getItemViewType(int i1)
    {
        if (c(i1))
        {
            return 2;
        }
        return !b(i1) ? 0 : 1;
    }

    public View getView(int i1, View view, ViewGroup viewgroup)
    {
        if (getItemViewType(i1) != 2) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = view;
        if (view == null)
        {
            obj = g.inflate(h.ji, null);
        }
_L4:
        return ((View) (obj));
_L2:
        if (getItemViewType(i1) != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = view;
        if (view == null)
        {
            return g.inflate(h.jh, null);
        }
        if (true) goto _L4; else goto _L3
_L3:
        viewgroup = view;
        if (view == null)
        {
            viewgroup = g.inflate(f, null);
        }
        fqu fqu1 = a(i1);
        obj = b;
        view = d;
        fng fng1 = e;
        if (c != null)
        {
            c.equals(fqu1.a());
        }
        i1 = h;
        if (viewgroup.getTag() == null)
        {
            view = view.a(viewgroup);
            viewgroup.setTag(view);
        } else
        {
            view = (fnh)viewgroup.getTag();
        }
        if (((fnh) (view)).e != null && obj != null)
        {
            ((fnh) (view)).e.setImageDrawable(null);
            if (!TextUtils.isEmpty(fqu1.f()))
            {
                ((fmv) (obj)).a(((fnh) (view)).e);
                ((fmv) (obj)).a(((fnh) (view)).e, fqu1, 1);
            } else
            {
                ((fmv) (obj)).a(((fnh) (view)).e);
                ((fnh) (view)).e.setImageBitmap(fmv.a(viewgroup.getContext()));
            }
        }
        if (((fnh) (view)).d != null)
        {
            ((fnh) (view)).d.setTextColor(i1);
            ((fnh) (view)).d.setVisibility(0);
            ((fnh) (view)).d.setText(fqu1.a());
            ((fnh) (view)).d.setContentDescription(i.getResources().getString(n.s, new Object[] {
                fqu1.a()
            }));
        }
        obj = viewgroup;
        if (fng1 != null)
        {
            fng1.a(view, fqu1);
            return viewgroup;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public int getViewTypeCount()
    {
        return 3;
    }

    static 
    {
        a = h.jf;
    }
}
