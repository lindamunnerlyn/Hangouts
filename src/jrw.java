// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executor;

final class jrw
{

    final Runnable a;
    final Executor b;
    jrw c;

    jrw(Runnable runnable, Executor executor, jrw jrw1)
    {
        a = runnable;
        b = executor;
        c = jrw1;
    }
}
