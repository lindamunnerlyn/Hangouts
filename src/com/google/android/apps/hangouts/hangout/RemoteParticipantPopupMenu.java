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
import bpc;
import bpe;
import bpm;
import brl;
import bsj;
import g;
import gmt;
import hlp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RemoteParticipantPopupMenu extends LinearLayout
{

    public final bnk a = bnk.a();
    public List b;
    private boolean c;
    private final bsj d = new bsj(this);

    public RemoteParticipantPopupMenu(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public void a(bpc bpc, gmt gmt, bpm bpm)
    {
        removeAllViews();
        Object obj = hlp.c(getContext(), brl);
        Collections.sort(((List) (obj)));
        b = new ArrayList();
        brl brl1;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); b.addAll(brl1.a(getContext(), bpc, gmt, bpm)))
        {
            brl1 = (brl)((Iterator) (obj)).next();
        }

        for (bpc = b.iterator(); bpc.hasNext(); addView(((bpe)bpc.next()).a(LayoutInflater.from(getContext()), g.ge, (ViewGroup)getParent()))) { }
        c = true;
        a.a(d);
    }

    public boolean a()
    {
        return c;
    }

    public void b()
    {
        a.b(d);
        removeAllViews();
        b = null;
        c = false;
    }
}
