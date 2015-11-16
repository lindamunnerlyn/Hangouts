// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.os.Message;

final class grd
    implements Runnable
{

    final gqn a;
    final grk b;
    final gqz c;

    grd(gqz gqz1, gqn gqn, grk grk)
    {
        c = gqz1;
        a = gqn;
        b = grk;
        super();
    }

    public void run()
    {
        Handler handler;
label0:
        {
            gqz.a(c).a(a, b);
            if (!gqz.a(c).b())
            {
                handler = gqz.a(c).d();
                handler.removeMessages(510);
                if (a != gqz.b(c))
                {
                    break label0;
                }
                gqz.c(c).stopService(gqz.d(c));
            }
            return;
        }
        Message message = Message.obtain(handler, inl.a(gqz.e(c)));
        message.what = 510;
        handler.sendMessageDelayed(message, 5000L);
    }
}
