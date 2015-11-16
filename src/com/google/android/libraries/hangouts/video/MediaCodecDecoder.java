// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.hangouts.video;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import g;
import gdv;
import ggd;
import ggp;
import ggq;
import ggr;
import ggs;
import ggt;
import ggu;
import ggv;
import gne;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.libraries.hangouts.video:
//            DecoderManager

public abstract class MediaCodecDecoder
{

    private static int a;
    private static final Object b = new Object();
    private static boolean g = false;
    private static int h = 0x7fffffff;
    private final Runnable A = new ggq(this);
    private final Runnable B = new ggr(this);
    private final DecoderManager c;
    private volatile int d;
    private volatile int e;
    private MediaCodec f;
    private boolean i;
    private volatile boolean j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private final Object o = new Object();
    private boolean p;
    private boolean q;
    private final ggd r;
    private final ggv s;
    private volatile int t;
    private Surface u;
    private SurfaceTexture v;
    private final HandlerThread w = new HandlerThread("DecoderHandlerThread", -4);
    private final Handler x;
    private MediaFormat y;
    private final Runnable z = new ggp(this);

    public MediaCodecDecoder(DecoderManager decodermanager, ggd ggd1, ggv ggv)
    {
        c = decodermanager;
        r = ggd1;
        s = ggv;
        d = 0;
        e = -1;
        q = true;
        n = true;
        t = 0;
        w.start();
        x = new Handler(w.getLooper());
    }

    public static int a(MediaCodecDecoder mediacodecdecoder, int i1)
    {
        mediacodecdecoder.d = i1;
        return i1;
    }

    public static void a(MediaCodecDecoder mediacodecdecoder)
    {
        mediacodecdecoder.o();
    }

