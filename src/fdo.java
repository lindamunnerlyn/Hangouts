// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.BlockingQueue;

final class fdo extends Handler
{

    final fdn a;

    fdo(fdn fdn1, Looper looper)
    {
        a = fdn1;
        super(looper);
    }

    public void handleMessage(Message message)
    {
        Object obj;
        if (message != null)
        {
            obj = message.obj;
        }
        message = (Intent)message.obj;
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(message.getAction()))
        {
            fdn.a(a).add(message);
        } else
        if (!fdn.a(a, message))
        {
            message.setPackage(fdn.b(a).getPackageName());
            fdn.b(a).sendBroadcast(message);
            return;
        }
    }
}
