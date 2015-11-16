// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicLong;

final class hbi
    implements Runnable
{

    final hbh a;

    hbi(hbh hbh1)
    {
        a = hbh1;
        super();
    }

    public void run()
    {
        a.a.a(a.d.get(), a.c);
        a.b = false;
    }
}
