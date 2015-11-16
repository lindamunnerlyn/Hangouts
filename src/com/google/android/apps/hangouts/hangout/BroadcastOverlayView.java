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
import bni;
import bnk;
import bns;
import bpb;
import bpc;
import bpm;
import g;
import h;
import l;

public final class BroadcastOverlayView extends LinearLayout
    implements bpb
{

    private final bns a = new bni(this);
    private final bnk b = bnk.a();
    private TextView c;
    private TextView d;

    public BroadcastOverlayView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public static void a(BroadcastOverlayView broadcastoverlayview)
    {
        Object obj = broadcastoverlayview.b.s();
        if (((bpm) (obj)).a(((bpm) (obj)).m(), ((bpm) (obj)).n()))
        {
            boolean flag = ((bpm) (obj)).o();
            obj = broadcastoverlayview.c;
            int i;
            if (flag)
            {
                i = l.et;
            } else
            {
                i = l.el;
            }
            ((TextView) (obj)).setText(i);
            obj = broadcastoverlayview.c;
            if (flag)
            {
                i = broadcastoverlayview.getContext().getResources().getColor(g.dM);
            } else
            {
                i = broadcastoverlayview.getContext().getResources().getColor(g.dl);
            }
            ((TextView) (obj)).setTextColor(i);
            obj = broadcastoverlayview.c;
            if (flag)
            {
                i = broadcastoverlayview.getContext().getResources().getColor(g.dL);
            } else
            {
                i = broadcastoverlayview.getContext().getResources().getColor(g.dk);
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

    public void a(bpc bpc)
    {
        b.a(a);
    }

    public void j_()
    {
        b.b(a);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        c = (TextView)findViewById(h.bM);
        d = (TextView)findViewById(h.bO);
    }
}
