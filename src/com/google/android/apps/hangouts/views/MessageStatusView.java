// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import h;

// Referenced classes of package com.google.android.apps.hangouts.views:
//            ScalingTextView

public class MessageStatusView extends FrameLayout
{

    View a;
    TextView b;
    TextView c;
    public ScalingTextView d;
    ImageView e;
    public View f;
    ScalingTextView g;
    View h;
    private float i;

    public MessageStatusView(Context context)
    {
        super(context);
        i = 1.0F;
    }

    public MessageStatusView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        i = 1.0F;
    }

    public MessageStatusView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        i = 1.0F;
    }

    public void a(float f1)
    {
        i = f1;
        setAlpha(f1);
        requestLayout();
    }

    public void onFinishInflate()
    {
        a = findViewById(h.U);
        d = (ScalingTextView)a.findViewById(h.gw);
        b = (TextView)a.findViewById(h.dQ);
        c = (TextView)a.findViewById(h.fM);
        e = (ImageView)a.findViewById(h.fW);
        f = findViewById(h.fK);
        g = (ScalingTextView)f.findViewById(h.fL);
        h = findViewById(h.fX);
    }

    protected void onMeasure(int j, int k)
    {
        super.onMeasure(j, k);
        setMeasuredDimension(getMeasuredWidth(), (int)((float)getMeasuredHeight() * i));
    }
}
