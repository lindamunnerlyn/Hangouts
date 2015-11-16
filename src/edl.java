// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Locale;

public class edl extends FrameLayout
    implements Checkable
{

    private static final StyleSpan b = new StyleSpan(1);
    private static ForegroundColorSpan c;
    private static AccessibilityManager d;
    public final ObjectAnimator a;
    private boolean e;
    private a f;

    public edl(Context context)
    {
        this(context, null);
    }

    public edl(Context context, AttributeSet attributeset)
    {
        super(context, null);
        if (c == null)
        {
            c = new ForegroundColorSpan(context.getApplicationContext().getResources().getColor(g.dn));
        }
        if (d == null)
        {
            d = (AccessibilityManager)getContext().getSystemService("accessibility");
        }
        a = ObjectAnimator.ofFloat(null, "alpha", new float[] {
            0.0F, 1.0F
        });
        a.setInterpolator(new aic(aig.a));
    }

    protected void a(View view, boolean flag)
    {
        float f1 = 1.0F;
        a.cancel();
        if (flag)
        {
            a.setTarget(view);
            ObjectAnimator objectanimator = a;
            float f3 = view.getAlpha();
            float f2;
            if (e)
            {
                f2 = 1.0F;
            } else
            {
                f2 = 0.0F;
            }
            objectanimator.setFloatValues(new float[] {
                f3, f2
            });
            f2 = view.getAlpha();
            if (!e)
            {
                f1 = 0.0F;
            }
            f1 = Math.abs(f2 - f1);
            a.setDuration((int)(f1 * 200F));
            a.start();
            return;
        }
        if (!e)
        {
            f1 = 0.0F;
        }
        view.setAlpha(f1);
    }

    protected void a(TextView textview, String s, SpannableStringBuilder spannablestringbuilder, String s1)
    {
        if (TextUtils.isEmpty(s) || TextUtils.isEmpty(s1) || d.isEnabled())
        {
            textview.setText(s);
            return;
        }
        int i = s.toUpperCase(Locale.getDefault()).indexOf(s1);
        if (i == -1)
        {
            textview.setText(s);
            return;
        } else
        {
            spannablestringbuilder.clear();
            spannablestringbuilder.append(s);
            int l = s1.length() + i;
            spannablestringbuilder.setSpan(b, i, l, 0);
            spannablestringbuilder.setSpan(c, i, l, 0);
            textview.setText(spannablestringbuilder);
            return;
        }
    }

    protected void a(boolean flag)
    {
        boolean flag1 = false;
        Object obj = findViewById(h.ab);
        if (obj instanceof Checkable)
        {
            ((Checkable)obj).setChecked(e);
        }
        a(((View) (obj)), flag);
        obj = (TextView)findViewById(h.dQ);
        int i;
        if (e)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        ((TextView) (obj)).setTypeface(null, i);
        if (e)
        {
            i = 0xcc000000;
        } else
        {
            i = 0x9a000000;
        }
        ((TextView) (obj)).setTextColor(i);
        i = ((flag1) ? 1 : 0);
        if (e)
        {
            i = -1;
        }
        setBackgroundColor(i);
    }

    public void a(boolean flag, boolean flag1)
    {
        if (e == flag)
        {
            return;
        } else
        {
            e = flag;
            a(flag1);
            return;
        }
    }

    public boolean isChecked()
    {
        return e;
    }

    public void j()
    {
        f = null;
    }

    public void k()
    {
        a(false, false);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        a(false);
    }

    public final void setChecked(boolean flag)
    {
        a(flag, true);
    }

    public void toggle()
    {
        boolean flag;
        if (!e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag, true);
    }

}
