// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicLong;

final class hfz
    implements Runnable
{

    final hfy a;

    hfz(hfy hfy1)
    {
        a = hfy1;
        super();
    }

    public void run()
    {
        a.a.a(a.d.get(), a.c);
        a.b = false;
    }
}
