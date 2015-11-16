// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Matrix;
import com.android.ex.photo.views.PhotoView;

public final class abt
    implements Runnable
{

    private final PhotoView a;
    private float b;
    private float c;
    private float d;
    private long e;
    private boolean f;
    private boolean g;

    public abt(PhotoView photoview)
    {
        a = photoview;
    }

    public void a()
    {
        f = false;
        g = true;
    }

    public void run()
    {
        if (!g) goto _L2; else goto _L1
_L1:
        return;
_L2:
label0:
        {
            if (c == b)
            {
                continue; /* Loop/switch isn't completed */
            }
            long l1 = System.currentTimeMillis();
            float f1;
            float f2;
            PhotoView photoview;
            long l;
            if (e != -1L)
            {
                l = l1 - e;
            } else
            {
                l = 0L;
            }
            f1 = d;
            f2 = (float)l * f1;
            if (c >= b || c + f2 <= b)
            {
                f1 = f2;
                if (c <= b)
                {
                    break label0;
                }
                f1 = f2;
                if (c + f2 >= b)
                {
                    break label0;
                }
            }
            f1 = b - c;
        }
        photoview = a;
        photoview.c = photoview.c + f1;
        photoview.a.postRotate(f1, photoview.getWidth() / 2, photoview.getHeight() / 2);
        photoview.invalidate();
        c = f1 + c;
        if (c == b)
        {
            a();
        }
        e = l1;
        if (g) goto _L1; else goto _L3
_L3:
        a.post(this);
        return;
    }
}
