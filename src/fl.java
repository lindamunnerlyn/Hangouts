// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;

final class fl extends fk
{

    fl()
    {
    }

    public void b(Drawable drawable, int i)
    {
        drawable.setLayoutDirection(i);
    }

    public int d(Drawable drawable)
    {
        return drawable.getLayoutDirection();
    }
}
