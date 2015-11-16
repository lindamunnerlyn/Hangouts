// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class elr extends Handler
{

    final elq a;

    public elr(elq elq1, Looper looper)
    {
        a = elq1;
        super(looper);
    }

    public void handleMessage(Message message)
    {
        boolean flag = true;
        if (message.what != 1)
        {
            flag = false;
        }
        h.b(flag);
        a.b((els)message.obj);
    }
}
