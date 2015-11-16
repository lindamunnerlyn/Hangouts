// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.OrientationEventListener;

final class glk extends OrientationEventListener
{

    final glj a;

    public glk(glj glj1)
    {
        a = glj1;
        super(glj1.i, 3);
    }

    public void onOrientationChanged(int i)
    {
        if (i == -1)
        {
            return;
        }
        Object obj = a.p;
        obj;
        JVM INSTR monitorenter ;
        if (!a.w) goto _L2; else goto _L1
_L1:
        int j = a.l();
_L3:
        if (j != a.v)
        {
            a.v = j;
            glj.a(a);
        }
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        int k = a.v;
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
