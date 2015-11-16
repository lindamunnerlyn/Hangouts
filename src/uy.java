// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

public class uy extends ListView
{

    private static final int f[] = {
        0
    };
    final Rect a = new Rect();
    int b;
    int c;
    int d;
    int e;
    private Field g;
    private uz h;

    public uy(Context context, int i)
    {
        super(context, null, i);
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        try
        {
            g = android/widget/AbsListView.getDeclaredField("mIsChildViewEnabled");
            g.setAccessible(true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
    }

    public int a(int i, int j)
    {
        Object obj;
        ListAdapter listadapter;
        int k;
        int l;
        int i1;
        k = getListPaddingTop();
        i1 = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        l = getDividerHeight();
        obj = getDivider();
        listadapter = getAdapter();
        if (listadapter != null) goto _L2; else goto _L1
_L1:
        k += i1;
_L4:
        return k;
_L2:
        k = i1 + k;
        int j1;
        int l1;
        if (l <= 0 || obj == null)
        {
            l = 0;
        }
        l1 = listadapter.getCount();
        i1 = 0;
        j1 = 0;
        obj = null;
        do
        {
label0:
            {
                if (i1 >= l1)
                {
                    break label0;
                }
                int k1 = listadapter.getItemViewType(i1);
                if (k1 != j1)
                {
                    j1 = k1;
                    obj = null;
                }
                obj = listadapter.getView(i1, ((View) (obj)), this);
                android.view.ViewGroup.LayoutParams layoutparams = ((View) (obj)).getLayoutParams();
                if (layoutparams != null && layoutparams.height > 0)
                {
                    k1 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
                } else
                {
                    k1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                }
                ((View) (obj)).measure(i, k1);
                if (i1 > 0)
                {
                    k += l;
                }
                k1 = ((View) (obj)).getMeasuredHeight() + k;
                k = j;
                if (k1 >= j)
                {
                    continue; /* Loop/switch isn't completed */
                }
                i1++;
                k = k1;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return k;
    }

    protected void a()
    {
        Drawable drawable = getSelector();
        if (drawable != null && b())
        {
            drawable.setState(getDrawableState());
        }
    }

    protected void a(int i, View view)
    {
        boolean flag1 = true;
        Drawable drawable = getSelector();
        boolean flag;
        if (drawable != null && i != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            drawable.setVisible(false, false);
        }
        b(i, view);
        if (flag)
        {
            view = a;
            float f1 = view.exactCenterX();
            float f2 = view.exactCenterY();
            if (getVisibility() != 0)
            {
                flag1 = false;
            }
            drawable.setVisible(flag1, false);
            fe.a(drawable, f1, f2);
        }
    }

    public void a(int i, View view, float f1, float f2)
    {
        a(i, view);
        view = getSelector();
        if (view != null && i != -1)
        {
            fe.a(view, f1, f2);
        }
    }

    protected void a(Canvas canvas)
    {
        if (!a.isEmpty())
        {
            Drawable drawable = getSelector();
            if (drawable != null)
            {
                drawable.setBounds(a);
                drawable.draw(canvas);
            }
        }
    }

    public void a(boolean flag)
    {
        if (h != null)
        {
            h.a(flag);
        }
    }

    protected void b(int i, View view)
    {
        Rect rect = a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left = rect.left - b;
        rect.top = rect.top - c;
        rect.right = rect.right + d;
        rect.bottom = rect.bottom + e;
        boolean flag;
        flag = g.getBoolean(this);
        if (view.isEnabled() == flag)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        view = g;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            view.set(this, Boolean.valueOf(flag));
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            view.printStackTrace();
            return;
        }
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        refreshDrawableState();
    }

    protected boolean b()
    {
        return c() && isPressed();
    }

    public boolean c()
    {
        return false;
    }

    protected void dispatchDraw(Canvas canvas)
    {
        a(canvas);
        super.dispatchDraw(canvas);
    }

    public void drawableStateChanged()
    {
        super.drawableStateChanged();
        a(true);
        a();
    }

    public void setSelector(Drawable drawable)
    {
        Object obj;
        if (drawable != null)
        {
            obj = new uz(drawable);
        } else
        {
            obj = null;
        }
        h = ((uz) (obj));
        super.setSelector(h);
        obj = new Rect();
        if (drawable != null)
        {
            drawable.getPadding(((Rect) (obj)));
        }
        b = ((Rect) (obj)).left;
        c = ((Rect) (obj)).top;
        d = ((Rect) (obj)).right;
        e = ((Rect) (obj)).bottom;
    }

}
