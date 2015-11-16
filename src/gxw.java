// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

final class gxw extends Handler
{

    private final WeakReference a;

    gxw(gxu gxu1)
    {
        a = new WeakReference(gxu1);
    }

    void a()
    {
        if (!hasMessages(0))
        {
            sendEmptyMessageDelayed(0, 800L);
        }
    }

    void b()
    {
        removeMessages(0);
    }

    public void handleMessage(Message message)
    {
        if (message.what == 0)
        {
            message = (gxu)a.get();
            if (message != null)
            {
                message.c();
            }
        }
    }
}
