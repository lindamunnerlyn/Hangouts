// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.peoplelistv2.impl;

import ahv;
import ahz;
import aii;
import aik;
import ail;
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
import aoa;
import aqc;
import chf;
import chg;
import chh;
import chi;
import chj;
import chk;
import chl;
import com.google.android.apps.hangouts.views.AvatarView;
import dbl;
import eev;
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
    private aii b;
    private ScrollViewCustom c;
    private ViewGroup d;
    private DeleteOnEmptyEditText e;
    private boolean f;
    private View g;
    private aoa h;
    private int i;
    private TextWatcher j;
    private aik k;
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
        j = new chi(this);
        k = new chj(this);
        l = new chk(this);
        m = new chl(this);
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

    private void a(View view, ail ail1)
    {
        Resources resources = getResources();
        String s = "";
        String s1;
        String s3;
        int i1;
        boolean flag;
        boolean flag1;
        if (ail1.c())
        {
            s = ail1.d();
        } else
        if (ail1.e())
        {
            s = ail1.f();
        } else
        if (ail1.a())
        {
            s = ail1.b().d;
        }
        if (TextUtils.isEmpty(s))
        {
            s = resources.getString(0x104000e);
        }
        s1 = ail1.g();
        if (a)
        {
            String s2 = String.valueOf(ail1.i());
            eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 36 + String.valueOf(s2).length())).append("Displaying chip text '").append(s).append("' for person: ").append(s2).toString());
        }
        s3 = resources.getString(h.iK, new Object[] {
            s
        });
        flag = b.c(ail1);
        resources = getResources();
        flag1 = view.equals(g);
        if (d.indexOfChild(view) > 0 || flag1)
        {
            view.setContentDescription(getResources().getString(h.iB, new Object[] {
                s3
            }));
        } else
        {
            view.setContentDescription(s3);
        }
        view.setVisibility(0);
        view.setTag(ail1);
        ail1 = (AvatarView)view.findViewById(l.tS);
        ail1.a(s1, s, h);
        ail1.a(0);
        ail1 = (ImageView)view.findViewById(l.tK);
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        ail1.setVisibility(i1);
        ail1 = (ImageView)view.findViewById(l.tT);
        if (flag1 && !flag)
        {
            ail1.setVisibility(0);
            ail1.setContentDescription(getResources().getString(h.iU, new Object[] {
                s
            }));
        } else
        {
            ail1.setVisibility(8);
        }
        ail1 = view.findViewById(l.tL);
        if (flag1)
        {
            i1 = g.ns;
        } else
        {
            i1 = g.nr;
        }
        ((GradientDrawable)ail1.getBackground()).setColor(getResources().getColor(i1));
        ail1 = (TextView)view.findViewById(l.tV);
        ail1.setTextColor(resources.getColor(g.nt));
        if (!flag1 && b.c().size() >= i)
        {
            view = s.substring(0, 1);
            if (s.length() > 1)
            {
                view = String.valueOf(view);
                view = (new StringBuilder(String.valueOf(view).length() + 1)).append(view).append("\u2026").toString();
            }
            ail1.setText(view);
            return;
        } else
        {
            ail1.setText(s);
            return;
        }
    }

    public static aii b(EditParticipantsView editparticipantsview)
    {
        return editparticipantsview.b;
    }

    public static void c(EditParticipantsView editparticipantsview)
    {
        Object obj;
        int i1;
        boolean flag;
        if (editparticipantsview.h != null && !g.a(editparticipantsview.h, aqc.g))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        obj = editparticipantsview.b.c();
        i1 = 0;
        while (i1 < editparticipantsview.d.getChildCount()) 
        {
            Object obj1 = editparticipantsview.d.getChildAt(i1);
            Object obj3 = ((View) (obj1)).getTag();
            if (((List) (obj)).contains(obj3))
            {
                editparticipantsview.a(((View) (obj1)), (ail)obj3);
                ((List) (obj)).remove(obj3);
            } else
            if (flag)
            {
                ((View) (obj1)).setOnClickListener(null);
                AvatarView avatarview = (AvatarView)((View) (obj1)).findViewById(l.tS);
                TextView textview = (TextView)((View) (obj1)).findViewById(l.tV);
                avatarview.setVisibility(4);
                textview.setVisibility(4);
                obj1 = ObjectAnimator.ofPropertyValuesHolder(obj1, new PropertyValuesHolder[] {
                    PropertyValuesHolder.ofFloat(SCALE_X, new float[] {
                        1.0F, 0.0F
                    })
                });
                ((ValueAnimator) (obj1)).setInterpolator(new ahv(ahz.a));
                ((ValueAnimator) (obj1)).setDuration(200L);
                ((ValueAnimator) (obj1)).addListener(editparticipantsview.m);
                ((ValueAnimator) (obj1)).start();
            } else
            {
                editparticipantsview.d.removeView(((View) (obj1)));
                i1--;
            }
            i1++;
        }
        Object obj2;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((ValueAnimator) (obj2)).start())
        {
            obj2 = (ail)((Iterator) (obj)).next();
            chh chh1 = new chh(editparticipantsview, ((ail) (obj2)));
            View view = LayoutInflater.from(editparticipantsview.getContext()).inflate(g.nD, editparticipantsview, false);
            view.setOnClickListener(editparticipantsview.l);
            ((ImageView)view.findViewById(l.tT)).setOnClickListener(chh1);
            view.setScaleX(0.0F);
            editparticipantsview.d.addView(view);
            editparticipantsview.a(view, ((ail) (obj2)));
            obj2 = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[] {
                PropertyValuesHolder.ofFloat(SCALE_X, new float[] {
                    0.0F, 1.0F
                })
            });
            ((ValueAnimator) (obj2)).setInterpolator(new ahv(ahz.a));
            ((ValueAnimator) (obj2)).setDuration(200L);
        }

        editparticipantsview.requestLayout();
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

    public void a(aii aii1)
    {
        b = aii1;
        aii1.a(k);
    }

    public void a(aoa aoa)
    {
        h = aoa;
    }

    public void a(boolean flag)
    {
        f = flag;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        c = (ScrollViewCustom)findViewById(l.tO);
        d = (ViewGroup)findViewById(l.tQ);
        d.setOnClickListener(l);
        e = (DeleteOnEmptyEditText)findViewById(l.tN);
        e.addTextChangedListener(j);
        e.setOnFocusChangeListener(new chf(this));
        e.a(new chg(this));
        e.requestFocus();
        e.sendAccessibilityEvent(32);
        i = getResources().getInteger(g.ny);
        Object obj;
        int i1;
        boolean flag;
        if (h != null && !g.a(h, aqc.g))
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
                a(((View) (obj1)), (ail)obj3);
                ((List) (obj)).remove(obj3);
            } else
            if (flag)
            {
                ((View) (obj1)).setOnClickListener(null);
                AvatarView avatarview = (AvatarView)((View) (obj1)).findViewById(l.tS);
                TextView textview = (TextView)((View) (obj1)).findViewById(l.tV);
                avatarview.setVisibility(4);
                textview.setVisibility(4);
                obj1 = ObjectAnimator.ofPropertyValuesHolder(obj1, new PropertyValuesHolder[] {
                    PropertyValuesHolder.ofFloat(SCALE_X, new float[] {
                        1.0F, 0.0F
                    })
                });
                ((ValueAnimator) (obj1)).setInterpolator(new ahv(ahz.a));
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
            obj2 = (ail)((Iterator) (obj)).next();
            chh chh1 = new chh(this, ((ail) (obj2)));
            View view = LayoutInflater.from(getContext()).inflate(g.nD, this, false);
            view.setOnClickListener(l);
            ((ImageView)view.findViewById(l.tT)).setOnClickListener(chh1);
            view.setScaleX(0.0F);
            d.addView(view);
            a(view, ((ail) (obj2)));
            obj2 = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[] {
                PropertyValuesHolder.ofFloat(SCALE_X, new float[] {
                    0.0F, 1.0F
                })
            });
            ((ValueAnimator) (obj2)).setInterpolator(new ahv(ahz.a));
            ((ValueAnimator) (obj2)).setDuration(200L);
        }

        requestLayout();
    }

    static 
    {
        hnc hnc = eev.w;
    }
}
