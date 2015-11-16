// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class anv
{

    public static final boolean a = false;
    private static int b;
    private static int c;
    private static int d;
    private static int e;
    private static int f;
    private static Bitmap g;
    private static Bitmap h;
    private static Bitmap i;
    private static Bitmap j;
    private static Bitmap k;
    private static Bitmap l;
    private static Bitmap m;
    private static Bitmap n;
    private static Bitmap o;
    private static Bitmap p;
    private static Map q = new gz();

    public static int a()
    {
        if (b == 0)
        {
            b = g.nS.getResources().getDimensionPixelSize(g.eM);
        }
        return b;
    }

    public static Bitmap a(amv amv1)
    {
        if (q.containsKey(amv1)) goto _L2; else goto _L1
_L1:
        Map map;
        Bitmap bitmap;
        Canvas canvas;
        map = q;
        bitmap = c();
        bitmap = bitmap.copy(bitmap.getConfig(), true);
        canvas = new Canvas(bitmap);
        anw.a[amv1.ordinal()];
        JVM INSTR tableswitch 1 3: default 72
    //                   1 114
    //                   2 158
    //                   3 183;
           goto _L3 _L4 _L5 _L6
_L6:
        break; /* Loop/switch isn't completed */
_L3:
        amv1 = String.valueOf(amv1);
        throw new AssertionError((new StringBuilder(String.valueOf(amv1).length() + 20)).append("Unknown badge type: ").append(amv1).toString());
_L4:
        a(canvas, ((BitmapDrawable)g.nS.getResources().getDrawable(com.google.android.apps.hangouts.R.drawable.aV)).getBitmap());
_L8:
        map.put(amv1, bitmap);
_L2:
        return (Bitmap)q.get(amv1);
_L5:
        a(canvas, ((BitmapDrawable)g.nS.getResources().getDrawable(com.google.android.apps.hangouts.R.drawable.bp)).getBitmap());
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static void a(Canvas canvas, Bitmap bitmap)
    {
        float f1 = g.nS.getResources().getDimension(g.eU);
        canvas.drawBitmap(bitmap, (float)(canvas.getWidth() - bitmap.getWidth()) - f1, (float)(canvas.getHeight() - bitmap.getHeight()) - f1, null);
    }

    public static void a(ani ani1, List list, boolean flag)
    {
        if (list != null)
        {
            Iterator iterator;
            int i1;
            if (flag)
            {
                i1 = e();
            } else
            {
                i1 = b();
            }
            iterator = list.iterator();
            while (iterator.hasNext()) 
            {
                list = (ceu)iterator.next();
                String s = ((ceu) (list)).h;
                if (TextUtils.isEmpty(s))
                {
                    if (a)
                    {
                        list = String.valueOf(ebw.b(((ceu) (list)).e));
                        if (list.length() != 0)
                        {
                            list = "Avatar url for contact is empty: ".concat(list);
                        } else
                        {
                            list = new String("Avatar url for contact is empty: ");
                        }
                        ebw.b("Babel_medialoader", list);
                    }
                } else
                {
                    list = new apw((new eam(s, ani1.a())).a(i1).d(true), null, true, null);
                    ((dmt)hgx.a(g.nS, dmt)).c(list);
                }
            }
        }
    }

    public static boolean a(Bitmap bitmap)
    {
        return bitmap != null && (bitmap == g || bitmap == h || bitmap == i || bitmap == j || bitmap == k || bitmap == l || bitmap == m || bitmap == n || bitmap == o || bitmap == p);
    }

    public static int b()
    {
        if (c == 0)
        {
            c = g.nS.getResources().getDimensionPixelSize(g.ew);
        }
        return c;
    }

    public static Bitmap c()
    {
        if (g == null)
        {
            g = Bitmap.createScaledBitmap(ean.a(com.google.android.apps.hangouts.R.drawable.e), b(), b(), false);
        }
        return g;
    }

    public static Bitmap d()
    {
        if (h == null)
        {
            h = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(g.nS.getResources(), com.google.android.apps.hangouts.R.drawable.e), b(), b(), false);
        }
        return h;
    }

    public static int e()
    {
        if (d == 0)
        {
            d = g.nS.getResources().getDimensionPixelSize(g.ev);
        }
        return d;
    }

    public static int f()
    {
        if (e == 0)
        {
            e = g.nS.getResources().getDimensionPixelSize(g.em);
        }
        return e;
    }

    public static int g()
    {
        if (f == 0)
        {
            f = g.nS.getResources().getDimensionPixelSize(g.eS);
        }
        return f;
    }

    public static Bitmap h()
    {
        if (i == null)
        {
            i = ean.a(com.google.android.apps.hangouts.R.drawable.g);
        }
        return i;
    }

    public static Bitmap i()
    {
        if (j == null)
        {
            j = BitmapFactory.decodeResource(g.nS.getResources(), com.google.android.apps.hangouts.R.drawable.g);
        }
        return j;
    }

    public static Bitmap j()
    {
        return h();
    }

    public static Bitmap k()
    {
        return i();
    }

    public static Bitmap l()
    {
        if (k == null)
        {
            k = ean.a(com.google.android.apps.hangouts.R.drawable.h);
        }
        return k;
    }

    public static Bitmap m()
    {
        if (l == null)
        {
            l = BitmapFactory.decodeResource(g.nS.getResources(), com.google.android.apps.hangouts.R.drawable.h);
        }
        return l;
    }

    public static Bitmap n()
    {
        if (m == null)
        {
            m = ean.a(com.google.android.apps.hangouts.R.drawable.i);
        }
        return m;
    }

    public static Bitmap o()
    {
        if (n == null)
        {
            n = BitmapFactory.decodeResource(g.nS.getResources(), com.google.android.apps.hangouts.R.drawable.i);
        }
        return n;
    }

    public static Bitmap p()
    {
        if (o == null)
        {
            o = ean.a(com.google.android.apps.hangouts.R.drawable.f);
        }
        return o;
    }

    public static Bitmap q()
    {
        if (p == null)
        {
            p = ean.a(com.google.android.apps.hangouts.R.drawable.cz);
        }
        return p;
    }

    static 
    {
        hik hik = ebw.d;
    }
}
