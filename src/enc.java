// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicInteger;

final class enc extends Handler
{

    final ena a;

    public enc(ena ena1, Looper looper)
    {
        a = ena1;
        super(looper);
    }

    private static void a(Message message)
    {
        ((end)message.obj).c();
    }

    private static boolean b(Message message)
    {
        return message.what == 2 || message.what == 1 || message.what == 5 || message.what == 6;
    }

    public void handleMessage(Message message)
    {
        if (a.c.get() != message.arg1)
        {
            if (b(message))
            {
                a(message);
            }
            return;
        }
        if ((message.what == 1 || message.what == 5 || message.what == 6) && !a.i())
        {
            a(message);
            return;
        }
        if (message.what == 3)
        {
            message = new ConnectionResult(message.arg2, null);
            ena.a(a).a(message);
            a.g();
            return;
        }
        if (message.what == 4)
        {
            ena.a(a, 4);
            if (ena.b(a) != null)
            {
                ena.b(a).a(message.arg2);
            }
            ena ena1 = a;
            int i = message.arg2;
            ena1.f();
            ena.a(a, 4, 1, null);
            return;
        }
        if (message.what == 2 && !a.d())
        {
            a(message);
            return;
        }
        if (b(message))
        {
            ((end)message.obj).b();
            return;
        } else
        {
            Log.wtf("GmsClient", "Don't know how to handle this message.");
            return;
        }
    }
}
