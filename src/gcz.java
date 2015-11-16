// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;

public final class gcz
{

    private gcx a;
    private EGLSurface b;
    private Surface c;

    public gcz(gcx gcx1, Surface surface)
    {
        a = gcx1;
        c = surface;
        b = null;
    }

    public boolean a()
    {
        if (b != null)
        {
            return false;
        }
        b = EGL14.eglCreateWindowSurface(a.b(), a.a(), c, new int[] {
            12344
        }, 0);
        gcx.a("eglCreateWindowSurface");
        if (b == null || b == EGL14.EGL_NO_SURFACE)
        {
            b = null;
            gkc.e("vclib", "Unable to create EGL surface for encoder input.");
            return false;
        } else
        {
            return true;
        }
    }

    public boolean a(long l)
    {
        while (b == null || !a.a(b)) 
        {
            return false;
        }
        EGLExt.eglPresentationTimeANDROID(a.b(), b, l);
        return true;
    }

    public void b()
    {
        if (b != null)
        {
            EGL14.eglDestroySurface(a.b(), b);
        }
        b = EGL14.EGL_NO_SURFACE;
        c.release();
        c = null;
    }

    public boolean c()
    {
        if (!EGL14.eglSwapBuffers(a.b(), b))
        {
            gcx.a("eglSwapBuffers");
            return false;
        } else
        {
            return true;
        }
    }
}
