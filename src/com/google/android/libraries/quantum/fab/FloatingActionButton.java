// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.quantum.fab;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import g;
import gmj;
import java.lang.reflect.Constructor;

public class FloatingActionButton extends ImageView
{

    private int a;
    private int b;
    private int c;

    public FloatingActionButton(Context context)
    {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public FloatingActionButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = context.obtainStyledAttributes(attributeset, gmj.E, i, g.rR);
        i = context.getColor(gmj.G, 0);
        int j = context.getColor(gmj.H, 0);
        int k = context.getInt(gmj.I, 0);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            setElevation(context.getDimension(gmj.F, 0.0F));
        }
        a(i, j);
        a(k);
        context.recycle();
    }

    private static Drawable b(int i, int j)
    {
        GradientDrawable gradientdrawable = c(i);
        Drawable drawable;
        try
        {
            drawable = (Drawable)Class.forName("android.graphics.drawable.RippleDrawable").getConstructor(new Class[] {
                android/content/res/ColorStateList, android/graphics/drawable/Drawable, android/graphics/drawable/Drawable
            }).newInstance(new Object[] {
                ColorStateList.valueOf(j), gradientdrawable, null
            });
        }
        catch (Exception exception)
        {
            StateListDrawable statelistdrawable = new StateListDrawable();
            GradientDrawable gradientdrawable1 = c(j);
            statelistdrawable.addState(new int[] {
                0x10100a7
            }, gradientdrawable1);
            gradientdrawable1 = c(0x106000d);
            statelistdrawable.addState(new int[0], gradientdrawable1);
            return new LayerDrawable(new Drawable[] {
                gradientdrawable, statelistdrawable
            });
        }
        return drawable;
    }

    private static GradientDrawable c(int i)
    {
        GradientDrawable gradientdrawable = new GradientDrawable();
        gradientdrawable.setShape(1);
        gradientdrawable.setColor(i);
        return gradientdrawable;
    }

    public void a(int i)
    {
        Resources resources = getResources();
        i;
        JVM INSTR tableswitch 1 1: default 24
    //                   1 63;
           goto _L1 _L2
_L1:
        a = resources.getDimensionPixelSize(g.rN);
        i = resources.getDimensionPixelSize(g.rP);
_L4:
        setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        setPadding(i, i, i, i);
        requestLayout();
        return;
_L2:
        a = resources.getDimensionPixelSize(g.rO);
        i = resources.getDimensionPixelSize(g.rQ);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(int i, int j)
    {
        if (b == i && c == j)
        {
            return;
        } else
        {
            b = i;
            c = j;
            Drawable drawable = b(i, j);
            i = getPaddingTop();
            j = getPaddingLeft();
            int k = getPaddingRight();
            int l = getPaddingBottom();
            setBackgroundDrawable(drawable);
            setPadding(j, i, k, l);
            return;
        }
    }

    public void b(int i)
    {
        a(i, c);
    }

    public android.view.ViewGroup.LayoutParams getLayoutParams()
    {
        android.view.ViewGroup.LayoutParams layoutparams = super.getLayoutParams();
        if (layoutparams != null)
        {
            layoutparams.height = a;
            layoutparams.width = a;
        }
        return layoutparams;
    }

    public void setElevation(float f)
    {
        super.setElevation(f);
        StateListAnimator statelistanimator = new StateListAnimator();
        ObjectAnimator objectanimator = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[] {
            PropertyValuesHolder.ofFloat("translationZ", new float[] {
                getElevation()
            }), PropertyValuesHolder.ofFloat("scaleX", new float[] {
                1.05F
            }), PropertyValuesHolder.ofFloat("scaleY", new float[] {
                1.05F
            })
        });
        statelistanimator.addState(new int[] {
            0x101009e, 0x10100a7
        }, objectanimator);
        objectanimator = ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[] {
            PropertyValuesHolder.ofFloat("translationZ", new float[] {
                0.0F
            }), PropertyValuesHolder.ofFloat("scaleX", new float[] {
                1.0F
            }), PropertyValuesHolder.ofFloat("scaleY", new float[] {
                1.0F
            })
        });
        statelistanimator.addState(new int[0], objectanimator);
        setStateListAnimator(statelistanimator);
    }
}
