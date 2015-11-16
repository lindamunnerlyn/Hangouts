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

class eec extends ImageSpan
{

    final edz a;
    private Bitmap b;
    private boolean c;
    private final int d;
    private final int e;

    public eec(edz edz1, Drawable drawable, String s, int i, int j)
    {
        a = edz1;
        super(drawable, s, 1);
        c = false;
        d = i;
        e = j;
    }

    static int a(eec eec1)
    {
        return eec1.d;
    }

    static int b(eec eec1)
    {
        return eec1.e;
    }

    void a()
    {
        this;
        JVM INSTR monitorenter ;
        c = true;
        if (b != null)
        {
            edz.a(a).a(b);
            b = null;
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
        if (!c)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        edz.a(a).a(bitmap);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        b = bitmap;
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
        if (b != null)
        {
            i = g.nS.getResources().getDimensionPixelOffset(g.el);
            edz.a().set(0, 0, b.getWidth(), b.getHeight());
            charsequence = edz.b();
            j = (int)f;
            float f1 = d;
            charsequence.set(j + i, k, (int)((float)i + (f1 + f)), e + k);
            canvas.drawBitmap(b, edz.a(), edz.b(), null);
        }
    }

    public int getSize(Paint paint, CharSequence charsequence, int i, int j, android.graphics.Paint.FontMetricsInt fontmetricsint)
    {
        i = super.getSize(paint, charsequence, i, j, fontmetricsint);
        if (fontmetricsint != null)
        {
            paint.getFontMetrics(edz.b(a));
            fontmetricsint.ascent = (int)((double)edz.b(a).ascent + 0.5D);
            fontmetricsint.descent = (int)((double)edz.b(a).descent + 0.5D);
            fontmetricsint.top = (int)((double)edz.b(a).top + 0.5D);
            fontmetricsint.bottom = (int)((double)edz.b(a).bottom + 0.5D);
        }
        return i;
    }
}
