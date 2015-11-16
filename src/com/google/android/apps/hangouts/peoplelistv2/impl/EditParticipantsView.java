// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.peoplelistv2.impl;

import aic;
import aig;
import aip;
import air;
import ais;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ani;
import apk;
import cfz;
import cga;
import cgb;
import cgc;
import cgd;
import cge;
import cgf;
import com.google.android.apps.hangouts.views.AvatarView;
import daf;
import ebw;
import g;
import h;
import java.util.Iterator;
import java.util.List;
import l;

// Referenced classes of package com.google.android.apps.hangouts.peoplelistv2.impl:
//            ScrollViewCustom, DeleteOnEmptyEditText

public class EditParticipantsView extends FrameLayout
{

    public static final boolean a = false;
    private aip b;
    private ScrollViewCustom c;
    private ViewGroup d;
    private DeleteOnEmptyEditText e;
    private boolean f;
    private View g;
    private ani h;
    private int i;
    private TextWatcher j;
    private air k;
    private android.view.View.OnClickListener l;
    private android.animation.Animator.AnimatorListener m;

    public EditParticipantsView(Context context)
    {
        this(context, null);
    }

    public EditParticipantsView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public EditParticipantsView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        g = null;
        j = new cgc(this);
        k = new cgd(this);
        l = new cge(this);
        m = new cgf(this);
    }

    public static View a(EditParticipantsView editparticipantsview, View view)
    {
        editparticipantsview.g = view;
        return view;
    }

    public static ViewGroup a(EditParticipantsView editparticipantsview)
    {
        return editparticipantsview.d;
    }

    private void a()
    {
        Object obj;
        int i1;
        boolean flag;
        if (h != null && !g.a(h, apk.g))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        obj = b.c();
        i1 = 0;
        while (i1 < d.getChildCount()) 
        {
            Object obj1 = d.getChildAt(i1);
            Object obj3 = ((View) (obj1)).getTag();
            if (((List) (obj)).contains(obj3))
            {
                a(((View) (obj1)), (ais)obj3);
                ((List) (obj)).remove(obj3);
            } else
            if (flag)
            {
                ((View) (obj1)).setOnClickListener(null);
                AvatarView avatarview = (AvatarView)((View) (obj1)).findViewById(l.uB);
                TextView textview = (TextView)((View) (obj1)).findViewById(l.uE);
                avatarview.setVisibility(4);
                textview.setVisibility(4);
                obj1 = ObjectAnimator.ofPropertyValuesHolder(obj1, new PropertyValuesHolder[] {
                    PropertyValuesHolder.ofFloat(SCALE_X, new float[] {
                        1.0F, 0.0F
                    })
                });
                ((ValueAnimator) (obj1)).setInterpolator(new aic(aig.a));
                ((ValueAnimator) (obj1)).setDuration(200L);
                ((ValueAnimator) (obj1)).addListener(m);
                ((ValueAnimator) (obj1)).start();
            } else
            {
                d.removeView(((View) (obj1)));
                i1--;
            }
            i1++;
        }
        Object obj2;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((ValueAnimator) (obj2)).start())
        {
            obj2 = (ais)((Iterator) (obj)).next();
            cgb cgb1 = new cgb(this, ((ais) (obj2)));
            View view = LayoutInflater.from(getContext()).inflate(g.nB, this, false);
            view.setOnClickListener(l);
            ((ImageView)view.findViewById(l.uC)).setOnClickListener(cgb1);
            view.setScaleX(0.0F);
            d.addView(view);
            a(view, ((ais) (obj2)));
            obj2 = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[] {
                PropertyValuesHolder.ofFloat(SCALE_X, new float[] {
                    0.0F, 1.0F
                })
            });
            ((ValueAnimator) (obj2)).setInterpolator(new aic(aig.a));
            ((ValueAnimator) (obj2)).setDuration(200L);
        }

        requestLayout();
    }

    private void a(View view, ais ais1)
    {
        Resources resources = getResources();
        String s = "";
        String s1;
        String s3;
        int i1;
        boolean flag;
        boolean flag1;
        if (ais1.c())
        {
            s = ais1.d();
        } else
        if (ais1.e())
        {
            s = ais1.f();
        } else
        if (ais1.a())
        {
            s = ais1.b().d;
        }
        if (TextUtils.isEmpty(s))
        {
            s = resources.getString(0x104000e);
        }
        s1 = ais1.g();
        if (a)
        {
            String s2 = String.valueOf(ais1.i());
            ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 36 + String.valueOf(s2).length())).append("Displaying chip text '").append(s).append("' for person: ").append(s2).toString());
        }
        s3 = resources.getString(h.iM, new Object[] {
            s
        });
        flag = b.c(ais1);
        resources = getResources();
        flag1 = view.equals(g);
        if (d.indexOfChild(view) > 0 || flag1)
        {
            view.setContentDescription(getResources().getString(h.iF, new Object[] {
                s3
            }));
        } else
        {
            view.setContentDescription(s3);
        }
        view.setVisibility(0);
        view.setTag(ais1);
        ais1 = (AvatarView)view.findViewById(l.uB);
        ais1.a(s1, s, h);
        ais1.a(0);
        ais1 = (ImageView)view.findViewById(l.ut);
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        ais1.setVisibility(i1);
        ais1 = (ImageView)view.findViewById(l.uC);
        if (flag1 && !flag)
        {
            ais1.setVisibility(0);
            ais1.setContentDescription(getResources().getString(h.iW, new Object[] {
                s
            }));
        } else
        {
            ais1.setVisibility(8);
        }
        ais1 = view.findViewById(l.uu);
        if (flag1)
        {
            i1 = g.nr;
        } else
        {
            i1 = g.nq;
        }
        ((GradientDrawable)ais1.getBackground()).setColor(getResources().getColor(i1));
        ais1 = (TextView)view.findViewById(l.uE);
        ais1.setTextColor(resources.getColor(g.ns));
        if (!flag1 && b.c().size() >= i)
        {
            view = s.substring(0, 1);
            if (s.length() > 1)
            {
                view = String.valueOf(view);
                view = (new StringBuilder(String.valueOf(view).length() + 1)).append(view).append("\u2026").toString();
            }
            ais1.setText(view);
            return;
        } else
        {
            ais1.setText(s);
            return;
        }
    }

    public static aip b(EditParticipantsView editparticipantsview)
    {
        return editparticipantsview.b;
    }

    public static void c(EditParticipantsView editparticipantsview)
    {
        editparticipantsview.a();
    }

    public static boolean d(EditParticipantsView editparticipantsview)
    {
        return editparticipantsview.f;
    }

    public static ScrollViewCustom e(EditParticipantsView editparticipantsview)
    {
        return editparticipantsview.c;
    }

    public static DeleteOnEmptyEditText f(EditParticipantsView editparticipantsview)
    {
        return editparticipantsview.e;
    }

    public static View g(EditParticipantsView editparticipantsview)
    {
        return editparticipantsview.g;
    }

    public void a(aip aip1)
    {
        b = aip1;
        aip1.a(k);
    }

    public void a(ani ani)
    {
        h = ani;
    }

    public void a(boolean flag)
    {
        f = flag;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        c = (ScrollViewCustom)findViewById(l.ux);
        d = (ViewGroup)findViewById(l.uz);
        d.setOnClickListener(l);
        e = (DeleteOnEmptyEditText)findViewById(l.uw);
        e.addTextChangedListener(j);
        e.setOnFocusChangeListener(new cfz(this));
        e.a(new cga(this));
        e.requestFocus();
        e.sendAccessibilityEvent(32);
        i = getResources().getInteger(g.nw);
        a();
    }

    static 
    {
        hik hik = ebw.w;
    }
}
