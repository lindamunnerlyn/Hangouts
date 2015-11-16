// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.RectF;
import android.net.Uri;

public final class heh
{

    public static final Uri a = Uri.parse("https://lh3.googleusercontent.com");
    public static int b = -1;
    private static hej c = new hej();
    private static Context d;

    static int a(Context context)
    {
        if (context != null)
        {
            context = android.provider.Settings.Secure.getString(d.getContentResolver(), "android_id");
            if (context != null)
            {
                int j = Math.abs(context.hashCode());
                int i = j;
                if (j == 0)
                {
                    i = 1;
                }
                return i;
            }
        }
        return 0;
    }

    static Context a()
    {
        return d;
    }

    private static String a(float f)
    {
        float f1;
label0:
        {
            if ((double)f >= 0.0D)
            {
                f1 = f;
                if ((double)f <= 1.0D)
                {
                    break label0;
                }
            }
            f1 = Math.max(0.0F, Math.min(1.0F, f));
        }
        String s1 = Integer.toString((int)(65535F * f1), 16);
        String s = String.valueOf("0000".substring(0, 4 - s1.length()));
        s1 = String.valueOf(s1);
        if (s1.length() != 0)
        {
            return s.concat(s1);
        } else
        {
            return new String(s);
        }
    }

    public static String a(RectF rectf)
    {
        new RectF();
        String s = String.valueOf(a(rectf.left));
        String s1 = String.valueOf(a(rectf.top));
        String s2 = String.valueOf(a(rectf.right));
        rectf = String.valueOf(a(rectf.bottom));
        return (new StringBuilder(String.valueOf(s).length() + 11 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(rectf).length())).append("-fcrop64=1,").append(s).append(s1).append(s2).append(rectf).toString();
    }

    private static String a(String s, int i, int j, int k, int l, int i1, int j1, RectF rectf, 
            int k1)
    {
        return c.a(s, i, j, k, l, i1, j1, rectf, k1, -1);
    }

    public static String a(String s, int i, int j, int k, int l, int i1, RectF rectf)
    {
        rectf = a(s, i, 0, j, k, l, i1, rectf, hei.a);
        if (rectf == null) goto _L2; else goto _L1
_L1:
        return rectf;
_L2:
        if (j != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        rectf = s;
        if (k == 0) goto _L1; else goto _L3
_L3:
        return hek.a(j, k, s);
    }

    public static String a(String s, int i, int j, RectF rectf)
    {
        String s1 = a(s, i, j, 0, 0, -1, -1, rectf, hei.a);
        rectf = s1;
        if (s1 == null)
        {
            rectf = hek.a(j, s);
        }
        return rectf;
    }

    public static String a(String s, int i, RectF rectf)
    {
        String s1 = a(s, i, 0, 0, 0, -1, -1, rectf, hei.a);
        rectf = s1;
        if (s1 == null)
        {
            rectf = hek.a(-1, s);
        }
        return rectf;
    }

}
