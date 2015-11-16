// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.Window;
import ap;
import bio;
import bkm;
import cgd;
import com.google.android.apps.hangouts.fragments.ConversationInviteListFragment;
import djs;
import g;
import gqu;
import grn;
import h;

public class InvitationListActivity extends bkm
    implements bio, djs
{

    public final gqu n;
    public ConversationInviteListFragment o;

    public InvitationListActivity()
    {
        n = (new grn(this, r)).a(q);
    }

    public void a(cgd cgd, String s, int i, long l)
    {
        startActivity(g.a(n.a(), s, cgd, i, l));
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.fp);
        o = (ConversationInviteListFragment)u_().a(h.at);
        o.a(this);
        o.b();
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            int i = g.ds;
            getWindow().setStatusBarColor(getResources().getColor(i));
        }
        if (bundle == null)
        {
            g.b(getIntent());
        }
    }
}
