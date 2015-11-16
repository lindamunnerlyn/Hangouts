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
import lfz;
import lga;
import lgb;

public class HorizontalListView extends AdapterView
{

    public boolean a;
    public ListAdapter b;
    public int c;
    public int d;
    public int e;
    public int f;
    public OverScroller g;
    public android.widget.AdapterView.OnItemSelectedListener h;
    public android.widget.AdapterView.OnItemClickListener i;
    public android.widget.AdapterView.OnItemLongClickListener j;
    public boolean k;
    private int l;
    private int m;
    private float n;
    private GestureDetector o;
    private Queue p;
    private DataSetObserver q;
    private android.view.GestureDetector.OnGestureListener r;

    public HorizontalListView(Context context)
    {
        super(context);
        a = true;
        c = -1;
        l = 0;
        f = 0x7fffffff;
        m = 0;
        n = -1F;
        p = new LinkedList();
        k = false;
        q = new lfz(this);
        r = new lgb(this);
        e();
    }

    public HorizontalListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = true;
        c = -1;
        l = 0;
        f = 0x7fffffff;
        m = 0;
        n = -1F;
        p = new LinkedList();
        k = false;
        q = new lfz(this);
        r = new lgb(this);
        e();
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

    private void e()
    {
        this;
        JVM INSTR monitorenter ;
        c = -1;
        l = 0;
        m = 0;
        d = 0;
        e = 0;
        f = 0x7fffffff;
        g = new OverScroller(getContext());
        o = new GestureDetector(getContext(), r);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
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
        b();
    }

    public boolean a(float f1)
    {
        this;
        JVM INSTR monitorenter ;
        g.fling(e, 0, (int)(-b(f1)), 0, 0, f, 0, 0);
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
        if (n == -1F)
        {
            return f1;
        } else
        {
            float f2 = Math.abs(f1);
            return f1 * (Math.min(f2, n) / f2);
        }
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        e();
        removeAllViewsInLayout();
        requestLayout();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void c()
    {
        if (e < 0 || e == 0 && g.getStartX() != 0)
        {
            e = 0;
            g.forceFinished(true);
        }
        if (e > f || e == f && g.getStartX() != f)
        {
            e = f;
            g.forceFinished(true);
        }
    }

    public boolean d()
    {
        if (!g.isFinished())
        {
            g.forceFinished(true);
        }
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        return super.dispatchTouchEvent(motionevent) | o.onTouchEvent(motionevent);
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
        if (k)
        {
            i1 = d;
            e();
            removeAllViewsInLayout();
            e = i1;
            k = false;
        }
        if (g.computeScrollOffset())
        {
            e = g.getCurrX();
        }
        c();
        j1 = d - e;
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
        m = m + ((View) (obj)).getMeasuredWidth();
        p.offer(obj);
        removeViewInLayout(((View) (obj)));
        c = c + 1;
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
        p.offer(obj);
        removeViewInLayout(((View) (obj)));
        l = l - 1;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
        i1 = m;
        exception = getChildAt(getChildCount() - 1);
        if (exception == null)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        i1 = exception.getRight();
        while (i1 + j1 < getWidth() && l < b.getCount()) 
        {
            exception = b.getView(l, (View)p.poll(), this);
            a(exception, -1);
            i1 = exception.getMeasuredWidth() + i1;
            if (l == b.getCount() - 1)
            {
                f = (d + i1) - getWidth();
            }
            if (f < 0)
            {
                f = 0;
            }
            l = l + 1;
        }
        i1 = m;
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
        if (c < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        View view = b.getView(c, (View)p.poll(), this);
        a(view, 0);
        k1 = view.getMeasuredWidth();
        c = c - 1;
        m = m - view.getMeasuredWidth();
        i1 -= k1;
        if (true) goto _L7; else goto _L6
_L6:
        if (getChildCount() <= 0) goto _L9; else goto _L8
_L8:
        m = m + j1;
        j1 = m;
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
        d = e;
        if (!g.isFinished())
        {
            post(new lga(this));
        }
          goto _L1
    }

    public void setAdapter(Adapter adapter)
    {
        a((ListAdapter)adapter);
    }

    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        i = onitemclicklistener;
    }

    public void setOnItemLongClickListener(android.widget.AdapterView.OnItemLongClickListener onitemlongclicklistener)
    {
        j = onitemlongclicklistener;
    }

    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onitemselectedlistener)
    {
        h = onitemselectedlistener;
    }

    public void setSelection(int i1)
    {
    }
}
