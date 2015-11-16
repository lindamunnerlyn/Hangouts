// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.libraries.hangouts.video.Decoder;
import com.google.android.libraries.hangouts.video.DecoderManager;

public final class gcs extends Handler
{

    final Decoder a;

    public gcs(Decoder decoder, Looper looper)
    {
        a = decoder;
        super(looper);
    }

    public void handleMessage(Message message)
    {
        boolean flag = true;
        message.what;
        JVM INSTR tableswitch 0 3: default 448
    //                   0 299
    //                   1 68
    //                   2 68
    //                   3 68;
           goto _L1 _L2 _L3 _L3 _L3
_L1:
        int i = message.what;
        gkc.e("vclib", (new StringBuilder(45)).append("Unknown message in DecodeHandler: ").append(i).toString());
        return;
_L3:
        Exception exception;
        if (message.what == 2)
        {
            flag = false;
        }
        if (message.what == 3)
        {
            Decoder.a(a, message.arg1);
        }
        removeMessages(0);
        Decoder.a(a, flag);
        message = ((Message) (Decoder.a(a)));
        message;
        JVM INSTR monitorenter ;
        if (Decoder.b(a) == 0 || Decoder.c(a) == null)
        {
            return;
        }
          goto _L4
        exception;
        message;
        JVM INSTR monitorexit ;
        String s;
        try
        {
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            s = String.valueOf(message);
        }
        gkc.e("vclib", (new StringBuilder(String.valueOf(s).length() + 28)).append("Exception in DecodeHandler: ").append(s).toString());
        gkc.e("vclib", Log.getStackTraceString(message));
        sendMessageDelayed(obtainMessage(0), 10L);
        return;
_L4:
        message;
        JVM INSTR monitorexit ;
        if (!flag) goto _L6; else goto _L5
_L5:
        int j = DecoderManager.getCodecType(Decoder.b(a));
        if (j != -1) goto _L8; else goto _L7
_L7:
        Decoder.d(a);
        sendMessageDelayed(obtainMessage(1), 200L);
        return;
_L8:
        a.a(j);
        if (!Decoder.e(a))
        {
            gkc.e("vclib", "Initialize failed, ignoring decode.");
            return;
        }
        sendMessage(obtainMessage(0));
        return;
_L2:
        long l;
        removeMessages(0);
        l = System.currentTimeMillis();
        Decoder.f(a);
        Decoder.g(a);
        if (Decoder.h(a))
        {
            gkc.d("vclib", "The MediaCodec HW decoder requires a restart.");
            sendMessage(obtainMessage(1));
            return;
        }
          goto _L9
_L10:
        String s1 = String.valueOf(message);
        gkc.e("vclib", (new StringBuilder(String.valueOf(s1).length() + 17)).append("Decoding failed: ").append(s1).toString());
        gkc.e("vclib", Log.getStackTraceString(message));
        gkc.e("vclib", "Attempting to reset decoder.");
        sendMessage(obtainMessage(1));
        return;
_L9:
        try
        {
            l = Math.max(0L, 10L - (System.currentTimeMillis() - l));
            sendMessageDelayed(obtainMessage(0), l);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Message message) { }
        if (true) goto _L10; else goto _L6
_L6:
    }
}
