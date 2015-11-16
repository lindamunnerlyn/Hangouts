// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.IBinder;

public final class eqe extends eqw
{

    private eqa a;
    private final int b;

    public eqe(eqa eqa1, int i)
    {
        a = eqa1;
        b = i;
    }

    public void a(int i, Bundle bundle)
    {
        g.b(a, "onAccountValidationComplete can be called only once per call to validateAccount");
        a.a(i, bundle, b);
        a = null;
    }

    public void a(int i, IBinder ibinder, Bundle bundle)
    {
        g.b(a, "onPostInitComplete can be called only once per call to getRemoteService");
        a.a(i, ibinder, bundle, b);
        a = null;
    }
}
