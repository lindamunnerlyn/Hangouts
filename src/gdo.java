// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.Surface;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLSurface;

final class gdo
{

    gju a;
    gfo b;
    final gdg c;
    private final gfp d = new gfp();
    private boolean e;
    private EGLSurface f;

    gdo(gdg gdg1, gju gju1, gfo gfo1)
    {
        c = gdg1;
        super();
        f = EGL10.EGL_NO_SURFACE;
        a(gju1, gfo1);
    }

    void a()
    {
        b.n();
        d.a();
        if (e)
        {
            gkc.a("vclib", "Destroying surface");
            c.d.a.eglDestroySurface(c.d.b, f);
            f = EGL10.EGL_NO_SURFACE;
        }
    }

    void a(gju gju1, gfo gfo1)
    {
        if (a != null)
        {
            gbh.a(gju1.a(), a.a());
        }
        if (b != null)
        {
            b.n();
        }
        gfo1.m();
        a = gju1;
        b = gfo1;
        d.a(a, b);
    }

    int b()
    {
        if (!e)
        {
            int i;
            if (!a.a().isValid())
            {
                gkc.e("vclib", "Invalid native window provided");
                i = 12299;
            } else
            {
                Object obj;
                if (android.os.Build.VERSION.SDK_INT >= 17)
                {
                    obj = a.a();
                } else
                {
                    obj = new gdl(a.a());
                }
                f = c.d.a.eglCreateWindowSurface(c.d.b, c.d.d, obj, null);
                g.z("OutputRenderer.initialize");
                i = c.d.a.eglGetError();
                if (i != 12288)
                {
                    gkc.e("vclib", (new StringBuilder(47)).append("createWindowSurface failed because: ").append(i).toString());
                } else
                if (f == EGL10.EGL_NO_SURFACE)
                {
                    gkc.e("vclib", "createWindowSurface failed to create a surface!");
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
