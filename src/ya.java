// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

public class ya
{

    private static Method a;
    private Handler A;
    private Rect B;
    private boolean C;
    private int D;
    int b;
    private Context c;
    private PopupWindow d;
    private ListAdapter e;
    private yd f;
    private int g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private int l;
    private boolean m;
    private boolean n;
    private View o;
    private int p;
    private DataSetObserver q;
    private View r;
    private Drawable s;
    private android.widget.AdapterView.OnItemClickListener t;
    private android.widget.AdapterView.OnItemSelectedListener u;
    private final yl v;
    private final yk w;
    private final yj x;
    private final yh y;
    private Runnable z;

    public ya(Context context)
    {
        this(context, null, g.I);
    }

    public ya(Context context, AttributeSet attributeset, int i1)
    {
        this(context, attributeset, i1, 0);
    }

    public ya(Context context, AttributeSet attributeset, int i1, int j1)
    {
        g = -2;
        h = -2;
        l = 0;
        m = false;
        n = false;
        b = 0x7fffffff;
        p = 0;
        v = new yl(this);
        w = new yk(this);
        x = new yj(this);
        y = new yh(this);
        A = new Handler();
        B = new Rect();
        c = context;
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, ro.ax, i1, j1);
        i = typedarray.getDimensionPixelOffset(ro.ay, 0);
        j = typedarray.getDimensionPixelOffset(ro.az, 0);
        if (j != 0)
        {
            k = true;
        }
        typedarray.recycle();
        d = new uq(context, attributeset, i1);
        d.setInputMethodMode(1);
        D = gw.a(c.getResources().getConfiguration().locale);
    }

    static yd a(ya ya1)
    {
        return ya1.f;
    }

    static PopupWindow b(ya ya1)
    {
        return ya1.d;
    }

    static yl c(ya ya1)
    {
        return ya1.v;
    }

    static Handler d(ya ya1)
    {
        return ya1.A;
    }

    public void a(int i1)
    {
        i = i1;
    }

    public void a(Drawable drawable)
    {
        d.setBackgroundDrawable(drawable);
    }

    public void a(View view)
    {
        r = view;
    }

    public void a(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        t = onitemclicklistener;
    }

    public void a(ListAdapter listadapter)
    {
        if (q != null) goto _L2; else goto _L1
_L1:
        q = new yi(this);
_L4:
        e = listadapter;
        if (e != null)
        {
            listadapter.registerDataSetObserver(q);
        }
        if (f != null)
        {
            f.setAdapter(e);
        }
        return;
_L2:
        if (e != null)
        {
            e.unregisterDataSetObserver(q);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(android.widget.PopupWindow.OnDismissListener ondismisslistener)
    {
        d.setOnDismissListener(ondismisslistener);
    }

    public void b(int i1)
    {
        j = i1;
        k = true;
    }

    public void c()
    {
        byte byte2;
        boolean flag1;
        boolean flag2;
        flag2 = true;
        flag1 = true;
        byte2 = -1;
        if (f != null) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        View view;
        android.widget.LinearLayout.LayoutParams layoutparams;
        int i1;
        int l1;
        int i2;
        boolean flag;
        obj1 = c;
        z = new yb(this);
        int j1;
        if (!C)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = new yd(((Context) (obj1)), flag);
        if (s != null)
        {
            f.setSelector(s);
        }
        f.setAdapter(e);
        f.setOnItemClickListener(t);
        f.setFocusable(true);
        f.setFocusableInTouchMode(true);
        f.setOnItemSelectedListener(new yc(this));
        f.setOnScrollListener(x);
        if (u != null)
        {
            f.setOnItemSelectedListener(u);
        }
        obj = f;
        view = o;
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_1179;
        }
        obj1 = new LinearLayout(((Context) (obj1)));
        ((LinearLayout) (obj1)).setOrientation(1);
        layoutparams = new android.widget.LinearLayout.LayoutParams(-1, 0, 1.0F);
        p;
        JVM INSTR tableswitch 0 1: default 224
    //                   0 563
    //                   1 548;
           goto _L3 _L4 _L5
_L3:
        Log.e("ListPopupWindow", (new StringBuilder("Invalid hint position ")).append(p).toString());
_L10:
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(h, 0x80000000), 0);
        obj = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
        i1 = view.getMeasuredHeight();
        j1 = ((android.widget.LinearLayout.LayoutParams) (obj)).topMargin;
        i1 = ((android.widget.LinearLayout.LayoutParams) (obj)).bottomMargin + (i1 + j1);
        obj = obj1;
_L19:
        d.setContentView(((View) (obj)));
_L11:
        obj = d.getBackground();
        if (obj != null)
        {
            ((Drawable) (obj)).getPadding(B);
            j1 = B.top + B.bottom;
            l1 = j1;
            if (!k)
            {
                j = -B.top;
                l1 = j1;
            }
        } else
        {
            B.setEmpty();
            l1 = 0;
        }
        d.getInputMethodMode();
        i2 = d.getMaxAvailableHeight(g(), j);
        if (!m && g != -1) goto _L7; else goto _L6
_L6:
        i1 = i2 + l1;
_L15:
        flag = o();
        if (!d.isShowing()) goto _L9; else goto _L8
_L8:
        int k1;
        if (h == -1)
        {
            k1 = -1;
        } else
        if (h == -2)
        {
            k1 = g().getWidth();
        } else
        {
            k1 = h;
        }
        if (g == -1)
        {
            if (!flag)
            {
                i1 = -1;
            }
            if (flag)
            {
                obj = d;
                if (h == -1)
                {
                    l1 = byte2;
                } else
                {
                    l1 = 0;
                }
                ((PopupWindow) (obj)).setWindowLayoutMode(l1, 0);
            } else
            {
                obj = d;
                byte byte1;
                if (h == -1)
                {
                    byte1 = -1;
                } else
                {
                    byte1 = 0;
                }
                ((PopupWindow) (obj)).setWindowLayoutMode(byte1, -1);
            }
        } else
        if (g != -2)
        {
            i1 = g;
        }
        obj = d;
        if (!n && !m)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        ((PopupWindow) (obj)).setOutsideTouchable(flag);
        d.update(g(), i, j, k1, i1);
_L18:
        return;
_L5:
        ((LinearLayout) (obj1)).addView(((View) (obj)), layoutparams);
        ((LinearLayout) (obj1)).addView(view);
          goto _L10
_L4:
        ((LinearLayout) (obj1)).addView(view);
        ((LinearLayout) (obj1)).addView(((View) (obj)), layoutparams);
          goto _L10
_L2:
        d.getContentView();
        obj = o;
        Exception exception;
        byte byte0;
        if (obj != null)
        {
            obj1 = (android.widget.LinearLayout.LayoutParams)((View) (obj)).getLayoutParams();
            i1 = ((View) (obj)).getMeasuredHeight();
            k1 = ((android.widget.LinearLayout.LayoutParams) (obj1)).topMargin;
            i1 = ((android.widget.LinearLayout.LayoutParams) (obj1)).bottomMargin + (i1 + k1);
        } else
        {
            i1 = 0;
        }
          goto _L11
_L7:
        h;
        JVM INSTR tableswitch -2 -1: default 668
    //                   -2 722
    //                   -1 762;
           goto _L12 _L13 _L14
_L14:
        break MISSING_BLOCK_LABEL_762;
_L12:
        k1 = android.view.View.MeasureSpec.makeMeasureSpec(h, 0x40000000);
_L16:
        i2 = f.a(k1, i2 - i1);
        k1 = i1;
        if (i2 > 0)
        {
            k1 = i1 + l1;
        }
        i1 = k1 + i2;
          goto _L15
_L13:
        k1 = android.view.View.MeasureSpec.makeMeasureSpec(c.getResources().getDisplayMetrics().widthPixels - (B.left + B.right), 0x80000000);
          goto _L16
        k1 = android.view.View.MeasureSpec.makeMeasureSpec(c.getResources().getDisplayMetrics().widthPixels - (B.left + B.right), 0x40000000);
          goto _L16
_L9:
        if (h == -1)
        {
            byte0 = -1;
        } else
        if (h == -2)
        {
            d.setWidth(g().getWidth());
            byte0 = 0;
        } else
        {
            d.setWidth(h);
            byte0 = 0;
        }
        if (g == -1)
        {
            i1 = -1;
        } else
        if (g == -2)
        {
            d.setHeight(i1);
            i1 = 0;
        } else
        {
            d.setHeight(g);
            i1 = 0;
        }
        d.setWindowLayoutMode(byte0, i1);
        if (a != null)
        {
            try
            {
                a.invoke(d, new Object[] {
                    Boolean.valueOf(true)
                });
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception) { }
        }
        obj = d;
        if (!n && !m)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        ((PopupWindow) (obj)).setOutsideTouchable(flag);
        d.setTouchInterceptor(w);
        ox.a(d, g(), i, j, l);
        f.setSelection(-1);
        if (!C || f.isInTouchMode())
        {
            m();
        }
        if (C) goto _L18; else goto _L17
_L17:
        A.post(y);
        return;
        i1 = 0;
          goto _L19
    }

    public void c(int i1)
    {
        l = i1;
    }

    public void d()
    {
        p = 0;
    }

    public void d(int i1)
    {
        h = i1;
    }

    public void e()
    {
        C = true;
        d.setFocusable(true);
    }

    public void e(int i1)
    {
        Drawable drawable = d.getBackground();
        if (drawable != null)
        {
            drawable.getPadding(B);
            h = B.left + B.right + i1;
            return;
        } else
        {
            d(i1);
            return;
        }
    }

    public Drawable f()
    {
        return d.getBackground();
    }

    public void f(int i1)
    {
        yd yd1 = f;
        if (n() && yd1 != null)
        {
            yd.a(yd1, false);
            yd1.setSelection(i1);
            if (android.os.Build.VERSION.SDK_INT >= 11 && yd1.getChoiceMode() != 0)
            {
                yd1.setItemChecked(i1, true);
            }
        }
    }

    public View g()
    {
        return r;
    }

    public int h()
    {
        return i;
    }

    public int i()
    {
        if (!k)
        {
            return 0;
        } else
        {
            return j;
        }
    }

    public int j()
    {
        return h;
    }

    public void k()
    {
        d.dismiss();
        if (o != null)
        {
            android.view.ViewParent viewparent = o.getParent();
            if (viewparent instanceof ViewGroup)
            {
                ((ViewGroup)viewparent).removeView(o);
            }
        }
        d.setContentView(null);
        f = null;
        A.removeCallbacks(v);
    }

    public void l()
    {
        d.setInputMethodMode(2);
    }

    public void m()
    {
        yd yd1 = f;
        if (yd1 != null)
        {
            yd.a(yd1, true);
            yd1.requestLayout();
        }
    }

    public boolean n()
    {
        return d.isShowing();
    }

    public boolean o()
    {
        return d.getInputMethodMode() == 2;
    }

    public ListView p()
    {
        return f;
    }

    static 
    {
        try
        {
            a = android/widget/PopupWindow.getDeclaredMethod("setClipToScreenEnabled", new Class[] {
                Boolean.TYPE
            });
        }
        catch (NoSuchMethodException nosuchmethodexception) { }
    }
}
