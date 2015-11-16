// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.signin.internal.CheckServerAuthResult;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

final class ful
    implements Runnable
{

    final List a;
    final String b;
    final fuf c;
    final fuk d;

    ful(fuk fuk1, List list, String s, fuf fuf1)
    {
        d = fuk1;
        a = list;
        b = s;
        c = fuf1;
        super();
    }

    public void run()
    {
        try
        {
            Object obj = d.a.d();
            Collections.unmodifiableSet(new HashSet(a));
            obj = ((a) (obj)).j();
            obj = new CheckServerAuthResult(((qd) (obj)).h(), ((qd) (obj)).i());
            c.a(((CheckServerAuthResult) (obj)));
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.e("SignInClientImpl", "RemoteException thrown when processing checkServerAuthorization callback", remoteexception);
        }
    }
}
