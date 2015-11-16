// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class eos extends Handler
{

    final eor a;

    public eos(eor eor1, Looper looper)
    {
        a = eor1;
        super(looper);
    }

    public void handleMessage(Message message)
    {
        boolean flag = true;
        if (message.what != 1)
        {
            flag = false;
        }
        g.b(flag);
        a.b((eot)message.obj);
    }
}
