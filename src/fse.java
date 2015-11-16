// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.signin.internal.CheckServerAuthResult;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

final class fse
    implements Runnable
{

    final List a;
    final String b;
    final fry c;
    final fsd d;

    fse(fsd fsd1, List list, String s, fry fry1)
    {
        d = fsd1;
        a = list;
        b = s;
        c = fry1;
        super();
    }

    public void run()
    {
        try
        {
            Object obj = fsd.a(d);
            Collections.unmodifiableSet(new HashSet(a));
            obj = ((a) (obj)).j();
            obj = new CheckServerAuthResult(((qb) (obj)).h(), ((qb) (obj)).i());
            c.a(((CheckServerAuthResult) (obj)));
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.e("SignInClientImpl", "RemoteException thrown when processing checkServerAuthorization callback", remoteexception);
        }
    }
}
