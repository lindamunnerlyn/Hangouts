// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.OrientationEventListener;

final class gii extends OrientationEventListener
{

    final gih a;

    public gii(gih gih1)
    {
        a = gih1;
        super(gih1.g, 3);
    }

    public void onOrientationChanged(int i)
    {
        if (i == -1)
        {
            return;
        }
        Object obj = a.n;
        obj;
        JVM INSTR monitorenter ;
        if (!a.u) goto _L2; else goto _L1
_L1:
        int j = a.k();
_L3:
        if (j != a.t)
        {
            a.t = j;
            gih.a(a);
        }
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        int k = a.t;
        if (i >= 338 || i <= 22)
        {
            j = 0;
        } else
        if (i >= 68 && i <= 112)
        {
            j = 270;
        } else
        if (i >= 158 && i <= 202)
        {
            j = 180;
        } else
        {
            j = k;
            if (i >= 248)
            {
                j = k;
                if (i <= 292)
                {
                    j = 90;
                }
            }
        }
          goto _L3
    }
}
