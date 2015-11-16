// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class fcx extends Handler
{

    final fcw a;

    fcx(fcw fcw1, Looper looper)
    {
        a = fcw1;
        super(looper);
    }

    public void handleMessage(Message message)
    {
        a.a(message);
    }
}
