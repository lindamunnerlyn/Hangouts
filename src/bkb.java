// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public final class bkb extends jq
{

    private static final boolean a = false;
    private static final Integer b[];
    private final Context c;
    private final bke d;
    private final bjy e;
    private final SparseArray f = new SparseArray(6);
    private final edj g;
    private final boolean h;
    private final Integer i;
    private int j;
    private int k;

    public bkb(Context context, bjy bjy, int l, int i1, int j1, boolean flag, Integer integer)
    {
        boolean flag1 = true;
        super();
        j = 0;
        k = 0;
        c = context;
        a(l, i1);
        d = new bke(c);
        e = bjy;
        g = new edj(context, j1);
        h = flag;
        i = integer;
        context = new HashSet();
        if (android.os.Build.VERSION.SDK_INT >= 19 && g.a(g.nU, "babel_prefer_emoji_system_font_rendering", true))
        {
            l = ((flag1) ? 1 : 0);
        } else
        {
            l = 0;
        }
        if (l != 0)
        {
            context.add(Integer.valueOf(0xfe4e5));
            context.add(Integer.valueOf(0xfe4e6));
            context.add(Integer.valueOf(0xfe4e7));
            context.add(Integer.valueOf(0xfe4e8));
            context.add(Integer.valueOf(0xfe4e9));
            context.add(Integer.valueOf(0xfe4ea));
            context.add(Integer.valueOf(0xfe4eb));
            context.add(Integer.valueOf(0xfe4ec));
            context.add(Integer.valueOf(0xfe4ed));
            context.add(Integer.valueOf(0xfe4ee));
            context.add(Integer.valueOf(0xfe82e));
            context.add(Integer.valueOf(0xfe82f));
            context.add(Integer.valueOf(0xfe830));
            context.add(Integer.valueOf(0xfe831));
            context.add(Integer.valueOf(0xfe832));
            context.add(Integer.valueOf(0xfe833));
            context.add(Integer.valueOf(0xfe834));
            context.add(Integer.valueOf(0xfe835));
            context.add(Integer.valueOf(0xfe836));
            context.add(Integer.valueOf(0xfe837));
            context.add(Integer.valueOf(0xfe82c));
        }
        for (l = 0; l < b.length; l++)
        {
            bjy = c.getResources().obtainTypedArray(g.a(b[l], 0));
            integer = new LinkedList();
            for (i1 = 0; i1 < bjy.length(); i1++)
            {
                j1 = Integer.parseInt(bjy.getString(i1), 16);
                if (!context.contains(Integer.valueOf(j1)))
                {
                    integer.add(Integer.valueOf(j1));
                }
            }

            bjy.recycle();
            f.append(l + 1, integer);
        }

    }

    static edj a(bkb bkb1)
    {
        return bkb1.g;
    }

    static bke b(bkb bkb1)
    {
        return bkb1.d;
    }

    static int c(bkb bkb1)
    {
        return bkb1.j;
    }

    static bjy d(bkb bkb1)
    {
        return bkb1.e;
    }

    private int f()
    {
        Resources resources = c.getResources();
        int l = resources.getDimensionPixelSize(g.ee);
        return Math.max(0, resources.getDimensionPixelSize(g.eH) - l);
    }

    private int g()
    {
        Resources resources = c.getResources();
        int l = resources.getDimensionPixelSize(g.ee);
        if (h)
        {
            l = resources.getDimensionPixelSize(g.eH) - l;
        } else
        {
            l = 0;
        }
        return Math.max(0, l);
    }

    public int a(int l)
    {
        if (l == 0)
        {
            return 1;
        }
        l = ((List)f.get(l)).size();
        if (j <= 0)
        {
            return 1;
        } else
        {
            return (l - 1) / j + 1;
        }
    }

    public Object a(ViewGroup viewgroup, int l)
    {
        if (a)
        {
            eev.b("Babel", (new StringBuilder(35)).append("Instantiate emoji view: ").append(l).toString());
        }
        long l3 = SystemClock.elapsedRealtime();
        Object obj = (LayoutInflater)viewgroup.getContext().getSystemService("layout_inflater");
        Object obj1 = b(l);
        int l1 = g.a((Integer)((Pair) (obj1)).first, 0);
        GridView gridview;
        int i1;
        boolean flag;
        int j1;
        int k1;
        int i2;
        int j2;
        int k2;
        int l2;
        if (l1 == 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0 && d.a().size() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            obj = ((LayoutInflater) (obj)).inflate(g.fQ, viewgroup, false);
        } else
        {
            obj = ((LayoutInflater) (obj)).inflate(g.fP, viewgroup, false);
        }
        gridview = (GridView)((View) (obj)).findViewById(h.bf);
        i2 = f();
        j2 = g();
        if (h)
        {
            j1 = k;
        } else
        {
            j1 = 0;
        }
        k2 = f();
        l2 = g();
        if (h)
        {
            k1 = k;
        } else
        {
            k1 = 0;
        }
        gridview.setPadding(i2, j2 + j1, k2, k1 + l2);
        if (i1 != 0)
        {
            obj1 = new bki(this, c.getResources());
        } else
        {
            obj1 = new bkc(this, c.getResources(), (List)f.get(l1), g.a((Integer)((Pair) (obj1)).second, 0));
        }
        if (flag)
        {
            gridview.setVisibility(8);
            ViewGroup viewgroup1 = (ViewGroup)((View) (obj)).findViewById(h.eX);
            viewgroup1.setVisibility(0);
            ImageView imageview = new ImageView(viewgroup1.getContext());
            imageview.setImageResource(com.google.android.apps.hangouts.R.drawable.bA);
            viewgroup1.addView(imageview, 0);
            ((bki)obj1).a(((View) (obj)));
            if (i != null)
            {
                i1 = g.a(i, 0);
                imageview.setColorFilter(i1 + 0x60000000, android.graphics.PorterDuff.Mode.SRC_ATOP);
                ((TextView)((View) (obj)).findViewById(h.eY)).setTextColor(i1);
            }
        }
        gridview.setOnItemClickListener(new bkd(this, l1));
        gridview.setAdapter(((android.widget.ListAdapter) (obj1)));
        gridview.setTag(Integer.valueOf(l));
        viewgroup.addView(((View) (obj)));
        if (eev.a("Babel", 3))
        {
            long l4 = SystemClock.elapsedRealtime();
            l = ((bka) (obj1)).getCount();
            eev.c("Babel", (new StringBuilder(119)).append("Emoji: Category Adapter instantiateItem @").append(l4).append(" took: ").append(l4 - l3).append(" Adapter has ").append(l).append(" items.").toString());
        }
        return obj;
    }

    public void a(int l, int i1)
    {
        Resources resources = c.getResources();
        int l1 = f();
        int k1 = g();
        int i2 = resources.getDimensionPixelSize(g.ec);
        int j1 = resources.getDimensionPixelSize(g.eh);
        l = (l - l1 * 2) / i2;
        k1 = (i1 - k1 * 2) / j1;
        k = (i1 - j1 * k1) / 2;
        j = k1 * l;
    }

    public void a(ViewGroup viewgroup, int l, Object obj)
    {
        obj = (View)obj;
        viewgroup.removeView(((View) (obj)));
        ((bka)((GridView)((View) (obj)).findViewById(h.bf)).getAdapter()).a();
    }

    public boolean a(View view, Object obj)
    {
        return view == obj;
    }

    public int b()
    {
        int l = 0;
        int i1 = 0;
        for (; l < 6; l++)
        {
            i1 += a(l);
        }

        return i1;
    }

    public Pair b(int l)
    {
        int i1 = 0;
        int k1;
        for (int j1 = 0; i1 < 6; j1 = k1)
        {
            k1 = j1 + a(i1);
            if (k1 > l)
            {
                return new Pair(Integer.valueOf(i1), Integer.valueOf(l - j1));
            }
            i1++;
        }

        return new Pair(Integer.valueOf(1), Integer.valueOf(0));
    }

    public int c(Object obj)
    {
        return -2;
    }

    public int d(int l)
    {
        int j1 = 0;
        int k1;
        for (int i1 = 0; j1 < 6; i1 = k1 + i1)
        {
            if (j1 == l)
            {
                return i1;
            }
            k1 = a(j1);
            j1++;
        }

        eev.f("Babel", (new StringBuilder(33)).append("categoryId not found: ").append(l).toString());
        return 0;
    }

    public void e()
    {
        g.b();
    }

    static 
    {
        hnc hnc = eev.e;
        b = (new Integer[] {
            Integer.valueOf(g.cI), Integer.valueOf(g.cK), Integer.valueOf(g.cJ), Integer.valueOf(g.cL), Integer.valueOf(g.cM)
        });
    }
}
