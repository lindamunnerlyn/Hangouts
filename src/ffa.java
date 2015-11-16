// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

public final class ffa extends eqa
{

    public ffa(Context context, Looper looper, epo epo, enb enb, end end)
    {
        super(context, looper, 28, epo, enb, end);
    }

    public IInterface a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.mdm.internal.INetworkQualityService");
        if (iinterface != null && (iinterface instanceof fht))
        {
            return (fht)iinterface;
        } else
        {
            return new fhv(ibinder);
        }
    }

    protected String a()
    {
        return "com.google.android.gms.mdm.services.START";
    }

    protected String b()
    {
        return "com.google.android.gms.mdm.internal.INetworkQualityService";
    }
}
