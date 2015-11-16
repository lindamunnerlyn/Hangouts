// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import com.google.android.libraries.hangouts.video.EncoderManager;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class gha
{

    private final EncoderManager a;
    private gfl b;
    private MediaCodec c;
    private gfn d;
    private final long e;
    private final int f;
    private final AtomicInteger g = new AtomicInteger(0);
    private int h;
    private int i;
    private final int j;
    private final int k;
    private ByteBuffer l;
    private int m;
    private final Object n = new Object();
    private int o;
    private volatile boolean p;
    private final gib q = new gib("MediaCodecEncoder");
    private volatile boolean r;
    private volatile boolean s;
    private volatile float t;
    private int u;
    private int v;
    private final Random w = new Random();
    private long x;

    public gha(EncoderManager encodermanager, gfl gfl, long l1, int i1, int j1, int k1, 
            int i2, int j2)
    {
        r = false;
        s = false;
        a = encodermanager;
        b = gfl;
        e = l1;
        f = i1;
        j = j1;
        k = k1;
        h = i2;
        i = j2;
        m = 0;
        p = false;
        t = 0.0F;
        u = 0;
        v = 0;
    }

    private static ByteBuffer a(ByteBuffer bytebuffer, int i1, int j1)
    {
        bytebuffer = bytebuffer.duplicate();
        bytebuffer.position(i1);
        bytebuffer.limit(i1 + j1);
        return bytebuffer.slice();
    }

    protected int a(long l1, ByteBuffer bytebuffer, int i1, int j1, int k1, int i2, 
            int j2, boolean flag)
    {
        return a.sendEncodedFrame(e, l1, bytebuffer, i1, j1, k1, i2, j2, flag);
    }

    protected MediaCodec a(String s1)
    {
        return MediaCodec.createEncoderByType(s1);
    }

    protected abstract ByteBuffer a(int i1);

    protected abstract void a();

    public void a(int i1, android.media.MediaCodec.BufferInfo bufferinfo)
    {
        boolean flag = true;
        gdv.f();
        if (!r)
        {
            ByteBuffer bytebuffer = a(i1);
            if ((bufferinfo.flags & 2) != 0)
            {
                if (f != 1)
                {
                    flag = false;
                }
                gdv.a("Expected condition to be true", flag);
                l = ByteBuffer.allocateDirect(bufferinfo.size);
                l.put(a(bytebuffer, bufferinfo.offset, bufferinfo.size));
                c.releaseOutputBuffer(i1, false);
                return;
            }
            long l1 = System.currentTimeMillis();
            if (l1 - x >= 1000L && v != 0)
            {
                x = l1;
                t = 0.25F * ((float)u / (float)(u + v)) + 0.75F * t;
                u = 0;
                v = 0;
            }
            if ((bufferinfo.flags & 1) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                m = 0;
                int j1;
                long l2;
                if (l != null)
                {
                    l.rewind();
                    ByteBuffer bytebuffer1 = ByteBuffer.allocateDirect(l.capacity() + bufferinfo.size);
                    bytebuffer1.put(l);
                    bytebuffer1.put(a(bytebuffer, bufferinfo.offset, bufferinfo.size));
                    bytebuffer1.rewind();
                    bufferinfo.offset = 0;
                    bufferinfo.size = bytebuffer1.capacity();
                    bytebuffer = bytebuffer1;
                }
            }
            l2 = bufferinfo.presentationTimeUs / 1000L;
            j1 = b();
            m = m + 1;
            if (a(l2, bytebuffer, bufferinfo.offset, bufferinfo.size, h, i, j1, flag) > 0)
            {
                p = true;
                u = u + 1;
            } else
            {
                v = v + 1;
            }
            c.releaseOutputBuffer(i1, false);
            i1 = g.decrementAndGet();
            if (i1 < 0)
            {
                gne.c("vclib", "The encoder for resolution: (%dx%d) produced extra frames, recovering.", new Object[] {
                    Integer.valueOf(j), Integer.valueOf(k)
                });
                g.compareAndSet(i1, 0);
                return;
            }
        }
    }

    protected abstract void a(MediaCodec mediacodec, MediaFormat mediaformat);

    protected void a(MediaFormat mediaformat)
    {
        while (r || h == mediaformat.getInteger("width") && i == mediaformat.getInteger("height")) 
        {
            return;
        }
        String s1 = String.valueOf("Encoder is unable to handle the exact requested camera size. Original size requested: ");
        int i1 = h;
        int j1 = i;
        String s2 = String.valueOf(mediaformat);
        gne.a(6, "vclib", (new StringBuilder(String.valueOf(s1).length() + 37 + String.valueOf(s2).length())).append(s1).append(i1).append("x").append(j1).append(", new format: ").append(s2).toString());
        synchronized (n)
        {
            h = mediaformat.getInteger("width");
            i = mediaformat.getInteger("height");
        }
        return;
        mediaformat;
        obj;
        JVM INSTR monitorexit ;
        throw mediaformat;
    }

    protected void a(IllegalStateException illegalstateexception, boolean flag)
    {
        gne.a("vclib", "MediaCodec encoder exception:", illegalstateexception);
        r = true;
        s = flag;
    }

    public boolean a(int i1, int j1, int k1, long l1, boolean flag)
    {
label0:
        {
            synchronized (n)
            {
                if (!r)
                {
                    break label0;
                }
            }
            return false;
        }
        if (d != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (p) goto _L2; else goto _L1
_L1:
        float f1 = t;
        boolean flag1;
        int i2;
        if (w.nextFloat() < f1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
          goto _L3
_L6:
        p = false;
        i2 = g.intValue();
        if (i2 <= 1)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        gne.a(2, "vclib", "Dropping frame due to too many outstanding frames for encoder: (%dx%d). Currently processing %d frames", new Object[] {
            Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i2)
        });
        flag1 = true;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        obj;
        JVM INSTR monitorexit ;
        return false;
        d.a();
        if (d.a(l1))
        {
            break MISSING_BLOCK_LABEL_226;
        }
        i1 = j;
        j1 = k;
        gne.a(6, "vclib", (new StringBuilder(85)).append("Unable to start frame operation for encoder: (").append(i1).append("x").append(j1).append(". Encode failed.").toString());
        obj;
        JVM INSTR monitorexit ;
        return false;
        q.a(i1, j1, k1, false, flag);
        q.a(h, i, true);
        q.e();
        d.c();
        g.incrementAndGet();
        obj;
        JVM INSTR monitorexit ;
        return true;
_L3:
        if (!flag1) goto _L4; else goto _L2
_L2:
        flag1 = true;
        continue; /* Loop/switch isn't completed */
_L4:
        flag1 = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected abstract int b();

    public boolean b(int i1)
    {
        o = i1 * 950;
        try
        {
            c = a(k());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = String.valueOf(obj);
            gdv.a((new StringBuilder(String.valueOf(obj).length() + 46)).append("Unable to create hardware encoder. Exception: ").append(((String) (obj))).toString());
            return false;
        }
        if (c == null)
        {
            gdv.a("Unexpected: MediaCodec.createEncoderByType returned null.");
            Object obj = String.valueOf(k());
            if (((String) (obj)).length() != 0)
            {
                obj = "Unable to create a hardware encoder for ".concat(((String) (obj)));
            } else
            {
                obj = new String("Unable to create a hardware encoder for ");
            }
            gne.a(6, "vclib", ((String) (obj)));
            return false;
        }
        if (gne.a())
        {
            gne.a(2, "vclib", "Creating hardware encoder with original size: %dx%d, encoder size: %dx%d", new Object[] {
                Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(h), Integer.valueOf(i)
            });
            gne.a(2, "vclib", "Requested bitrate: %d", new Object[] {
                Integer.valueOf(o)
            });
            gne.a(2, "vclib", "Encoder name: %s", new Object[] {
                c.getName()
            });
            gne.a(2, "vclib", "Native encoder ID: %d", new Object[] {
                Long.valueOf(e)
            });
        }
        MediaFormat mediaformat = MediaFormat.createVideoFormat(k(), h, i);
        mediaformat.setInteger("color-format", 0x7f000789);
        mediaformat.setInteger("bitrate", o);
        mediaformat.setInteger("frame-rate", 30);
        mediaformat.setInteger("i-frame-interval", 120);
        a(c, mediaformat);
        gne.a(2, "vclib", "Configuring encoder with format: %s", new Object[] {
            mediaformat
        });
        gfn gfn1;
        try
        {
            c.configure(mediaformat, null, null, 1);
            gfn1 = new gfn(b, c.createInputSurface());
            c.start();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            gne.a(6, "vclib", "Encoder initialization failed.");
            a(((IllegalStateException) (obj1)), true);
            return false;
        }
        synchronized (n)
        {
            if (d != null)
            {
                gdv.a("Existing input surface on the encoder instance.");
                d.b();
            }
            d = gfn1;
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
        return c;
    }

    public void c(int i1)
    {
        if (!r)
        {
            if ((i1 *= 950) != o)
            {
                int j1 = j;
                int k1 = k;
                gne.a(4, "vclib", (new StringBuilder(81)).append("Encoder bitrate changing to ").append(i1).append(" for resolution: (").append(j1).append("x").append(k1).append(")").toString());
                o = i1;
                Bundle bundle = new Bundle();
                bundle.putInt("video-bitrate", o);
                c.setParameters(bundle);
                return;
            }
        }
    }

    protected int d()
    {
        return m;
    }

    public boolean e()
    {
        return r;
    }

    public boolean f()
    {
        return s;
    }

    public long g()
    {
        return e;
    }

    public int h()
    {
        return f;
    }

    public int i()
    {
        return j;
    }

    public int j()
    {
        return k;
    }

    public String k()
    {
        if (f == 0)
        {
            return "video/x-vnd.on2.vp8";
        }
        if (f == 1)
        {
            return "video/avc";
        } else
        {
            int i1 = f;
            gdv.a((new StringBuilder(31)).append("Unknown codec type: ").append(i1).toString());
            return null;
        }
    }

    public void l()
    {
        if (r)
        {
            return;
        } else
        {
            int i1 = j;
            int j1 = k;
            gne.a(4, "vclib", (new StringBuilder(66)).append("Encoder keyframe request for resolution: (").append(i1).append(",").append(j1).append(")").toString());
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            c.setParameters(bundle);
            return;
        }
    }

    public gfn m()
    {
        gfn gfn1;
        synchronized (n)
        {
            gfn1 = d;
            d = null;
        }
        if (c != null)
        {
            obj = String.valueOf(c.getName());
            int i1 = j;
            int j1 = k;
            gne.a(2, "vclib", (new StringBuilder(String.valueOf(obj).length() + 50)).append("Releasing encoder: ").append(((String) (obj))).append(", size: ").append(i1).append("x").append(j1).toString());
            try
            {
                c.stop();
            }
            catch (IllegalStateException illegalstateexception) { }
            c.release();
            c = null;
        }
        return gfn1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
