// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicBoolean;

final class bdo
    implements Runnable
{

    final bdn a;

    bdo(bdn bdn1)
    {
        a = bdn1;
        super();
    }

    public void run()
    {
        bdn.a(a).set(true);
    }
}
