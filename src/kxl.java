// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import org.xml.sax.Attributes;

final class kxl
{

    final kxk a;
    private Paint b;
    private Paint c;
    private float d;
    private float e;
    private String f;
    private boolean g;
    private int h;

    public kxl(kxk kxk1, Attributes attributes)
    {
        a = kxk1;
        super();
        b = null;
        c = null;
        h = 0;
        d = kxk.a(kxk1, "x", attributes, Float.valueOf(0.0F)).floatValue();
        e = kxk.a(kxk1, "y", attributes, Float.valueOf(0.0F)).floatValue();
        f = null;
        g = true;
        kxj kxj1 = new kxj(attributes);
        if (kxk.a(kxk1, kxj1, kxk1.v))
        {
            c = new Paint(kxk1.h);
            kxk.a(kxk1, attributes, c);
        }
        if (kxk.a(kxk1, kxj1))
        {
            b = new Paint(kxk1.d);
            kxk.a(kxk1, attributes, b);
        }
        kxk1 = kxd.a("alignment-baseline", attributes);
        if ("middle".equals(kxk1))
        {
            h = 1;
        } else
        if ("top".equals(kxk1))
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
