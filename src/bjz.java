// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;

final class bjz extends Handler
{

    private final bjy a;

    public bjz(bjy bjy1)
    {
        a = bjy1;
    }

    public void handleMessage(Message message)
    {
        if (message.what == 0)
        {
            a.Y();
        }
    }
}
