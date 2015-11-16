// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.os.Bundle;

public class gcb
    implements gbu
{

    fdf a;

    public gcb()
    {
        a = new fdf();
    }

    public gbt a()
    {
        return new gbt(a.a());
    }

    public gbu a(Bitmap bitmap)
    {
        a.a(bitmap);
        return this;
    }

    public gbu a(Bundle bundle)
    {
        a.a(bundle);
        return this;
    }

    public gbu a(String s)
    {
        a.a(s);
        return this;
    }

    public gbu a(String s, String s1)
    {
        a.a(s, s1);
        return this;
    }

    public gbu b(String s)
    {
        a.b(s);
        return this;
    }

    public gbu c(String s)
    {
        a.c(s);
        return this;
    }
}
