// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.android.ex.photo.views.PhotoView;

public final class abw
    implements Runnable
{

    public boolean a;
    private final PhotoView b;
    private float c;
    private float d;
    private float e;
    private float f;
    private long g;
    private boolean h;

    public abw(PhotoView photoview)
    {
        g = -1L;
        b = photoview;
    }

    public void a()
    {
        a = false;
        h = true;
    }

    public boolean a(float f1, float f2)
    {
        if (a)
        {
            return false;
        } else
        {
            g = -1L;
            c = f1;
            d = f2;
            f1 = (float)Math.atan2(d, c);
            e = (float)(Math.cos(f1) * 1000D);
            f = (float)(Math.sin(f1) * 1000D);
            h = false;
            a = true;
            b.post(this);
            return true;
        }
    }

    public void run()
    {
        float f4 = 1000F;
        if (!h) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        long l = System.currentTimeMillis();
        float f1;
        float f5;
        if (g != -1L)
        {
            f1 = (float)(l - g) / 1000F;
        } else
        {
            f1 = 0.0F;
        }
        i = b.a(c * f1, d * f1);
        g = l;
        f5 = e * f1;
        if (Math.abs(c) > Math.abs(f5))
        {
            c = c - f5;
        } else
        {
            c = 0.0F;
        }
        f1 *= f;
        if (Math.abs(d) > Math.abs(f1))
        {
            d = d - f1;
        } else
        {
            d = 0.0F;
        }
        if ((c != 0.0F || d != 0.0F) && i != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        a();
        b.h();
_L4:
        if (!h)
        {
            b.post(this);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (i == 1)
        {
            float f2;
            if (c > 0.0F)
            {
                f2 = 1000F;
            } else
            {
                f2 = -1000F;
            }
            e = f2;
            f = 0.0F;
            d = 0.0F;
        } else
        if (i == 2)
        {
            e = 0.0F;
            float f3;
            if (d > 0.0F)
            {
                f3 = f4;
            } else
            {
                f3 = -1000F;
            }
            f = f3;
            c = 0.0F;
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }
}
