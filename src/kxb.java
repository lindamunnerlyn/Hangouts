// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Picture;
import android.graphics.RectF;

public final class kxb
{

    private Picture a;
    private RectF b;
    private RectF c;

    kxb(Picture picture, RectF rectf)
    {
        c = null;
        a = picture;
        b = rectf;
    }

    public Picture a()
    {
        return a;
    }

    void a(RectF rectf)
    {
        c = rectf;
    }
}
