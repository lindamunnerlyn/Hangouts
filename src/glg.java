// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import android.view.Surface;

public final class glg extends glj
{

    final CameraManager a;
    final gli b;
    String c;
    String d;
    CameraDevice e;
    CameraCaptureSession f;
    Surface g;
    gnk h;
    private final glh x;
    private boolean y;

    public glg(Context context)
    {
        super(context);
        x = new glh(this);
        b = new gli(this);
        a = (CameraManager)context.getSystemService("camera");
        int j;
        context = a.getCameraIdList();
        j = context.length;
        int i = 0;
_L2:
        String s;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        s = context[i];
        if (((Integer)a.getCameraCharacteristics(s).get(CameraCharacteristics.LENS_FACING)).intValue() == 0)
        {
            c = s;
            break MISSING_BLOCK_LABEL_115;
        }
        try
        {
            d = s;
            break MISSING_BLOCK_LABEL_115;
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
        return c != null;
    }

    public boolean b()
    {
        return d != null;
    }

    protected gnk c()
    {
        gnk gnk1;
        synchronized (p)
        {
            gnk1 = h;
        }
        return gnk1;
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
                if (!y)
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
        y = true;
        if (e != null) goto _L2; else goto _L1
_L1:
        gne.a(3, "vclib", "Opening camera");
        if (u != 1) goto _L4; else goto _L3
_L3:
        String s = c;
_L7:
        a.openCamera(s, x, l);
_L5:
        obj;
        JVM INSTR monitorexit ;
        return;
_L4:
        s = d;
        continue; /* Loop/switch isn't completed */
        CameraAccessException cameraaccessexception;
        cameraaccessexception;
        gne.a("vclib", "Failed to open cameras", cameraaccessexception);
        g.a(super.j);
          goto _L5
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected void e()
    {
        Object obj = p;
        obj;
        JVM INSTR monitorenter ;
        if (f == null) goto _L2; else goto _L1
_L1:
        gne.a(3, "vclib", "Stopping capture session");
        f.stopRepeating();
        f.close();
_L3:
        f = null;
_L2:
        if (e != null)
        {
            gne.a(3, "vclib", "Closing camera");
            e.close();
            e = null;
        }
        if (g != null)
        {
            g.release();
            g = null;
        }
        y = false;
        return;
        Object obj1;
        obj1;
        gne.a("vclib", "Failed to stop camera capture session", ((Throwable) (obj1)));
          goto _L3
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    gnk f()
    {
        Object obj1 = p;
        obj1;
        JVM INSTR monitorenter ;
        if (u != 1) goto _L2; else goto _L1
_L1:
        Object obj = c;
_L5:
        Size asize[];
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        try
        {
            obj1 = (StreamConfigurationMap)a.getCameraCharacteristics(((String) (obj))).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            obj = new Size(0, 0);
        }
        catch (CameraAccessException cameraaccessexception)
        {
            gne.a("vclib", "Failed to read camera capture sizes", cameraaccessexception);
            return new gnk(0, 0);
        }
        i = 0x7fffffff;
        asize = ((StreamConfigurationMap) (obj1)).getOutputSizes(android/graphics/SurfaceTexture);
        j1 = asize.length;
        j = 0;
_L4:
        if (j >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = asize[j];
        gne.a(3, "vclib", "Camera candidate size: %s ", new Object[] {
            obj1
        });
        l = ((Size) (obj1)).getWidth() - q.d;
        k = ((Size) (obj1)).getHeight();
        i1 = q.e;
        i1 = k - i1;
        k = l;
        if (l < 0)
        {
            k = l * -4;
        }
        l = i1;
        if (i1 < 0)
        {
            l = i1 * -4;
        }
        k = l + k;
        if (k < i)
        {
            obj = obj1;
            i = k;
        }
        j++;
        if (true) goto _L4; else goto _L3
_L2:
        obj = d;
          goto _L5
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
_L3:
        gne.a("vclib", "Camera preview size: %s", new Object[] {
            obj
        });
        obj = new gnk(((Size) (obj)).getWidth(), ((Size) (obj)).getHeight());
        return ((gnk) (obj));
    }
}
