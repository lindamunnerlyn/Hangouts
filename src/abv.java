// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.android.ex.photo.views.PhotoView;

public final class abv
    implements Runnable
{

    private final PhotoView a;
    private float b;
    private float c;
    private long d;
    private boolean e;
    private boolean f;

    public abv(PhotoView photoview)
    {
        d = -1L;
        a = photoview;
    }

    public void a()
    {
        e = false;
        f = true;
    }

    public boolean a(float f1, float f2)
    {
        if (e)
        {
            return false;
        } else
        {
            d = -1L;
            b = f1;
            c = f2;
            f = false;
            e = true;
            a.postDelayed(this, 250L);
            return true;
        }
    }

    public void run()
    {
        if (!f) goto _L2; else goto _L1
_L1:
        return;
_L2:
        float f1;
        float f2;
        float f3;
        long l = System.currentTimeMillis();
        if (d != -1L)
        {
            f1 = l - d;
        } else
        {
            f1 = 0.0F;
        }
        if (d == -1L)
        {
            d = l;
        }
        if (f1 < 100F) goto _L4; else goto _L3
_L3:
        f2 = b;
_L6:
        f1 = c;
        f3 = f2;
        f2 = f1;
_L8:
        a.a(f3, f2);
        b = b - f3;
        c = c - f2;
        if (b == 0.0F && c == 0.0F)
        {
            a();
        }
        if (!f)
        {
            a.post(this);
            return;
        }
          goto _L1
_L4:
        f2 = (b / (100F - f1)) * 10F;
        f3 = (c / (100F - f1)) * 10F;
        if (Math.abs(f2) > Math.abs(b) || Float.isNaN(f2))
        {
            f1 = b;
        } else
        {
            f1 = f2;
        }
        f2 = f1;
        if (Math.abs(f3) > Math.abs(c)) goto _L6; else goto _L5
_L5:
        f2 = f1;
        if (Float.isNaN(f3)) goto _L6; else goto _L7
_L7:
        f2 = f3;
        f3 = f1;
          goto _L8
    }
}
