// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;

class fg extends ff
{

    fg()
    {
    }

    public void a(Drawable drawable)
    {
        drawable.jumpToCurrentState();
    }

    public Drawable c(Drawable drawable)
    {
        Object obj = drawable;
        if (!(drawable instanceof fo))
        {
            obj = new fo(drawable);
        }
        return ((Drawable) (obj));
    }
}
