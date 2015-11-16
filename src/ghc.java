// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodec;
import android.os.Handler;

final class ghc
    implements Runnable
{

    final ghb a;

    ghc(ghb ghb1)
    {
        a = ghb1;
        super();
    }

    public void run()
    {
        Object obj;
        int i;
        long l = System.currentTimeMillis();
        obj = a.c();
        if (obj == null)
        {
            return;
        }
        android.media.MediaCodec.BufferInfo bufferinfo = new android.media.MediaCodec.BufferInfo();
        try
        {
            i = ((MediaCodec) (obj)).dequeueOutputBuffer(bufferinfo, 0L);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a.a(((IllegalStateException) (obj)), true);
            return;
        }
        if (i < 0) goto _L2; else goto _L1
_L1:
        a.a(i, bufferinfo);
_L5:
        l = Math.max(0L, 10L - (System.currentTimeMillis() - l));
        a.b.postDelayed(a.a, l);
        return;
_L2:
        if (i != -2) goto _L4; else goto _L3
_L3:
        a.a(((MediaCodec) (obj)).getOutputFormat());
          goto _L5
_L4:
        if (i != -3) goto _L5; else goto _L6
_L6:
        a.c = ((MediaCodec) (obj)).getOutputBuffers();
          goto _L5
    }
}
