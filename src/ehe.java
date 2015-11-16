// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

class ehe extends ImageSpan
{

    final int a;
    final int b;
    final ehb c;
    private Bitmap d;
    private boolean e;

    public ehe(ehb ehb1, Drawable drawable, String s, int i, int j)
    {
        c = ehb1;
        super(drawable, s, 1);
        e = false;
        a = i;
        b = j;
    }

    void a()
    {
        this;
        JVM INSTR monitorenter ;
        e = true;
        if (d != null)
        {
            ehb.a(c).a(d);
            d = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void a(Bitmap bitmap)
    {
        this;
        JVM INSTR monitorenter ;
        if (!e)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        ehb.a(c).a(bitmap);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        d = bitmap;
        if (true) goto _L2; else goto _L1
_L1:
        bitmap;
        this;
        JVM INSTR monitorexit ;
        throw bitmap;
    }

    public void draw(Canvas canvas, CharSequence charsequence, int i, int j, float f, int k, int l, 
            int i1, Paint paint)
    {
        if (d != null)
        {
            i = g.nU.getResources().getDimensionPixelOffset(g.ej);
            ehb.a().set(0, 0, d.getWidth(), d.getHeight());
            charsequence = ehb.b();
            j = (int)f;
            float f1 = a;
            charsequence.set(j + i, k, (int)((float)i + (f1 + f)), b + k);
            canvas.drawBitmap(d, ehb.a(), ehb.b(), null);
        }
    }

    public int getSize(Paint paint, CharSequence charsequence, int i, int j, android.graphics.Paint.FontMetricsInt fontmetricsint)
    {
        i = super.getSize(paint, charsequence, i, j, fontmetricsint);
        if (fontmetricsint != null)
        {
            paint.getFontMetrics(ehb.b(c));
            fontmetricsint.ascent = (int)((double)ehb.b(c).ascent + 0.5D);
            fontmetricsint.descent = (int)((double)ehb.b(c).descent + 0.5D);
            fontmetricsint.top = (int)((double)ehb.b(c).top + 0.5D);
            fontmetricsint.bottom = (int)((double)ehb.b(c).bottom + 0.5D);
        }
        return i;
    }
}
