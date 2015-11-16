// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

public final class gg
{

    private boolean a;
    private int b;
    private gp c;

    public gg()
    {
        a = gf.a(Locale.getDefault());
        c = gf.b();
        b = 2;
    }

    public gf a()
    {
        if (b == 2 && c == gf.b())
        {
            if (a)
            {
                return gf.c();
            } else
            {
                return gf.d();
            }
        } else
        {
            return new gf(a, b, c);
        }
    }
}
