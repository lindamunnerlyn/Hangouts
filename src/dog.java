// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;

final class dog extends bgg
{

    final csv d;
    private final Context e;
    private final int f;
    private final het g;
    private final aqo h;
    private final String i;

    protected dog(Context context, int j, het het1, aqo aqo, csv csv, String s)
    {
        e = context;
        f = j;
        g = het1;
        h = aqo;
        i = s;
        d = csv;
    }

    public String a()
    {
        return e.getResources().getString(l.Z);
    }

    protected void a(dgu dgu)
    {
        super.a(dgu);
        aqm.b(f, h, d);
    }

    protected void a(Exception exception)
    {
        super.a(exception);
        g.a(i);
        g.b(g.f()[g.b(i)]);
    }

    public int b()
    {
        g.a(dbf.e(f), 1594);
        return aqm.a(f, h, d);
    }

    public void c()
    {
        if (!j())
        {
            ebr.a(e, l.ab);
            return;
        } else
        {
            ebr.a(e, l.aa);
            return;
        }
    }

    public void d()
    {
        ebr.a(e, l.ac);
    }

    public Class e()
    {
        return csu;
    }

    public Class f()
    {
        return cxz;
    }
}
