// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;

public final class gec extends geb
{

    final Runnable a = new ged(this);
    final Handler b;
    ByteBuffer c[];

    public gec(gcx gcx, long l, int i, int j, int k, int i1, 
            int j1, Handler handler)
    {
        super(gcx, l, i, j, k, i1, j1);
        b = handler;
    }

    protected ByteBuffer a(int i)
    {
        return c[i];
    }

    protected void a()
    {
        c = c().getOutputBuffers();
        b.post(a);
    }

    protected void a(MediaCodec mediacodec, MediaFormat mediaformat)
    {
    }

    protected int b()
    {
        return -1;
    }
}
