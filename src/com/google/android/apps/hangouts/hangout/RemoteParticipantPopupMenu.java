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
import bot;
import bov;
import bpd;
import brc;
import bsa;
import g;
import gjr;
import hgx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RemoteParticipantPopupMenu extends LinearLayout
{

    public final bnd a = bnd.a();
    private boolean b;
    private final bsa c = new bsa(this);
    private List d;

    public RemoteParticipantPopupMenu(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public static List a(RemoteParticipantPopupMenu remoteparticipantpopupmenu)
    {
        return remoteparticipantpopupmenu.d;
    }

    public void a(bot bot, gjr gjr, bpd bpd)
    {
        removeAllViews();
        Object obj = hgx.c(getContext(), brc);
        Collections.sort(((List) (obj)));
        d = new ArrayList();
        brc brc1;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); d.addAll(brc1.a(getContext(), bot, gjr, bpd)))
        {
            brc1 = (brc)((Iterator) (obj)).next();
        }

        for (bot = d.iterator(); bot.hasNext(); addView(((bov)bot.next()).a(LayoutInflater.from(getContext()), g.gi, (ViewGroup)getParent()))) { }
        b = true;
        a.a(c);
    }

    public boolean a()
    {
        return b;
    }

    public void b()
    {
        a.b(c);
        removeAllViews();
        d = null;
        b = false;
    }
}
