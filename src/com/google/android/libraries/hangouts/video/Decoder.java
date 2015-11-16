// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.hangouts.video;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import g;
import gbh;
import gcq;
import gcr;
import gcs;
import gct;
import gdp;
import gkc;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.libraries.hangouts.video:
//            DecoderManager

public final class Decoder
{

    private static int a;
    private static final Object b = new Object();
    private static boolean f = false;
    private static int g = 0x7fffffff;
    private final gcs A;
    private MediaFormat B;
    private volatile int c;
    private volatile int d;
    private MediaCodec e;
    private boolean h;
    private boolean i;
    private volatile boolean j;
    private int k;
    private int l;
    private ByteBuffer m[];
    private int n;
    private int o;
    private boolean p;
    private final Object q = new Object();
    private boolean r;
    private boolean s;
    private int t;
    private final gdp u;
    private final gct v;
    private volatile int w;
    private Surface x;
    private SurfaceTexture y;
    private final HandlerThread z = new HandlerThread("DecoderHandlerThread", -4);

    Decoder(gdp gdp1, gct gct)
    {
        u = gdp1;
        v = gct;
        c = 0;
        d = -1;
        k = -1;
        s = true;
        p = true;
        w = 0;
        z.start();
        gdp1 = z.getLooper();
        if (gdp1 == null)
        {
            gkc.e("vclib", "Unable to create decoder thread/looper.");
            gbh.a("Unable to create decoder thread/looper.");
        }
        A = new gcs(this, gdp1);
    }

    public static int a(Decoder decoder, int i1)
    {
        decoder.c = i1;
        return i1;
    }

    public static Object a(Decoder decoder)
    {
        return decoder.q;
    }

    private void a(MediaFormat mediaformat)
    {
        if (!h && mediaformat.containsKey("crop-right"))
        {
            mediaformat.setInteger("width", mediaformat.getInteger("crop-right") + 1);
            mediaformat.setInteger("height", mediaformat.getInteger("crop-bottom") + 1);
        }
        B = mediaformat;
    }

    public static void a(Decoder decoder, boolean flag)
    {
        decoder.k = -1;
        synchronized (decoder.q)
        {
            decoder.r = false;
        }
        decoder.l = 0;
        decoder.i = false;
        decoder.j = false;
        decoder.n = 0;
        decoder.o = 0;
        decoder.B = null;
        if (decoder.e != null)
        {
            int i1;
            try
            {
                decoder.e.stop();
            }
            catch (IllegalStateException illegalstateexception) { }
            decoder.e.release();
            decoder.e = null;
            if (decoder.h)
            {
                synchronized (b)
                {
                    a--;
                }
            }
        }
        if (!flag && decoder.y != null)
        {
            decoder.y.release();
            decoder.y = null;
            decoder.x.release();
            decoder.x = null;
            i1 = decoder.w;
            decoder.w = 0;
            decoder.u.a(new gcr(decoder, i1));
        }
        decoder.s = true;
        return;
        decoder;
        obj;
        JVM INSTR monitorexit ;
        throw decoder;
        decoder;
        obj;
        JVM INSTR monitorexit ;
        throw decoder;
    }

    public static int b(Decoder decoder)
    {
        return decoder.c;
    }

    public static Surface c(Decoder decoder)
    {
        return decoder.x;
    }

    public static boolean d(Decoder decoder)
    {
        decoder.j = false;
        return false;
    }

    public static boolean e(Decoder decoder)
    {
        return decoder.i();
    }

