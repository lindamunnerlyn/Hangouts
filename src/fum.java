// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;
import android.util.Log;

final class fum
    implements Runnable
{

    final String a;
    final String b;
    final fuf c;
    final fuk d;

    fum(fuk fuk1, String s, String s1, fuf fuf1)
    {
        d = fuk1;
        a = s;
        b = s1;
        c = fuf1;
        super();
    }

    public void run()
    {
        try
        {
            boolean flag = d.a.d().k();
            c.a(flag);
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.e("SignInClientImpl", "RemoteException thrown when processing uploadServerAuthCode callback", remoteexception);
        }
    }
}
