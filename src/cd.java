// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;

public final class cd extends cr
{

    Bitmap a;
    Bitmap b;
    boolean c;

    public cd()
    {
    }

    public cd(cf cf1)
    {
        a(cf1);
    }

    public cd a(Bitmap bitmap)
    {
        a = bitmap;
        return this;
    }

    public cd a(CharSequence charsequence)
    {
        f = cf.d(charsequence);
        g = true;
        return this;
    }
}