    private void a(boolean flag)
    {
        b();
        x.removeCallbacks(z);
        x.removeCallbacks(B);
        b(-1);
        synchronized (o)
        {
            p = false;
        }
        k = 0;
        j = false;
        l = 0;
        m = 0;
        y = null;
        if (f != null)
        {
            int i1;
            try
            {
                f.stop();
            }
            catch (IllegalStateException illegalstateexception) { }
            f.release();
            f = null;
            if (i)
            {
                synchronized (b)
                {
                    a--;
                }
            }
        }
        if (flag && v != null)
        {
            v.release();
            v = null;
            u.release();
            u = null;
            i1 = t;
            t = 0;
            r.a(new ggu(this, i1));
        }
        q = true;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public static void b(MediaCodecDecoder mediacodecdecoder)
    {
        mediacodecdecoder.a(true);
    }

    public static Runnable c(MediaCodecDecoder mediacodecdecoder)
    {
        return mediacodecdecoder.B;
    }

    public static Handler d(MediaCodecDecoder mediacodecdecoder)
    {
        return mediacodecdecoder.x;
    }

    public static void e(MediaCodecDecoder mediacodecdecoder)
    {
        int i1;
        byte byte0;
        byte0 = 4;
        gdv.e();
        i1 = mediacodecdecoder.c.getCodecType(mediacodecdecoder.d);
        if (mediacodecdecoder.e == i1) goto _L2; else goto _L1
_L1:
        if (i1 == -1)
        {
            mediacodecdecoder.j = false;
        }
        mediacodecdecoder.o();
_L13:
        return;
_L2:
        FrameDataOutputParams framedataoutputparams;
        int j1;
        int l1;
        boolean flag;
        framedataoutputparams = new FrameDataOutputParams();
        if (!mediacodecdecoder.c.getNextEncodedFrameMetadata(mediacodecdecoder.d, mediacodecdecoder.q, framedataoutputparams))
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = framedataoutputparams.width;
        j1 = framedataoutputparams.height;
        int i2;
        if (i1 > 0 && j1 > 0 && (i1 != mediacodecdecoder.l || j1 != mediacodecdecoder.m))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L4; else goto _L3
_L3:
        i1 = framedataoutputparams.width;
        j1 = framedataoutputparams.height;
        if (android.os.Build.VERSION.SDK_INT < 21) goto _L6; else goto _L5
_L5:
        if (j1 > i1)
        {
            l1 = j1;
            j1 = i1;
        } else
        {
            l1 = i1;
        }
        if (mediacodecdecoder.f != null) goto _L8; else goto _L7
_L7:
        gne.a(6, "vclib", "Getting Codec info when mediaCodec is null");
_L11:
        flag = false;
_L10:
        mediacodecdecoder.n = flag;
        if (!mediacodecdecoder.n)
        {
            i1 = framedataoutputparams.width;
            j1 = framedataoutputparams.height;
            gne.a(5, "vclib", (new StringBuilder(59)).append("Unsupported resolution for decode (").append(i1).append("x").append(j1).append(")").toString());
            mediacodecdecoder.c.notifyResolutionNotSupported(mediacodecdecoder.d, framedataoutputparams.width, framedataoutputparams.height);
        }
        if (mediacodecdecoder.l != 0 && mediacodecdecoder.m != 0)
        {
            i1 = mediacodecdecoder.l;
            j1 = mediacodecdecoder.m;
            l1 = framedataoutputparams.width;
            i2 = framedataoutputparams.height;
            gne.a(4, "vclib", (new StringBuilder(87)).append("Dynamic resolution change detected (").append(i1).append("x").append(j1).append(" -> ").append(l1).append("x").append(i2).append(")").toString());
            if (!g)
            {
                mediacodecdecoder.o();
                return;
            }
        }
        break; /* Loop/switch isn't completed */
_L8:
        flag = mediacodecdecoder.f.getCodecInfo().getCapabilitiesForType(mediacodecdecoder.m()).getVideoCapabilities().isSizeSupported(l1, j1);
        continue; /* Loop/switch isn't completed */
_L6:
        if (i1 > 1920 || j1 > 1920 || i1 > 1080 && j1 > 1080)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = true;
        if (true) goto _L10; else goto _L9
_L9:
        if (true) goto _L11; else goto _L4
_L4:
        mediacodecdecoder.q = false;
        if (framedataoutputparams.width != 0 && framedataoutputparams.height != 0)
        {
            mediacodecdecoder.l = framedataoutputparams.width;
            mediacodecdecoder.m = framedataoutputparams.height;
        }
        if (!mediacodecdecoder.n)
        {
            mediacodecdecoder.c.consumeNextEncodedFrame(mediacodecdecoder.d, framedataoutputparams.timestamp, null);
            return;
        }
        int k1 = mediacodecdecoder.c();
        if (k1 == -1)
        {
            mediacodecdecoder.k = mediacodecdecoder.k + 1;
            if (mediacodecdecoder.k >= 100)
            {
                mediacodecdecoder.o();
                return;
            }
        } else
        {
            mediacodecdecoder.k = 0;
            ByteBuffer bytebuffer = mediacodecdecoder.a(k1);
            if (!mediacodecdecoder.c.consumeNextEncodedFrame(mediacodecdecoder.d, framedataoutputparams.timestamp, bytebuffer))
            {
                gne.a(6, "vclib", "Unable to consume encoded frame.");
                return;
            }
            long l2;
            if (framedataoutputparams.isEndOfStream)
            {
                i1 = byte0;
            } else
            {
                i1 = 0;
            }
            l2 = framedataoutputparams.timestamp;
            mediacodecdecoder.f.queueInputBuffer(k1, 0, framedataoutputparams.size, l2 * 11L, i1);
            mediacodecdecoder.b(k1);
            return;
        }
        if (true) goto _L13; else goto _L12
_L12:
    }

    public static ggv f(MediaCodecDecoder mediacodecdecoder)
    {
        return mediacodecdecoder.s;
    }

    private String m()
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
            gdv.a((new StringBuilder(31)).append("Unknown codec type: ").append(i1).toString());
            return null;
        }
    }

    private boolean n()
    {
        i = true;
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (a < h) goto _L2; else goto _L1
_L1:
        i = false;
_L9:
        if (i)
        {
            Exception exception;
            try
            {
                f = MediaCodec.createDecoderByType(m());
            }
            catch (Throwable throwable)
            {
                throwable = String.valueOf(throwable);
                gne.a(6, "vclib", (new StringBuilder(String.valueOf(throwable).length() + 39)).append("MediaCodec.createDecoderByType failed, ").append(throwable).toString());
            }
            break MISSING_BLOCK_LABEL_45;
        }
          goto _L3
_L2:
        a++;
        continue; /* Loop/switch isn't completed */
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L3:
        gne.a(5, "vclib", "Creating a software decoder.");
        if (e != 0) goto _L5; else goto _L4
_L4:
        throwable = "OMX.google.vp8.decoder";
_L7:
        try
        {
            f = MediaCodec.createByCodecName(throwable);
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            throwable = String.valueOf(throwable);
            gne.a(6, "vclib", (new StringBuilder(String.valueOf(throwable).length() + 37)).append("MediaCodec.createByCodecName failed, ").append(throwable).toString());
        }
          goto _L6
_L5:
        if (e != 1)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        throwable = "OMX.google.h264.decoder";
          goto _L7
        int i1 = e;
        gdv.a((new StringBuilder(31)).append("Unknown codec type: ").append(i1).toString());
        throwable = null;
          goto _L7
_L6:
        if (f == null)
        {
            gne.a(6, "vclib", "Unable to create a MediaCodec decoder.");
            return false;
        }
        throwable = MediaFormat.createVideoFormat(m(), 640, 640);
        throwable.setInteger("max-width", 1920);
        throwable.setInteger("max-height", 1920);
        a(f);
        f.configure(throwable, u, null, 0);
        f.start();
        j = true;
        a();
        return true;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        String s1 = String.valueOf(illegalstateexception);
        gne.a(6, "vclib", (new StringBuilder(String.valueOf(s1).length() + 38)).append("Initialization failed with exception: ").append(s1).toString());
        gne.a(6, "vclib", Log.getStackTraceString(illegalstateexception));
        return false;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private void o()
    {
label0:
        {
            a(false);
            synchronized (o)
            {
                if (d != 0 && u != null)
                {
                    break label0;
                }
            }
            return;
        }
        obj;
        JVM INSTR monitorexit ;
        int i1;
        i1 = c.getCodecType(d);
        if (i1 == -1)
        {
            j = false;
            x.postDelayed(z, 200L);
            return;
        }
        break MISSING_BLOCK_LABEL_74;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        c(i1);
        if (!n())
        {
            gne.a(6, "vclib", "Initialize failed, ignoring decode.");
            return;
        } else
        {
            x.post(B);
            return;
        }
    }

    public abstract ByteBuffer a(int i1);

    public void a()
    {
    }

    public void a(int i1, android.media.MediaCodec.BufferInfo bufferinfo)
    {
        gdv.e();
        if (y == null)
        {
            synchronized (o)
            {
                y = f.getOutputFormat();
            }
        }
        long l1 = bufferinfo.presentationTimeUs / 11L;
        int j1 = y.getInteger("width");
        int k1 = y.getInteger("height");
        f.releaseOutputBuffer(i1, true);
        c.frameRenderedExternally(d, l1, j1, k1);
        synchronized (o)
        {
            p = true;
        }
        return;
        bufferinfo;
        obj;
        JVM INSTR monitorexit ;
        throw bufferinfo;
        exception;
        bufferinfo;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(MediaCodec mediacodec)
    {
    }

    public void a(MediaFormat mediaformat)
    {
        int i1 = d;
        mediaformat = String.valueOf(mediaformat);
        gne.a(4, "vclib", (new StringBuilder(String.valueOf(mediaformat).length() + 59)).append("decoder (ssrc=").append(i1).append(") resolution changed. New format: ").append(mediaformat).toString());
        if (y != null && !g)
        {
            gne.a(5, "vclib", "Missed a dynamic resolution change when handling incoming frames. Resetting hw decoder now.");
            o();
            return;
        }
        synchronized (o)
        {
            MediaFormat mediaformat1 = f.getOutputFormat();
            if (!i && mediaformat1.containsKey("crop-right"))
            {
                mediaformat1.setInteger("width", mediaformat1.getInteger("crop-right") + 1);
                mediaformat1.setInteger("height", mediaformat1.getInteger("crop-bottom") + 1);
            }
            y = mediaformat1;
        }
        return;
        exception;
        mediaformat;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b()
    {
    }

    public abstract void b(int i1);

    public abstract int c();

    void c(int i1)
    {
        if (e != i1 && i1 != -1)
        {
            e = i1;
            if (s != null)
            {
                r.a(new ggs(this, i1));
                return;
            }
        }
    }

    public MediaCodec d()
    {
        return f;
    }

    public void d(int i1)
    {
        if (d == i1)
        {
            return;
        } else
        {
            x.post(new ggt(this, i1));
            return;
        }
    }

    public Handler e()
    {
        return x;
    }

    public void f()
    {
        synchronized (o)
        {
            t = g.p();
            v = new SurfaceTexture(t);
            u = new Surface(v);
        }
        x.post(z);
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int g()
    {
        int i1;
        synchronized (o)
        {
            i1 = t;
        }
        return i1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean h()
    {
        Object obj = o;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (j && n)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public int i()
    {
        int i1;
        synchronized (o)
        {
            i1 = e;
        }
        return i1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean j()
    {
        boolean flag;
        synchronized (o)
        {
            flag = p;
            p = false;
        }
        if (flag && v != null)
        {
            v.updateTexImage();
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public MediaFormat k()
    {
        MediaFormat mediaformat;
        synchronized (o)
        {
            mediaformat = y;
        }
        return mediaformat;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void l()
    {
        x.postAtFrontOfQueue(A);
        w.getLooper().quitSafely();
    }

    static 
    {
        if ("manta".equals(Build.HARDWARE))
        {
            h = 3;
        }
    }

    private class FrameDataOutputParams
    {

        public int height;
        public boolean isEndOfStream;
        public int size;
        public long timestamp;
        public int width;

        public FrameDataOutputParams()
        {
        }
    }

}
