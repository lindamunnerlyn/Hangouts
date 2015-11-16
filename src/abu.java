// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.android.ex.photo.views.PhotoView;

public final class abu
    implements Runnable
{

    private final PhotoView a;
    private float b;
    private float c;
    private float d;
    private float e;
    private long f;
    private boolean g;
    private boolean h;

    public abu(PhotoView photoview)
    {
        f = -1L;
        a = photoview;
    }

    public static boolean a(abu abu1)
    {
        return abu1.g;
    }

    public void a()
    {
        g = false;
        h = true;
    }

    public boolean a(float f1, float f2)
    {
        if (g)
        {
            return false;
        } else
        {
            f = -1L;
            b = f1;
            c = f2;
            f1 = (float)Math.atan2(c, b);
            d = (float)(Math.cos(f1) * 1000D);
            e = (float)(Math.sin(f1) * 1000D);
            h = false;
            g = true;
            a.post(this);
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
        if (f != -1L)
        {
            f1 = (float)(l - f) / 1000F;
        } else
        {
            f1 = 0.0F;
        }
        i = PhotoView.a(a, b * f1, c * f1);
        f = l;
        f5 = d * f1;
        if (Math.abs(b) > Math.abs(f5))
        {
            b = b - f5;
        } else
        {
            b = 0.0F;
        }
        f1 *= e;
        if (Math.abs(c) > Math.abs(f1))
        {
            c = c - f1;
        } else
        {
            c = 0.0F;
        }
        if ((b != 0.0F || c != 0.0F) && i != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        a();
        PhotoView.a(a);
_L4:
        if (!h)
        {
            a.post(this);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (i == 1)
        {
            float f2;
            if (b > 0.0F)
            {
                f2 = 1000F;
            } else
            {
                f2 = -1000F;
            }
            d = f2;
            e = 0.0F;
            c = 0.0F;
        } else
        if (i == 2)
        {
            d = 0.0F;
            float f3;
            if (c > 0.0F)
            {
                f3 = f4;
            } else
            {
                f3 = -1000F;
            }
            e = f3;
            b = 0.0F;
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }
}
