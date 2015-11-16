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

public final class fsc extends ena
    implements fsl
{

    private final boolean e;
    private final emo f;
    private final fro g;
    private Integer h;
    private final ExecutorService i;

    public fsc(Context context, Looper looper, boolean flag, emo emo1, eka eka, ekc ekc, ExecutorService executorservice)
    {
        super(context, looper, 44, emo1, eka, ekc);
        e = flag;
        f = emo1;
        g = emo1.h();
        h = emo1.i();
        i = executorservice;
    }

    protected IInterface a(IBinder ibinder)
    {
        return frz.a(ibinder);
    }

    protected String a()
    {
        return "com.google.android.gms.signin.service.START";
    }

    public void a(emq emq, Set set, frv frv1)
    {
        h.a(frv1, "Expecting a valid ISignInCallbacks");
        try
        {
            ((fry)n()).a(new AuthAccountRequest(emq, set), frv1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (emq emq) { }
        try
        {
            frv1.a(new ConnectionResult(8, null), new AuthAccountResult());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (emq emq)
        {
            Log.wtf("SignInClientImpl", "ISignInCallbacks#onAuthAccount should be executed from the same process, unexpected RemoteException.");
        }
    }

    public void a(emq emq, boolean flag)
    {
        try
        {
            ((fry)n()).a(emq, h.intValue(), flag);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (emq emq)
        {
            return;
        }
    }

    public void a(eob eob1)
    {
        h.a(eob1, "Expecting a valid IResolveAccountCallbacks");
        try
        {
            android.accounts.Account account = f.b();
            ((fry)n()).a(new ResolveAccountRequest(account, h.intValue()), eob1);
            return;
        }
        catch (RemoteException remoteexception) { }
        try
        {
            eob1.a(new ResolveAccountResponse());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (eob eob1)
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

    protected Bundle k()
    {
        Object obj = g;
        Integer integer = f.i();
        ExecutorService executorservice = i;
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", ((fro) (obj)).a());
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", ((fro) (obj)).b());
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", ((fro) (obj)).c());
        if (((fro) (obj)).d() != null)
        {
            bundle.putParcelable("com.google.android.gms.signin.internal.signInCallbacks", new BinderWrapper((new fsd(((fro) (obj)), executorservice)).asBinder()));
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

    public void o()
    {
        try
        {
            ((fry)n()).a(h.intValue());
            return;
        }
        catch (RemoteException remoteexception)
        {
            return;
        }
    }

    public void p()
    {
        a(new eng(this));
    }
}
