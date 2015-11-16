// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodec;
import com.google.android.libraries.hangouts.video.DecoderManager;
import com.google.android.libraries.hangouts.video.MediaCodecDecoder;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class ggy extends MediaCodecDecoder
{

    private final ggz a = new ggz(this);
    private final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();

    public ggy(DecoderManager decodermanager, ggd ggd, ggv ggv)
    {
        super(decodermanager, ggd, ggv);
    }

    static ConcurrentLinkedQueue a(ggy ggy1)
    {
        return ggy1.b;
    }

    protected ByteBuffer a(int i)
    {
        return d().getInputBuffer(i);
    }

    protected void a(MediaCodec mediacodec)
    {
        mediacodec.setCallback(a);
        b.clear();
    }

    protected void b(int i)
    {
        boolean flag;
        if (i == -1 || i == ((Integer)b.peek()).intValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gdv.a("Expected condition to be true", flag);
        if (i == -1)
        {
            b.clear();
            return;
        } else
        {
            b.poll();
            return;
        }
    }

    protected int c()
    {
        Integer integer = (Integer)b.peek();
        if (integer == null)
        {
            return -1;
        } else
        {
            return integer.intValue();
        }
    }
}
