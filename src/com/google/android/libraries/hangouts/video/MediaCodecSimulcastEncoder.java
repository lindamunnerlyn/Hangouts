// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.hangouts.video;

import android.os.Handler;
import android.os.HandlerThread;
import gdv;
import gfl;
import gfo;
import ggd;
import gha;
import ghb;
import ghd;
import ghf;
import ghg;
import ghh;
import ghi;
import ghj;
import gne;
import gnk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.libraries.hangouts.video:
//            EncoderManager

public final class MediaCodecSimulcastEncoder
    implements gfo
{

    public List a;
    public boolean b;
    public boolean c;
    public boolean d;
    public long e;
    public final Handler f;
    public final Runnable g = new ghh(this);
    private final EncoderManager h;
    private final ggd i;
    private final int j;
    private final Object k = new Object();
    private int l;
    private int m;
    private gfl n;
    private final HandlerThread o = new HandlerThread("EncoderHandlerThread", -4);
    private final Runnable p = new ghf(this);
    private final Runnable q = new ghg(this);

    public MediaCodecSimulcastEncoder(EncoderManager encodermanager, ggd ggd1, int i1)
    {
        h = encodermanager;
        i = ggd1;
        j = i1;
        a = new ArrayList();
        o.start();
        f = new Handler(o.getLooper());
        n = new gfl();
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
                Object obj = (gha)list.next();
                if (obj != null)
                {
                    obj = ((gha) (obj)).m();
                    if (obj != null)
                    {
                        arraylist.add(obj);
                    }
                }
            } while (true);
            if (!arraylist.isEmpty())
            {
                i.a(new ghj(this, arraylist));
                return;
            }
        }
    }

    public void a()
    {
        n.c();
    }

    public void a(int i1, int j1, boolean flag)
    {
        if (l == i1 && m == j1 && b == flag)
        {
            return;
        }
        String s = String.valueOf("Encoder setResolution with new resolution: Input: ");
        gne.a(2, "vclib", (new StringBuilder(String.valueOf(s).length() + 23)).append(s).append(i1).append("x").append(j1).toString());
        synchronized (k)
        {
            l = i1;
            m = j1;
            b = flag;
            f.post(g);
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
        Object obj = k;
        j1 = ((flag1) ? 1 : 0);
        obj;
        JVM INSTR monitorenter ;
        j1 = k1;
        if (c)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        j1 = k1;
        flag = c;
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
        k1 = j1 | ((gha)iterator.next()).a(i1, l, m, l1, flag);
        j1 = k1;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        if (j1 != 0)
        {
            n.d();
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
            n.d();
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
            synchronized (k)
            {
                if (!a.isEmpty())
                {
                    break label0;
                }
            }
            return -1;
        }
        int i1 = ((gha)a.get(0)).h();
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
        f.postAtFrontOfQueue(q);
        o.quitSafely();
    }

    public boolean d()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            gha gha1 = (gha)iterator.next();
            if (gha1.e())
            {
                if (gha1.f())
                {
                    gne.a(6, "vclib", "An encoder instance has reported hardware failure. Resetting.");
                    g();
                } else
                {
                    gne.a(6, "vclib", "An encoder instance has reported a non-recoverable failure.");
                }
                return true;
            }
        }

        return false;
    }

    public List e()
    {
        gdv.f();
        Object obj = k;
        obj;
        JVM INSTR monitorenter ;
        NativeSimulcastEncoderOutputParams nativesimulcastencoderoutputparams;
        int i1;
        if (l >= m)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        obj;
        JVM INSTR monitorexit ;
        nativesimulcastencoderoutputparams = new NativeSimulcastEncoderOutputParams();
        if (!h.getNativeSimulcastEncoderIds(nativesimulcastencoderoutputparams) || nativesimulcastencoderoutputparams.nativeEncoderIds.length == 0)
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_66;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        ArrayList arraylist;
        EncoderConfigurationOutputParams encoderconfigurationoutputparams;
        boolean flag;
        int j1;
        if (nativesimulcastencoderoutputparams.nativeEncoderIds.length > 4)
        {
            i1 = nativesimulcastencoderoutputparams.nativeEncoderIds.length;
            gdv.a((new StringBuilder(57)).append("Got a request for too many simulcast streams: ").append(i1).toString());
            return null;
        }
        if (nativesimulcastencoderoutputparams.nativeEncoderIds.length == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        arraylist = new ArrayList(nativesimulcastencoderoutputparams.nativeEncoderIds.length);
        j1 = 0;
_L9:
        if (j1 >= nativesimulcastencoderoutputparams.nativeEncoderIds.length) goto _L2; else goto _L1
_L1:
        encoderconfigurationoutputparams = new EncoderConfigurationOutputParams();
        if (!h.getEncoderConfig(nativesimulcastencoderoutputparams.nativeEncoderIds[j1], encoderconfigurationoutputparams))
        {
            gne.a(5, "vclib", "Native encoder reset in the middle of a fetch operation.");
            return null;
        }
        if (!flag || j != 1) goto _L4; else goto _L3
_L3:
        gnk gnk1 = new gnk(encoderconfigurationoutputparams.width, encoderconfigurationoutputparams.height);
        if (encoderconfigurationoutputparams.targetBitRate > 300) goto _L6; else goto _L5
_L5:
        obj = gnk.a(gnk1, 0x12c00);
_L7:
        encoderconfigurationoutputparams.width = ((gnk) (obj)).a;
        encoderconfigurationoutputparams.height = ((gnk) (obj)).b;
_L4:
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
        continue; /* Loop/switch isn't completed */
_L6:
        obj = gnk1;
        if (encoderconfigurationoutputparams.targetBitRate <= 1500)
        {
            obj = gnk.a(gnk1, 0x4b000);
        }
        if (true) goto _L7; else goto _L2
_L2:
        Collections.sort(arraylist, new ghi(this));
        return arraylist;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void f()
    {
        ArrayList arraylist = new ArrayList();
        synchronized (k)
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

    public void g()
    {
        List list;
        d = true;
        f.removeCallbacks(p);
        f.removeCallbacks(g);
        f();
        list = e();
        if (list != null) goto _L2; else goto _L1
_L1:
        c = false;
        f.postDelayed(p, 200L);
_L4:
        return;
_L2:
        ArrayList arraylist = new ArrayList();
        int i1 = -1;
        int k1 = 0;
        do
        {
            if (k1 >= list.size())
            {
                break;
            }
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
                obj = new ghb(h, n, encoderconfigurationoutputparams.nativeEncoderId, encoderconfigurationoutputparams.codecType, encoderconfigurationoutputparams.width, encoderconfigurationoutputparams.height, i2, l1, f);
            } else
            {
                obj = new ghd(h, n, encoderconfigurationoutputparams.nativeEncoderId, encoderconfigurationoutputparams.codecType, encoderconfigurationoutputparams.width, encoderconfigurationoutputparams.height, i2, l1, encoderconfigurationoutputparams.temporalLayerCount);
            }
            if (!((gha) (obj)).b(encoderconfigurationoutputparams.targetBitRate))
            {
                boolean flag = ((gha) (obj)).f();
                arraylist.add(obj);
                a(arraylist);
                if (flag)
                {
                    f.postDelayed(p, 1000L);
                    return;
                }
                continue; /* Loop/switch isn't completed */
            }
            arraylist.add(obj);
            k1++;
            i1 = j1;
        } while (true);
        synchronized (k)
        {
            a.addAll(arraylist);
            c = true;
        }
        f.postDelayed(g, 200L);
        return;
        continue; /* Loop/switch isn't completed */
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private class NativeSimulcastEncoderOutputParams
    {

        public long nativeEncoderIds[];

        public NativeSimulcastEncoderOutputParams()
        {
        }
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

}
