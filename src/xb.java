// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

final class xb
{

    private static final int a[] = {
        0x1010034
    };
    private static final int b[];
    private final TextView c;

    xb(TextView textview)
    {
        c = textview;
    }

    private void a(boolean flag)
    {
        TextView textview = c;
        se se1;
        if (flag)
        {
            se1 = new se(c.getContext());
        } else
        {
            se1 = null;
        }
        textview.setTransformationMethod(se1);
    }

    void a(Context context, int i)
    {
        context = context.obtainStyledAttributes(i, b);
        if (context.hasValue(0))
        {
            a(context.getBoolean(0, false));
        }
        context.recycle();
    }

    void a(AttributeSet attributeset, int i)
    {
        Context context = c.getContext();
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, a, i, 0);
        int j = typedarray.getResourceId(0, -1);
        typedarray.recycle();
        if (j != -1)
        {
            TypedArray typedarray1 = context.obtainStyledAttributes(j, ro.bH);
            if (typedarray1.hasValue(ro.bJ))
            {
                a(typedarray1.getBoolean(ro.bJ, false));
            }
            typedarray1.recycle();
        }
        attributeset = context.obtainStyledAttributes(attributeset, b, i, 0);
        if (attributeset.hasValue(0))
        {
            a(attributeset.getBoolean(0, false));
        }
        attributeset.recycle();
        attributeset = c.getTextColors();
        if (attributeset != null && !attributeset.isStateful())
        {
            if (android.os.Build.VERSION.SDK_INT < 21)
            {
                i = ve.c(context, 0x1010038);
            } else
            {
                i = ve.a(context, 0x1010038);
            }
            c.setTextColor(ve.a(attributeset.getDefaultColor(), i));
        }
    }

    static 
    {
        b = (new int[] {
            g.O
        });
    }
}
