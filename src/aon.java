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

public final class aon
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
            b = g.nU.getResources().getDimensionPixelSize(g.eK);
        }
        return b;
    }

    public static Bitmap a(ann ann1)
    {
        if (q.containsKey(ann1)) goto _L2; else goto _L1
_L1:
        Map map;
        Bitmap bitmap;
        Canvas canvas;
        map = q;
        bitmap = c();
        bitmap = bitmap.copy(bitmap.getConfig(), true);
        canvas = new Canvas(bitmap);
        aoo.a[ann1.ordinal()];
        JVM INSTR tableswitch 1 3: default 72
    //                   1 114
    //                   2 158
    //                   3 183;
           goto _L3 _L4 _L5 _L6
_L6:
        break; /* Loop/switch isn't completed */
_L3:
        ann1 = String.valueOf(ann1);
        throw new AssertionError((new StringBuilder(String.valueOf(ann1).length() + 20)).append("Unknown badge type: ").append(ann1).toString());
_L4:
        a(canvas, ((BitmapDrawable)g.nU.getResources().getDrawable(com.google.android.apps.hangouts.R.drawable.aR)).getBitmap());
_L8:
        map.put(ann1, bitmap);
_L2:
        return (Bitmap)q.get(ann1);
_L5:
        a(canvas, ((BitmapDrawable)g.nU.getResources().getDrawable(com.google.android.apps.hangouts.R.drawable.bl)).getBitmap());
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static void a(Canvas canvas, Bitmap bitmap)
    {
        float f1 = g.nU.getResources().getDimension(g.eS);
        canvas.drawBitmap(bitmap, (float)(canvas.getWidth() - bitmap.getWidth()) - f1, (float)(canvas.getHeight() - bitmap.getHeight()) - f1, null);
    }

    public static void a(aoa aoa1, List list, boolean flag)
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
                list = (cfz)iterator.next();
                String s = ((cfz) (list)).h;
                if (TextUtils.isEmpty(s))
                {
                    if (a)
                    {
                        list = String.valueOf(eev.b(((cfz) (list)).e));
                        if (list.length() != 0)
                        {
                            list = "Avatar url for contact is empty: ".concat(list);
                        } else
                        {
                            list = new String("Avatar url for contact is empty: ");
                        }
                        eev.b("Babel_medialoader", list);
                    }
                } else
                {
                    list = new aqn((new edq(s, aoa1.a())).a(i1).d(true), null, true, null);
                    ((dpn)hlp.a(g.nU, dpn)).c(list);
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
            c = g.nU.getResources().getDimensionPixelSize(g.eu);
        }
        return c;
    }

    public static Bitmap c()
    {
        if (g == null)
        {
            g = Bitmap.createScaledBitmap(edr.a(com.google.android.apps.hangouts.R.drawable.d), b(), b(), false);
        }
        return g;
    }

    public static Bitmap d()
    {
        if (h == null)
        {
            h = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(g.nU.getResources(), com.google.android.apps.hangouts.R.drawable.d), b(), b(), false);
        }
        return h;
    }

    public static int e()
    {
        if (d == 0)
        {
            d = g.nU.getResources().getDimensionPixelSize(g.et);
        }
        return d;
    }

    public static int f()
    {
        if (e == 0)
        {
            e = g.nU.getResources().getDimensionPixelSize(g.ek);
        }
        return e;
    }

    public static int g()
    {
        if (f == 0)
        {
            f = g.nU.getResources().getDimensionPixelSize(g.eQ);
        }
        return f;
    }

    public static Bitmap h()
    {
        if (i == null)
        {
            i = edr.a(com.google.android.apps.hangouts.R.drawable.f);
        }
        return i;
    }

    public static Bitmap i()
    {
        if (j == null)
        {
            j = BitmapFactory.decodeResource(g.nU.getResources(), com.google.android.apps.hangouts.R.drawable.f);
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
            k = edr.a(com.google.android.apps.hangouts.R.drawable.g);
        }
        return k;
    }

    public static Bitmap m()
    {
        if (l == null)
        {
            l = BitmapFactory.decodeResource(g.nU.getResources(), com.google.android.apps.hangouts.R.drawable.g);
        }
        return l;
    }

    public static Bitmap n()
    {
        if (m == null)
        {
            m = edr.a(com.google.android.apps.hangouts.R.drawable.h);
        }
        return m;
    }

    public static Bitmap o()
    {
        if (n == null)
        {
            n = BitmapFactory.decodeResource(g.nU.getResources(), com.google.android.apps.hangouts.R.drawable.h);
        }
        return n;
    }

    public static Bitmap p()
    {
        if (o == null)
        {
            o = edr.a(com.google.android.apps.hangouts.R.drawable.e);
        }
        return o;
    }

    public static Bitmap q()
    {
        if (p == null)
        {
            p = edr.a(com.google.android.apps.hangouts.R.drawable.cr);
        }
        return p;
    }

    static 
    {
        hnc hnc = eev.d;
    }
}
