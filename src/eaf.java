// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.ImageView;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class eaf
{

    private static final boolean a = false;
    private static final String b = (new StringBuilder()).appendCodePoint(0x1f170).appendCodePoint(0x1f607).appendCodePoint(0x1f38a).appendCodePoint(0x1f3e5).toString();
    private static dzn c;
    private static int d;
    private static boolean e = false;
    private static boolean f;
    private static int g;
    private static int h;
    private static final ThreadFactory n;
    private static final Executor o;
    private final int i;
    private final Paint j;
    private final he k;
    private final Context l;
    private final boolean m;

    public eaf(Context context, int i1)
    {
        l = context.getApplicationContext();
        a(l);
        k = new he(d);
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 19 && g.a(g.nS, "babel_prefer_emoji_system_font_rendering", true))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        m = flag;
        if (m)
        {
            i = context.getResources().getDimensionPixelSize(g.eh);
            j = new Paint(1);
            j.setColor(i1);
            a(i);
            return;
        } else
        {
            i = 0;
            j = null;
            return;
        }
    }

    public static android.graphics.BitmapFactory.Options a()
    {
        if (!e)
        {
            g = 128;
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                f = false;
                h = 128;
            } else
            {
                f = true;
                h = g.nS.getResources().getDimensionPixelSize(g.eh);
            }
            e = true;
        }
        return dzn.a(f, g, h);
    }

    public static dzn a(Context context)
    {
        if (c == null)
        {
            android.graphics.BitmapFactory.Options options = a();
            Resources resources = context.getResources();
            Bitmap bitmap = BitmapFactory.decodeResource(resources, com.google.android.apps.hangouts.R.drawable.emoji_u00a9, options);
            int l1 = bitmap.getByteCount();
            int j1 = bitmap.getWidth();
            int k1 = bitmap.getHeight();
            int i1;
            int i2;
            int j2;
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                i1 = 0x20000;
            } else
            {
                i1 = 0x10000;
            }
            i2 = Math.min(Math.max(((ActivityManager)context.getSystemService("activity")).getMemoryClass() * i1, 0x400000), 0x1000000);
            if ((resources.getConfiguration().screenLayout & 0xf) >= 3)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            j2 = i2 / l1;
            if (i1 != 0)
            {
                i1 = Math.min(j2, g.a(g.nS, "babel_emoji_max_pool_size_large", 256));
            } else
            {
                i1 = Math.min(j2, g.a(g.nS, "babel_emoji_max_pool_size", 128));
            }
            if (a || ebw.a("Babel", 3))
            {
                ebw.d("Babel", (new StringBuilder(97)).append("[BitmapPoolICS ctor] maxItems=").append(i1).append(", poolMemSize=").append(i2).append(", memTakenPerBitmap=").append(l1).toString());
            }
            d = i1;
            i1 = d;
            ebw.f("Babel", (new StringBuilder(30)).append("getBitmapPool size=").append(i1).toString());
            c = dzn.a(d, 0, 0, 0, "Emoji");
            if (android.os.Build.VERSION.SDK_INT < 19)
            {
                c.a(bitmap);
                (new eag(j1, k1, 64, resources, options)).execute(new Object[0]);
            }
        }
        return c;
    }

    static eaj a(ImageView imageview)
    {
        if (imageview != null)
        {
            imageview = imageview.getDrawable();
            if (imageview instanceof eai)
            {
                return ((eai)imageview).a();
            }
        }
        return null;
    }

    private void a(int i1)
    {
        Rect rect = new Rect();
        int j1 = 0;
        int k1;
        int i2;
        for (k1 = i1; j1 < b.length(); k1 = i2)
        {
            int j2 = Character.charCount(b.codePointAt(j1));
            i2 = i1 + 1;
            int l1;
            do
            {
                do
                {
                    Paint paint = j;
                    l1 = i2 - 1;
                    paint.setTextSize(l1);
                    j.getTextBounds(b, j1, j1 + j2, rect);
                    i2 = l1;
                } while (rect.height() > i);
                i2 = l1;
            } while (rect.width() > i);
            i2 = k1;
            if (l1 < k1)
            {
                if (a || ebw.a("Babel", 3))
                {
                    ebw.d("Babel", (new StringBuilder(56)).append("Emoji font size min so far:").append(l1).append(" for i:").append(j1).toString());
                }
                i2 = l1;
            }
            j1 += j2;
        }

        j.setTextSize(k1);
    }

    static boolean a(eaf eaf1)
    {
        return eaf1.m;
    }

    static he b(eaf eaf1)
    {
        return eaf1.k;
    }

    static int c(eaf eaf1)
    {
        return eaf1.i;
    }

    static dzn c()
    {
        return c;
    }

    static Paint d(eaf eaf1)
    {
        return eaf1.j;
    }

    static boolean d()
    {
        return a;
    }

    public eaj a(int ai[])
    {
        ai = new eaj(this, l, ai);
        ai.executeOnExecutor(o, new Void[0]);
        return ai;
    }

    public void a(Resources resources, int i1, eaj eaj1, ImageView imageview)
    {
        imageview.setImageDrawable(new eai(this, resources, eaj1));
        eaj1.a(i1, imageview);
    }

    public void b()
    {
        k.a(-1);
    }

    static 
    {
        hik hik = ebw.u;
        n = new eah();
        o = Executors.newFixedThreadPool(2, n);
    }
}