    public static void f(Decoder decoder)
    {
        gbh.f();
        int i1 = DecoderManager.getCodecType(decoder.c);
        if (decoder.d != i1)
        {
            decoder.i = true;
            if (i1 == -1)
            {
                decoder.j = false;
            }
        } else
        {
            FrameDataOutputParams framedataoutputparams = new FrameDataOutputParams();
            if (DecoderManager.getNextEncodedFrameMetadata(decoder.c, decoder.s, framedataoutputparams))
            {
                int j1 = framedataoutputparams.width;
                int k1 = framedataoutputparams.height;
                if (j1 > 0 && k1 > 0 && (j1 != decoder.n || k1 != decoder.o))
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
                if (j1 != 0)
                {
                    j1 = framedataoutputparams.width;
                    int l1 = framedataoutputparams.height;
                    if (android.os.Build.VERSION.SDK_INT >= 21)
                    {
                        ByteBuffer bytebuffer;
                        int i2;
                        int j2;
                        long l2;
                        boolean flag;
                        if (l1 > j1)
                        {
                            i2 = l1;
                            l1 = j1;
                        } else
                        {
                            i2 = j1;
                        }
                        flag = decoder.e.getCodecInfo().getCapabilitiesForType(decoder.h()).getVideoCapabilities().isSizeSupported(i2, l1);
                    } else
                    if (j1 <= 1920 && l1 <= 1920 && (j1 <= 1080 || l1 <= 1080))
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    decoder.p = flag;
                    if (!decoder.p)
                    {
                        j1 = framedataoutputparams.width;
                        l1 = framedataoutputparams.height;
                        gkc.d("vclib", (new StringBuilder(59)).append("Unsupported resolution for decode (").append(j1).append("x").append(l1).append(")").toString());
                        DecoderManager.notifyResolutionNotSupported(decoder.c, framedataoutputparams.width, framedataoutputparams.height);
                    }
                    if (decoder.n != 0 && decoder.o != 0)
                    {
                        j1 = decoder.n;
                        l1 = decoder.o;
                        i2 = framedataoutputparams.width;
                        j2 = framedataoutputparams.height;
                        gkc.c("vclib", (new StringBuilder(87)).append("Dynamic resolution change detected (").append(j1).append("x").append(l1).append(" -> ").append(i2).append("x").append(j2).append(")").toString());
                        if (!f)
                        {
                            decoder.i = true;
                            return;
                        }
                    }
                }
                decoder.s = false;
                if (framedataoutputparams.width != 0 && framedataoutputparams.height != 0)
                {
                    decoder.n = framedataoutputparams.width;
                    decoder.o = framedataoutputparams.height;
                }
                if (!decoder.p)
                {
                    DecoderManager.consumeNextEncodedFrame(decoder.c, framedataoutputparams.timestamp, null);
                    return;
                }
                if (decoder.k == -1)
                {
                    decoder.k = decoder.e.dequeueInputBuffer(0L);
                }
                if (decoder.k == -1)
                {
                    decoder.l = decoder.l + 1;
                } else
                {
                    decoder.l = 0;
                }
                l1 = decoder.k;
                if (l1 == -1)
                {
                    if (decoder.l >= 100)
                    {
                        decoder.i = true;
                        return;
                    }
                } else
                {
                    bytebuffer = decoder.m[l1];
                    if (!DecoderManager.consumeNextEncodedFrame(decoder.c, framedataoutputparams.timestamp, bytebuffer))
                    {
                        gkc.e("vclib", "Unable to consume encoded frame.");
                        return;
                    }
                    if (framedataoutputparams.isEndOfStream)
                    {
                        j1 = 4;
                    } else
                    {
                        j1 = 0;
                    }
                    l2 = framedataoutputparams.timestamp;
                    decoder.e.queueInputBuffer(l1, 0, framedataoutputparams.size, l2 * 11L, j1);
                    decoder.t = decoder.t + 1;
                    decoder.k = -1;
                    return;
                }
            }
        }
    }

    public static boolean g(Decoder decoder)
    {
        return decoder.j();
    }

    private String h()
    {
        if (d == 0)
        {
            return "video/x-vnd.on2.vp8";
        }
        if (d == 1)
        {
            return "video/avc";
        } else
        {
            int i1 = d;
            gbh.a((new StringBuilder(31)).append("Unknown codec type: ").append(i1).toString());
            return null;
        }
    }

    public static boolean h(Decoder decoder)
    {
        return decoder.i;
    }

    public static gct i(Decoder decoder)
    {
        return decoder.v;
    }

