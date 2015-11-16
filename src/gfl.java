// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import java.util.LinkedList;

public final class gfl
{

    private EGLDisplay a;
    private EGLContext b;
    private EGLConfig c;
    private LinkedList d;

    public gfl()
    {
        b = EGL14.EGL_NO_CONTEXT;
        d = new LinkedList();
    }

    public static void a(String s)
    {
        gdv.c();
        boolean flag = false;
        do
        {
            int i = EGL14.eglGetError();
            if (i == 12288)
            {
                break;
            }
            flag = true;
            String s1 = String.valueOf(Integer.toHexString(i));
            gne.a(6, "vclib", (new StringBuilder(String.valueOf(s).length() + 15 + String.valueOf(s1).length())).append(s).append(": EGL error: 0x").append(s1).toString());
        } while (true);
        if (flag)
        {
            throw new RuntimeException("EGL error encountered (see log).");
        } else
        {
            return;
        }
    }

    public EGLConfig a()
    {
        return c;
    }

    public boolean a(EGLSurface eglsurface)
    {
        if (b == EGL14.EGL_NO_CONTEXT)
        {
            gne.a(6, "vclib", "pushContext called with no created EGL context.");
            return false;
        }
        gfm gfm1 = new gfm();
        gfm1.a = EGL14.eglGetCurrentContext();
        gfm1.c = EGL14.eglGetCurrentSurface(12377);
        gfm1.b = EGL14.eglGetCurrentSurface(12378);
        if (!EGL14.eglMakeCurrent(a, eglsurface, eglsurface, b))
        {
            a("eglMakeCurrent");
            return false;
        } else
        {
            d.push(gfm1);
            return true;
        }
    }

    public EGLDisplay b()
    {
        return a;
    }

    public boolean c()
    {
        if (b != EGL14.EGL_NO_CONTEXT)
        {
            gdv.a("Asked to re-initialize an EncoderGLContext.");
            return false;
        }
        a = EGL14.eglGetCurrentDisplay();
        gdv.b(a, EGL14.EGL_NO_DISPLAY);
        Object aobj[] = new EGLConfig[1];
        int ai[] = new int[1];
        if (!EGL14.eglChooseConfig(a, new int[] {
    12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 
    12344
}, 0, ((EGLConfig []) (aobj)), 0, 1, ai, 0))
        {
            gne.a(6, "vclib", "Unable to find RGB8888+recordable ES2 EGL config.");
            return false;
        }
        c = aobj[0];
        aobj = new int[1];
        if (!EGL14.eglQueryContext(a, EGL14.eglGetCurrentContext(), 12440, ((int []) (aobj)), 0))
        {
            gne.a(6, "vclib", "Unable to get current EGL context client version.");
            return false;
        } else
        {
            int i = aobj[0];
            b = EGL14.eglCreateContext(a, c, EGL14.eglGetCurrentContext(), new int[] {
                12440, i, 12344
            }, 0);
            a("eglCreateContext");
            return true;
        }
    }

    public boolean d()
    {
        if (d.isEmpty())
        {
            gne.a(6, "vclib", "popContext called with no saved EGL context.");
            return false;
        } else
        {
            gfm gfm1 = (gfm)d.getLast();
            d.clear();
            EGL14.eglMakeCurrent(a, gfm1.c, gfm1.b, gfm1.a);
            return true;
        }
    }
}
