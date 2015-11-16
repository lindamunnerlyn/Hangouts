// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import g;
import kb;
import rq;
import st;
import su;
import tc;
import te;
import ts;
import we;
import xe;
import yg;

public class ActionMenuItemView extends xe
    implements android.view.View.OnClickListener, android.view.View.OnLongClickListener, ts, we
{

    public te a;
    public tc b;
    public su c;
    private CharSequence d;
    private Drawable e;
    private yg f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private int k;

    public ActionMenuItemView(Context context)
    {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeset, int l)
    {
        super(context, attributeset, l);
        Resources resources = context.getResources();
        g = resources.getBoolean(g.T);
        context = context.obtainStyledAttributes(attributeset, rq.v, l, 0);
        i = context.getDimensionPixelSize(rq.w, 0);
        context.recycle();
        k = (int)(resources.getDisplayMetrics().density * 32F + 0.5F);
        setOnClickListener(this);
        setOnLongClickListener(this);
        j = -1;
    }

    private void f()
    {
        CharSequence charsequence;
label0:
        {
            boolean flag2 = false;
            boolean flag;
            boolean flag1;
            if (!TextUtils.isEmpty(d))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (e != null)
            {
                flag1 = flag2;
                if (!a.l())
                {
                    break label0;
                }
                if (!g)
                {
                    flag1 = flag2;
                    if (!h)
                    {
                        break label0;
                    }
                }
            }
            flag1 = true;
        }
        if (flag & flag1)
        {
            charsequence = d;
        } else
        {
            charsequence = null;
        }
        setText(charsequence);
    }

    public te a()
    {
        return a;
    }

    public void a(Drawable drawable)
    {
        e = drawable;
        if (drawable != null)
        {
            int k1 = drawable.getIntrinsicWidth();
            int j1 = drawable.getIntrinsicHeight();
            int i1 = j1;
            int l = k1;
            if (k1 > k)
            {
                float f1 = (float)k / (float)k1;
                l = k;
                i1 = (int)((float)j1 * f1);
            }
            k1 = i1;
            j1 = l;
            if (i1 > k)
            {
                float f2 = (float)k / (float)i1;
                k1 = k;
                j1 = (int)((float)l * f2);
            }
            drawable.setBounds(0, 0, j1, k1);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public void a(CharSequence charsequence)
    {
        d = charsequence;
        setContentDescription(d);
        f();
    }

    public void a(su su)
    {
        c = su;
    }

    public void a(tc tc1)
    {
        b = tc1;
    }

    public void a(te te1)
    {
        a = te1;
        a(te1.getIcon());
        a(te1.a(this));
        setId(te1.getItemId());
        int l;
        if (te1.isVisible())
        {
            l = 0;
        } else
        {
            l = 8;
        }
        setVisibility(l);
        setEnabled(te1.isEnabled());
        if (te1.hasSubMenu() && f == null)
        {
            f = new st(this);
        }
    }

    public boolean b()
    {
        return true;
    }

    public boolean c()
    {
        return !TextUtils.isEmpty(getText());
    }

    public boolean d()
    {
        return c() && a.getIcon() == null;
    }

    public boolean e()
    {
        return c();
    }

    public void onClick(View view)
    {
        if (b != null)
        {
            b.a(a);
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        g = getContext().getResources().getBoolean(g.T);
        f();
    }

    public boolean onLongClick(View view)
    {
        if (c())
        {
            return false;
        }
        int ai[] = new int[2];
        Rect rect = new Rect();
        getLocationOnScreen(ai);
        getWindowVisibleDisplayFrame(rect);
        Context context = getContext();
        int l = getWidth();
        int j1 = getHeight();
        int k1 = ai[1];
        int l1 = j1 / 2;
        int i1 = ai[0];
        i1 = l / 2 + i1;
        l = i1;
        if (kb.i(view) == 0)
        {
            l = context.getResources().getDisplayMetrics().widthPixels - i1;
        }
        view = Toast.makeText(context, a.getTitle(), 0);
        if (k1 + l1 < rect.height())
        {
            view.setGravity(0x800035, l, (ai[1] + j1) - rect.top);
        } else
        {
            view.setGravity(81, 0, j1);
        }
        view.show();
        return true;
    }

    protected void onMeasure(int l, int i1)
    {
        boolean flag = c();
        if (flag && j >= 0)
        {
            super.setPadding(j, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(l, i1);
        int j1 = android.view.View.MeasureSpec.getMode(l);
        l = android.view.View.MeasureSpec.getSize(l);
        int k1 = getMeasuredWidth();
        if (j1 == 0x80000000)
        {
            l = Math.min(l, i);
        } else
        {
            l = i;
        }
        if (j1 != 0x40000000 && i > 0 && k1 < l)
        {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(l, 0x40000000), i1);
        }
        if (!flag && e != null)
        {
            super.setPadding((getMeasuredWidth() - e.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (a.hasSubMenu() && f != null && f.onTouch(this, motionevent))
        {
            return true;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }

    public void setPadding(int l, int i1, int j1, int k1)
    {
        j = l;
        super.setPadding(l, i1, j1, k1);
    }
}
