// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.Window;
import ap;
import bic;
import bka;
import cey;
import com.google.android.apps.hangouts.fragments.ConversationInviteListFragment;
import dih;
import g;
import gmo;
import gng;
import h;

public class InvitationListActivity extends bka
    implements bic, dih
{

    public final gmo m;
    public ConversationInviteListFragment n;

    public InvitationListActivity()
    {
        m = (new gng(this, q)).a(p);
    }

    public void a(cey cey, String s, int i, long l)
    {
        startActivity(g.a(m.a(), s, cey, i, l));
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.fr);
        n = (ConversationInviteListFragment)t_().a(h.ay);
        n.a(this);
        n.b();
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            int i = g.dt;
            getWindow().setStatusBarColor(getResources().getColor(i));
        }
        if (bundle == null)
        {
            g.b(getIntent());
        }
    }
}
