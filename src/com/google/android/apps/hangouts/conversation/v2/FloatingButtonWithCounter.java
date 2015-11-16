// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.conversation.v2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import azb;
import azc;
import azd;
import aze;
import azf;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import ebr;
import g;
import l;

public class FloatingButtonWithCounter extends FrameLayout
{

    private int a;
    private View b;
    private FloatingActionButton c;
    private int d;
    private azf e;

    public FloatingButtonWithCounter(Context context)
    {
        this(context, null);
    }

    public FloatingButtonWithCounter(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 0;
        LayoutInflater.from(getContext()).inflate(g.kB, this);
        c = (FloatingActionButton)getRootView().findViewById(g.ki);
        c.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        c.setOnClickListener(new azb(this));
        c();
        b = getRootView().findViewById(g.ke);
        b.bringToFront();
        b.setVisibility(8);
        int i = (int)TypedValue.applyDimension(1, 5F, getResources().getDisplayMetrics());
        context = b;
        float f;
        if (ebr.d())
        {
            f = i;
        } else
        {
            f = -i;
        }
        context.setTranslationX(f);
        setTranslationY(getContext().getResources().getDimensionPixelSize(g.jX));
    }

    public static azf a(FloatingButtonWithCounter floatingbuttonwithcounter)
    {
        return floatingbuttonwithcounter.e;
    }

    private static String a(int i)
    {
        if (i == 0)
        {
            return "";
        } else
        {
            return Integer.toString(i);
        }
    }

    public static FloatingActionButton b(FloatingButtonWithCounter floatingbuttonwithcounter)
    {
        return floatingbuttonwithcounter.c;
    }

    private void c()
    {
        c.b(getContext().getResources().getColor(g.jT));
        c.setColorFilter(getResources().getColor(g.jS), android.graphics.PorterDuff.Mode.SRC_IN);
        findViewById(g.kj).setVisibility(8);
    }

    public static void c(FloatingButtonWithCounter floatingbuttonwithcounter)
    {
        floatingbuttonwithcounter.c();
    }

    public int a()
    {
        return getContext().getResources().getDimensionPixelSize(g.jZ);
    }

    public void a(azf azf)
    {
        e = azf;
    }

    public void a(boolean flag, int i)
    {
        Object obj;
        Object obj1;
        TextView textview;
        ImageView imageview;
        String s;
        int j;
        int k;
        if (flag || i > 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        obj1 = (TextView)b.findViewById(g.kc);
        textview = (TextView)b.findViewById(g.kd);
        imageview = (ImageView)b.findViewById(g.kf);
        s = a(a);
        obj = a(i);
        ((TextView) (obj1)).setText(s);
        textview.setText(((CharSequence) (obj)));
        if (j != 0)
        {
            k = 0;
        } else
        {
            k = 8;
        }
        if (k != d)
        {
            if (k == 0)
            {
                AnimatorSet animatorset = new AnimatorSet();
                Animator animator = g.a(1.0F, 0.0F, 1.0F, 0.0F);
                animator.setStartDelay(0L);
                animator.setDuration(100L);
                animator.setInterpolator(g.d());
                animator.addListener(new azd(this));
                Animator animator2 = g.a(0.0F, 1.0F, 0.0F, 1.0F);
                animator2.setStartDelay(0L);
                animator2.setDuration(150L);
                animator2.setInterpolator(g.d());
                animatorset.playSequentially(new Animator[] {
                    animator, animator2
                });
                animatorset.setTarget(this);
                animatorset.start();
            } else
            {
                AnimatorSet animatorset1 = new AnimatorSet();
                Animator animator1 = g.a(1.0F, 0.0F, 1.0F, 0.0F);
                animator1.setStartDelay(0L);
                animator1.setDuration(150L);
                animator1.setInterpolator(g.d());
                animator1.addListener(new aze(this));
                Animator animator3 = g.a(0.0F, 1.0F, 0.0F, 1.0F);
                animator3.setStartDelay(0L);
                animator3.setDuration(100L);
                animator3.setInterpolator(g.d());
                animatorset1.playSequentially(new Animator[] {
                    animator1, animator3
                });
                animatorset1.setTarget(this);
                animatorset1.start();
            }
            d = k;
        }
        if (a != i)
        {
            if (imageview != null)
            {
                imageview.setVisibility(8);
            }
            if (a > 0)
            {
                ((TextView) (obj1)).setAlpha(1.0F);
                ((TextView) (obj1)).setTranslationY(0.0F);
                ((TextView) (obj1)).animate().alpha(0.0F).setDuration(102L).setInterpolator(g.c()).start();
            } else
            {
                ((TextView) (obj1)).setAlpha(0.0F);
            }
            textview.setAlpha(0.0F);
            textview.setTranslationY(20F);
            textview.animate().setStartDelay(16L).translationY(0.0F).alpha(1.0F).setDuration(102L).setInterpolator(g.d()).setListener(new azc(this, imageview)).start();
        }
        obj1 = b;
        if (j != 0 && !TextUtils.isEmpty(((CharSequence) (obj))))
        {
            j = 0;
        } else
        {
            j = 8;
        }
        ((View) (obj1)).setVisibility(j);
        obj = getContext().getResources();
        if (i > 0)
        {
            if (!flag)
            {
                c.setContentDescription(((Resources) (obj)).getQuantityString(g.hB, i, new Object[] {
                    Integer.valueOf(i)
                }));
            } else
            {
                c.setContentDescription(((Resources) (obj)).getQuantityString(g.hC, i, new Object[] {
                    Integer.valueOf(i)
                }));
            }
        } else
        {
            c.setContentDescription(((Resources) (obj)).getText(l.aq));
        }
        a = i;
    }

    public int b()
    {
        return getContext().getResources().getDimensionPixelSize(g.jZ);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        setMeasuredDimension(b(), a());
    }
}
