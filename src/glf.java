// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.hardware.Camera;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

final class glf
    implements Runnable
{

    final gle a;

    glf(gle gle1)
    {
        a = gle1;
        super();
    }

    public void run()
    {
        boolean flag;
label0:
        {
            flag = false;
            synchronized (a.p)
            {
                if (a.e == null && a.m != null && a.q != null)
                {
                    break label0;
                }
            }
            return;
        }
        if (a.u == 0)
        {
            flag = true;
        }
        gdv.b("Attempted to open camera without a camera selected", flag);
        if (a.u != 1) goto _L2; else goto _L1
_L1:
        int i = a.a;
_L10:
        a.e = Camera.open(i);
        android.hardware.Camera.Parameters parameters;
        Iterator iterator1;
        parameters = a.e.getParameters();
        List list = parameters.getSupportedPreviewFpsRange();
        obj = (int[])list.get(list.size() - 1);
        i = a.q.c;
        iterator1 = list.iterator();
_L15:
        if (!iterator1.hasNext()) goto _L4; else goto _L3
_L3:
        int ai[];
        ai = (int[])iterator1.next();
        gne.a(3, "vclib", "Camera FPS range: %d-%d", new Object[] {
            Integer.valueOf(ai[0]), Integer.valueOf(ai[1])
        });
        if (ai[1] > obj[1] || ai[1] < i * 1000) goto _L6; else goto _L5
_L5:
        Object obj1 = ai;
        if (ai[1] < obj[1]) goto _L8; else goto _L7
_L7:
        if (ai[0] > obj[0]) goto _L6; else goto _L9
_L9:
        obj1 = ai;
          goto _L8
_L2:
        i = a.b;
          goto _L10
        obj;
        gne.a("vclib", "Error opening camera", ((Throwable) (obj)));
        g.a(((glj) (a)).j);
        obj2;
        JVM INSTR monitorexit ;
        return;
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
_L4:
        gne.a("vclib", "Using camera FPS range: %d-%d", new Object[] {
            Integer.valueOf(obj[0]), Integer.valueOf(obj[1])
        });
        parameters.setPreviewFpsRange(obj[0], obj[1]);
        obj1 = parameters.getSupportedPreviewSizes();
        obj = null;
        i = 0x7fffffff;
        Iterator iterator = ((List) (obj1)).iterator();
_L16:
        if (!iterator.hasNext()) goto _L12; else goto _L11
_L11:
        int k;
        int i1;
        obj1 = (android.hardware.Camera.Size)iterator.next();
        gne.a(3, "vclib", "Camera candidate size: %d x %d", new Object[] {
            Integer.valueOf(((android.hardware.Camera.Size) (obj1)).width), Integer.valueOf(((android.hardware.Camera.Size) (obj1)).height)
        });
        k = ((android.hardware.Camera.Size) (obj1)).width - a.q.d;
        i1 = ((android.hardware.Camera.Size) (obj1)).height - a.q.e;
        int j;
        j = k;
        if (k < 0)
        {
            j = k * -4;
        }
        break MISSING_BLOCK_LABEL_633;
_L12:
        parameters.setPreviewSize(((android.hardware.Camera.Size) (obj)).width, ((android.hardware.Camera.Size) (obj)).height);
        a.e.setParameters(parameters);
        a.f = new gnk(parameters.getPreviewSize().width, parameters.getPreviewSize().height);
        gne.a("vclib", "Camera preview size: %s ", new Object[] {
            a.f
        });
        a.e.setPreviewTexture(a.t);
_L13:
        a.e.startPreview();
        if (a.u != 1)
        {
            break MISSING_BLOCK_LABEL_608;
        }
        i = a.c;
_L14:
        a.a(i, i);
        obj2;
        JVM INSTR monitorexit ;
        return;
        obj;
        gne.b("vclib", "Failure setting surface texture", ((Throwable) (obj)));
          goto _L13
        i = a.d;
          goto _L14
_L6:
        obj1 = obj;
_L8:
        obj = obj1;
          goto _L15
        int l = i1;
        if (i1 < 0)
        {
            l = i1 * -4;
        }
        j = l + j;
        if (j < i)
        {
            obj = obj1;
            i = j;
        }
          goto _L16
    }
}
