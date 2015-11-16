// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.hangouts.video;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import gbh;
import gcx;
import gda;
import gdp;
import geb;
import gec;
import gee;
import geg;
import geh;
import gei;
import gej;
import gek;
import gkc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.libraries.hangouts.video:
//            EncoderManager

public final class MediaCodecSimulcastEncoder
    implements gda
{

    private List a;
    private final gdp b;
    private final Object c = new Object();
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private boolean h;
    private long i;
    private gcx j;
    private final HandlerThread k = new HandlerThread("EncoderHandlerThread", -4);
    private final Handler l;
    private final Runnable m = new geg(this);
    private final Runnable n = new geh(this);
    private final Runnable o = new gei(this);

    public MediaCodecSimulcastEncoder(gdp gdp1)
    {
        b = gdp1;
        a = new ArrayList();
        k.start();
        l = new Handler(k.getLooper());
        j = new gcx();
    }

    public static void a(MediaCodecSimulcastEncoder mediacodecsimulcastencoder)
    {
        mediacodecsimulcastencoder.h = true;
        mediacodecsimulcastencoder.l.removeCallbacks(mediacodecsimulcastencoder.m);
        mediacodecsimulcastencoder.l.removeCallbacks(mediacodecsimulcastencoder.o);
        mediacodecsimulcastencoder.e();
        List list = mediacodecsimulcastencoder.d();
        if (list == null)
        {
            mediacodecsimulcastencoder.g = false;
            mediacodecsimulcastencoder.l.postDelayed(mediacodecsimulcastencoder.m, 200L);
            return;
        }
        ArrayList arraylist = new ArrayList();
        int i1 = -1;
        for (int k1 = 0; k1 < list.size();)
        {
            EncoderConfigurationOutputParams encoderconfigurationoutputparams = (EncoderConfigurationOutputParams)list.get(k1);
            int k2 = encoderconfigurationoutputparams.width;
            int j2 = encoderconfigurationoutputparams.height;
            Object obj;
            int j1;
            int l1;
            int i2;
            if (i1 == -1)
            {
                if (encoderconfigurationoutputparams.codecType == 1)
                {
                    i1 = 16;
                } else
                {
                    i1 = 2;
                }
            }
            i2 = k2;
            l1 = j2;
            j1 = i1;
            if (i1 > 0)
            {
                i2 = k2 & ~(i1 - 1);
                l1 = j2 & ~(i1 - 1);
                j1 = i1 << 1;
            }
            if (android.os.Build.VERSION.SDK_INT < 21)
            {
                obj = new gec(mediacodecsimulcastencoder.j, encoderconfigurationoutputparams.nativeEncoderId, encoderconfigurationoutputparams.codecType, encoderconfigurationoutputparams.width, encoderconfigurationoutputparams.height, i2, l1, mediacodecsimulcastencoder.l);
            } else
            {
                obj = new gee(mediacodecsimulcastencoder.j, encoderconfigurationoutputparams.nativeEncoderId, encoderconfigurationoutputparams.codecType, encoderconfigurationoutputparams.width, encoderconfigurationoutputparams.height, i2, l1, encoderconfigurationoutputparams.temporalLayerCount);
            }
            if (!((geb) (obj)).b(encoderconfigurationoutputparams.targetBitRate))
            {
                gbh.a("MediaCodec initialization failed.");
                return;
            }
            arraylist.add(obj);
            k1++;
            i1 = j1;
        }

        synchronized (mediacodecsimulcastencoder.c)
        {
            mediacodecsimulcastencoder.a.addAll(arraylist);
            mediacodecsimulcastencoder.g = true;
        }
        mediacodecsimulcastencoder.l.postDelayed(mediacodecsimulcastencoder.o, 200L);
        return;
        mediacodecsimulcastencoder;
        obj1;
        JVM INSTR monitorexit ;
        throw mediacodecsimulcastencoder;
    }

    private void a(List list)
    {
        if (!list.isEmpty())
        {
            ArrayList arraylist = new ArrayList();
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                Object obj = (geb)list.next();
                if (obj != null)
                {
                    obj = ((geb) (obj)).k();
                    if (obj != null)
                    {
                        arraylist.add(obj);
                    }
                }
            } while (true);
            if (!arraylist.isEmpty())
            {
                b.a(new gek(this, arraylist));
                return;
            }
        }
    }

    public static void b(MediaCodecSimulcastEncoder mediacodecsimulcastencoder)
    {
        mediacodecsimulcastencoder.e();
    }

    public static Runnable c(MediaCodecSimulcastEncoder mediacodecsimulcastencoder)
    {
        return mediacodecsimulcastencoder.o;
    }

    public static Handler d(MediaCodecSimulcastEncoder mediacodecsimulcastencoder)
    {
        return mediacodecsimulcastencoder.l;
    }

    private List d()
    {
        gbh.g();
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        int i1;
        if (d >= e)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        obj;
        JVM INSTR monitorexit ;
        obj = new NativeSimulcastEncoderOutputParams();
        if (!EncoderManager.getNativeSimulcastEncoderIds(obj) || ((NativeSimulcastEncoderOutputParams) (obj)).nativeEncoderIds.length == 0)
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_62;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (((NativeSimulcastEncoderOutputParams) (obj)).nativeEncoderIds.length > 4)
        {
            i1 = ((NativeSimulcastEncoderOutputParams) (obj)).nativeEncoderIds.length;
            gbh.a((new StringBuilder(57)).append("Got a request for too many simulcast streams: ").append(i1).toString());
            return null;
        }
        ArrayList arraylist = new ArrayList(((NativeSimulcastEncoderOutputParams) (obj)).nativeEncoderIds.length);
        int j1 = 0;
        while (j1 < ((NativeSimulcastEncoderOutputParams) (obj)).nativeEncoderIds.length) 
        {
            EncoderConfigurationOutputParams encoderconfigurationoutputparams = new EncoderConfigurationOutputParams();
            if (!EncoderManager.getEncoderConfig(((NativeSimulcastEncoderOutputParams) (obj)).nativeEncoderIds[j1], encoderconfigurationoutputparams))
            {
                gkc.d("vclib", "Native encoder reset in the middle of a fetch operation.");
                return null;
            }
            int k1;
            if (encoderconfigurationoutputparams.width >= encoderconfigurationoutputparams.height)
            {
                k1 = 1;
            } else
            {
                k1 = 0;
            }
            if (i1 != k1)
            {
                k1 = encoderconfigurationoutputparams.width;
                encoderconfigurationoutputparams.width = encoderconfigurationoutputparams.height;
                encoderconfigurationoutputparams.height = k1;
            }
            arraylist.add(encoderconfigurationoutputparams);
            j1++;
        }
        Collections.sort(arraylist, new gej(this));
        return arraylist;
    }

    private void e()
    {
        ArrayList arraylist = new ArrayList();
        synchronized (c)
        {
            arraylist.addAll(a);
            a.clear();
        }
        a(arraylist);
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static boolean e(MediaCodecSimulcastEncoder mediacodecsimulcastencoder)
    {
        return mediacodecsimulcastencoder.h;
    }

    public static boolean f(MediaCodecSimulcastEncoder mediacodecsimulcastencoder)
    {
        List list;
        boolean flag2;
        flag2 = false;
        gbh.g();
        list = mediacodecsimulcastencoder.d();
        if (list != null) goto _L2; else goto _L1
_L1:
        boolean flag1;
        gkc.c("vclib", "Native encoders have been reset.");
        mediacodecsimulcastencoder.g = false;
        flag1 = true;
_L4:
        return flag1;
_L2:
        if (list.size() != mediacodecsimulcastencoder.a.size())
        {
            int i1 = list.size();
            gkc.d("vclib", (new StringBuilder(60)).append("New number of simulcast streams forcing a reset: ").append(i1).toString());
            return true;
        }
        int j1 = 0;
        do
        {
            flag1 = flag2;
            if (j1 >= mediacodecsimulcastencoder.a.size())
            {
                continue;
            }
label0:
            {
                geb geb1 = (geb)mediacodecsimulcastencoder.a.get(j1);
                EncoderConfigurationOutputParams encoderconfigurationoutputparams = (EncoderConfigurationOutputParams)list.get(j1);
                if (encoderconfigurationoutputparams.nativeEncoderId != geb1.e())
                {
                    gkc.d("vclib", "Encoder setup has changed. Resetting.");
                    return true;
                }
                if (encoderconfigurationoutputparams.codecType != geb1.f())
                {
                    gkc.d("vclib", "Encoder codec has changed. Resetting.");
                    return true;
                }
                if (encoderconfigurationoutputparams.width != geb1.g() || encoderconfigurationoutputparams.height != geb1.h())
                {
                    gkc.d("vclib", "Encoder setup(resolution) has changed. Resetting.");
                    return true;
                }
                if (!encoderconfigurationoutputparams.requiresKeyFrame)
                {
                    boolean flag;
                    if (mediacodecsimulcastencoder.f && SystemClock.elapsedRealtime() > mediacodecsimulcastencoder.i)
                    {
                        mediacodecsimulcastencoder.i = SystemClock.elapsedRealtime() + 5000L;
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (!flag)
                    {
                        break label0;
                    }
                }
                geb1.j();
            }
            geb1.c(encoderconfigurationoutputparams.targetBitRate);
            j1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a()
    {
        j.c();
    }

    public void a(int i1, int j1, boolean flag)
    {
        if (d == i1 && e == j1 && f == flag)
        {
            return;
        }
        String s = String.valueOf("Encoder setResolution with new resolution: Input: ");
        gkc.a("vclib", (new StringBuilder(String.valueOf(s).length() + 23)).append(s).append(i1).append("x").append(j1).toString());
        synchronized (c)
        {
            d = i1;
            e = j1;
            f = flag;
            l.post(o);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean a(int i1, long l1, boolean flag)
    {
        int j1;
        int k1;
        boolean flag1;
        flag1 = false;
        k1 = 0;
        j1 = ((flag1) ? 1 : 0);
        Object obj = c;
        j1 = ((flag1) ? 1 : 0);
        obj;
        JVM INSTR monitorenter ;
        j1 = k1;
        if (g)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        j1 = k1;
        flag = g;
        j1 = k1;
        obj;
        JVM INSTR monitorexit ;
        return flag;
        j1 = k1;
        Iterator iterator = a.iterator();
        j1 = 0;
_L2:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        k1 = j1 | ((geb)iterator.next()).a(i1, d, e, l1, flag);
        j1 = k1;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        if (j1 != 0)
        {
            j.d();
        }
        return true;
        Exception exception;
        exception;
        i1 = j1;
_L4:
        j1 = i1;
        obj;
        JVM INSTR monitorexit ;
        j1 = i1;
        throw exception;
        exception;
        if (j1 != 0)
        {
            j.d();
        }
        throw exception;
        exception;
        i1 = j1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int b()
    {
label0:
        {
            synchronized (c)
            {
                if (!a.isEmpty())
                {
                    break label0;
                }
            }
            return -1;
        }
        int i1 = ((geb)a.get(0)).f();
        obj;
        JVM INSTR monitorexit ;
        return i1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void c()
    {
        l.postAtFrontOfQueue(n);
        k.quitSafely();
    }

    private class EncoderConfigurationOutputParams
    {

        public int codecType;
        public int height;
        public long nativeEncoderId;
        public boolean requiresKeyFrame;
        public int targetBitRate;
        public int targetFrameRate;
        public int temporalLayerCount;
        public int width;

        public EncoderConfigurationOutputParams()
        {
        }
    }


    private class NativeSimulcastEncoderOutputParams
    {

        public long nativeEncoderIds[];

        public NativeSimulcastEncoderOutputParams()
        {
        }
    }

}
