// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import bnk;
import brm;
import brn;
import bry;
import gdv;
import gmt;
import hlp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ParticipantOverlays extends LinearLayout
{

    public gmt a;
    public List b;
    private final brn c = new brn(this);
    private final bnk d = bnk.a();

    public ParticipantOverlays(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void a()
    {
        gdv.b("Expected non-null", b);
        d.b(c);
        removeAllViews();
        b = null;
    }

    public void a(gmt gmt)
    {
        gdv.a("Expected null", b);
        a = gmt;
        b = new ArrayList();
        Context context = getContext();
        brm brm1;
        for (Iterator iterator = hlp.c(context, bry).iterator(); iterator.hasNext(); b.add(brm1))
        {
            brm1 = ((bry)iterator.next()).a(context, gmt);
        }

        for (gmt = b.iterator(); gmt.hasNext(); addView(((brm)gmt.next()).a())) { }
        d.a(c);
    }
}
