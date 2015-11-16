// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.hangouts.views.FixedAspectRatioImageView;

public abstract class eez extends LinearLayout
    implements aqb, can
{

    public static final boolean c = false;
    private static int i;
    private ebh a;
    private eei b;
    public apw d;
    public final FixedAspectRatioImageView e;
    public boolean f;
    private final ImageView g;
    private final ImageView h;

    public eez(Context context, AttributeSet attributeset)
    {
        super(context, null);
        if (i == 0)
        {
            i = getResources().getDimensionPixelSize(g.dZ);
        }
        setOrientation(1);
        inflate(context, g.gH, this);
        g = (ImageView)findViewById(h.cQ);
        e = (FixedAspectRatioImageView)findViewById(h.cU);
        h = (ImageView)findViewById(h.cT);
        if (a())
        {
            h.setImageResource(com.google.android.apps.hangouts.R.drawable.by);
            h.setContentDescription(getResources().getString(l.ig));
        }
        setLongClickable(true);
    }

    protected void a(int j)
    {
        setContentDescription(getResources().getString(j));
    }

    public void a(ani ani1, boolean flag, String s, int j, int k, int i1)
    {
        if (s == null)
        {
            if (a())
            {
                h.setVisibility(0);
            }
        } else
        {
            if (j > 0 && k > 0)
            {
                if (Math.abs(i1 % 180) == 90)
                {
                    e.a(k, j);
                } else
                {
                    e.a(j, k);
                }
            }
            f = flag;
            d = new apw((new eam(s, ani1.a())).a(i).a(false).c(f()).d(false), this, null, true, null);
            if (((dmt)hgx.a(getContext(), dmt)).a(d, f))
            {
                d = null;
            } else
            {
                e();
            }
            if (g.a(g.nS, "babel_extra_log_scrolling", false))
            {
                j = e.getHeight();
                ebw.e("Babel_Scroll", (new StringBuilder(39)).append("Image request begin, Height:").append(j).toString());
                return;
            }
        }
    }

    public void a(ebh ebh1, eab eab, boolean flag, apw apw1, boolean flag1)
    {
        if (c)
        {
            String s;
            String s1;
            if (ebh1 == null)
            {
                s = null;
            } else
            {
                s = ebh1.toString();
            }
            if (eab == null)
            {
                s1 = null;
            } else
            {
                s1 = eab.toString();
            }
            s1 = String.valueOf(s1);
            ebw.b("Babel_medialoader", (new StringBuilder(String.valueOf(s).length() + 80 + String.valueOf(s1).length())).append("MediaThumbnailView: setImageBitmap ").append(s).append("gifImage=").append(s1).append(" success=").append(flag).append(" loadedFromCache=").append(flag1).toString());
        }
        if (d != apw1)
        {
            if (ebh1 != null)
            {
                ebh1.b();
            }
        } else
        {
            d = null;
            int j;
            if (!flag1)
            {
                j = 1;
            } else
            {
                j = 0;
            }
            if (j != 0)
            {
                e.setAlpha(0.0F);
                e.animate().alpha(1.0F).setDuration(250L).start();
            } else
            {
                e.setAlpha(1.0F);
            }
            g.setVisibility(4);
            e.setVisibility(0);
            if (a())
            {
                h.setVisibility(0);
            }
            if (flag)
            {
                if (apw1.n().q() != null)
                {
                    a(apw1.n().q());
                }
                if (eab != null)
                {
                    b = new eei(eab);
                    e.setImageDrawable(b);
                    b.a();
                } else
                {
                    gbh.a(a);
                    a = ebh1;
                    e.setImageBitmap(a.e());
                }
                e.requestLayout();
            } else
            {
                ebh1 = getResources();
                if (a())
                {
                    e.setBackgroundColor(ebh1.getColor(g.du));
                } else
                {
                    e.setBackgroundColor(ebh1.getColor(g.dA));
                    h.setImageResource(com.google.android.apps.hangouts.R.drawable.aT);
                    h.setVisibility(0);
                    eab = new TextView(getContext());
                    eab.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
                    eab.setText(l.gi);
                    eab.setTextColor(ebh1.getColor(g.dd));
                    addView(eab, 0);
                }
            }
            if (g.a(g.nS, "babel_extra_log_scrolling", false))
            {
                j = e.getHeight();
                ebw.e("Babel_Scroll", (new StringBuilder(37)).append("Image Update done, Height:").append(j).toString());
                return;
            }
        }
    }

    public boolean a()
    {
        return true;
    }

    public void b()
    {
        if (d != null)
        {
            d.b();
            d = null;
        }
        e.setImageBitmap(null);
        if (a != null)
        {
            a.b();
            a = null;
        }
        f = false;
        if (b != null)
        {
            b.c();
            b = null;
        }
    }

    public void c()
    {
        if (b != null)
        {
            b.b();
        }
    }

    public void c(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            TextView textview = (TextView)findViewById(h.y);
            textview.setText(s);
            textview.setVisibility(0);
        }
    }

    public void d()
    {
        if (f)
        {
            f = false;
            boolean flag = ((dmt)hgx.a(getContext(), dmt)).a(d);
            if (d != null && flag)
            {
                d = null;
            }
        }
    }

    public void e()
    {
        android.graphics.drawable.AnimationDrawable animationdrawable = edv.a((bka)getContext());
        g.setBackgroundDrawable(animationdrawable);
        g.setVisibility(0);
        e.setVisibility(4);
    }

    protected boolean f()
    {
        return false;
    }

    public void f_()
    {
        if (b != null)
        {
            b.a();
        }
    }

    protected void onAttachedToWindow()
    {
        if (b != null)
        {
            b.a();
        }
        super.onAttachedToWindow();
    }

    protected void onDetachedFromWindow()
    {
        if (b != null)
        {
            b.b();
        }
        super.onDetachedFromWindow();
    }

    static 
    {
        hik hik = ebw.w;
    }
}
