// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;

abstract class ddx extends bgg
{

    public final int d;
    private final Context e;
    private final ddy f;
    private final int g;

    public ddx(Context context, int i, ddy ddy1, int j)
    {
        e = context;
        d = i;
        f = ddy1;
        g = j;
    }

    public String a()
    {
        return e.getResources().getString(g);
    }

    protected void a(dgu dgu)
    {
        super.a(dgu);
        if (f != null)
        {
            f.a();
        }
    }

    protected void a(Exception exception)
    {
        super.a(exception);
        if (f != null)
        {
            f.b();
        }
    }

    public void c()
    {
    }

    public void d()
    {
    }
}
