// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import bnd;
import bof;
import bot;
import bov;
import bpb;
import bpc;
import bpd;
import brc;
import g;
import gbh;
import gjr;
import hgx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class HangoutSelfMenu extends LinearLayout
{

    public List a;
    private boolean b;
    private final bof c = bof.a();
    private final bpb d = new bpb(this);
    private final bnd e = bnd.a();
    private final bpc f = new bpc(this);

    public HangoutSelfMenu(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public static bnd a(HangoutSelfMenu hangoutselfmenu)
    {
        return hangoutselfmenu.e;
    }

    public void a(bot bot, gjr gjr, bpd bpd)
    {
        removeAllViews();
        Object obj = hgx.c(getContext(), brc);
        Collections.sort(((List) (obj)));
        a = new ArrayList();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            List list = ((brc)((Iterator) (obj)).next()).a(getContext(), bot, gjr, bpd);
            if (list != null)
            {
                a.addAll(list);
            }
        } while (true);
        for (bot = a.iterator(); bot.hasNext(); addView(((bov)bot.next()).a(LayoutInflater.from(getContext()), g.gk, (ViewGroup)getParent()))) { }
        gbh.b(b);
        c.a(f);
        e.a(d);
        setVisibility(0);
        b = true;
    }

    public boolean a()
    {
        return b;
    }

    public void b()
    {
        if (b)
        {
            setVisibility(8);
            c.b(f);
            e.b(d);
            b = false;
            a = null;
        }
    }
}
