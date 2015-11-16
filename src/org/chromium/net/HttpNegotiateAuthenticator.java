// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import android.os.Bundle;
import android.os.Handler;
import lmp;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.ThreadUtils;

public class HttpNegotiateAuthenticator
{

    public Bundle a;
    private final String b;
    private AccountManagerFuture c;

    private HttpNegotiateAuthenticator(String s)
    {
        a = null;
        b = s;
    }

    static HttpNegotiateAuthenticator create(String s)
    {
        return new HttpNegotiateAuthenticator(s);
    }

    void getNextAuthToken(long l, String s, String s1, boolean flag)
    {
        s = (new StringBuilder("SPNEGO:HOSTBASED:")).append(s).toString();
        android.app.Activity activity = ApplicationStatus.a();
        if (activity == null)
        {
            nativeSetResult(l, -9, null);
            return;
        }
        AccountManager accountmanager = AccountManager.get(activity);
        Bundle bundle = new Bundle();
        if (s1 != null)
        {
            bundle.putString("incomingAuthToken", s1);
        }
        if (a != null)
        {
            bundle.putBundle("spnegoContext", a);
        }
        bundle.putBoolean("canDelegate", flag);
        s1 = b;
        lmp lmp1 = new lmp(this, l);
        Handler handler = new Handler(ThreadUtils.a());
        c = accountmanager.getAuthTokenByFeatures(s1, s, new String[] {
            "SPNEGO"
        }, activity, null, bundle, lmp1, handler);
    }

    public native void nativeSetResult(long l, int i, String s);
}
