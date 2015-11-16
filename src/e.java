// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.os.Bundle;

public class e
    implements ch
{

    private static final String a = e.getSimpleName();
    private Bitmap b;
    private g c;
    private int d;

    public e()
    {
        d = 0;
    }

    public cf a(cf cf1)
    {
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            return cf1;
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putParcelable("large_icon", b);
            bundle.putInt("app_color", d);
            bundle.putBundle("car_conversation", g.a(c));
            cf1.f().putBundle("android.car.EXTENSIONS", bundle);
            return cf1;
        }
    }

    public e a(int i)
    {
        d = i;
        return this;
    }

    public e a(g g1)
    {
        c = g1;
        return this;
    }

}
