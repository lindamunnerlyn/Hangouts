// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.AuthAccountResult;
import java.util.Set;
import java.util.concurrent.ExecutorService;

public final class fuj extends eqa
    implements fus
{

    private final boolean e;
    private final epo f;
    private final ftv g;
    private Integer h;
    private final ExecutorService i;

    public fuj(Context context, Looper looper, boolean flag, epo epo1, enb enb, end end, ExecutorService executorservice)
    {
        super(context, looper, 44, epo1, enb, end);
        e = flag;
        f = epo1;
        g = epo1.h();
        h = epo1.i();
        i = executorservice;
    }

    protected IInterface a(IBinder ibinder)
    {
        return fug.a(ibinder);
    }

    protected String a()
    {
        return "com.google.android.gms.signin.service.START";
    }

    public void a(epq epq, Set set, fuc fuc1)
    {
        g.b(fuc1, "Expecting a valid ISignInCallbacks");
        try
        {
            ((fuf)m()).a(new AuthAccountRequest(epq, set), fuc1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (epq epq) { }
        try
        {
            fuc1.a(new ConnectionResult(8, null), new AuthAccountResult());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (epq epq)
        {
            Log.wtf("SignInClientImpl", "ISignInCallbacks#onAuthAccount should be executed from the same process, unexpected RemoteException.");
        }
    }

    public void a(epq epq, boolean flag)
    {
        try
        {
            ((fuf)m()).a(epq, h.intValue(), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (epq epq)
        {
            return;
        }
    }

    public void a(erb erb1)
    {
        g.b(erb1, "Expecting a valid IResolveAccountCallbacks");
        try
        {
            android.accounts.Account account = f.b();
            ((fuf)m()).a(new ResolveAccountRequest(account, h.intValue()), erb1);
            return;
        }
        catch (RemoteException remoteexception) { }
        try
        {
            erb1.a(new ResolveAccountResponse());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (erb erb1)
        {
            Log.wtf("SignInClientImpl", "IResolveAccountCallbacks#onAccountResolutionComplete should be executed from the same process, unexpected RemoteException.");
        }
    }

    protected String b()
    {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public boolean e()
    {
        return e;
    }

    protected Bundle j()
    {
        Object obj = g;
        Integer integer = f.i();
        ExecutorService executorservice = i;
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", ((ftv) (obj)).a());
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", ((ftv) (obj)).b());
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", ((ftv) (obj)).c());
        if (((ftv) (obj)).d() != null)
        {
            bundle.putParcelable("com.google.android.gms.signin.internal.signInCallbacks", new BinderWrapper((new fuk(((ftv) (obj)), executorservice)).asBinder()));
        }
        if (integer != null)
        {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", integer.intValue());
        }
        obj = f.f();
        if (!super.a.getPackageName().equals(obj))
        {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", f.f());
        }
        return bundle;
    }

    public void n()
    {
        try
        {
            ((fuf)m()).a(h.intValue());
            return;
        }
        catch (RemoteException remoteexception)
        {
            return;
        }
    }

    public void o()
    {
        a(new eqg(this));
    }
}
