// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

final class gga
{

    EGL10 a;
    EGLDisplay b;
    EGLContext c;
    EGLConfig d;
    final gfu e;
    private final int f[] = {
        12324, 8, 12323, 8, 12322, 8, 12352, 4, 12344
    };

    gga(gfu gfu)
    {
        e = gfu;
        super();
    }

    private static int a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig, int i)
    {
        int j = 0;
        int ai[] = new int[1];
        if (egl10.eglGetConfigAttrib(egldisplay, eglconfig, i, ai))
        {
            j = ai[0];
        }
        return j;
    }

    private EGLConfig a(EGLConfig aeglconfig[])
    {
        int j = aeglconfig.length;
        for (int i = 0; i < j; i++)
        {
            EGLConfig eglconfig = aeglconfig[i];
            int k = a(a, b, eglconfig, 12324);
            int l = a(a, b, eglconfig, 12323);
            int i1 = a(a, b, eglconfig, 12322);
            if (k == 8 && l == 8 && i1 == 8)
            {
                return eglconfig;
            }
        }

        throw new IllegalArgumentException("Unable to identify a supported opengl configuration");
    }

    void a()
    {
        a = (EGL10)EGLContext.getEGL();
        b = a.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        int ai[] = new int[2];
        if (!a.eglInitialize(b, ai))
        {
            throw new RuntimeException("eglInitialize failed");
        }
        Object obj = a;
        EGLDisplay egldisplay = b;
        int ai1[] = new int[1];
        if (!((EGL10) (obj)).eglChooseConfig(egldisplay, f, null, 0, ai1))
        {
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
        int i = ai1[0];
        if (i <= 0)
        {
            throw new IllegalArgumentException("No configs match configSpec");
        }
        EGLConfig aeglconfig[] = new EGLConfig[i];
        if (!((EGL10) (obj)).eglChooseConfig(egldisplay, f, aeglconfig, i, ai1))
        {
            throw new IllegalArgumentException("eglChooseConfig#2 failed");
        }
        obj = a(aeglconfig);
        if (obj == null)
        {
            throw new IllegalArgumentException("No config chosen");
        }
        d = ((EGLConfig) (obj));
        c = a.eglCreateContext(b, d, EGL10.EGL_NO_CONTEXT, new int[] {
            12440, 2, 12344
        });
        if (c == null || c == EGL10.EGL_NO_CONTEXT)
        {
            throw new RuntimeException("eglCreateContext failed");
        } else
        {
            return;
        }
    }

    void b()
    {
        if (!a.eglDestroyContext(b, c))
        {
            gne.a(6, "vclib", "Unable to destroy eglContext");
        }
        a.eglTerminate(b);
        a = null;
        c = null;
        b = null;
        d = null;
    }
}
