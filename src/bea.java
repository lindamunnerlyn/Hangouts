// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicBoolean;

final class bea
    implements Runnable
{

    final bdz a;

    bea(bdz bdz1)
    {
        a = bdz1;
        super();
    }

    public void run()
    {
        a.a.set(true);
    }
}
