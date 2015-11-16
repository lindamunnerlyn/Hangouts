// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.login;

import android.content.Intent;
import android.os.Bundle;
import gmp;
import gmq;
import gwt;
import gwz;
import gxe;
import hgx;
import hhw;

public final class LoginActivity extends hhw
    implements gmq
{

    final gwt j;
    private gwz m;
    private boolean n;

    public LoginActivity()
    {
        j = (new gwt(this, l)).b(this);
    }

    protected void a(Bundle bundle)
    {
        super.a(bundle);
        m = (gwz)k.b(gwz);
    }

    public void a(boolean flag, gmp gmp, gmp gmp1, int i, int k)
    {
        if (k != -1)
        {
            gmp = (Intent)getIntent().getParcelableExtra("redirect_intent");
            gmp1 = (Bundle)getIntent().getParcelableExtra("redirect_intent_options");
            if (gmp != null)
            {
                gmp.putExtra("account_id", j.a());
                gmp.addFlags(0x2800000);
                if (android.os.Build.VERSION.SDK_INT >= 16)
                {
                    startActivity(gmp, gmp1);
                } else
                {
                    startActivity(gmp);
                }
            } else
            {
                gmp = new Intent();
                gmp.putExtra("account_id", j.a());
                setResult(-1, gmp);
            }
        } else
        {
            setResult(0);
        }
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle == null)
        {
            bundle = (gxe)getIntent().getParcelableExtra("login_request");
            j.a(bundle);
            return;
        } else
        {
            n = bundle.getBoolean("impression_logged", false);
            return;
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (!n && m != null)
        {
            n = true;
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("impression_logged", n);
    }
}
