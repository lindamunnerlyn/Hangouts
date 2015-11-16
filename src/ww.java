// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public final class ww extends Spinner
    implements jw
{

    private static final boolean a;
    private static final boolean b;
    private static final int c[] = {
        0x10102f1
    };
    private vk d;
    private wn e;
    private Context f;
    private yg g;
    private SpinnerAdapter h;
    private boolean i;
    private wz j;
    private int k;
    private final Rect l;

    public ww(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, g.N);
    }

    public ww(Context context, AttributeSet attributeset, int i1)
    {
        this(context, attributeset, i1, (byte)0);
    }

    private ww(Context context, AttributeSet attributeset, int i1, byte byte0)
    {
        this(context, attributeset, i1, -1);
    }

    private ww(Context context, AttributeSet attributeset, int i1, int j1)
    {
        Object obj1;
        int l1;
        obj1 = null;
        super(context, attributeset, i1);
        l = new Rect();
        vm vm1 = vm.a(context, attributeset, rq.bt, i1);
        d = vm1.c();
        e = new wn(this, d);
        int k1 = vm1.f(rq.bx, 0);
        Object obj;
        if (k1 != 0)
        {
            obj = new si(context, k1);
        } else
        if (!a)
        {
            obj = context;
        } else
        {
            obj = null;
        }
        f = ((Context) (obj));
        if (f == null) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT < 11) goto _L4; else goto _L3
_L3:
        context = context.obtainStyledAttributes(attributeset, c, i1, 0);
        k1 = j1;
        if (context.hasValue(0))
        {
            k1 = context.getInt(0, 0);
        }
        l1 = k1;
        if (context != null)
        {
            context.recycle();
            l1 = k1;
        }
_L5:
        if (l1 == 1)
        {
            context = new wz(this, f, attributeset, i1);
            obj = vm.a(f, attributeset, rq.bt, i1);
            k = ((vm) (obj)).e(rq.bu, -2);
            context.a(((vm) (obj)).a(rq.bv));
            context.a(vm1.d(rq.bw));
            ((vm) (obj)).b();
            j = context;
            g = new wx(this, this, context);
        }
_L2:
        vm1.b();
        i = true;
        if (h != null)
        {
            setAdapter(h);
            h = null;
        }
        e.a(attributeset, i1);
        return;
        context;
        context = null;
_L7:
        l1 = j1;
        if (context != null)
        {
            context.recycle();
            l1 = j1;
        }
          goto _L5
        attributeset;
        context = obj1;
_L6:
        if (context != null)
        {
            context.recycle();
        }
        throw attributeset;
