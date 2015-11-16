// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;

public final class gle extends glj
{

    int a;
    int b;
    int c;
    int d;
    Camera e;
    gnk f;
    private final glf g;

    public gle(Context context)
    {
        int i;
        i = 0;
        super(context);
        a = -1;
        b = -1;
        c = 0;
        d = 0;
        g = new glf(this);
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
            gne.a("vclib", "Failed to detect cameras", context);
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

    protected gnk c()
    {
        gnk gnk;
        synchronized (p)
        {
            gnk = f;
        }
        return gnk;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void d()
    {
label0:
        {
            synchronized (p)
            {
                if (e == null)
                {
                    break label0;
                }
                gne.a(3, "vclib", "Camera was already opened, ignoring");
            }
            return;
        }
        if (u != 0)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        gne.a("vclib", "openCamera was called with no camera selected.");
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
        l.removeCallbacks(g);
        l.post(g);
        return;
    }

    protected void e()
    {
        l.removeCallbacks(g);
        synchronized (p)
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
