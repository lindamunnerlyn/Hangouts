// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.hardware.Camera;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

final class gid
    implements Runnable
{

    final gic a;

    gid(gic gic1)
    {
        a = gic1;
        super();
    }

    public void run()
    {
        boolean flag;
label0:
        {
            flag = false;
            synchronized (a.n)
            {
                if (a.e == null && a.k != null && a.o != null)
                {
                    break label0;
                }
            }
            return;
        }
        if (a.s == 0)
        {
            flag = true;
        }
        gbh.b("Attempted to open camera without a camera selected", flag);
        if (a.s != 1) goto _L2; else goto _L1
_L1:
        int i = a.a;
_L9:
        a.e = Camera.open(i);
        Object obj1;
        android.hardware.Camera.Parameters parameters;
        Object obj3;
        parameters = a.e.getParameters();
        obj3 = parameters.getSupportedPreviewFpsRange();
        obj1 = ((List) (obj3)).iterator();
_L6:
        if (!((Iterator) (obj1)).hasNext()) goto _L4; else goto _L3
_L3:
        obj = (int[])((Iterator) (obj1)).next();
        if (obj[1] < a.o.c * 1000) goto _L6; else goto _L5
_L5:
        int ai[];
        ai = ((int []) (obj));
        if (obj[0] >= 0)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        ai = (int[])((List) (obj3)).get(((List) (obj3)).size() - 1);
        parameters.setPreviewFpsRange(ai[0], ai[1]);
        ai = parameters.getSupportedPreviewSizes();
        obj = null;
        i = 0x7fffffff;
        obj3 = ai.iterator();
_L12:
        if (!((Iterator) (obj3)).hasNext()) goto _L8; else goto _L7
_L7:
        int k;
        int i1;
        ai = (android.hardware.Camera.Size)((Iterator) (obj3)).next();
        k = ((android.hardware.Camera.Size) (ai)).width - a.o.d;
        i1 = ((android.hardware.Camera.Size) (ai)).height - a.o.e;
        int j;
        j = k;
        if (k < 0)
        {
            j = k * -4;
        }
        break MISSING_BLOCK_LABEL_539;
_L2:
        i = a.b;
          goto _L9
        obj;
        gkc.b("vclib", "Error opening camera", ((Throwable) (obj)));
        g.a(((gih) (a)).h);
        obj2;
        JVM INSTR monitorexit ;
        return;
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
_L8:
        parameters.setPreviewSize(((android.hardware.Camera.Size) (obj)).width, ((android.hardware.Camera.Size) (obj)).height);
        a.e.setParameters(parameters);
        a.f = new gki(parameters.getPreviewSize().width, parameters.getPreviewSize().height);
        obj = String.valueOf(a.f);
        gkc.c("vclib", (new StringBuilder(String.valueOf(obj).length() + 21)).append("Camera preview size: ").append(((String) (obj))).toString());
        a.e.setPreviewTexture(a.r);
_L10:
        a.e.startPreview();
        if (a.s != 1)
        {
            break MISSING_BLOCK_LABEL_509;
        }
        i = a.c;
_L11:
        a.a(i, i);
        obj2;
        JVM INSTR monitorexit ;
        return;
        obj;
        gkc.c("vclib", "Failure setting surface texture", ((Throwable) (obj)));
          goto _L10
        i = a.d;
          goto _L11
_L4:
        obj = (new int[] {
            -1, -1
        });
          goto _L5
        int l = i1;
        if (i1 < 0)
        {
            l = i1 * -4;
        }
        j = l + j;
        if (j < i)
        {
            obj = ai;
            i = j;
        }
          goto _L12
    }
}
