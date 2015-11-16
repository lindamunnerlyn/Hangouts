// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.google.android.apps.hangouts.views.EasterEggView;
import java.util.List;

public final class edt
    implements android.view.animation.Animation.AnimationListener, aqb
{

    final EasterEggView a;
    private apw b;
    private ImageView c;
    private Animation d;
    private eei e;

    public edt(EasterEggView eastereggview, eam eam, int i)
    {
        a = eastereggview;
        super();
        b = new apw(eam, this, true, null);
        c = null;
        d = AnimationUtils.loadAnimation(eastereggview.getContext(), i);
        d.setAnimationListener(this);
        ((dmt)hgx.a(eastereggview.getContext(), dmt)).c(b);
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

    public void a(ebh ebh, eab eab, boolean flag, apw apw1, boolean flag1)
    {
        if (apw1.equals(b))
        {
            b = null;
            if (!flag)
            {
                ebw.c("Babel", "Failed to download easter egg image.");
                EasterEggView.a(a).remove(this);
            }
            gbh.b(eab);
            c = new ImageView(a.getContext());
            c.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            e = new eei(eab);
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
        a.post(new edu(this, this));
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }
}
