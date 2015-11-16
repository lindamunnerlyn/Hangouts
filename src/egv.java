// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.google.android.apps.hangouts.views.EasterEggView;
import java.util.List;

public final class egv
    implements android.view.animation.Animation.AnimationListener, aqs
{

    final EasterEggView a;
    private aqn b;
    private ImageView c;
    private Animation d;
    private ehk e;

    public egv(EasterEggView eastereggview, edq edq, int i)
    {
        a = eastereggview;
        super();
        b = new aqn(edq, this, true, null);
        c = null;
        d = AnimationUtils.loadAnimation(eastereggview.getContext(), i);
        d.setAnimationListener(this);
        ((dpn)hlp.a(eastereggview.getContext(), dpn)).c(b);
    }

    public void a()
    {
        if (b != null)
        {
            b.b();
            b = null;
        }
        if (d != null)
        {
            d.cancel();
            d = null;
        }
        if (c != null)
        {
            a.removeView(c);
            c.clearAnimation();
            c.setImageDrawable(null);
            c.setImageBitmap(null);
            c = null;
        }
        if (e != null)
        {
            e.c();
            e = null;
        }
    }

    public void a(eef eef, edf edf, boolean flag, aqn aqn1, boolean flag1)
    {
        if (aqn1.equals(b))
        {
            b = null;
            if (!flag)
            {
                eev.c("Babel", "Failed to download easter egg image.");
                EasterEggView.a(a).remove(this);
            }
            gdv.b("Expected non-null", edf);
            c = new ImageView(a.getContext());
            c.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            e = new ehk(edf);
            c.setImageDrawable(e);
            e.a();
            c.startAnimation(d);
            a.addView(c);
        }
    }

    public void onAnimationEnd(Animation animation)
    {
        if (c != null)
        {
            c.setVisibility(8);
        }
        a.post(new egw(this, this));
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }
}
