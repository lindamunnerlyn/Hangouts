// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.signin.internal.AuthAccountResult;
import java.lang.ref.WeakReference;

final class ekr extends frr
{

    private final WeakReference a;

    ekr(ekp ekp1)
    {
        a = new WeakReference(ekp1);
    }

    public void a(ConnectionResult connectionresult, AuthAccountResult authaccountresult)
    {
        authaccountresult = (ekp)a.get();
        if (authaccountresult == null)
        {
            return;
        } else
        {
            ((ekp) (authaccountresult)).a.a(new eks(this, authaccountresult, authaccountresult, connectionresult));
            return;
        }
    }
}
