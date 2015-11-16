// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.SortedSet;

final class gvs
    implements gvn
{

    private static final gvp a = new gvt();

    gvs()
    {
    }

    public gvo a(int i, int j)
    {
        return new gvo(i, j, a);
    }

    public gvo a(Bitmap bitmap)
    {
        return a(bitmap.getWidth(), bitmap.getHeight());
    }

    public gvo a(gvo gvo1, SortedSet sortedset, gvq gvq1)
    {
        for (sortedset = sortedset.iterator(); sortedset.hasNext();)
        {
            gvo gvo2 = (gvo)sortedset.next();
            if (gvo2.b >= gvo1.b && gvo2.a >= gvo1.a && (gvq1 == gvq.b || gvo2.b == gvo1.b && gvo2.a == gvo1.a))
            {
                return gvo2;
            }
        }

        return null;
    }

    public void a(gvo gvo1, Bitmap bitmap)
    {
    }

}
