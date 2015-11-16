// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import ani;
import eam;
import edr;
import eds;
import edt;
import fwz;
import g;
import gbh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class EasterEggView extends FrameLayout
{

    private static final String a[] = {
        "ponies", "ponystream", "pitchforks"
    };
    private static final Random b = new Random();
    private static final int e[];
    private final TypedArray c;
    private final TypedArray d;
    private Handler f;
    private Runnable g;
    private Runnable h;
    private int i;
    private final List j;

    public EasterEggView(Context context)
    {
        this(context, null);
    }

    public EasterEggView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = new Handler();
        j = new ArrayList();
        context = context.getResources();
        c = context.obtainTypedArray(g.cI);
        d = context.obtainTypedArray(g.cH);
    }

    public static String a(String s)
    {
        if (s == null || s.length() == 0 || s.charAt(0) != '/')
        {
            return null;
        }
        String as[] = a;
        int l = as.length;
        String s1;
        for (int k = 0; k < l; k++)
        {
            String s2 = as[k];
            s1 = String.valueOf(s2);
            if (s1.length() != 0)
            {
                s1 = "/".concat(s1);
            } else
            {
                s1 = new String("/");
            }
            if (TextUtils.equals(s, s1))
            {
                return s2;
            }
        }

        return null;
    }

    public static List a(EasterEggView eastereggview)
    {
        return eastereggview.j;
    }

    private void a(ani ani1, TypedArray typedarray, int k)
    {
        if (typedarray == null)
        {
            return;
        }
        int l = b.nextInt(typedarray.length());
        String s = String.valueOf("//ssl.gstatic.com/chat/babble/ee/");
        typedarray = String.valueOf(typedarray.getString(l));
        if (typedarray.length() != 0)
        {
            typedarray = s.concat(typedarray);
        } else
        {
            typedarray = new String(s);
        }
        ani1 = new eam(typedarray, ani1.a());
        ani1.a(false);
        ani1.c(false);
        ani1.d(false);
        j.add(new edt(this, ani1, k));
    }

    public static void a(EasterEggView eastereggview, ani ani1, TypedArray typedarray, int k)
    {
        eastereggview.a(ani1, typedarray, k);
    }

    public static TypedArray b(EasterEggView eastereggview)
    {
        return eastereggview.c;
    }

    public static Random b()
    {
        return b;
    }

    public static boolean b(String s)
    {
        return !TextUtils.equals(s, "ponystream");
    }

    public static Handler c(EasterEggView eastereggview)
    {
        return eastereggview.f;
    }

    public static int[] c()
    {
        return e;
    }

    public static TypedArray d(EasterEggView eastereggview)
    {
        return eastereggview.d;
    }

    public static int e(EasterEggView eastereggview)
    {
        return eastereggview.i;
    }

    public static int f(EasterEggView eastereggview)
    {
        int k = eastereggview.i;
        eastereggview.i = k - 1;
        return k;
    }

    public static Runnable g(EasterEggView eastereggview)
    {
        eastereggview.h = null;
        return null;
    }

    public void a()
    {
        for (Iterator iterator = j.iterator(); iterator.hasNext(); iterator.remove())
        {
            ((edt)iterator.next()).a();
        }

        boolean flag;
        if (j.size() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gbh.a(flag);
        if (g != null)
        {
            f.removeCallbacks(g);
            g = null;
        }
        if (h != null)
        {
            f.removeCallbacks(h);
            h = null;
        }
    }

    public void a(ani ani1, String s)
    {
        if (fwz.a(getContext().getContentResolver(), "babel_easter_eggs", true))
        {
            if (TextUtils.equals("ponies", s))
            {
                int k;
                if (b.nextBoolean())
                {
                    k = g.cv;
                } else
                {
                    k = g.cu;
                }
                a(ani1, c, k);
                return;
            }
            if (TextUtils.equals("ponystream", s))
            {
                if (g != null)
                {
                    f.removeCallbacks(g);
                    g = null;
                    return;
                } else
                {
                    g = new edr(this, ani1);
                    f.post(g);
                    return;
                }
            }
            if (TextUtils.equals("pitchforks", s) && h == null)
            {
                i = b.nextInt(20) + 20;
                h = new eds(this, ani1);
                f.post(h);
                return;
            }
        }
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
    }

    static 
    {
        e = (new int[] {
            g.cw, g.cy, g.cx
        });
    }
}
