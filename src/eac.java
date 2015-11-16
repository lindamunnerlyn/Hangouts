// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

final class eac extends HandlerThread
    implements android.os.Handler.Callback
{

    public eac()
    {
        super("GifDecoder");
    }

    public boolean handleMessage(Message message)
    {
        eab eab1 = (eab)message.obj;
        if (eab1 == null || eab.a(eab1) == null || eab.b(eab1))
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
                    eab.c(eab1);
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    eab.d(eab1);
                }
                if (eab.e(eab1))
                {
                    if (eab.f(eab1) == 0)
                    {
                        eab.g(eab1);
                        ebw.f("Babel", "Could not read first frame of the gif.");
                    } else
                    if (eab.f(eab1) > 1 && eab.h(eab1))
                    {
                        eab.i(eab1);
                    } else
                    {
                        eab.j(eab1);
                    }
                }
            } while (eab.e(eab1) && !eab.k(eab1) && !eab.l(eab1));
            eab.n(eab1).sendMessage(eab.n(eab1).obtainMessage(11, eab.m(eab1), 0));
            return true;

        case 12: // '\f'
            eab.i(eab1);
            return true;
        }
    }
}
