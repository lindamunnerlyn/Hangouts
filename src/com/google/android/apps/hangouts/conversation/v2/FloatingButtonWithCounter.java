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
import azp;
import azq;
import azr;
import azs;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import eep;
import g;
import l;

public class FloatingButtonWithCounter extends FrameLayout
{

    public FloatingActionButton a;
    private int b;
    private View c;
    private int d;

    public FloatingButtonWithCounter(Context context)
    {
        this(context, null);
    }

    public FloatingButtonWithCounter(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = 0;
        LayoutInflater.from(getContext()).inflate(g.ku, this);
        a = (FloatingActionButton)getRootView().findViewById(g.kb);
        a.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        a.setOnClickListener(new azp(this, context));
        c();
        c = getRootView().findViewById(g.jX);
        c.bringToFront();
        c.setVisibility(8);
        int i = (int)TypedValue.applyDimension(1, 5F, getResources().getDisplayMetrics());
        context = c;
        float f;
        if (eep.d())
        {
            f = i;
        } else
        {
            f = -i;
        }
        context.setTranslationX(f);
        setTranslationY(getContext().getResources().getDimensionPixelSize(g.jQ));
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

    public int a()
    {
        return getContext().getResources().getDimensionPixelSize(g.jS);
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
        obj1 = (TextView)c.findViewById(g.jV);
        textview = (TextView)c.findViewById(g.jW);
        imageview = (ImageView)c.findViewById(g.jY);
        s = a(b);
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
                animator.setInterpolator(g.c());
                animator.addListener(new azr(this));
                Animator animator2 = g.a(0.0F, 1.0F, 0.0F, 1.0F);
                animator2.setStartDelay(0L);
                animator2.setDuration(150L);
                animator2.setInterpolator(g.c());
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
                animator1.setInterpolator(g.c());
                animator1.addListener(new azs(this));
                Animator animator3 = g.a(0.0F, 1.0F, 0.0F, 1.0F);
                animator3.setStartDelay(0L);
                animator3.setDuration(100L);
                animator3.setInterpolator(g.c());
                animatorset1.playSequentially(new Animator[] {
                    animator1, animator3
                });
                animatorset1.setTarget(this);
                animatorset1.start();
            }
            d = k;
        }
        if (b != i)
        {
            if (imageview != null)
            {
                imageview.setVisibility(8);
            }
            if (b > 0)
            {
                ((TextView) (obj1)).setAlpha(1.0F);
                ((TextView) (obj1)).setTranslationY(0.0F);
                ((TextView) (obj1)).animate().alpha(0.0F).setDuration(102L).setInterpolator(g.b()).start();
            } else
            {
                ((TextView) (obj1)).setAlpha(0.0F);
            }
            textview.setAlpha(0.0F);
            textview.setTranslationY(20F);
            textview.animate().setStartDelay(16L).translationY(0.0F).alpha(1.0F).setDuration(102L).setInterpolator(g.c()).setListener(new azq(this, imageview)).start();
        }
        obj1 = c;
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
                a.setContentDescription(((Resources) (obj)).getQuantityString(g.ht, i, new Object[] {
                    Integer.valueOf(i)
                }));
            } else
            {
                a.setContentDescription(((Resources) (obj)).getQuantityString(g.hu, i, new Object[] {
                    Integer.valueOf(i)
                }));
            }
        } else
        {
            a.setContentDescription(((Resources) (obj)).getText(l.al));
        }
        b = i;
    }

    public int b()
    {
        return getContext().getResources().getDimensionPixelSize(g.jS);
    }

    public void c()
    {
        a.b(getContext().getResources().getColor(g.jM));
        a.setColorFilter(getResources().getColor(g.jL), android.graphics.PorterDuff.Mode.SRC_IN);
        findViewById(g.kc).setVisibility(8);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        setMeasuredDimension(b(), a());
    }
}
