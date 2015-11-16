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

final class gif extends android.hardware.camera2.CameraDevice.StateCallback
{

    final gie a;

    gif(gie gie1)
    {
        a = gie1;
        super();
    }

    public void onDisconnected(CameraDevice cameradevice)
    {
        gbh.e();
        gkc.b("vclib", "Camera disconnected");
        a.j();
    }

    public void onError(CameraDevice cameradevice, int i)
    {
        gbh.e();
        gkc.d("vclib", (new StringBuilder(26)).append("Camera error - ").append(i).toString());
        a.j();
        g.a(((gih) (a)).h);
    }

    public void onOpened(CameraDevice cameradevice)
    {
        gbh.e();
        gkc.b("vclib", "Camera opened");
        Object obj = a.n;
        obj;
        JVM INSTR monitorenter ;
        a.c = cameradevice;
        int i = ((Integer)a.a.getCameraCharacteristics(cameradevice.getId()).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        a.a(i, 0);
        a.f = a.f();
        a.r.setDefaultBufferSize(a.f.a, a.f.b);
        a.e = new Surface(a.r);
        cameradevice = new ArrayList();
        cameradevice.add(a.e);
        a.c.createCaptureSession(cameradevice, a.b, a.j);
_L1:
        return;
        cameradevice;
        gkc.b("vclib", "Failed to create camera capture session", cameradevice);
        g.a(((gih) (a)).h);
          goto _L1
        cameradevice;
        obj;
        JVM INSTR monitorexit ;
        throw cameradevice;
    }
}
