// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.login;

import android.content.Intent;
import android.os.Bundle;
import gqv;
import gqw;
import hbd;
import hbj;
import hbo;
import hlp;
import hmo;

public final class LoginActivity extends hmo
    implements gqw
{

    final hbd j;
    private hbj m;
    private boolean n;

    public LoginActivity()
    {
        j = (new hbd(this, l)).b(this);
    }

    protected void a(Bundle bundle)
    {
        super.a(bundle);
        m = (hbj)k.b(hbj);
    }

    public void a(boolean flag, gqv gqv, gqv gqv1, int i, int k)
    {
        if (k != -1)
        {
            gqv = (Intent)getIntent().getParcelableExtra("redirect_intent");
            gqv1 = (Bundle)getIntent().getParcelableExtra("redirect_intent_options");
            if (gqv != null)
            {
                gqv.putExtra("account_id", j.a());
                gqv.addFlags(0x2800000);
                if (android.os.Build.VERSION.SDK_INT >= 16)
                {
                    startActivity(gqv, gqv1);
                } else
                {
                    startActivity(gqv);
                }
            } else
            {
                gqv = new Intent();
                gqv.putExtra("account_id", j.a());
                setResult(-1, gqv);
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
            bundle = (hbo)getIntent().getParcelableExtra("login_request");
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
