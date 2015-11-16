// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.login.settings;

import android.os.Bundle;
import h;
import hdl;
import hdr;
import hll;
import hlp;
import hmb;

public final class LoginSettingsActivity extends hmb
    implements hdr
{

    public LoginSettingsActivity()
    {
        new hll(this, r);
        new hdl(this, this, r);
    }

    protected void a(Bundle bundle)
    {
        super.a(bundle);
        q.a(hdr, this);
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
        setContentView(h.jr);
    }
}
