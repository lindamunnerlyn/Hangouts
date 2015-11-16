// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;

public final class enl extends Handler
{

    public enl()
    {
        this(Looper.getMainLooper());
    }

    public enl(Looper looper)
    {
        super(looper);
    }

    public void a()
    {
        removeMessages(2);
    }

    public void a(eni eni1, enh enh1)
    {
        sendMessage(obtainMessage(1, new Pair(eni1, enh1)));
    }

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            Log.wtf("AbstractPendingResult", "Don't know how to handle this message.");
            return;

        case 1: // '\001'
            Object obj = (Pair)message.obj;
            message = (eni)((Pair) (obj)).first;
            obj = (enh)((Pair) (obj)).second;
            try
            {
                message.a(((enh) (obj)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                enk.b(((enh) (obj)));
            }
            throw message;

        case 2: // '\002'
            ((enk)message.obj).b(Status.d);
            return;
        }
    }
}
