// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.Log;
import com.google.android.libraries.hangouts.video.EncoderManager;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class geb
{

    private gcx a;
    private MediaCodec b;
    private gcz c;
    private final long d;
    private final int e;
    private final AtomicInteger f = new AtomicInteger(0);
    private int g;
    private int h;
    private final int i;
    private final int j;
    private ByteBuffer k;
    private int l;
    private final Object m = new Object();
    private int n;
    private volatile boolean o;
    private final gfc p = new gfc("MediaCodecEncoder");

    public geb(gcx gcx, long l1, int i1, int j1, int k1, int i2, 
            int j2)
    {
        a = gcx;
        d = l1;
        e = i1;
        i = j1;
        j = k1;
        g = i2;
        h = j2;
        l = 0;
        o = false;
    }

    private static ByteBuffer a(ByteBuffer bytebuffer, int i1, int j1)
    {
        bytebuffer = bytebuffer.duplicate();
        bytebuffer.position(i1);
        bytebuffer.limit(i1 + j1);
        return bytebuffer.slice();
    }

    protected int a(long l1, long l2, ByteBuffer bytebuffer, int i1, int j1, 
            int k1, int i2, int j2, boolean flag)
    {
        return EncoderManager.sendEncodedFrame(l1, l2, bytebuffer, i1, j1, k1, i2, j2, flag);
    }

    protected MediaCodec a(String s)
    {
        return MediaCodec.createEncoderByType(s);
    }

    protected abstract ByteBuffer a(int i1);

    protected abstract void a();

    public void a(int i1, android.media.MediaCodec.BufferInfo bufferinfo)
    {
        gbh.g();
        ByteBuffer bytebuffer = a(i1);
        if ((bufferinfo.flags & 2) != 0)
        {
            boolean flag;
            if (e == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gbh.a(flag);
            k = ByteBuffer.allocateDirect(bufferinfo.size);
            k.put(a(bytebuffer, bufferinfo.offset, bufferinfo.size));
            b.releaseOutputBuffer(i1, false);
        } else
        {
            boolean flag1;
            if ((bufferinfo.flags & 1) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                l = 0;
                int j1;
                long l1;
                if (k != null)
                {
                    k.rewind();
                    ByteBuffer bytebuffer1 = ByteBuffer.allocateDirect(k.capacity() + bufferinfo.size);
                    bytebuffer1.put(k);
                    bytebuffer1.put(a(bytebuffer, bufferinfo.offset, bufferinfo.size));
                    bytebuffer1.rewind();
                    bufferinfo.offset = 0;
                    bufferinfo.size = bytebuffer1.capacity();
                    bytebuffer = bytebuffer1;
                }
            }
            l1 = bufferinfo.presentationTimeUs / 1000L;
            j1 = b();
            l = l + 1;
            if (a(d, l1, bytebuffer, bufferinfo.offset, bufferinfo.size, g, h, j1, flag1) > 0)
            {
                o = true;
            }
            b.releaseOutputBuffer(i1, false);
            i1 = f.decrementAndGet();
            if (i1 < 0)
            {
                gkc.e("vclib", "The encoder for resolution: (%dx%d) produced extra frames, recovering.", new Object[] {
                    Integer.valueOf(i), Integer.valueOf(j)
                });
                f.compareAndSet(i1, 0);
                return;
            }
        }
    }

    protected abstract void a(MediaCodec mediacodec, MediaFormat mediaformat);

    protected void a(MediaFormat mediaformat)
    {
        if (g != mediaformat.getInteger("width") || h != mediaformat.getInteger("height"))
        {
            String s = String.valueOf("Encoder is unable to handle the exact requested camera size. Original size requested: ");
            int i1 = g;
            int j1 = h;
            String s1 = String.valueOf(mediaformat);
            gkc.e("vclib", (new StringBuilder(String.valueOf(s).length() + 37 + String.valueOf(s1).length())).append(s).append(i1).append("x").append(j1).append(", new format: ").append(s1).toString());
            synchronized (m)
            {
                g = mediaformat.getInteger("width");
                h = mediaformat.getInteger("height");
            }
            return;
        } else
        {
            return;
        }
        mediaformat;
        obj;
        JVM INSTR monitorexit ;
        throw mediaformat;
    }

    public boolean a(int i1, int j1, int k1, long l1, boolean flag)
    {
label0:
        {
            synchronized (m)
            {
                if (c != null)
                {
                    break label0;
                }
            }
            return false;
        }
        int i2;
        boolean flag1;
        flag1 = o;
        o = false;
        i2 = f.intValue();
        if (i2 <= 1)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        gkc.a("vclib", "Dropping frame due to too many outstanding frames for encoder: (%dx%d). Currently processing %d frames", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(i2)
        });
        flag1 = true;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        c.a();
        if (c.a(l1))
        {
            break MISSING_BLOCK_LABEL_182;
        }
        i1 = i;
        j1 = j;
        gkc.e("vclib", (new StringBuilder(85)).append("Unable to start frame operation for encoder: (").append(i1).append("x").append(j1).append(". Encode failed.").toString());
        obj;
        JVM INSTR monitorexit ;
        return false;
        p.a(i1, j1, k1, false, flag);
        p.a(g, h, true);
        p.e();
        c.c();
        f.incrementAndGet();
        obj;
        JVM INSTR monitorexit ;
        return true;
    }

    protected abstract int b();

    public boolean b(int i1)
    {
        n = i1 * 950;
        try
        {
            b = a(i());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = String.valueOf(obj);
            gbh.a((new StringBuilder(String.valueOf(obj).length() + 46)).append("Unable to create hardware encoder. Exception: ").append(((String) (obj))).toString());
            return false;
        }
        if (b == null)
        {
            gbh.a("Unexpected: MediaCodec.createEncoderByType returned null.");
            Object obj = String.valueOf(i());
            if (((String) (obj)).length() != 0)
            {
                obj = "Unable to create a hardware encoder for ".concat(((String) (obj)));
            } else
            {
                obj = new String("Unable to create a hardware encoder for ");
            }
            gkc.e("vclib", ((String) (obj)));
            return false;
        }
        if (gkc.b())
        {
            gkc.a("vclib", "Creating hardware encoder with original size: %dx%d, encoder size: %dx%d", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(g), Integer.valueOf(h)
            });
            gkc.a("vclib", "Requested bitrate: %d", new Object[] {
                Integer.valueOf(n)
            });
            gkc.a("vclib", "Encoder name: %s", new Object[] {
                b.getName()
            });
            gkc.a("vclib", "Native encoder ID: %d", new Object[] {
                Long.valueOf(d)
            });
        }
        MediaFormat mediaformat = MediaFormat.createVideoFormat(i(), g, h);
        mediaformat.setInteger("color-format", 0x7f000789);
        mediaformat.setInteger("bitrate", n);
        mediaformat.setInteger("frame-rate", 30);
        mediaformat.setInteger("i-frame-interval", 120);
        a(b, mediaformat);
        gkc.a("vclib", "Configuring encoder with format: %s", new Object[] {
            mediaformat
        });
        gcz gcz1;
        try
        {
            b.configure(mediaformat, null, null, 1);
            gcz1 = new gcz(a, b.createInputSurface());
            b.start();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            String s = String.valueOf(obj1);
            gkc.e("vclib", (new StringBuilder(String.valueOf(s).length() + 38)).append("Initialization failed with exception: ").append(s).toString());
            gkc.e("vclib", Log.getStackTraceString(((Throwable) (obj1))));
            obj1 = String.valueOf(obj1);
            gbh.a((new StringBuilder(String.valueOf(obj1).length() + 49)).append("MediaCodec initialization failed with exception: ").append(((String) (obj1))).toString());
            return false;
        }
        synchronized (m)
        {
            if (c != null)
            {
                gbh.a("Existing input surface on the encoder instance.");
                c.b();
            }
            c = gcz1;
        }
        a();
        return true;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected MediaCodec c()
    {
        return b;
    }

    public void c(int i1)
    {
        i1 *= 950;
        if (i1 == n)
        {
            return;
        } else
        {
            int j1 = i;
            int k1 = j;
            gkc.c("vclib", (new StringBuilder(81)).append("Encoder bitrate changing to ").append(i1).append(" for resolution: (").append(j1).append("x").append(k1).append(")").toString());
            n = i1;
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", n);
            b.setParameters(bundle);
            return;
        }
    }

    protected int d()
    {
        return l;
    }

    public long e()
    {
        return d;
    }

    public int f()
    {
        return e;
    }

    public int g()
    {
        return i;
    }

    public int h()
    {
        return j;
    }

    public String i()
    {
        if (e == 0)
        {
            return "video/x-vnd.on2.vp8";
        }
        if (e == 1)
        {
            return "video/avc";
        } else
        {
            int i1 = e;
            gbh.a((new StringBuilder(31)).append("Unknown codec type: ").append(i1).toString());
            return null;
        }
    }

    public void j()
    {
        int i1 = i;
        int j1 = j;
        gkc.c("vclib", (new StringBuilder(66)).append("Encoder keyframe request for resolution: (").append(i1).append(",").append(j1).append(")").toString());
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        b.setParameters(bundle);
    }

    public gcz k()
    {
        gcz gcz1;
        synchronized (m)
        {
            gcz1 = c;
            c = null;
        }
        if (b != null)
        {
            obj = String.valueOf(b.getName());
            int i1 = i;
            int j1 = j;
            gkc.a("vclib", (new StringBuilder(String.valueOf(obj).length() + 50)).append("Releasing encoder: ").append(((String) (obj))).append(", size: ").append(i1).append("x").append(j1).toString());
            try
            {
                b.stop();
            }
            catch (IllegalStateException illegalstateexception) { }
            b.release();
            b = null;
        }
        return gcz1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
