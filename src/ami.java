// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.concurrent.impl.ConcurrentServiceImpl;
import java.util.concurrent.ThreadFactory;

public final class ami
    implements ThreadFactory
{

    final ConcurrentServiceImpl a;

    public ami(ConcurrentServiceImpl concurrentserviceimpl)
    {
        a = concurrentserviceimpl;
        super();
    }

    public Thread newThread(Runnable runnable)
    {
        return new Thread(new amj(this, runnable));
    }
}
