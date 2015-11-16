// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.chromium.base.JavaHandlerThread;

public final class llm
    implements Runnable
{

    final long a;
    final long b;
    final JavaHandlerThread c;

    public llm(JavaHandlerThread javahandlerthread, long l, long l1)
    {
        c = javahandlerthread;
        a = l;
        b = l1;
        super();
    }

    public void run()
    {
        JavaHandlerThread.a(c, a, b);
    }
}
