// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.hangouts.video;

import android.content.Context;
import gdv;
import ggd;
import ghu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.libraries.hangouts.video:
//            Libjingle, DecoderManager, RemoteRenderer, Renderer

public final class RendererManager
{

    private static List b;
    private static final Object c = new Object();
    private final DecoderManager a;
    private long mNativeContext;

    public RendererManager(Context context)
    {
        nativeInit();
        a = new DecoderManager(context);
        synchronized (c)
        {
            b = new ArrayList();
        }
        return;
        exception;
        context;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void a(Renderer renderer)
    {
        synchronized (c)
        {
            if (b != null)
            {
                b.add(renderer);
            }
        }
        return;
        renderer;
        obj;
        JVM INSTR monitorexit ;
        throw renderer;
    }

    static void b(Renderer renderer)
    {
        synchronized (c)
        {
            if (b != null)
            {
                b.remove(renderer);
            }
        }
        return;
        renderer;
        obj;
        JVM INSTR monitorexit ;
        throw renderer;
    }

    public static void d()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (b != null)
        {
            for (Iterator iterator = b.iterator(); iterator.hasNext(); iterator.next()) { }
        }
        break MISSING_BLOCK_LABEL_45;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
    }

    private final native void nativeInit();

    private final native void nativeRelease();

    int a(int i)
    {
        gdv.a(i, 0, 3);
        return nativeInstantiateRenderer(i);
    }

    public RemoteRenderer a(ggd ggd, ghu ghu)
    {
        return new RemoteRenderer(this, a, ggd, ghu);
    }

    public void a()
    {
        nativeRelease();
        a.a();
        synchronized (c)
        {
            b = null;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public DecoderManager b()
    {
        return a;
    }

    public long c()
    {
        return mNativeContext;
    }

    final native int getIntParam(int i, String s);

    final native boolean initializeGLContext(int i);

    final native int nativeInstantiateRenderer(int i);

    final native void releaseRenderer(int i);

    final native void renderFrame(int i, Object obj, Object obj1);

    final native void setIntParam(int i, String s, int j);

    static 
    {
        Libjingle.a();
    }
}
