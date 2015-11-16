// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;

public final class bcu extends LinearLayout
{

    private final int a;
    private final int b;
    private final Paint c;
    private final int d;
    private final Paint e;
    private int f;
    private float g;

    public bcu(Context context, int i)
    {
        this(context, i, (byte)0);
    }

    private bcu(Context context, int i, byte byte0)
    {
        super(context, null);
        setWillNotDraw(false);
        a = i;
        float f1 = getResources().getDisplayMetrics().density;
        TypedValue typedvalue = new TypedValue();
        context.getTheme().resolveAttribute(0x1010030, typedvalue, true);
        i = typedvalue.data;
        b = (int)(0.0F * f1);
        c = new Paint();
        c.setColor(Color.argb(38, Color.red(i), Color.green(i), Color.blue(i)));
        d = (int)(f1 * 3F);
        e = new Paint();
        e.setColor(getResources().getColor(g.lh));
    }

    void a(int i, float f1)
    {
        f = i;
        g = f1;
        invalidate();
    }

    protected void onDraw(Canvas canvas)
    {
        int i1 = getHeight();
        if (getChildCount() > 0)
        {
            View view = getChildAt(f);
            int l = view.getLeft();
            int k = view.getRight();
            int j = k;
            int i = l;
            if (g > 0.0F)
            {
                j = k;
                i = l;
                if (f < getChildCount() - 1)
                {
                    View view1 = getChildAt(f + 1);
                    float f1 = g;
                    float f2 = view1.getLeft();
                    float f3 = g;
                    i = (int)((float)l * (1.0F - f3) + f1 * f2);
                    f1 = g;
                    f2 = view1.getRight();
                    f3 = g;
                    j = (int)((float)k * (1.0F - f3) + f2 * f1);
                }
            }
            canvas.drawRect(i, i1 - d, j, i1, e);
        }
        if (a == 0)
        {
            canvas.drawRect(0.0F, i1 - b, getWidth(), i1, c);
        } else
        if (a == 1)
        {
            canvas.drawRect(0.0F, 0.0F, getWidth(), b, c);
            return;
        }
    }
}
