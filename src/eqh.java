// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

public final class eqh extends eqb
{

    public final IBinder e;
    final eqa f;

    public eqh(eqa eqa1, int i, IBinder ibinder, Bundle bundle)
    {
        f = eqa1;
        super(eqa1, i, bundle);
        e = ibinder;
    }

    protected void a(ConnectionResult connectionresult)
    {
        if (eqa.e(f) != null)
        {
            eqa.e(f).a(connectionresult);
        }
        f.g();
    }

    protected boolean a()
    {
        String s;
        try
        {
            s = e.getInterfaceDescriptor();
        }
        catch (RemoteException remoteexception)
        {
            return false;
        }
        if (!f.b().equals(s))
        {
            Log.e("GmsClient", (new StringBuilder("service descriptor mismatch: ")).append(f.b()).append(" vs. ").append(s).toString());
        } else
        {
            android.os.IInterface iinterface = f.a(e);
            if (iinterface != null && eqa.a(f, 2, 3, iinterface))
            {
                f.l();
                if (eqa.b(f) != null)
                {
                    eqa.b(f).a_(null);
                }
                return true;
            }
        }
        return false;
    }
}
