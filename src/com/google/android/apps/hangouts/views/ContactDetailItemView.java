// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import bhk;
import bhl;
import bhm;
import bho;
import ebw;
import g;
import gf;
import gq;
import java.util.Locale;
import l;

public class ContactDetailItemView extends TextView
{

    private static boolean a;
    private static String b;
    private static String c;
    private static String d;
    private static String e;
    private static String f;
    private static StyleSpan g = new StyleSpan(1);
    private static ForegroundColorSpan h;
    private static AccessibilityManager i;

    public ContactDetailItemView(Context context)
    {
        this(context, null);
    }

    public ContactDetailItemView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        if (!a)
        {
            context = context.getApplicationContext().getResources();
            b = context.getString(l.s);
            c = context.getString(l.u);
            d = context.getString(l.v);
            e = context.getString(l.t);
            f = context.getString(l.w);
            g = new StyleSpan(1);
            h = new ForegroundColorSpan(context.getColor(g.dn));
            i = (AccessibilityManager)getContext().getSystemService("accessibility");
            a = true;
        }
    }

    private void a(String s, String s1)
    {
        if (TextUtils.isEmpty(s) || TextUtils.isEmpty(s1) || i.isEnabled())
        {
            setText(s);
            return;
        }
        int j = s.toUpperCase(Locale.getDefault()).indexOf(s1.toUpperCase(Locale.getDefault()));
        if (j == -1)
        {
            setText(s);
            return;
        } else
        {
            int k = s1.length() + j;
            s = new SpannableStringBuilder(s);
            s.setSpan(g, j, k, 0);
            s.setSpan(h, j, k, 0);
            setText(s);
            return;
        }
    }

    public void a(bhl bhl, String s)
    {
        if (bhl instanceof bhm)
        {
            a(((bhm)bhl).a, s);
            return;
        }
        if (bhl instanceof bho)
        {
            bhl = (bho)bhl;
            a(gf.a().a(bhl.a(), gq.a), s);
            return;
        }
        if (bhl instanceof bhk)
        {
            a(((bhk)bhl).a(), null);
            return;
        } else
        {
            ebw.g("Babel", "Invalid contact detail item");
            return;
        }
    }

}
