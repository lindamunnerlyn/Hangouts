// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executor;

final class jzr
{

    static final jzr a = new jzr(null, null);
    final Runnable b;
    final Executor c;
    jzr next;

    jzr(Runnable runnable, Executor executor)
    {
        b = runnable;
        c = executor;
    }

}
