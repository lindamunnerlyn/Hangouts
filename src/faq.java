// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.BlockingQueue;

final class faq extends Handler
{

    final fap a;

    faq(fap fap1, Looper looper)
    {
        a = fap1;
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
            fap.a(a).add(message);
        } else
        if (!fap.a(a, message))
        {
            message.setPackage(fap.b(a).getPackageName());
            fap.b(a).sendBroadcast(message);
            return;
        }
    }
}
