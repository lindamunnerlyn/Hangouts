// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

public abstract class gih
    implements gjv
{

    private final gil a = new gil(this);
    private final gik b = new gik(this);
    private final gii c = new gii(this);
    private int d;
    private int e;
    private boolean f;
    public final Context g;
    final gij h = new gij(this);
    public HandlerThread i;
    public Handler j;
    public gjw k;
    public a l;
    public boolean m;
    public final Object n = new Object();
    public gjy o;
    public gki p;
    public gki q;
    public SurfaceTexture r;
    public int s;
    int t;
    boolean u;

    protected gih(Context context)
    {
        q = new gki(16, 10);
        s = 0;
        d = 0;
        e = 0;
        t = 0;
        g = context;
        t = k();
    }

    static void a(gih gih1)
    {
label0:
        {
            g.w();
            synchronized (gih1.n)
            {
                if (gih1.f && gih1.r != null)
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
        if (gih1.s == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_412;
        }
        i1 = (360 - (gih1.d + gih1.t) % 360) % 360;
_L1:
        j1 = gih1.o.a;
        k1 = gih1.o.b;
        gkc.b("vclib", (new StringBuilder(36)).append("Encoder caps=").append(j1).append("x").append(k1).toString());
        obj;
        JVM INSTR monitorexit ;
        obj = gih1.c();
        Object obj1;
        if (gih1.f())
        {
            obj = new gki(((gki) (obj)).b, ((gki) (obj)).a);
            obj1 = gki.a(new gki(gih1.q.b, gih1.q.a), new gki(gih1.o.b, gih1.o.a));
        } else
        {
            obj1 = gki.a(gih1.q, new gki(gih1.o.a, gih1.o.b));
        }
        obj1 = gki.b(((gki) (obj1)), ((gki) (obj)));
        if (!((gki) (obj1)).equals(gih1.p))
        {
            gih1.p = ((gki) (obj1));
        }
        obj1 = String.valueOf(obj);
        gkc.b("vclib", (new StringBuilder(String.valueOf(obj1).length() + 31)).append("CaptureDimensions preview size=").append(((String) (obj1))).toString());
        obj1 = String.valueOf(gih1.p);
        gkc.b("vclib", (new StringBuilder(String.valueOf(obj1).length() + 31)).append("CaptureDimensions cropped size=").append(((String) (obj1))).toString());
        gih1.k.a(((gki) (obj)).a, ((gki) (obj)).b, gih1.p.a, gih1.p.b, false);
        gkc.b("vclib", (new StringBuilder(38)).append("CaptureDimensions rotation=").append(i1).toString());
        gih1.k.b(i1);
        gkc.b("vclib", (new StringBuilder(32)).append("CaptureDimensions mirrored=").append(flag).toString());
        gih1.k.b(flag);
        return;
        i1 = ((gih1.d - gih1.t) + 360) % 360;
          goto _L1
        gih1;
        obj;
        JVM INSTR monitorexit ;
        throw gih1;
    }

    private boolean f()
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
        Object obj = n;
        obj;
        JVM INSTR monitorenter ;
        if (e != 90 && e != 270)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        Exception exception;
        if (t == 0 || t == 180)
        {
            flag = true;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        if (t == 90) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (t != 270) goto _L3; else goto _L2
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
            g.w();
            synchronized (n)
            {
                if (i1 != s)
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
        s = i1;
        j();
        if (s != 0)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        obj;
        JVM INSTR monitorexit ;
        if (m)
        {
            d();
        }
        return;
    }

    protected final void a(int i1, int j1)
    {
        synchronized (n)
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

    public void a(gjk gjk, gjw gjw1)
    {
        g.w();
        i = new HandlerThread("CameraOpenThread");
        i.start();
        j = new Handler(i.getLooper());
        c.enable();
        k = gjw1;
        gjw1.a(a);
        synchronized (n)
        {
            o = gjw1.b();
        }
        a(m);
        return;
        gjw1;
        gjk;
        JVM INSTR monitorexit ;
        throw gjw1;
    }

    public void a(boolean flag)
    {
        boolean flag1;
        flag1 = true;
        g.w();
        m = flag;
        Object obj = n;
        obj;
        JVM INSTR monitorenter ;
        if (s != 0) goto _L2; else goto _L1
_L1:
        if (!a()) goto _L4; else goto _L3
_L3:
        int i1 = 1;
_L7:
        s = i1;
_L2:
        if (s != 0) goto _L6; else goto _L5
_L5:
        gkc.e("vclib", "No camera supported on this device, can not enable");
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
        if (k != null && r != null)
        {
            break MISSING_BLOCK_LABEL_93;
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
        gjw gjw1 = k;
        if (flag)
        {
            flag1 = false;
        }
        gjw1.a(flag1);
        if (flag)
        {
            d();
            return;
        } else
        {
            j();
            return;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    protected abstract gki c();

    protected abstract void d();

    protected abstract void e();

    public void g()
    {
        g.w();
        synchronized (n)
        {
            k = null;
        }
        c.disable();
        j();
        if (i != null)
        {
            i.quit();
            i = null;
            j = null;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean h()
    {
        return m;
    }

    public int i()
    {
        int i1;
        synchronized (n)
        {
            i1 = s;
        }
        return i1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void j()
    {
        synchronized (n)
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

    final int k()
    {
        switch (((WindowManager)g.getSystemService("window")).getDefaultDisplay().getRotation())
        {
        default:
            gkc.f("vclib", "Bad rotation");
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
