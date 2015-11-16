// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.hangouts.views.RichStatusView;

public final class egj
{

    public boolean a;
    public final View b;
    public final ImageView c;
    public int d;
    final RichStatusView e;

    public egj(RichStatusView richstatusview, int i, int j, int k)
    {
        e = richstatusview;
        super();
        b = richstatusview.findViewById(i);
        gbh.b(b);
        c = (ImageView)richstatusview.findViewById(j);
        gbh.b(c);
        d = k;
    }

    public void a(int i)
    {
        b.getLayoutParams().width = i;
        b.requestLayout();
    }

    public void a(boolean flag)
    {
        if (a != flag)
        {
            egl egl1 = new egl(this, d, flag);
            egl1.setDuration(250L);
            egl1.setAnimationListener(new egk(this, flag));
            b.startAnimation(egl1);
            RichStatusView.a(e);
            a = flag;
        }
    }

    public boolean a(int i, int j)
    {
        c.setImageResource(i);
        c.setColorFilter(j, android.graphics.PorterDuff.Mode.SRC_IN);
        boolean flag;
        if (i != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
        return flag;
    }

    public void b(int i)
    {
        b.getBackground().setColorFilter(i, android.graphics.PorterDuff.Mode.SRC_IN);
    }
}
