// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

final class vi extends va
{

    private final vk a;

    public vi(Resources resources, vk vk1)
    {
        super(resources);
        a = vk1;
    }

    public Drawable getDrawable(int i)
    {
        Drawable drawable = super.getDrawable(i);
        if (drawable != null)
        {
            a.a(i, drawable);
        }
        return drawable;
    }
}
