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

public abstract class eib extends LinearLayout
    implements aqs, cbs
{

    public static final boolean c = false;
    private static int i;
    private eef a;
    private ehk b;
    public aqn d;
    public final FixedAspectRatioImageView e;
    public boolean f;
    private final ImageView g;
    private final ImageView h;

    public eib(Context context, AttributeSet attributeset)
    {
        super(context, null);
        if (i == 0)
        {
            i = getResources().getDimensionPixelSize(g.dX);
        }
        setOrientation(1);
        inflate(context, g.gC, this);
        g = (ImageView)findViewById(h.cG);
        e = (FixedAspectRatioImageView)findViewById(h.cJ);
        h = (ImageView)findViewById(h.cI);
        if (a())
        {
            h.setImageResource(com.google.android.apps.hangouts.R.drawable.bu);
            h.setContentDescription(getResources().getString(l.hA));
        }
        setLongClickable(true);
    }

    protected void a(int j)
    {
        setContentDescription(getResources().getString(j));
    }

    public void a(aoa aoa1, boolean flag, String s, int j, int k, int i1)
    {
        if (s == null)
        {
            if (a())
            {
                h.setVisibility(0);
            }
        } else
        {
            int j1 = j;
            if (j == 0)
            {
                j1 = i;
            }
            j = k;
            if (k == 0)
            {
                j = i;
            }
            if (Math.abs(i1 % 180) == 90)
            {
                e.a(j, j1);
            } else
            {
                e.a(j1, j);
            }
            f = flag;
            d = new aqn((new edq(s, aoa1.a())).a(i).a(false).c(f()).d(false), this, null, true, null);
            if (((dpn)hlp.a(getContext(), dpn)).a(d, f))
            {
                d = null;
            } else
            {
                e();
            }
            if (g.a(g.nU, "babel_extra_log_scrolling", false))
            {
                j = e.getHeight();
                eev.e("Babel_Scroll", (new StringBuilder(39)).append("Image request begin, Height:").append(j).toString());
                return;
            }
        }
    }

    public void a(eef eef1, edf edf, boolean flag, aqn aqn1, boolean flag1)
    {
        if (c)
        {
            String s;
            String s1;
            if (eef1 == null)
            {
                s = null;
            } else
            {
                s = eef1.toString();
            }
            if (edf == null)
            {
                s1 = null;
            } else
            {
                s1 = edf.toString();
            }
            s1 = String.valueOf(s1);
            eev.b("Babel_medialoader", (new StringBuilder(String.valueOf(s).length() + 80 + String.valueOf(s1).length())).append("MediaThumbnailView: setImageBitmap ").append(s).append("gifImage=").append(s1).append(" success=").append(flag).append(" loadedFromCache=").append(flag1).toString());
        }
        if (d != aqn1)
        {
            if (eef1 != null)
            {
                eef1.b();
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
                if (aqn1.o().q() != null)
                {
                    a(aqn1.o().q());
                }
                if (edf != null)
                {
                    b = new ehk(edf);
                    e.setImageDrawable(b);
                    b.a();
                } else
                {
                    gdv.a("Expected null", a);
                    a = eef1;
                    e.setImageBitmap(a.e());
                }
                e.requestLayout();
            } else
            {
                eef1 = getResources();
                if (a())
                {
                    e.setBackgroundColor(eef1.getColor(g.dt));
                } else
                {
                    e.setBackgroundColor(eef1.getColor(g.dz));
                    h.setImageResource(com.google.android.apps.hangouts.R.drawable.aP);
                    h.setVisibility(0);
                    edf = new TextView(getContext());
                    edf.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
                    edf.setText(l.fR);
                    edf.setTextColor(eef1.getColor(g.db));
                    addView(edf, 0);
                }
            }
            if (g.a(g.nU, "babel_extra_log_scrolling", false))
            {
                j = e.getHeight();
                eev.e("Babel_Scroll", (new StringBuilder(37)).append("Image Update done, Height:").append(j).toString());
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
            TextView textview = (TextView)findViewById(h.x);
            textview.setText(s);
            textview.setVisibility(0);
        }
    }

    public void d()
    {
        if (f)
        {
            f = false;
            boolean flag = ((dpn)hlp.a(getContext(), dpn)).a(d);
            if (d != null && flag)
            {
                d = null;
            }
        }
    }

    public void e()
    {
        android.graphics.drawable.AnimationDrawable animationdrawable = egx.a((bkm)getContext());
        g.setBackgroundDrawable(animationdrawable);
        g.setVisibility(0);
        e.setVisibility(4);
    }

    protected boolean f()
    {
        return false;
    }

    public void h_()
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
        hnc hnc = eev.w;
    }
}
