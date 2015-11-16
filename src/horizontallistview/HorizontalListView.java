// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package horizontallistview;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.OverScroller;
import java.util.LinkedList;
import java.util.Queue;
import kxu;
import kxv;
import kxw;

public class HorizontalListView extends AdapterView
{

    public boolean a;
    public ListAdapter b;
    public int c;
    public int d;
    public int e;
    public OverScroller f;
    private int g;
    private int h;
    private int i;
    private float j;
    private GestureDetector k;
    private Queue l;
    private android.widget.AdapterView.OnItemSelectedListener m;
    private android.widget.AdapterView.OnItemClickListener n;
    private android.widget.AdapterView.OnItemLongClickListener o;
    private boolean p;
    private DataSetObserver q;
    private android.view.GestureDetector.OnGestureListener r;

    public HorizontalListView(Context context)
    {
        super(context);
        a = true;
        g = -1;
        h = 0;
        e = 0x7fffffff;
        i = 0;
        j = -1F;
        l = new LinkedList();
        p = false;
        q = new kxu(this);
        r = new kxw(this);
        d();
    }

    public HorizontalListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = true;
        g = -1;
        h = 0;
        e = 0x7fffffff;
        i = 0;
        j = -1F;
        l = new LinkedList();
        p = false;
        q = new kxu(this);
        r = new kxw(this);
        d();
    }

    private void a(View view, int i1)
    {
        android.view.ViewGroup.LayoutParams layoutparams1 = view.getLayoutParams();
        android.view.ViewGroup.LayoutParams layoutparams = layoutparams1;
        if (layoutparams1 == null)
        {
            layoutparams = new android.view.ViewGroup.LayoutParams(-1, -1);
        }
        addViewInLayout(view, i1, layoutparams, true);
        int j1;
        if (layoutparams.width > 0)
        {
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.width, 0x40000000);
        } else
        {
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(getWidth(), 0x80000000);
        }
        if (layoutparams.height > 0)
        {
            j1 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
        } else
        {
            j1 = android.view.View.MeasureSpec.makeMeasureSpec(getHeight(), 0x80000000);
        }
        view.measure(i1, j1);
    }

    public static boolean a(HorizontalListView horizontallistview)
    {
        horizontallistview.p = true;
        return true;
    }

    public static void b(HorizontalListView horizontallistview)
    {
        horizontallistview.e();
    }

    public static android.widget.AdapterView.OnItemClickListener c(HorizontalListView horizontallistview)
    {
        return horizontallistview.n;
    }

    public static int d(HorizontalListView horizontallistview)
    {
        return horizontallistview.g;
    }

    private void d()
    {
        this;
        JVM INSTR monitorenter ;
        g = -1;
        h = 0;
        i = 0;
        c = 0;
        d = 0;
        e = 0x7fffffff;
        f = new OverScroller(getContext());
        k = new GestureDetector(getContext(), r);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static android.widget.AdapterView.OnItemSelectedListener e(HorizontalListView horizontallistview)
    {
        return horizontallistview.m;
    }

    private void e()
    {
        this;
        JVM INSTR monitorenter ;
        d();
        removeAllViewsInLayout();
        requestLayout();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static android.widget.AdapterView.OnItemLongClickListener f(HorizontalListView horizontallistview)
    {
        return horizontallistview.o;
    }

    public ListAdapter a()
    {
        return b;
    }

    public void a(ListAdapter listadapter)
    {
        if (b != null)
        {
            b.unregisterDataSetObserver(q);
        }
        b = listadapter;
        b.registerDataSetObserver(q);
        e();
    }

    public boolean a(float f1)
    {
        this;
        JVM INSTR monitorenter ;
        f.fling(d, 0, (int)(-b(f1)), 0, 0, e, 0, 0);
        this;
        JVM INSTR monitorexit ;
        requestLayout();
        return true;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected float b(float f1)
    {
        if (j == -1F)
        {
            return f1;
        } else
        {
            float f2 = Math.abs(f1);
            return f1 * (Math.min(f2, j) / f2);
        }
    }

    protected void b()
    {
        if (d < 0 || d == 0 && f.getStartX() != 0)
        {
            d = 0;
            f.forceFinished(true);
        }
        if (d > e || d == e && f.getStartX() != e)
        {
            d = e;
            f.forceFinished(true);
        }
    }

    public boolean c()
    {
        if (!f.isFinished())
        {
            f.forceFinished(true);
        }
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        return super.dispatchTouchEvent(motionevent) | k.onTouchEvent(motionevent);
    }

    public Adapter getAdapter()
    {
        return a();
    }

    public View getSelectedView()
    {
        return null;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        super.onLayout(flag, i1, j1, k1, l1);
        obj = b;
        if (obj != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (p)
        {
            i1 = c;
            d();
            removeAllViewsInLayout();
            d = i1;
            p = false;
        }
        if (f.computeScrollOffset())
        {
            d = f.getCurrX();
        }
        b();
        j1 = c - d;
        obj = getChildAt(0);
_L3:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        if (((View) (obj)).getRight() + j1 > 0)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        i = i + ((View) (obj)).getMeasuredWidth();
        l.offer(obj);
        removeViewInLayout(((View) (obj)));
        g = g + 1;
        obj = getChildAt(0);
          goto _L3
_L5:
        obj = getChildAt(getChildCount() - 1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_235;
        }
        if (((View) (obj)).getLeft() + j1 < getWidth())
        {
            break MISSING_BLOCK_LABEL_235;
        }
        l.offer(obj);
        removeViewInLayout(((View) (obj)));
        h = h - 1;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
        i1 = i;
        exception = getChildAt(getChildCount() - 1);
        if (exception == null)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        i1 = exception.getRight();
        while (i1 + j1 < getWidth() && h < b.getCount()) 
        {
            exception = b.getView(h, (View)l.poll(), this);
            a(exception, -1);
            i1 = exception.getMeasuredWidth() + i1;
            if (h == b.getCount() - 1)
            {
                e = (c + i1) - getWidth();
            }
            if (e < 0)
            {
                e = 0;
            }
            h = h + 1;
        }
        i1 = i;
        exception = getChildAt(0);
        if (exception == null)
        {
            break MISSING_BLOCK_LABEL_419;
        }
        i1 = exception.getLeft();
_L7:
        if (i1 + j1 <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (g < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        View view = b.getView(g, (View)l.poll(), this);
        a(view, 0);
        k1 = view.getMeasuredWidth();
        g = g - 1;
        i = i - view.getMeasuredWidth();
        i1 -= k1;
        if (true) goto _L7; else goto _L6
_L6:
        if (getChildCount() <= 0) goto _L9; else goto _L8
_L8:
        i = i + j1;
        j1 = i;
        i1 = 0;
_L10:
        if (i1 >= getChildCount())
        {
            break; /* Loop/switch isn't completed */
        }
        View view1 = getChildAt(i1);
        k1 = view1.getMeasuredWidth();
        view1.layout(j1, 0, j1 + k1, view1.getMeasuredHeight());
        j1 += view1.getPaddingRight() + k1;
        i1++;
        if (true) goto _L10; else goto _L9
_L9:
        c = d;
        if (!f.isFinished())
        {
            post(new kxv(this));
        }
          goto _L1
    }

    public void setAdapter(Adapter adapter)
    {
        a((ListAdapter)adapter);
    }

    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        n = onitemclicklistener;
    }

    public void setOnItemLongClickListener(android.widget.AdapterView.OnItemLongClickListener onitemlongclicklistener)
    {
        o = onitemlongclicklistener;
    }

    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onitemselectedlistener)
    {
        m = onitemselectedlistener;
    }

    public void setSelection(int i1)
    {
    }
}
