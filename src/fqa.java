// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.widget.ContentLoadingProgressBar;
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

public final class fqa extends BaseAdapter
    implements fpp
{

    private static final int a;
    private fpr b;
    private String c;
    private fqe d;
    private fqc e;
    private int f;
    private LayoutInflater g;
    private int h;
    private Context i;
    private ArrayList j;
    private boolean k;
    private boolean l;
    private boolean m;
    private fpo n;
    private boolean o;

    public fqa(Context context, int i1, fqe fqe1, fqc fqc1)
    {
        o = false;
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
        if (fqe1 == null)
        {
            fqe1 = new fqb(this);
        }
        d = fqe1;
        e = fqc1;
        i1 = g.ru;
        fqe1 = context.obtainStyledAttributes((new TypedValue()).data, new int[] {
            i1
        });
        h = fqe1.getColor(0, context.getResources().getColor(g.rw));
        fqe1.recycle();
        n = new fpo(context, this);
    }

    public static List a(List list, ftl ftl1, ftl ftl2)
    {
        String s = null;
        int j1;
        int l1;
        if (g.a(ftl2))
        {
            ftl2 = ftl2.a();
        } else
        {
            ftl2 = null;
        }
        if (g.a(ftl1))
        {
            s = ftl1.a();
        }
        l1 = -1;
        j1 = -1;
        for (int i1 = 0; i1 < list.size();)
        {
            ftl ftl3 = (ftl)list.get(i1);
            int j2 = l1;
            int i2 = j1;
            if (g.a(ftl3))
            {
                int k1 = j1;
                if (j1 < 0)
                {
                    k1 = j1;
                    if (ftl3.a().equals(ftl2))
                    {
                        k1 = i1;
                    }
                }
                j2 = l1;
                i2 = k1;
                if (l1 < 0)
                {
                    j2 = l1;
                    i2 = k1;
                    if (ftl3.a().equals(s))
                    {
                        j2 = i1;
                        i2 = k1;
                    }
                }
            }
            i1++;
            l1 = j2;
            j1 = i2;
        }

        if (j1 >= 0)
        {
            list.remove(j1);
        }
        if (l1 < 0 && s != null && !s.equals(ftl2))
        {
            list.add(ftl1);
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

    public ftl a(int i1)
    {
        while (b(i1) || c(i1) || j == null) 
        {
            return null;
        }
        return (ftl)j.get(i1);
    }

    public void a()
    {
        if (!k)
        {
            k = true;
            notifyDataSetChanged();
        }
    }

    public void a(fpr fpr1)
    {
        b = fpr1;
    }

    public void a(ArrayList arraylist)
    {
        o = false;
        j = arraylist;
        notifyDataSetChanged();
    }

    public void a(List list)
    {
        if (m || list != null && list.size() <= 1)
        {
            if (j == null)
            {
                j = new ArrayList();
            }
            j.clear();
            if (list != null)
            {
                ftl ftl1;
                for (list = list.iterator(); list.hasNext(); j.add(ftl1))
                {
                    ftl1 = (ftl)list.next();
                }

            }
            notifyDataSetChanged();
            return;
        } else
        {
            o = true;
            n.a(list);
            notifyDataSetChanged();
            return;
        }
    }

    public void b()
    {
        m = true;
    }

    public int getCount()
    {
        int j1 = 1;
        int k1 = 0;
        if (o)
        {
            return 1;
        }
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
        if (c(i1))
        {
            return -2L;
        }
        if (b(i1))
        {
            return -1L;
        }
        if (j != null)
        {
            ftl ftl1 = (ftl)j.get(i1);
            if (g.a(ftl1))
            {
                return (long)ftl1.a().hashCode();
            } else
            {
                return -1L;
            }
        } else
        {
            return -1L;
        }
    }

    public int getItemViewType(int i1)
    {
        if (o)
        {
            return 3;
        }
        if (c(i1))
        {
            return 2;
        }
        return !b(i1) ? 0 : 1;
    }

    public View getView(int i1, View view, ViewGroup viewgroup)
    {
        if (getItemViewType(i1) == 3)
        {
            view = g.inflate(h.jh, null);
            ((ContentLoadingProgressBar)view).a();
            kb.d(view);
            return view;
        }
        if (getItemViewType(i1) != 2) goto _L2; else goto _L1
_L1:
        viewgroup = view;
        if (view == null)
        {
            viewgroup = g.inflate(h.jg, null);
        }
_L4:
        return viewgroup;
_L2:
        if (getItemViewType(i1) == 1)
        {
            viewgroup = view;
            if (view == null)
            {
                viewgroup = g.inflate(h.jf, null);
            }
        } else
        {
            View view1 = view;
            if (view == null)
            {
                view1 = g.inflate(f, null);
            }
            ftl ftl1 = a(i1);
            if (c != null && g.a(ftl1))
            {
                c.equals(ftl1.a());
            }
            viewgroup = b;
            view = d;
            fqc fqc1 = e;
            i1 = h;
            if (view1.getTag() == null)
            {
                view = view.a(view1);
                view1.setTag(view);
            } else
            {
                view = (fqd)view1.getTag();
            }
            if (((fqd) (view)).e != null && viewgroup != null && g.a(ftl1))
            {
                ((fqd) (view)).e.setImageDrawable(null);
                if (!TextUtils.isEmpty(ftl1.f()))
                {
                    viewgroup.a(((fqd) (view)).e);
                    viewgroup.a(((fqd) (view)).e, ftl1, 1);
                } else
                {
                    viewgroup.a(((fqd) (view)).e);
                    ((fqd) (view)).e.setImageBitmap(fpr.a(view1.getContext()));
                }
            }
            if (((fqd) (view)).d != null && g.a(ftl1))
            {
                ((fqd) (view)).d.setTextColor(i1);
                ((fqd) (view)).d.setVisibility(0);
                ((fqd) (view)).d.setText(ftl1.a());
                ((fqd) (view)).d.setContentDescription(i.getResources().getString(n.s, new Object[] {
                    ftl1.a()
                }));
            }
            viewgroup = view1;
            if (fqc1 != null)
            {
                fqc1.a(view, ftl1);
                viewgroup = view1;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int getViewTypeCount()
    {
        return 4;
    }

    public boolean isEnabled(int i1)
    {
        return !o;
    }

    static 
    {
        a = h.jd;
    }
}
