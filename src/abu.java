// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.android.ex.photo.views.PhotoView;

public final class abu
    implements Runnable
{

    public boolean a;
    private final PhotoView b;
    private float c;
    private float d;
    private boolean e;
    private float f;
    private float g;
    private float h;
    private long i;
    private boolean j;

    public abu(PhotoView photoview)
    {
        b = photoview;
    }

    public void a()
    {
        a = false;
        j = true;
    }

    public boolean a(float f1, float f2, float f3, float f4)
    {
        if (a)
        {
            return false;
        }
        c = f3;
        d = f4;
        f = f2;
        i = System.currentTimeMillis();
        g = f1;
        boolean flag;
        if (f > g)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
        h = (f - g) / 200F;
        a = true;
        j = false;
        b.post(this);
        return true;
    }

    public void run()
    {
        if (!j) goto _L2; else goto _L1
_L1:
        return;
_L2:
        long l = System.currentTimeMillis();
        long l1 = i;
        float f1 = g;
        float f2 = h;
        f1 = (float)(l - l1) * f2 + f1;
        b.a(f1, c, d);
        if (f1 != f)
        {
            boolean flag1 = e;
            boolean flag;
            if (f1 > f)
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
        b.a(f, c, d);
        a();
        if (j) goto _L1; else goto _L3
_L3:
        b.post(this);
        return;
    }
}
