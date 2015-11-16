// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.hangouts.views.RichStatusView;

public final class ejl
{

    public boolean a;
    public final View b;
    public final ImageView c;
    public int d;
    final RichStatusView e;

    public ejl(RichStatusView richstatusview, int i, int j, int k)
    {
        e = richstatusview;
        super();
        b = richstatusview.findViewById(i);
        gdv.b("Expected non-null", b);
        c = (ImageView)richstatusview.findViewById(j);
        gdv.b("Expected non-null", c);
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
            ejn ejn1 = new ejn(this, d, flag);
            ejn1.setDuration(250L);
            ejn1.setAnimationListener(new ejm(this, flag));
            b.startAnimation(ejn1);
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
