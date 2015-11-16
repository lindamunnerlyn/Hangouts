// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class bpw extends LinearLayout
{

    private View a;
    private ImageView b;
    private TextView c;
    private TextView d;
    private boolean e;

    public bpw(Context context)
    {
        super(context, null);
        setPadding(0, 0, 0, 0);
        setOrientation(0);
        LayoutInflater.from(context).inflate(g.gh, this, true);
        b = (ImageView)findViewById(h.cp);
        a = findViewById(h.cs);
        c = (TextView)findViewById(h.cr);
        d = (TextView)findViewById(h.cq);
        e = false;
        a();
    }

    private void a()
    {
        byte byte0 = 8;
        boolean flag = TextUtils.isEmpty(c.getText());
        boolean flag1 = TextUtils.isEmpty(d.getText());
        Object obj = c;
        int i;
        if (flag)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((TextView) (obj)).setVisibility(i);
        obj = d;
        if (flag1)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((TextView) (obj)).setVisibility(i);
        obj = a;
        if (flag && flag1)
        {
            i = 8;
        } else
        {
            i = 0;
        }
        ((View) (obj)).setVisibility(i);
        obj = b;
        if (e)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((ImageView) (obj)).setVisibility(i);
        if (flag && flag1 && !e)
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        setVisibility(i);
    }

    public void a(Drawable drawable)
    {
        boolean flag;
        if (drawable != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
        b.setImageDrawable(drawable);
        a();
    }

    public void a(String s)
    {
        TextView textview = c;
        String s1 = s;
        if (TextUtils.isEmpty(s))
        {
            s1 = null;
        }
        textview.setText(s1);
        a();
    }

    public void b(String s)
    {
        TextView textview = d;
        String s1 = s;
        if (TextUtils.isEmpty(s))
        {
            s1 = null;
        }
        textview.setText(s1);
        a();
    }

    public void setClickable(boolean flag)
    {
        super.setClickable(flag);
        int i;
        int j;
        if (flag)
        {
            i = com.google.android.apps.hangouts.R.drawable.aC;
        } else
        {
            i = 0x106000d;
        }
        setBackgroundResource(i);
        if (flag)
        {
            i = getResources().getDimensionPixelSize(g.eq);
        } else
        {
            i = 0;
        }
        if (flag)
        {
            j = getResources().getDimensionPixelSize(g.er);
        } else
        {
            j = 0;
        }
        setPadding(i, j, i, j);
    }
}
