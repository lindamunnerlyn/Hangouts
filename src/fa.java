// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class fa extends Handler
{

    public fa()
    {
        super(Looper.getMainLooper());
    }

    public void handleMessage(Message message)
    {
        ez ez1 = (ez)message.obj;
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            eu.c(ez1.a, ez1.b[0]);
            return;

        case 2: // '\002'
            ez1.a.b();
            break;
        }
    }
}
