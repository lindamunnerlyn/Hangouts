// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;

final class if extends Handler
{

    final ie a;

    if(ie ie1)
    {
        a = ie1;
        super();
    }

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 3: default 32
    //                   1 56
    //                   2 76
    //                   3 84;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new RuntimeException((new StringBuilder("Unknown message ")).append(message).toString());
_L2:
        ie.b(a).onShowPress(ie.a(a));
_L6:
        return;
_L3:
        ie.c(a);
        return;
_L4:
        if (ie.d(a) != null)
        {
            if (!ie.e(a))
            {
                ie.d(a).onSingleTapConfirmed(ie.a(a));
                return;
            } else
            {
                ie.f(a);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
