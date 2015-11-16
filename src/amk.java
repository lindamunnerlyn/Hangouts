// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.concurrent.impl.ConcurrentServiceImpl;

public final class amk
    implements Runnable
{

    final ConcurrentServiceImpl a;

    public amk(ConcurrentServiceImpl concurrentserviceimpl)
    {
        a = concurrentserviceimpl;
        super();
    }

    public void run()
    {
        ConcurrentServiceImpl.a(a);
    }
}
