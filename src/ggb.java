// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.SurfaceTexture;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import javax.microedition.khronos.egl.EGL10;

final class ggb extends Thread
{

    final gfu a;

    ggb(gfu gfu1)
    {
        a = gfu1;
        super("GLThread.vclib");
    }

    public void run()
    {
        Object obj;
        javax.microedition.khronos.egl.EGLSurface eglsurface;
        a.d.a();
        obj = new SurfaceTexture(g.p());
        eglsurface = a.d.a.eglCreateWindowSurface(a.d.b, a.d.d, obj, null);
_L24:
        if (!a.d.a.eglMakeCurrent(a.d.b, eglsurface, eglsurface, a.d.c)) goto _L2; else goto _L1
_L1:
        Object obj1 = (Runnable)a.c.poll();
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        InterruptedException interruptedexception;
        ((Runnable) (obj1)).run();
          goto _L1
_L26:
        gne.a(4, "vclib", "GlThread interrupted, shutting down.");
          goto _L5
_L4:
        k = a.b.size();
        int i;
        int j;
        j = 0;
        i = 0;
_L28:
        if (j >= k) goto _L7; else goto _L6
_L6:
        interruptedexception = (gio)a.b.get(j);
        if (!interruptedexception.b()) goto _L9; else goto _L8
_L8:
        if (!interruptedexception.c()) goto _L11; else goto _L10
_L10:
        l = a.a.size();
        i = 0;
_L27:
        if (i >= l) goto _L11; else goto _L12
_L12:
        obj2 = (ggc)a.a.get(i);
        if (((ggc) (obj2)).b != interruptedexception) goto _L14; else goto _L13
_L13:
        i1 = ((ggc) (obj2)).b();
        i1;
        JVM INSTR lookupswitch 4: default 896
    //                   12288: 899
    //                   12291: 415
    //                   12299: 415
    //                   12301: 359;
           goto _L15 _L14 _L16 _L16 _L17
_L15:
        gne.a(5, "vclib", (new StringBuilder(49)).append("GlManager failed to render. GL error: ").append(i1).toString());
          goto _L14
_L17:
        gne.a(5, "vclib", "Failed to initialize OutputRenderer; no surface created");
        a.a(((ggc) (obj2)).a);
          goto _L14
_L16:
        gne.a(5, "vclib", "Failed to render frame: invalid native window");
        a.a(((ggc) (obj2)).a);
          goto _L14
_L7:
        k = a.b.size();
        j = 0;
_L19:
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        ((gio)a.b.get(j)).p();
        j++;
        if (true) goto _L19; else goto _L18
_L18:
        break; /* Loop/switch isn't completed */
_L2:
        g.C("eglMakeCurrent failed");
        i = 0;
        if (true) goto _L7; else goto _L20
_L20:
        this;
        JVM INSTR monitorenter ;
        if (i == 0) goto _L22; else goto _L21
_L21:
        wait(1L);
_L25:
        this;
        JVM INSTR monitorexit ;
        flag = Thread.interrupted();
        if (!flag) goto _L24; else goto _L23
_L22:
        gne.a(2, "vclib", "GlThread going to sleep.");
        wait();
        gne.a(2, "vclib", "GlThread waking up.");
          goto _L25
        interruptedexception;
        this;
        JVM INSTR monitorexit ;
        try
        {
            throw interruptedexception;
        }
        // Misplaced declaration of an exception variable
        catch (InterruptedException interruptedexception) { }
        finally
        {
            do
            {
                obj2 = (Runnable)a.c.poll();
                if (obj2 == null)
                {
                    break;
                }
                ((Runnable) (obj2)).run();
            } while (true);
        }
          goto _L26
_L23:
        do
        {
            interruptedexception = (Runnable)a.c.poll();
            if (interruptedexception == null)
            {
                break;
            }
            interruptedexception.run();
        } while (true);
        a.d.a.eglDestroySurface(a.d.b, eglsurface);
        ((SurfaceTexture) (obj)).release();
        a.b.clear();
        for (obj = a.a.iterator(); ((Iterator) (obj)).hasNext(); ((ggc)((Iterator) (obj)).next()).a()) { }
        a.a.clear();
        a.d.b();
        return;
_L5:
        Object obj2;
        int k;
        int l;
        int i1;
        boolean flag;
        do
        {
            interruptedexception = (Runnable)a.c.poll();
            if (interruptedexception == null)
            {
                break;
            }
            interruptedexception.run();
        } while (true);
        a.d.a.eglDestroySurface(a.d.b, eglsurface);
        ((SurfaceTexture) (obj)).release();
        a.b.clear();
        for (obj = a.a.iterator(); ((Iterator) (obj)).hasNext(); ((ggc)((Iterator) (obj)).next()).a()) { }
        a.a.clear();
        a.d.b();
        return;
_L14:
        i++;
          goto _L27
_L11:
        i = 1;
_L9:
        j++;
          goto _L28
    }
}
