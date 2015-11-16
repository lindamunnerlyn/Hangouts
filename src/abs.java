// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.android.ex.photo.views.PhotoView;

public final class abs
    implements Runnable
{

    private final PhotoView a;
    private float b;
    private float c;
    private boolean d;
    private float e;
    private float f;
    private float g;
    private long h;
    private boolean i;
    private boolean j;

    public abs(PhotoView photoview)
    {
        a = photoview;
    }

    public static boolean a(abs abs1)
    {
        return abs1.i;
    }

    public void a()
    {
        i = false;
        j = true;
    }

    public boolean a(float f1, float f2, float f3, float f4)
    {
        if (i)
        {
            return false;
        }
        b = f3;
        c = f4;
        e = f2;
        h = System.currentTimeMillis();
        f = f1;
        boolean flag;
        if (e > f)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        g = (e - f) / 200F;
        i = true;
        j = false;
        a.post(this);
        return true;
    }

    public void run()
    {
        if (!j) goto _L2; else goto _L1
_L1:
        return;
_L2:
        long l = System.currentTimeMillis();
        long l1 = h;
        float f1 = f;
        float f2 = g;
        f1 = (float)(l - l1) * f2 + f1;
        PhotoView.a(a, f1, b, c);
        if (f1 != e)
        {
            boolean flag1 = d;
            boolean flag;
            if (f1 > e)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag1 != flag)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        PhotoView.a(a, e, b, c);
        a();
        if (j) goto _L1; else goto _L3
_L3:
        a.post(this);
        return;
    }
}
