// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.Map;

final class hae
{

    private final Map a = new HashMap();
    private final haf b = new haf(null);

    hae()
    {
    }

    private static void a(haf haf1)
    {
        haf1.a.b = haf1.b;
        haf1.b.a = haf1.a;
    }

    public Bitmap a()
    {
        for (haf haf1 = b.b; haf1 != b; haf1 = haf1.b)
        {
            if (haf1.a() > 0)
            {
                return haf1.b();
            }
            a.remove(haf1.c);
            a(haf1);
        }

        return null;
    }

    public Bitmap a(gzy gzy)
    {
        haf haf1 = (haf)a.get(gzy);
        if (haf1 == null)
        {
            haf1 = new haf(gzy);
            a.put(gzy, haf1);
            gzy = haf1;
        } else
        {
            a(haf1);
            gzy = haf1;
        }
        gzy.b = b;
        gzy.a = b.a;
        ((haf) (gzy)).a.b = gzy;
        b.a = gzy;
        return gzy.b();
    }

    public void a(gzy gzy, Bitmap bitmap)
    {
        haf haf2 = (haf)a.get(gzy);
        haf haf1 = haf2;
        if (haf2 == null)
        {
            haf1 = new haf(gzy);
            a.put(gzy, haf1);
            haf1.b = b.b;
            haf1.a = b;
            haf1.b.a = haf1;
            b.b = haf1;
        }
        haf1.a(bitmap);
    }

    public String toString()
    {
        haf haf1 = b.a;
        String s = "GroupedLinkedMap(";
        Object obj = s;
        if (!a.isEmpty())
        {
            for (obj = haf1; obj != b; obj = ((haf) (obj)).a)
            {
                s = String.valueOf(s);
                String s1 = String.valueOf(((haf) (obj)).c);
                int i = ((haf) (obj)).a();
                s = (new StringBuilder(String.valueOf(s).length() + 16 + String.valueOf(s1).length())).append(s).append("{").append(s1).append(", ").append(i).append("} ").toString();
            }

            obj = s.substring(0, s.length() - 1);
        }
        return String.valueOf(obj).concat(")");
    }
}
