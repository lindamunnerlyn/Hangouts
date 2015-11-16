// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.os.Bundle;
import android.view.MenuItem;
import bkm;
import g;
import grn;
import l;
import pq;

public class ConversationParticipantsActivity extends bkm
{

    public ConversationParticipantsActivity()
    {
        (new grn(this, r)).a(q);
    }

    public boolean a(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.a(menuitem);

        case 16908332: 
            onBackPressed();
            break;
        }
        return true;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(g.fz);
        bundle = g();
        bundle.a(true);
        bundle.a(l.ax);
    }
}
