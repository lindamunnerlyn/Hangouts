// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.xml.sax.Attributes;

final class lfo
{

    final lfn a;
    private Paint b;
    private Paint c;
    private float d;
    private float e;
    private String f;
    private boolean g;
    private int h;

    public lfo(lfn lfn1, Attributes attributes)
    {
        a = lfn1;
        super();
        b = null;
        c = null;
        h = 0;
        d = lfn.a(lfn1, "x", attributes, Float.valueOf(0.0F)).floatValue();
        e = lfn.a(lfn1, "y", attributes, Float.valueOf(0.0F)).floatValue();
        f = null;
        g = true;
        lfm lfm1 = new lfm(attributes);
        if (lfn.a(lfn1, lfm1, lfn1.v))
        {
            c = new Paint(lfn1.h);
            lfn.a(lfn1, attributes, c);
        }
        if (lfn.a(lfn1, lfm1))
        {
            b = new Paint(lfn1.d);
            lfn.a(lfn1, attributes, b);
        }
        lfn1 = lfg.a("alignment-baseline", attributes);
        if ("middle".equals(lfn1))
        {
            h = 1;
        } else
        if ("top".equals(lfn1))
        {
            h = 2;
            return;
        }
    }

    public void a()
    {
        g = false;
    }

    public void a(Canvas canvas)
    {
        if (c != null)
        {
            canvas.drawText(f, d, e, c);
        }
        if (b != null)
        {
            canvas.drawText(f, d, e, b);
        }
    }

    public void a(char ac[], int i, int j)
    {
        if (g)
        {
            if (f == null)
            {
                ac = new String(ac, i, j);
            } else
            {
                obj = String.valueOf(f);
                ac = String.valueOf(new String(ac, i, j));
                if (ac.length() != 0)
                {
                    ac = ((String) (obj)).concat(ac);
                } else
                {
                    ac = new String(((String) (obj)));
                }
            }
            f = ac;
            if (h > 0)
            {
                float f1;
                float f2;
                Object obj;
                if (b == null)
                {
                    ac = c;
                } else
                {
                    ac = b;
                }
                obj = new Rect();
                ac.getTextBounds(f, 0, f.length(), ((Rect) (obj)));
                f2 = e;
                if (h == 1)
                {
                    f1 = -((Rect) (obj)).centerY();
                } else
                {
                    f1 = ((Rect) (obj)).height();
                }
                e = f1 + f2;
            }
        }
    }
}
