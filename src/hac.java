// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.SortedSet;

final class hac
    implements gzx
{

    private static final gzz a = new had();

    hac()
    {
    }

    public gzy a(int i, int j)
    {
        return new gzy(i, j, a);
    }

    public gzy a(Bitmap bitmap)
    {
        return a(bitmap.getWidth(), bitmap.getHeight());
    }

    public gzy a(gzy gzy1, SortedSet sortedset, haa haa1)
    {
        for (sortedset = sortedset.iterator(); sortedset.hasNext();)
        {
            gzy gzy2 = (gzy)sortedset.next();
            if (gzy2.b >= gzy1.b && gzy2.a >= gzy1.a && (haa1 == haa.b || gzy2.b == gzy1.b && gzy2.a == gzy1.a))
            {
                return gzy2;
            }
        }

        return null;
    }

    public void a(gzy gzy1, Bitmap bitmap)
    {
    }

}
