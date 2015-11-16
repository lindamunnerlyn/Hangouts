// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

public abstract class glj
    implements gmx
{

    private final gln a = new gln(this);
    private final glm b = new glm(this);
    private final glk c = new glk(this);
    private int d;
    private int e;
    private boolean f;
    public final Context i;
    final gll j = new gll(this);
    public HandlerThread k;
    public Handler l;
    public gmy m;
    public a n;
    public boolean o;
    public final Object p = new Object();
    public gna q;
    public gnk r;
    public gnk s;
    public SurfaceTexture t;
    public int u;
    int v;
    boolean w;

    protected glj(Context context)
    {
        s = new gnk(16, 10);
        u = 0;
        d = 0;
        e = 0;
        v = 0;
        i = context;
        v = l();
    }

    static void a(glj glj1)
    {
label0:
        {
            g.v();
            synchronized (glj1.p)
            {
                if (glj1.f && glj1.t != null)
                {
                    break label0;
                }
            }
            return;
        }
        int i1;
        int j1;
        int k1;
        boolean flag;
        if (glj1.u == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_417;
        }
        i1 = (360 - (glj1.d + glj1.v) % 360) % 360;
_L1:
        j1 = glj1.q.a;
        k1 = glj1.q.b;
        gne.a(3, "vclib", (new StringBuilder(36)).append("Encoder caps=").append(j1).append("x").append(k1).toString());
        obj;
        JVM INSTR monitorexit ;
        obj = glj1.c();
        Object obj1;
        if (glj1.f())
        {
            obj = new gnk(((gnk) (obj)).b, ((gnk) (obj)).a);
            obj1 = gnk.a(new gnk(glj1.s.b, glj1.s.a), new gnk(glj1.q.b, glj1.q.a));
        } else
        {
            obj1 = gnk.a(glj1.s, new gnk(glj1.q.a, glj1.q.b));
        }
        obj1 = gnk.b(((gnk) (obj1)), ((gnk) (obj)));
        if (!((gnk) (obj1)).equals(glj1.r))
        {
            glj1.r = ((gnk) (obj1));
        }
        obj1 = String.valueOf(obj);
        gne.a(3, "vclib", (new StringBuilder(String.valueOf(obj1).length() + 31)).append("CaptureDimensions preview size=").append(((String) (obj1))).toString());
        obj1 = String.valueOf(glj1.r);
        gne.a(3, "vclib", (new StringBuilder(String.valueOf(obj1).length() + 31)).append("CaptureDimensions cropped size=").append(((String) (obj1))).toString());
        glj1.m.a(((gnk) (obj)).a, ((gnk) (obj)).b, glj1.r.a, glj1.r.b, false);
        gne.a(3, "vclib", (new StringBuilder(38)).append("CaptureDimensions rotation=").append(i1).toString());
        glj1.m.b(i1);
        gne.a(3, "vclib", (new StringBuilder(32)).append("CaptureDimensions mirrored=").append(flag).toString());
        glj1.m.c(flag);
        return;
        i1 = ((glj1.d - glj1.v) + 360) % 360;
          goto _L1
        glj1;
        obj;
        JVM INSTR monitorexit ;
        throw glj1;
    }

    private boolean f()
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
        Object obj = p;
        obj;
        JVM INSTR monitorenter ;
        if (e != 90 && e != 270)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        Exception exception;
        if (v == 0 || v == 180)
        {
            flag = true;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        if (v == 90) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (v != 270) goto _L3; else goto _L2
_L3:
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        flag = true;
        if (true) goto _L3; else goto _L4
_L4:
    }

    public void a(int i1)
    {
label0:
        {
            g.v();
            synchronized (p)
            {
                if (i1 != u)
                {
                    break label0;
                }
            }
            return;
        }
        if (i1 != 1)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        if (!a())
        {
            throw new IllegalStateException("Tried to use front camera, but no front camera detected");
        }
        break MISSING_BLOCK_LABEL_48;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (i1 != 2)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        if (!b())
        {
            throw new IllegalStateException("Tried to use rear camera, but no rear camera detected");
        }
        u = i1;
        k();
        if (u != 0)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        obj;
        JVM INSTR monitorexit ;
        if (o)
        {
            d();
        }
        return;
    }

    protected final void a(int i1, int j1)
    {
        synchronized (p)
        {
            f = true;
            e = i1;
            d = j1;
        }
        g.a(b);
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(gmm gmm, gmy gmy1)
    {
        g.v();
        k = new HandlerThread("CameraOpenThread");
        k.start();
        l = new Handler(k.getLooper());
        c.enable();
        m = gmy1;
        gmy1.a(a);
        synchronized (p)
        {
            q = gmy1.n();
        }
        a(o);
        return;
        gmy1;
        gmm;
        JVM INSTR monitorexit ;
        throw gmy1;
    }

    public void a(boolean flag)
    {
        boolean flag1;
        flag1 = true;
        g.v();
        o = flag;
        Object obj = p;
        obj;
        JVM INSTR monitorenter ;
        if (u != 0) goto _L2; else goto _L1
_L1:
        if (!a()) goto _L4; else goto _L3
_L3:
        int i1 = 1;
_L7:
        u = i1;
_L2:
        if (u != 0) goto _L6; else goto _L5
_L5:
        gne.a(6, "vclib", "No camera supported on this device, can not enable");
        obj;
        JVM INSTR monitorexit ;
        return;
_L4:
        Exception exception;
        if (b())
        {
            i1 = 2;
        } else
        {
            i1 = 0;
        }
        if (true) goto _L7; else goto _L6
_L6:
        if (m != null && t != null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
        gmy gmy1 = m;
        if (flag)
        {
            flag1 = false;
        }
        gmy1.b(flag1);
        if (flag)
        {
            d();
            return;
        } else
        {
            k();
            return;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    protected abstract gnk c();

    protected abstract void d();

    protected abstract void e();

    public void g()
    {
        g.v();
        synchronized (p)
        {
            m = null;
        }
        c.disable();
        k();
        if (k != null)
        {
            k.quit();
            k = null;
            l = null;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean h()
    {
        return o;
    }

    public int i()
    {
        int i1;
        synchronized (p)
        {
            i1 = u;
        }
        return i1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void j()
    {
        w = true;
    }

    protected final void k()
    {
        synchronized (p)
        {
            f = false;
        }
        e();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    final int l()
    {
        switch (((WindowManager)i.getSystemService("window")).getDefaultDisplay().getRotation())
        {
        default:
            gne.a("vclib", "Bad rotation");
            return 0;

        case 0: // '\0'
            return 0;

        case 1: // '\001'
            return 90;

        case 2: // '\002'
            return 180;

        case 3: // '\003'
            return 270;
        }
    }
}
