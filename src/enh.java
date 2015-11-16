// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

public final class enh extends enb
{

    public final IBinder e;
    final ena f;

    public enh(ena ena1, int i, IBinder ibinder, Bundle bundle)
    {
        f = ena1;
        super(ena1, i, bundle);
        e = ibinder;
    }

    protected void a(ConnectionResult connectionresult)
    {
        if (ena.e(f) != null)
        {
            ena.e(f).a(connectionresult);
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
            if (iinterface != null && ena.a(f, 2, 3, iinterface))
            {
                f.m();
                if (ena.b(f) != null)
                {
                    ena.b(f).a_(null);
                }
                return true;
            }
        }
        return false;
    }
}
