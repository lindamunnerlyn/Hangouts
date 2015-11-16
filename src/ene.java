// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.IBinder;

public final class ene extends enw
{

    private ena a;
    private final int b;

    public ene(ena ena1, int i)
    {
        a = ena1;
        b = i;
    }

    public void a(int i, Bundle bundle)
    {
        h.a(a, "onAccountValidationComplete can be called only once per call to validateAccount");
        a.a(i, bundle, b);
        a = null;
    }

    public void a(int i, IBinder ibinder, Bundle bundle)
    {
        h.a(a, "onPostInitComplete can be called only once per call to getRemoteService");
        a.a(i, ibinder, bundle, b);
        a = null;
    }
}
