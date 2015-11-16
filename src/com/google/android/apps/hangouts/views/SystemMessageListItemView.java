// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cao;
import g;
import h;

public class SystemMessageListItemView extends RelativeLayout
    implements cao
{

    private static boolean a = false;
    private static int b;
    private static int c;
    private ImageView d;
    private TextView e;
    private CharSequence f;
    private long g;

    public SystemMessageListItemView(Context context)
    {
        this(context, null);
    }

    public SystemMessageListItemView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (!a)
        {
            context = context.getApplicationContext().getResources();
            b = context.getColor(g.dL);
            c = context.getColor(g.dK);
            a = true;
        }
    }

    private void d()
    {
        e.setText(Html.fromHtml(f.toString()));
    }

    public long a()
    {
        return g;
    }

    public void a(int i)
    {
        d.setImageResource(i);
    }

    public void a(long l)
    {
        b(l);
        d();
    }

    public void a(CharSequence charsequence)
    {
        f = charsequence;
        d();
    }

    public void a(boolean flag)
    {
        ImageView imageview = d;
        int i;
        if (flag)
        {
            i = c;
        } else
        {
            i = b;
        }
        imageview.setColorFilter(i);
    }

    public View b()
    {
        return this;
    }

    public void b(long l)
    {
        g = l;
    }

    public void c()
    {
        setContentDescription(e.getText());
    }

    public void onFinishInflate()
    {
        e = (TextView)findViewById(h.gp);
        d = (ImageView)findViewById(h.cM);
    }

}
