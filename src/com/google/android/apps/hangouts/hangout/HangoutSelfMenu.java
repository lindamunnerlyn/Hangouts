// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import bnk;
import boo;
import bpc;
import bpe;
import bpk;
import bpl;
import bpm;
import brl;
import g;
import gdv;
import gmt;
import hlp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class HangoutSelfMenu extends LinearLayout
{

    public final bnk a = bnk.a();
    public List b;
    private boolean c;
    private final boo d = boo.a();
    private final bpk e = new bpk(this);
    private final bpl f = new bpl(this);

    public HangoutSelfMenu(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void a(bpc bpc, gmt gmt, bpm bpm)
    {
        removeAllViews();
        Object obj = hlp.c(getContext(), brl);
        Collections.sort(((List) (obj)));
        b = new ArrayList();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            List list = ((brl)((Iterator) (obj)).next()).a(getContext(), bpc, gmt, bpm);
            if (list != null)
            {
                b.addAll(list);
            }
        } while (true);
        for (bpc = b.iterator(); bpc.hasNext(); addView(((bpe)bpc.next()).a(LayoutInflater.from(getContext()), g.gg, (ViewGroup)getParent()))) { }
        gdv.b("Expected condition to be false", c);
        d.a(f);
        a.a(e);
        setVisibility(0);
        c = true;
    }

    public boolean a()
    {
        return c;
    }

    public void b()
    {
        if (c)
        {
            setVisibility(8);
            d.b(f);
            a.b(e);
            c = false;
            b = null;
        }
    }
}
