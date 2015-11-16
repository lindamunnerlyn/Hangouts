// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ExecutionException;

final class jsg extends jsh
{

    private final Throwable a;

    jsg(Throwable throwable)
    {
        a = throwable;
    }

    public Object get()
    {
        throw new ExecutionException(a);
    }
}
