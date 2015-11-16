// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.locks.LockSupport;

final class jzx
{

    static final jzx a = new jzx();
    volatile jzx next;
    volatile Thread thread;

    jzx()
    {
    }

    jzx(byte byte0)
    {
        jzm.d().a(this, Thread.currentThread());
    }

    void a()
    {
        Thread thread1 = thread;
        if (thread1 != null)
        {
            thread = null;
            LockSupport.unpark(thread1);
        }
    }

    void a(jzx jzx1)
    {
        jzm.d().a(this, jzx1);
    }

}
