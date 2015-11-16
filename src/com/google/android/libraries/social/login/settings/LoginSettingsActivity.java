// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.login.settings;

import android.os.Bundle;
import gys;
import gyy;
import h;
import hgt;
import hgx;
import hhj;

public final class LoginSettingsActivity extends hhj
    implements gyy
{

    public LoginSettingsActivity()
    {
        new hgt(this, q);
        new gys(this, this, q);
    }

    protected void a(Bundle bundle)
    {
        super.a(bundle);
        p.a(gyy, this);
    }

    public void j()
    {
        finish();
    }

    public void k()
    {
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(h.js);
    }
}
