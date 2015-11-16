// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.signin.internal.AuthAccountResult;
import java.lang.ref.WeakReference;

final class ens extends fty
{

    private final WeakReference a;

    ens(enq enq1)
    {
        a = new WeakReference(enq1);
    }

    public void a(ConnectionResult connectionresult, AuthAccountResult authaccountresult)
    {
        authaccountresult = (enq)a.get();
        if (authaccountresult == null)
        {
            return;
        } else
        {
            ((enq) (authaccountresult)).a.a(new ent(this, authaccountresult, authaccountresult, connectionresult));
            return;
        }
    }
}