_L4:
        l1 = 1;
          goto _L5
        attributeset;
          goto _L6
        Exception exception;
        exception;
          goto _L7
    }

    private int a(SpinnerAdapter spinneradapter, Drawable drawable)
    {
        if (spinneradapter == null)
        {
            return 0;
        }
        int i2 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int j2 = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int i1 = Math.max(0, getSelectedItemPosition());
        int k2 = Math.min(spinneradapter.getCount(), i1 + 15);
        int j1 = Math.max(0, i1 - (15 - (k2 - i1)));
        View view = null;
        int k1 = 0;
        i1 = 0;
        for (; j1 < k2; j1++)
        {
            int l1 = spinneradapter.getItemViewType(j1);
            if (l1 != i1)
            {
                view = null;
                i1 = l1;
            }
            view = spinneradapter.getView(j1, view, this);
            if (view.getLayoutParams() == null)
            {
                view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(i2, j2);
            k1 = Math.max(k1, view.getMeasuredWidth());
        }

        if (drawable != null)
        {
            drawable.getPadding(l);
            return l.left + l.right + k1;
        } else
        {
            return k1;
        }
    }

    static int a(ww ww1, SpinnerAdapter spinneradapter, Drawable drawable)
    {
        return ww1.a(spinneradapter, drawable);
    }

    static wz a(ww ww1)
    {
        return ww1.j;
    }

    static boolean a()
    {
        return a;
    }

    static Rect b(ww ww1)
    {
        return ww1.l;
    }

    static int c(ww ww1)
    {
        return ww1.k;
    }

    public void a(ColorStateList colorstatelist)
    {
        if (e != null)
        {
            e.a(colorstatelist);
        }
    }

    public void a(android.graphics.PorterDuff.Mode mode)
    {
        if (e != null)
        {
            e.a(mode);
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (e != null)
        {
            e.b();
        }
    }

    public int getDropDownHorizontalOffset()
    {
        if (j != null)
        {
            return j.h();
        }
        if (b)
        {
            return super.getDropDownHorizontalOffset();
        } else
        {
            return 0;
        }
    }

    public int getDropDownVerticalOffset()
    {
        if (j != null)
        {
            return j.i();
        }
        if (b)
        {
            return super.getDropDownVerticalOffset();
        } else
        {
            return 0;
        }
    }

    public int getDropDownWidth()
    {
        if (j != null)
        {
            return k;
        }
        if (b)
        {
            return super.getDropDownWidth();
        } else
        {
            return 0;
        }
    }

    public Drawable getPopupBackground()
    {
        if (j != null)
        {
            return j.f();
        }
        if (b)
        {
            return super.getPopupBackground();
        } else
        {
            return null;
        }
    }

    public Context getPopupContext()
    {
        if (j != null)
        {
            return f;
        }
        if (a)
        {
            return super.getPopupContext();
        } else
        {
            return null;
        }
    }

    public CharSequence getPrompt()
    {
        if (j != null)
        {
            return j.a();
        } else
        {
            return super.getPrompt();
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (j != null && j.n())
        {
            j.k();
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        if (j != null && android.view.View.MeasureSpec.getMode(i1) == 0x80000000)
        {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), android.view.View.MeasureSpec.getSize(i1)), getMeasuredHeight());
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (g != null && g.onTouch(this, motionevent))
        {
            return true;
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }

    public boolean performClick()
    {
        if (j != null && !j.n())
        {
            j.c();
            return true;
        } else
        {
            return super.performClick();
        }
    }

    public volatile void setAdapter(Adapter adapter)
    {
        setAdapter((SpinnerAdapter)adapter);
    }

    public void setAdapter(SpinnerAdapter spinneradapter)
    {
        if (!i)
        {
            h = spinneradapter;
        } else
        {
            super.setAdapter(spinneradapter);
            if (j != null)
            {
                Context context;
                if (f == null)
                {
                    context = getContext();
                } else
                {
                    context = f;
                }
                j.a(new wy(spinneradapter, context.getTheme()));
                return;
            }
        }
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        super.setBackgroundDrawable(drawable);
        if (e != null)
        {
            e.a();
        }
    }

    public void setBackgroundResource(int i1)
    {
        super.setBackgroundResource(i1);
        if (e != null)
        {
            e.a(i1);
        }
    }

    public void setDropDownHorizontalOffset(int i1)
    {
        if (j != null)
        {
            j.a(i1);
        } else
        if (b)
        {
            super.setDropDownHorizontalOffset(i1);
            return;
        }
    }

    public void setDropDownVerticalOffset(int i1)
    {
        if (j != null)
        {
            j.b(i1);
        } else
        if (b)
        {
            super.setDropDownVerticalOffset(i1);
            return;
        }
    }

    public void setDropDownWidth(int i1)
    {
        if (j != null)
        {
            k = i1;
        } else
        if (b)
        {
            super.setDropDownWidth(i1);
            return;
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable)
    {
        if (j != null)
        {
            j.a(drawable);
        } else
        if (b)
        {
            super.setPopupBackgroundDrawable(drawable);
            return;
        }
    }

    public void setPopupBackgroundResource(int i1)
    {
        setPopupBackgroundDrawable(getPopupContext().getDrawable(i1));
    }

    public void setPrompt(CharSequence charsequence)
    {
        if (j != null)
        {
            j.a(charsequence);
            return;
        } else
        {
            super.setPrompt(charsequence);
            return;
        }
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 23)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }
}
