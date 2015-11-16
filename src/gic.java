// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;

public final class gic extends gih
{

    int a;
    int b;
    int c;
    int d;
    Camera e;
    gki f;
    private final gid v;

    public gic(Context context)
    {
        int i;
        i = 0;
        super(context);
        a = -1;
        b = -1;
        c = 0;
        d = 0;
        v = new gid(this);
        int j;
        context = new android.hardware.Camera.CameraInfo();
        j = Camera.getNumberOfCameras();
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        Camera.getCameraInfo(i, context);
        if (((android.hardware.Camera.CameraInfo) (context)).facing == 1)
        {
            a = i;
            c = ((android.hardware.Camera.CameraInfo) (context)).orientation;
            break MISSING_BLOCK_LABEL_111;
        }
        try
        {
            b = i;
            d = ((android.hardware.Camera.CameraInfo) (context)).orientation;
            break MISSING_BLOCK_LABEL_111;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            gkc.b("vclib", "Failed to detect cameras", context);
        }
        return;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean a()
    {
        return a != -1;
    }

    public boolean b()
    {
        return b != -1;
    }

    protected gki c()
    {
        gki gki;
        synchronized (n)
        {
            gki = f;
        }
        return gki;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void d()
    {
label0:
        {
            synchronized (n)
            {
                if (e == null)
                {
                    break label0;
                }
                gkc.b("vclib", "Camera was already opened, ignoring");
            }
            return;
        }
        if (s != 0)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        gkc.f("vclib", "openCamera was called with no camera selected.");
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
        j.removeCallbacks(v);
        j.post(v);
        return;
    }

    protected void e()
    {
        j.removeCallbacks(v);
        synchronized (n)
        {
            if (e != null)
            {
                e.stopPreview();
                e.release();
                e = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
