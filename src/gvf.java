// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Looper;
import android.os.MessageQueue;

final class gvf
    implements Runnable
{

    final gvc a;

    gvf(gvc gvc1)
    {
        a = gvc1;
        super();
    }

    public void run()
    {
        Looper.myQueue().addIdleHandler(gvc.a(a));
    }
}
