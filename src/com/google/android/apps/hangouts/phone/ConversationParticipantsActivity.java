// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.phone;

import android.os.Bundle;
import android.view.MenuItem;
import bka;
import g;
import gng;
import l;
import po;

public class ConversationParticipantsActivity extends bka
{

    public ConversationParticipantsActivity()
    {
        (new gng(this, q)).a(p);
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
        setContentView(g.fB);
        bundle = g();
        bundle.a(true);
        bundle.a(l.aC);
    }
}
