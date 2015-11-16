// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class edl
    implements ThreadFactory
{

    private final AtomicInteger a = new AtomicInteger(1);

    edl()
    {
    }

    public Thread newThread(Runnable runnable)
    {
        int i = a.getAndIncrement();
        return new Thread(runnable, (new StringBuilder(22)).append("AsyncTask #").append(i).toString());
    }
}
