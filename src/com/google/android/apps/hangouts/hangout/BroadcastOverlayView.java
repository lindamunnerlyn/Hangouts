// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import bmz;
import bnd;
import bnk;
import bos;
import bot;
import bpd;
import g;
import h;
import l;

public final class BroadcastOverlayView extends LinearLayout
    implements bos
{

    private final bnk a = new bmz(this);
    private final bnd b = bnd.a();
    private TextView c;
    private TextView d;

    public BroadcastOverlayView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public static void a(BroadcastOverlayView broadcastoverlayview)
    {
        Object obj = broadcastoverlayview.b.t();
        if (((bpd) (obj)).a(((bpd) (obj)).n(), ((bpd) (obj)).o()))
        {
            boolean flag = ((bpd) (obj)).p();
            obj = broadcastoverlayview.c;
            int i;
            if (flag)
            {
                i = l.eK;
            } else
            {
                i = l.eC;
            }
            ((TextView) (obj)).setText(i);
            obj = broadcastoverlayview.c;
            if (flag)
            {
                i = broadcastoverlayview.getContext().getResources().getColor(g.dN);
            } else
            {
                i = broadcastoverlayview.getContext().getResources().getColor(g.dm);
            }
            ((TextView) (obj)).setTextColor(i);
            obj = broadcastoverlayview.c;
            if (flag)
            {
                i = broadcastoverlayview.getContext().getResources().getColor(g.dM);
            } else
            {
                i = broadcastoverlayview.getContext().getResources().getColor(g.dl);
            }
            ((TextView) (obj)).setBackgroundColor(i);
            broadcastoverlayview.c.setVisibility(0);
            return;
        } else
        {
            broadcastoverlayview.c.setVisibility(8);
            return;
        }
    }

    public void a(int i)
    {
    }

    public void a(bot bot)
    {
        b.a(a);
    }

    public void i_()
    {
        b.b(a);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        c = (TextView)findViewById(h.bW);
        d = (TextView)findViewById(h.bY);
    }
}
