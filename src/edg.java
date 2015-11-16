// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

final class edg extends HandlerThread
    implements android.os.Handler.Callback
{

    public edg()
    {
        super("GifDecoder");
    }

    public boolean handleMessage(Message message)
    {
        edf edf1 = (edf)message.obj;
        if (edf1 == null || edf.a(edf1) == null || edf.b(edf1))
        {
            return true;
        }
        switch (message.what)
        {
        case 11: // '\013'
        default:
            return false;

        case 10: // '\n'
            do
            {
                try
                {
                    edf.c(edf1);
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    edf.d(edf1);
                }
                if (edf.e(edf1))
                {
                    if (edf.f(edf1) == 0)
                    {
                        edf.g(edf1);
                        eev.f("Babel", "Could not read first frame of the gif.");
                    } else
                    if (edf.f(edf1) > 1 && edf.h(edf1))
                    {
                        edf.i(edf1);
                    } else
                    {
                        edf.j(edf1);
                    }
                }
            } while (edf.e(edf1) && !edf.k(edf1) && !edf.l(edf1));
            edf.n(edf1).sendMessage(edf.n(edf1).obtainMessage(11, edf.m(edf1), 0));
            return true;

        case 12: // '\f'
            edf.i(edf1);
            return true;
        }
    }
}
