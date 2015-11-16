// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class bbl
    implements bbh
{

    final Context a;
    final bbk b;

    bbl(bbk bbk, Context context)
    {
        b = bbk;
        a = context;
        super();
    }

    public int a()
    {
        return g.kP;
    }

    public boolean a(aoa aoa)
    {
        aoa = (bdz)hlp.a(a, bdz);
        return android.os.Build.VERSION.SDK_INT >= 16 && !aoa.a();
    }

    public bab b()
    {
        return null;
    }

    public Class c()
    {
        return bbi;
    }
}
