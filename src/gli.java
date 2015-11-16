// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.util.Range;

final class gli extends android.hardware.camera2.CameraCaptureSession.StateCallback
{

    final glg a;

    gli(glg glg1)
    {
        a = glg1;
        super();
    }

    public void onClosed(CameraCaptureSession cameracapturesession)
    {
        gdv.d();
        gne.a(3, "vclib", "Camera capture session closed");
        a.k();
    }

    public void onConfigureFailed(CameraCaptureSession cameracapturesession)
    {
        gdv.d();
        gne.a(6, "vclib", "Unable to start camera capture session");
        a.k();
        g.a(((glj) (a)).j);
    }

    public void onConfigured(CameraCaptureSession cameracapturesession)
    {
label0:
        {
            gdv.d();
            gne.a(3, "vclib", "Camera capture session configured");
            synchronized (a.p)
            {
                if (a.e != null)
                {
                    break label0;
                }
                gne.a(5, "vclib", "Session configured without an open device");
            }
            return;
        }
        a.f = cameracapturesession;
        android.hardware.camera2.CaptureRequest.Builder builder = a.e.createCaptureRequest(3);
        if (a.u != 1) goto _L2; else goto _L1
_L1:
        cameracapturesession = a.c;
_L7:
        Range arange[];
        int i;
        arange = (Range[])a.a.getCameraCharacteristics(cameracapturesession).get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        cameracapturesession = arange[arange.length - 1];
        i = a.q.c;
        if (((Integer)cameracapturesession.getUpper()).intValue() <= 1000) goto _L4; else goto _L3
_L3:
        gne.a(3, "vclib", "Appears to be a LEGACY camera; multiplying fps by 1000");
        i *= 1000;
_L4:
        int k = arange.length;
        int j = 0;
_L9:
        if (j >= k) goto _L6; else goto _L5
_L5:
        Range range = arange[j];
        gne.a(3, "vclib", "Camera FPS range: %s", new Object[] {
            range
        });
        if (((Integer)range.getUpper()).intValue() <= ((Integer)cameracapturesession.getUpper()).intValue() && ((Integer)range.getUpper()).intValue() >= i && (((Integer)range.getUpper()).intValue() < ((Integer)cameracapturesession.getUpper()).intValue() || ((Integer)range.getLower()).intValue() <= ((Integer)cameracapturesession.getLower()).intValue()))
        {
            cameracapturesession = range;
        }
        break MISSING_BLOCK_LABEL_414;
_L2:
        cameracapturesession = a.d;
          goto _L7
_L6:
        gne.a("vclib", "Using camera FPS range: %s", new Object[] {
            cameracapturesession
        });
        builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, cameracapturesession);
        builder.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
        builder.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.valueOf(false));
        builder.addTarget(a.g);
        a.f.setRepeatingRequest(builder.build(), null, a.l);
_L8:
        obj;
        JVM INSTR monitorexit ;
        return;
        cameracapturesession;
        obj;
        JVM INSTR monitorexit ;
        throw cameracapturesession;
        cameracapturesession;
        gne.a("vclib", "Failed to start capture request", cameracapturesession);
        g.a(((glj) (a)).j);
          goto _L8
        j++;
          goto _L9
    }
}
