// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

public final class eei extends Drawable
    implements eae
{

    private Paint a;
    private eab b;
    private Bitmap c;
    private boolean d;
    private Runnable e;

    public eei(eab eab1)
    {
        d = true;
        a(eab1);
    }

    public void a()
    {
        if (b != null)
        {
            b.g();
        }
    }

    public void a(Bitmap bitmap)
    {
        if (e != null)
        {
            e.run();
            e = null;
        }
        c = bitmap;
        invalidateSelf();
    }

    public void a(eab eab1)
    {
        a = new Paint(2);
        c();
        if (eab1 != null)
        {
            b = eab1;
            b.a(this);
            b.a(d);
        }
    }

    public void a(Runnable runnable)
    {
        e = runnable;
    }

    public void b()
    {
        if (b != null)
        {
            b.h();
        }
    }

    public void c()
    {
        if (b != null)
        {
            b.h();
            b.a(null);
            b.i();
            b = null;
        }
        c = null;
        e = null;
    }

    public void d()
    {
        d = false;
        if (b != null)
        {
            b.a(false);
        }
    }

    public void draw(Canvas canvas)
    {
        if (c != null && !c.isRecycled())
        {
            canvas.drawBitmap(c, 0.0F, 0.0F, a);
        }
    }

    public int getIntrinsicHeight()
    {
        if (b != null)
        {
            return b.e();
        } else
        {
            return 0;
        }
    }

    public int getIntrinsicWidth()
    {
        if (b != null)
        {
            return b.d();
        } else
        {
            return 0;
        }
    }

    public int getOpacity()
    {
        return -1;
    }

    public void setAlpha(int i)
    {
        a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        a.setColorFilter(colorfilter);
    }
}
