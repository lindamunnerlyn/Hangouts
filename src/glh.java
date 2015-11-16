// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;

final class glh extends android.hardware.camera2.CameraDevice.StateCallback
{

    final glg a;

    glh(glg glg1)
    {
        a = glg1;
        super();
    }

    public void onDisconnected(CameraDevice cameradevice)
    {
        gdv.d();
        gne.a(3, "vclib", "Camera disconnected");
        a.k();
    }

    public void onError(CameraDevice cameradevice, int i)
    {
        gdv.d();
        gne.a(5, "vclib", (new StringBuilder(26)).append("Camera error - ").append(i).toString());
        a.k();
        g.a(((glj) (a)).j);
    }

    public void onOpened(CameraDevice cameradevice)
    {
        gdv.d();
        gne.a(3, "vclib", "Camera opened");
        Object obj = a.p;
        obj;
        JVM INSTR monitorenter ;
        a.e = cameradevice;
        int i = ((Integer)a.a.getCameraCharacteristics(cameradevice.getId()).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        a.a(i, 0);
        a.h = a.f();
        a.t.setDefaultBufferSize(a.h.a, a.h.b);
        a.g = new Surface(a.t);
        cameradevice = new ArrayList();
        cameradevice.add(a.g);
        a.e.createCaptureSession(cameradevice, a.b, a.l);
_L1:
        return;
        cameradevice;
        gne.a("vclib", "Failed to create camera capture session", cameradevice);
        g.a(((glj) (a)).j);
          goto _L1
        cameradevice;
        obj;
        JVM INSTR monitorexit ;
        throw cameradevice;
    }
}
