// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.clearcut.LogEventParcelable;

public final class elr extends eqa
{

    public elr(Context context, Looper looper, epo epo, enb enb, end end)
    {
        super(context, looper, 40, epo, enb, end);
    }

    protected IInterface a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        if (iinterface != null && (iinterface instanceof elv))
        {
            return (elv)iinterface;
        } else
        {
            return new elx(ibinder);
        }
    }

    protected String a()
    {
        return "com.google.android.gms.clearcut.service.START";
    }

    public void a(els els, LogEventParcelable logeventparcelable)
    {
        ((elv)m()).a(els, logeventparcelable);
    }

    protected String b()
    {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }
}
