// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import java.util.SortedSet;

final class hag
    implements gzx
{

    private static final gzz a = new hah();

    hag()
    {
    }

    public gzy a(int i, int j)
    {
        return new gzy(i, j, a);
    }

    public gzy a(Bitmap bitmap)
    {
        return new gzy(bitmap.getWidth(), bitmap.getHeight(), bitmap.getAllocationByteCount(), a);
    }

    public gzy a(gzy gzy1, SortedSet sortedset, haa haa)
    {
        if (!sortedset.isEmpty())
        {
            return (gzy)sortedset.first();
        } else
        {
            return null;
        }
    }

    public void a(gzy gzy1, Bitmap bitmap)
    {
        bitmap.reconfigure(gzy1.b, gzy1.a, android.graphics.Bitmap.Config.ARGB_8888);
    }

}
