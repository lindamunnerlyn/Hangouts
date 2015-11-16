// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;
import android.util.Log;

final class fsf
    implements Runnable
{

    final String a;
    final String b;
    final fry c;
    final fsd d;

    fsf(fsd fsd1, String s, String s1, fry fry1)
    {
        d = fsd1;
        a = s;
        b = s1;
        c = fry1;
        super();
    }

    public void run()
    {
        try
        {
            boolean flag = fsd.a(d).k();
            c.a(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.e("SignInClientImpl", "RemoteException thrown when processing uploadServerAuthCode callback", remoteexception);
        }
    }
}
