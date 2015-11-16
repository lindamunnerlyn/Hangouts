// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.os.Message;

final class gvo
    implements Runnable
{

    final guy a;
    final gvv b;
    final gvk c;

    gvo(gvk gvk1, guy guy, gvv gvv)
    {
        c = gvk1;
        a = guy;
        b = gvv;
        super();
    }

    public void run()
    {
        Handler handler;
label0:
        {
            gvk.a(c).a(a, b);
            if (!gvk.a(c).b())
            {
                handler = gvk.a(c).d();
                handler.removeMessages(510);
                if (a != gvk.b(c))
                {
                    break label0;
                }
                gvk.c(c).stopService(gvk.d(c));
            }
            return;
        }
        Message message = Message.obtain(handler, itp.a(gvk.e(c)));
        message.what = 510;
        handler.sendMessageDelayed(message, 5000L);
    }
}
