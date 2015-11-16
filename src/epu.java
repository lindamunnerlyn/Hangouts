// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

public final class epu extends eqa
{

    private final a e;

    public epu(Context context, Looper looper, int i, enb enb, end end, epo epo, a a1)
    {
        super(context, looper, i, epo, enb, end);
        e = a1;
    }

    protected IInterface a(IBinder ibinder)
    {
        return e.g();
    }

    protected String a()
    {
        return e.e();
    }

    protected String b()
    {
        return e.f();
    }
}
