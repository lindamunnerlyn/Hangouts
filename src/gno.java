// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

abstract class gno
    implements android.os.Handler.Callback, gnz
{

    private HandlerThread a;
    private Handler b;
    private gom c;

    gno()
    {
    }

    public void a(gnq gnq1)
    {
        Message message = Message.obtain(b, 1);
        message.obj = gnq1;
        b.sendMessage(message);
    }

    protected void a(gny gny1)
    {
        c = new gom(gny1.b());
        a = new HandlerThread("MetricRecorderImpl", 10);
        a.start();
        b = new Handler(a.getLooper(), this);
    }

    protected abstract void a(String s, gnq gnq1);

    public boolean a()
    {
        return !c.a();
    }

    public boolean handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            int i = message.what;
            (new StringBuilder(28)).append("Unknown message: ").append(i);
            return false;

        case 1: // '\001'
            a(message.getData().getString("custom_event_name"), (gnq)message.obj);
            break;
        }
        c.b();
        return true;
    }
}
