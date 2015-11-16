// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.hangouts.video;

import android.content.Context;
import fwz;
import gcu;
import gda;
import gdb;
import gdp;
import gel;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.libraries.hangouts.video:
//            RendererManager

public final class EncoderManager
{

    private final Context a;
    private final List b = new ArrayList();

    public EncoderManager(Context context)
    {
        a = context;
        nativeInit();
    }

    public static int a(Context context)
    {
        int i;
        int j;
        j = 0;
        i = 0;
        if (fwz.a(context.getContentResolver(), "babel_hangout_hardware_encode", true)) goto _L2; else goto _L1
_L1:
        return i & gel.a(true);
_L2:
        if (fwz.a(context.getContentResolver(), "babel_hangout_vp8_hardware_encode", true))
        {
            j = 1;
        }
        i = j;
        if (fwz.a(context.getContentResolver(), "babel_hangout_h264_hardware_encode2", true))
        {
            i = j | 2;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    static native boolean getEncoderConfig(long l, Object obj);

    static native boolean getNativeSimulcastEncoderIds(Object obj);

    private final native void nativeInit();

    private final native void nativeRelease();

    public static native int sendEncodedFrame(long l, long l1, ByteBuffer bytebuffer, int i, int j, int k, 
            int i1, int j1, boolean flag);

    public gda a(RendererManager renderermanager, gdb gdb, gdp gdp)
    {
        boolean flag;
        if (a(a) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        renderermanager = new gcu(flag, renderermanager, gdb, gdp);
        b.add(new WeakReference(renderermanager));
        return renderermanager;
    }

    public void a()
    {
        b.clear();
        nativeRelease();
    }

    public void onOutputFormatChanged(int i, int j)
    {
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            WeakReference weakreference = (WeakReference)iterator.next();
            if (weakreference.get() != null)
            {
                ((gcu)weakreference.get()).a(i, j);
            }
        } while (true);
    }
}
