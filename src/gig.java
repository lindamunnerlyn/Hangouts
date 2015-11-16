// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;

final class gig extends android.hardware.camera2.CameraCaptureSession.StateCallback
{

    final gie a;

    gig(gie gie1)
    {
        a = gie1;
        super();
    }

    public void onClosed(CameraCaptureSession cameracapturesession)
    {
        gbh.e();
        gkc.b("vclib", "Camera capture session closed");
        a.j();
    }

    public void onConfigureFailed(CameraCaptureSession cameracapturesession)
    {
        gbh.e();
        gkc.e("vclib", "Unable to start camera capture session");
        a.j();
        g.a(((gih) (a)).h);
    }

    public void onConfigured(CameraCaptureSession cameracapturesession)
    {
label0:
        {
            gbh.e();
            gkc.b("vclib", "Camera capture session configured");
            synchronized (a.n)
            {
                if (a.c != null)
                {
                    break label0;
                }
                gkc.d("vclib", "Session configured without an open device");
            }
            return;
        }
        a.d = cameracapturesession;
        cameracapturesession = a.c.createCaptureRequest(1);
        cameracapturesession.addTarget(a.e);
        a.d.setRepeatingRequest(cameracapturesession.build(), null, a.j);
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        cameracapturesession;
        obj;
        JVM INSTR monitorexit ;
        throw cameracapturesession;
        cameracapturesession;
        gkc.b("vclib", "Failed to start capture request", cameracapturesession);
        g.a(((gih) (a)).h);
          goto _L1
    }
}
