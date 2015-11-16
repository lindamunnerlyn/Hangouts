// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

public final class emu extends ena
{

    private final a e;

    public emu(Context context, Looper looper, int i, eka eka, ekc ekc, emo emo, a a1)
    {
        super(context, looper, i, emo, eka, ekc);
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
