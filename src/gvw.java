// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import java.util.SortedSet;

final class gvw
    implements gvn
{

    private static final gvp a = new gvx();

    gvw()
    {
    }

    public gvo a(int i, int j)
    {
        return new gvo(i, j, a);
    }

    public gvo a(Bitmap bitmap)
    {
        return new gvo(bitmap.getWidth(), bitmap.getHeight(), bitmap.getAllocationByteCount(), a);
    }

    public gvo a(gvo gvo1, SortedSet sortedset, gvq gvq)
    {
        if (!sortedset.isEmpty())
        {
            return (gvo)sortedset.first();
        } else
        {
            return null;
        }
    }

    public void a(gvo gvo1, Bitmap bitmap)
    {
        bitmap.reconfigure(gvo1.b, gvo1.a, android.graphics.Bitmap.Config.ARGB_8888);
    }

}
