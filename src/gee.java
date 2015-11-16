// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

public final class gee extends geb
{

    private final gef a = new gef(this);
    private int b;
    private final String c;

    public gee(gcx gcx, long l, int i, int j, int k, int i1, 
            int j1, int k1)
    {
        super(gcx, l, i, j, k, i1, j1);
        if ("video/x-vnd.on2.vp8".equals(i()))
        {
            b = k1;
            if (k1 == 2)
            {
                c = "webrtc.vp8.2-layer";
                return;
            }
            if (k1 == 3)
            {
                c = "webrtc.vp8.3-layer";
                return;
            } else
            {
                c = null;
                b = 0;
                return;
            }
        } else
        {
            c = null;
            b = 0;
            return;
        }
    }

    protected ByteBuffer a(int i)
    {
        return c().getOutputBuffer(i);
    }

    protected void a()
    {
        if (c != null && !c().getInputFormat().containsKey("ts-schema"))
        {
            gkc.c("vclib", "HW encoder doesn't support temporal scalability; disabling.");
            b = 0;
        }
    }

    protected void a(MediaCodec mediacodec, MediaFormat mediaformat)
    {
        if (c != null)
        {
            mediaformat.setString("ts-schema", c);
        }
        mediacodec.setCallback(a);
    }

    protected int b()
    {
        if (b < 2)
        {
            return -1;
        }
        if (b == 2)
        {
            return d() % 2;
        }
        if (b == 3)
        {
            int i = d() % 4;
            if (i == 0)
            {
                return 0;
            }
            return i != 2 ? 2 : 1;
        } else
        {
            int j = b;
            gbh.a((new StringBuilder(44)).append("Unexpected temporal layer count: ").append(j).toString());
            return -1;
        }
    }
}
