// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.Surface;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLSurface;

final class ggc
{

    gmw a;
    gio b;
    final gfu c;
    private final gip d = new gip();
    private boolean e;
    private EGLSurface f;

    ggc(gfu gfu1, gmw gmw1, gio gio1)
    {
        c = gfu1;
        super();
        f = EGL10.EGL_NO_SURFACE;
        a(gmw1, gio1);
    }

    void a()
    {
        b.m();
        d.a();
        if (e)
        {
            gne.a(2, "vclib", "Destroying surface");
            c.d.a.eglDestroySurface(c.d.b, f);
            f = EGL10.EGL_NO_SURFACE;
        }
    }

    void a(gmw gmw1, gio gio1)
    {
        if (a != null)
        {
            gdv.a(gmw1.a(), a.a());
        }
        if (b != null)
        {
            b.m();
        }
        gio1.l();
        a = gmw1;
        b = gio1;
        d.a(a, b);
    }

    int b()
    {
        if (!e)
        {
            int i;
            if (!a.a().isValid())
            {
                gne.a(6, "vclib", "Invalid native window provided");
                i = 12299;
            } else
            {
                Object obj;
                if (android.os.Build.VERSION.SDK_INT >= 17)
                {
                    obj = a.a();
                } else
                {
                    obj = new gfz(a.a());
                }
                f = c.d.a.eglCreateWindowSurface(c.d.b, c.d.d, obj, null);
                g.C("OutputRenderer.initialize");
                i = c.d.a.eglGetError();
                if (i != 12288)
                {
                    gne.a(6, "vclib", (new StringBuilder(47)).append("createWindowSurface failed because: ").append(i).toString());
                } else
                if (f == EGL10.EGL_NO_SURFACE)
                {
                    gne.a(6, "vclib", "createWindowSurface failed to create a surface!");
                    i = 12301;
                } else
                {
                    i = 12288;
                }
            }
            if (i != '\u3000')
            {
                return i;
            }
            e = true;
        }
        if (f == EGL10.EGL_NO_SURFACE)
        {
            throw new IllegalStateException("Attempted to render a released OutputRenderer");
        }
        if (!c.d.a.eglMakeCurrent(c.d.b, f, f, c.d.c))
        {
            return c.d.a.eglGetError();
        }
        if (d.e() && !c.d.a.eglSwapBuffers(c.d.b, f))
        {
            return c.d.a.eglGetError();
        } else
        {
            return 12288;
        }
    }
}
