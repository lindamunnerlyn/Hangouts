// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

public final class fcc extends ena
{

    public fcc(Context context, Looper looper, emo emo, eka eka, ekc ekc)
    {
        super(context, looper, 28, emo, eka, ekc);
    }

    public IInterface a(IBinder ibinder)
    {
        return few.a(ibinder);
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
