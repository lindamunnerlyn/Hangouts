// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class bav
    implements bar
{

    final Context a;
    final bau b;

    bav(bau bau, Context context)
    {
        b = bau;
        a = context;
        super();
    }

    public int a()
    {
        return g.kX;
    }

    public boolean a(ani ani)
    {
        ani = (bdn)hgx.a(a, bdn);
        return android.os.Build.VERSION.SDK_INT >= 16 && !ani.a();
    }

    public azm b()
    {
        return null;
    }

    public Class c()
    {
        return bas;
    }
}
