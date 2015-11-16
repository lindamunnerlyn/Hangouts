// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

public final class abk
{

    public Drawable a;
    public Bitmap b;
    public int c;

    public abk()
    {
    }

    public Drawable a(Resources resources)
    {
        if (resources == null)
        {
            throw new IllegalArgumentException("resources can not be null!");
        }
        if (a != null)
        {
            return a;
        }
        if (b == null)
        {
            return null;
        } else
        {
            return new BitmapDrawable(resources, b);
        }
    }
}
