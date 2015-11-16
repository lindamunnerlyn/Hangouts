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

public final class gie extends gih
{

    final CameraManager a;
    final gig b;
    CameraDevice c;
    CameraCaptureSession d;
    Surface e;
    gki f;
    private final gif v;
    private String w;
    private String x;
    private boolean y;

    public gie(Context context)
    {
        super(context);
        v = new gif(this);
        b = new gig(this);
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
            w = s;
            break MISSING_BLOCK_LABEL_115;
        }
        try
        {
            x = s;
            break MISSING_BLOCK_LABEL_115;
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

    public static boolean a(Context context)
    {
        context = (CameraManager)context.getSystemService("camera");
        String as[];
        int i;
        int j;
        int k;
        try
        {
            as = context.getCameraIdList();
            j = as.length;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            gkc.b("vclib", "Exception reading camera properties", context);
            return false;
        }
        i = 0;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        k = ((Integer)context.getCameraCharacteristics(as[i]).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
        if (k != 1)
        {
            return false;
        }
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_20;
_L1:
        return true;
    }

    public boolean a()
    {
        return w != null;
    }

    public boolean b()
    {
        return x != null;
    }

    protected gki c()
    {
        gki gki1;
        synchronized (n)
        {
            gki1 = f;
        }
        return gki1;
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
                if (!y)
                {
                    break label0;
                }
                gkc.b("vclib", "Camera was already opened, ignoring");
            }
            return;
        }
        if (this.s != 0)
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
        y = true;
        if (c != null) goto _L2; else goto _L1
_L1:
        gkc.b("vclib", "Opening camera");
        if (this.s != 1) goto _L4; else goto _L3
_L3:
        String s = w;
_L7:
        a.openCamera(s, v, j);
_L5:
        obj;
        JVM INSTR monitorexit ;
        return;
_L4:
        s = x;
        continue; /* Loop/switch isn't completed */
        CameraAccessException cameraaccessexception;
        cameraaccessexception;
        gkc.b("vclib", "Failed to open cameras", cameraaccessexception);
        g.a(super.h);
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
        Object obj = n;
        obj;
        JVM INSTR monitorenter ;
        if (d == null) goto _L2; else goto _L1
_L1:
        gkc.b("vclib", "Stopping capture session");
        d.stopRepeating();
        d.close();
_L3:
        d = null;
_L2:
        if (c != null)
        {
            gkc.b("vclib", "Closing camera");
            c.close();
            c = null;
        }
        if (e != null)
        {
            e.release();
            e = null;
        }
        y = false;
        return;
        Object obj1;
        obj1;
        gkc.b("vclib", "Failed to stop camera capture session", ((Throwable) (obj1)));
          goto _L3
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    gki f()
    {
        Object obj1 = n;
        obj1;
        JVM INSTR monitorenter ;
        if (this.s != 1) goto _L2; else goto _L1
_L1:
        Object obj = w;
_L5:
        StreamConfigurationMap streamconfigurationmap;
        Size asize[];
        String s;
        int i;
        int j;
        int k;
        try
        {
            streamconfigurationmap = (StreamConfigurationMap)a.getCameraCharacteristics(((String) (obj))).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            obj = new Size(0, 0);
            asize = streamconfigurationmap.getOutputSizes(android/graphics/SurfaceTexture);
            j = asize.length;
        }
        catch (CameraAccessException cameraaccessexception)
        {
            gkc.b("vclib", "Failed to read camera capture sizes", cameraaccessexception);
            return new gki(0, 0);
        }
        i = 0;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = asize[i];
        s = String.valueOf(obj1);
        gkc.b("vclib", (new StringBuilder(String.valueOf(s).length() + 23)).append("Camera candidate size: ").append(s).toString());
        if (((Size) (obj1)).getWidth() <= ((Size) (obj)).getWidth() || ((Size) (obj1)).getWidth() > 1920 || ((Size) (obj1)).getHeight() <= ((Size) (obj)).getHeight())
        {
            break MISSING_BLOCK_LABEL_169;
        }
        k = ((Size) (obj1)).getHeight();
        if (k <= 1080)
        {
            obj = obj1;
        }
        i++;
        if (true) goto _L4; else goto _L3
_L4:
        break MISSING_BLOCK_LABEL_66;
_L2:
        obj = x;
          goto _L5
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
_L3:
        obj1 = obj;
        if (((Size) (obj)).getWidth() == 0)
        {
            obj1 = streamconfigurationmap.getOutputSizes(android/graphics/SurfaceTexture)[0];
        }
        obj = new gki(((Size) (obj1)).getWidth(), ((Size) (obj1)).getHeight());
        return ((gki) (obj));
    }
}
