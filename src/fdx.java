// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

public final class fdx extends eqa
{

    public fdx(Context context, Looper looper, epo epo, enb enb, end end)
    {
        super(context, looper, 63, epo, enb, end);
    }

    protected IInterface a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
        if (iinterface != null && (iinterface instanceof fec))
        {
            return (fec)iinterface;
        } else
        {
            return new fee(ibinder);
        }
    }

    protected String a()
    {
        return "com.google.android.gms.googlehelp.service.GoogleHelpService.START";
    }

    protected String b()
    {
        return "com.google.android.gms.googlehelp.internal.common.IGoogleHelpService";
    }
}
