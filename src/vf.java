// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

final class vf extends xu
    implements android.view.View.OnLongClickListener
{

    final vc a;
    private final int b[] = {
        0x10100d4
    };
    private pt c;
    private TextView d;
    private ImageView e;
    private View f;

    public vf(vc vc1, Context context, pt pt1, boolean flag)
    {
        a = vc1;
        super(context, null, g.h);
        c = pt1;
        vc1 = vm.a(context, null, b, g.h);
        if (vc1.g(0))
        {
            setBackgroundDrawable(vc1.a(0));
        }
        vc1.b();
        f(0x800013);
        b();
    }

    private void b()
    {
        Object obj = c;
        Object obj1 = ((pt) (obj)).c();
        if (obj1 != null)
        {
            obj = ((View) (obj1)).getParent();
            if (obj != this)
            {
                if (obj != null)
                {
                    ((ViewGroup)obj).removeView(((View) (obj1)));
                }
                addView(((View) (obj1)));
            }
            f = ((View) (obj1));
            if (d != null)
            {
                d.setVisibility(8);
            }
            if (e != null)
            {
                e.setVisibility(8);
                e.setImageDrawable(null);
            }
            return;
        }
        if (f != null)
        {
            removeView(f);
            f = null;
        }
        android.graphics.drawable.Drawable drawable = ((pt) (obj)).a();
        obj1 = ((pt) (obj)).b();
        boolean flag;
        if (drawable != null)
        {
            if (e == null)
            {
                ImageView imageview = new ImageView(getContext());
                xv xv2 = new xv(-2, -2);
                xv2.h = 16;
                imageview.setLayoutParams(xv2);
                addView(imageview, 0);
                e = imageview;
            }
            e.setImageDrawable(drawable);
            e.setVisibility(0);
        } else
        if (e != null)
        {
            e.setVisibility(8);
            e.setImageDrawable(null);
        }
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (d == null)
            {
                xe xe1 = new xe(getContext(), null, g.i);
                xe1.setEllipsize(android.text.TextUtils.TruncateAt.END);
                xv xv1 = new xv(-2, -2);
                xv1.h = 16;
                xe1.setLayoutParams(xv1);
                addView(xe1);
                d = xe1;
            }
            d.setText(((CharSequence) (obj1)));
            d.setVisibility(0);
        } else
        if (d != null)
        {
            d.setVisibility(8);
            d.setText(null);
        }
        if (e != null)
        {
            e.setContentDescription(((pt) (obj)).d());
        }
        if (!flag && !TextUtils.isEmpty(((pt) (obj)).d()))
        {
            setOnLongClickListener(this);
            return;
        } else
        {
            setOnLongClickListener(null);
            setLongClickable(false);
            return;
        }
    }

    public pt a()
    {
        return c;
    }

    public void a(pt pt1)
    {
        c = pt1;
        b();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setClassName(pt.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            accessibilitynodeinfo.setClassName(pt.getName());
        }
    }

    public boolean onLongClick(View view)
    {
        view = new int[2];
        getLocationOnScreen(view);
        Object obj = getContext();
        int i = getWidth();
        int j = getHeight();
        int k = ((Context) (obj)).getResources().getDisplayMetrics().widthPixels;
        obj = Toast.makeText(((Context) (obj)), c.d(), 0);
        ((Toast) (obj)).setGravity(49, (view[0] + i / 2) - k / 2, j);
        ((Toast) (obj)).show();
        return true;
    }

    public void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (a.b > 0 && getMeasuredWidth() > a.b)
        {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(a.b, 0x40000000), j);
        }
    }

    public void setSelected(boolean flag)
    {
        boolean flag1;
        if (isSelected() != flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        super.setSelected(flag);
        if (flag1 && flag)
        {
            sendAccessibilityEvent(4);
        }
    }
}
