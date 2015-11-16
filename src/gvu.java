// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.Map;

final class gvu
{

    private final Map a = new HashMap();
    private final gvv b = new gvv(null);

    gvu()
    {
    }

    private static void a(gvv gvv1)
    {
        gvv1.a.b = gvv1.b;
        gvv1.b.a = gvv1.a;
    }

    public Bitmap a()
    {
        for (gvv gvv1 = b.b; gvv1 != b; gvv1 = gvv1.b)
        {
            if (gvv1.a() > 0)
            {
                return gvv1.b();
            }
            a.remove(gvv1.c);
            a(gvv1);
        }

        return null;
    }

    public Bitmap a(gvo gvo)
    {
        gvv gvv1 = (gvv)a.get(gvo);
        if (gvv1 == null)
        {
            gvv1 = new gvv(gvo);
            a.put(gvo, gvv1);
            gvo = gvv1;
        } else
        {
            a(gvv1);
            gvo = gvv1;
        }
        gvo.b = b;
        gvo.a = b.a;
        ((gvv) (gvo)).a.b = gvo;
        b.a = gvo;
        return gvo.b();
    }

    public void a(gvo gvo, Bitmap bitmap)
    {
        gvv gvv2 = (gvv)a.get(gvo);
        gvv gvv1 = gvv2;
        if (gvv2 == null)
        {
            gvv1 = new gvv(gvo);
            a.put(gvo, gvv1);
            gvv1.b = b.b;
            gvv1.a = b;
            gvv1.b.a = gvv1;
            b.b = gvv1;
        }
        gvv1.a(bitmap);
    }

    public String toString()
    {
        gvv gvv1 = b.a;
        String s = "GroupedLinkedMap(";
        Object obj = s;
        if (!a.isEmpty())
        {
            for (obj = gvv1; obj != b; obj = ((gvv) (obj)).a)
            {
                s = String.valueOf(s);
                String s1 = String.valueOf(((gvv) (obj)).c);
                int i = ((gvv) (obj)).a();
                s = (new StringBuilder(String.valueOf(s).length() + 16 + String.valueOf(s1).length())).append(s).append("{").append(s1).append(", ").append(i).append("} ").toString();
            }

            obj = s.substring(0, s.length() - 1);
        }
        return String.valueOf(obj).concat(")");
    }
}
