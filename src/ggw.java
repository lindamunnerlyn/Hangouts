// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodec;
import android.os.Handler;
import com.google.android.libraries.hangouts.video.DecoderManager;
import com.google.android.libraries.hangouts.video.MediaCodecDecoder;
import java.nio.ByteBuffer;

public final class ggw extends MediaCodecDecoder
{

    private final Runnable a = new ggx(this);
    private ByteBuffer b[];
    private ByteBuffer c[];
    private int d;

    public ggw(DecoderManager decodermanager, ggd ggd, ggv ggv)
    {
        super(decodermanager, ggd, ggv);
        d = -1;
    }

    static Runnable a(ggw ggw1)
    {
        return ggw1.a;
    }

    static ByteBuffer[] a(ggw ggw1, ByteBuffer abytebuffer[])
    {
        ggw1.b = abytebuffer;
        return abytebuffer;
    }

    protected ByteBuffer a(int i)
    {
        return c[i];
    }

    protected void a()
    {
        c = d().getInputBuffers();
        b = d().getOutputBuffers();
        e().post(a);
    }

    protected void b()
    {
        e().removeCallbacks(a);
    }

    protected void b(int i)
    {
        boolean flag;
        if (i == -1 || i == d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gdv.a("Expected condition to be true", flag);
        d = -1;
    }

    protected int c()
    {
        if (d == -1)
        {
            d = d().dequeueInputBuffer(0L);
        }
        return d;
    }
}
