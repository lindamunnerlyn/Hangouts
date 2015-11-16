// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.clearcut.LogEventParcelable;

public final class eiq extends ena
{

    public eiq(Context context, Looper looper, emo emo, eka eka, ekc ekc)
    {
        super(context, looper, 40, emo, eka, ekc);
    }

    protected IInterface a(IBinder ibinder)
    {
        return eiv.a(ibinder);
    }

    protected String a()
    {
        return "com.google.android.gms.clearcut.service.START";
    }

    public void a(eir eir, LogEventParcelable logeventparcelable)
    {
        ((eiu)n()).a(eir, logeventparcelable);
    }

    protected String b()
    {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }
}
