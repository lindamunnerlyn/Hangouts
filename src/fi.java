// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;

class fi extends fh
{

    fi()
    {
    }

    public void a(Drawable drawable, boolean flag)
    {
        drawable.setAutoMirrored(flag);
    }

    public boolean b(Drawable drawable)
    {
        return drawable.isAutoMirrored();
    }

    public Drawable c(Drawable drawable)
    {
        Object obj = drawable;
        if (!(drawable instanceof fp))
        {
            obj = new fp(drawable);
        }
        return ((Drawable) (obj));
    }
}
