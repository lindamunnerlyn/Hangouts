// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import bnd;
import brd;
import bre;
import brp;
import gbh;
import gjr;
import hgx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ParticipantOverlays extends LinearLayout
{

    public List a;
    private final bre b = new bre(this);
    private final bnd c = bnd.a();
    private gjr d;

    public ParticipantOverlays(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public static gjr a(ParticipantOverlays participantoverlays)
    {
        return participantoverlays.d;
    }

    public void a()
    {
        gbh.b(a);
        c.b(b);
        removeAllViews();
        a = null;
    }

    public void a(gjr gjr)
    {
        gbh.a(a);
        d = gjr;
        a = new ArrayList();
        Context context = getContext();
        brd brd1;
        for (Iterator iterator = hgx.c(context, brp).iterator(); iterator.hasNext(); a.add(brd1))
        {
            brd1 = ((brp)iterator.next()).a(context, gjr);
        }

        for (gjr = a.iterator(); gjr.hasNext(); addView(((brd)gjr.next()).a())) { }
        c.a(b);
    }
}
