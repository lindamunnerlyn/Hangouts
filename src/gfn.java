// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;

public final class gfn
{

    private gfl a;
    private EGLSurface b;
    private Surface c;

    public gfn(gfl gfl1, Surface surface)
    {
        a = gfl1;
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
        gfl.a("eglCreateWindowSurface");
        if (b == null || b == EGL14.EGL_NO_SURFACE)
        {
            b = null;
            gne.a(6, "vclib", "Unable to create EGL surface for encoder input.");
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
            gfl.a("eglSwapBuffers");
            return false;
        } else
        {
            return true;
        }
    }
}