    private boolean i()
    {
        Object obj;
        obj = null;
        h = true;
        Object obj1 = b;
        obj1;
        JVM INSTR monitorenter ;
        if (a < g) goto _L2; else goto _L1
_L1:
        h = false;
_L9:
        if (!h) goto _L4; else goto _L3
_L3:
        try
        {
            e = MediaCodec.createDecoderByType(h());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = String.valueOf(obj);
            gkc.e("vclib", (new StringBuilder(String.valueOf(obj).length() + 39)).append("MediaCodec.createDecoderByType failed, ").append(((String) (obj))).toString());
        }
_L6:
        if (e == null)
        {
            gkc.e("vclib", "Unable to create a MediaCodec decoder.");
            return false;
        }
        break MISSING_BLOCK_LABEL_246;
_L2:
        a++;
        continue; /* Loop/switch isn't completed */
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
_L4:
        gkc.d("vclib", "Creating a software decoder.");
        if (d != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = "OMX.google.vp8.decoder";
_L7:
        try
        {
            e = MediaCodec.createByCodecName(((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = String.valueOf(obj);
            gkc.e("vclib", (new StringBuilder(String.valueOf(obj).length() + 37)).append("MediaCodec.createByCodecName failed, ").append(((String) (obj))).toString());
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (d != 1)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        obj = "OMX.google.h264.decoder";
          goto _L7
        int i1 = d;
        gbh.a((new StringBuilder(31)).append("Unknown codec type: ").append(i1).toString());
          goto _L7
        MediaFormat mediaformat = MediaFormat.createVideoFormat(h(), 640, 640);
        mediaformat.setInteger("max-width", 1920);
        mediaformat.setInteger("max-height", 1920);
        try
        {
            e.configure(mediaformat, x, null, 0);
            e.start();
            m = e.getInputBuffers();
        }
        catch (IllegalStateException illegalstateexception)
        {
            String s1 = String.valueOf(illegalstateexception);
            gkc.e("vclib", (new StringBuilder(String.valueOf(s1).length() + 38)).append("Initialization failed with exception: ").append(s1).toString());
            gkc.e("vclib", Log.getStackTraceString(illegalstateexception));
            return false;
        }
        if (!m[0].isDirect())
        {
            gbh.a("All MediaCodec objects should use direct input buffers.");
            return false;
        }
        j = true;
        return true;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private boolean j()
    {
        gbh.f();
        break MISSING_BLOCK_LABEL_3;
_L2:
        int i1;
        do
        {
            return false;
        } while (i || !j || t == 0);
        android.media.MediaCodec.BufferInfo bufferinfo = new android.media.MediaCodec.BufferInfo();
        i1 = e.dequeueOutputBuffer(bufferinfo, 0L);
        if (i1 >= 0)
        {
            if (B == null)
            {
                synchronized (q)
                {
                    a(e.getOutputFormat());
                }
            }
            long l2 = bufferinfo.presentationTimeUs / 11L;
            int k1 = B.getInteger("width");
            int l1 = B.getInteger("height");
            e.releaseOutputBuffer(i1, true);
            t = t - 1;
            DecoderManager.frameRenderedExternally(c, l2, k1, l1);
            synchronized (q)
            {
                r = true;
            }
            return true;
        }
        continue; /* Loop/switch isn't completed */
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        exception2;
        obj;
        JVM INSTR monitorexit ;
        throw exception2;
        if (i1 != -2) goto _L2; else goto _L1
_L1:
        MediaFormat mediaformat = e.getOutputFormat();
        int j1 = c;
        String s1 = String.valueOf(mediaformat);
        gkc.c("vclib", (new StringBuilder(String.valueOf(s1).length() + 59)).append("decoder (ssrc=").append(j1).append(") resolution changed. New format: ").append(s1).toString());
        if (B != null && !f)
        {
            gkc.d("vclib", "Missed a dynamic resolution change when handling incoming frames. Resetting hw decoder now.");
            i = true;
            return false;
        }
        synchronized (q)
        {
            a(mediaformat);
        }
        return false;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a()
    {
        synchronized (q)
        {
            w = g.q();
            y = new SurfaceTexture(w);
            x = new Surface(y);
        }
        A.sendMessage(A.obtainMessage(1));
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(int i1)
    {
        if (d != i1 && i1 != -1)
        {
            d = i1;
            if (v != null)
            {
                u.a(new gcq(this, i1));
                return;
            }
        }
    }

    public int b()
    {
        int i1;
        synchronized (q)
        {
            i1 = w;
        }
        return i1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b(int i1)
    {
        if (c == i1)
        {
            return;
        } else
        {
            A.sendMessage(A.obtainMessage(3, i1, 0));
            return;
        }
    }

    public boolean c()
    {
        Object obj = q;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (j && p)
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

    public int d()
    {
        int i1;
        synchronized (q)
        {
            i1 = d;
        }
        return i1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean e()
    {
        boolean flag;
        synchronized (q)
        {
            flag = r;
            r = false;
        }
        if (flag && y != null)
        {
            y.updateTexImage();
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public MediaFormat f()
    {
        MediaFormat mediaformat;
        synchronized (q)
        {
            mediaformat = B;
        }
        return mediaformat;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void g()
    {
        A.sendMessageAtFrontOfQueue(A.obtainMessage(2));
        z.getLooper().quitSafely();
    }

    static 
    {
        if ("manta".equals(Build.HARDWARE))
        {
            g = 3;
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
