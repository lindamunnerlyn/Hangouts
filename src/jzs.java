// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class jzs extends jzn
{

    jzs()
    {
        super((byte)0);
    }

    void a(jzx jzx, Thread thread)
    {
        jzm.e().lazySet(jzx, thread);
    }

    void a(jzx jzx, jzx jzx1)
    {
        jzm.f().lazySet(jzx, jzx1);
    }

    boolean a(jzm jzm1, Object obj, Object obj1)
    {
        return jzm.i().compareAndSet(jzm1, obj, obj1);
    }

    boolean a(jzm jzm1, jzr jzr, jzr jzr1)
    {
        return jzm.h().compareAndSet(jzm1, jzr, jzr1);
    }

    boolean a(jzm jzm1, jzx jzx, jzx jzx1)
    {
        return jzm.g().compareAndSet(jzm1, jzx, jzx1);
    }
}
