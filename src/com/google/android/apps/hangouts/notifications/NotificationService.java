// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.notifications;

import android.content.Intent;
import apu;
import cea;
import cej;
import cek;
import ceq;
import cer;
import cfb;
import cfc;
import dok;
import dol;
import eev;
import jnv;

public class NotificationService extends dok
{

    public NotificationService()
    {
        super("NotificationService");
    }

    public void a(Intent intent, jnv jnv)
    {
        try
        {
            super.a(intent, jnv);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (jnv jnv)
        {
            int i = intent.getIntExtra("account_id", -1);
            eev.f("Babel", (new StringBuilder(71)).append("Ignoring NotificationService intent for invalid account id: ").append(i).toString());
            return;
        }
    }

    protected dol[] a()
    {
        return (new dol[] {
            new cfc(), new cer(), new cek(), new cea(), new cfb(), new ceq(), new cej()
        });
    }
}
