// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;

final class bkl extends Handler
{

    private final bkk a;

    public bkl(bkk bkk1)
    {
        a = bkk1;
    }

    public void handleMessage(Message message)
    {
        if (message.what == 0)
        {
            a.Y();
        }
    }
}
