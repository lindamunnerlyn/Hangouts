// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class bee extends guy
{

    private final Context a;
    private final aoa b;
    private final int c;
    private final String d;
    private final String g = aow.g();
    private final dgk h = new dgk();
    private final dcw i;

    public bee(Context context, aoa aoa1, String s, int j)
    {
        super(context, "ModifyOtrStatusTask");
        a = context;
        c = j;
        b = aoa1;
        d = s;
        i = dcn.g(aoa1);
    }

    protected gvv a()
    {
        aow aow1;
        aow1 = new aow(a, b.h());
        aow1.a();
        long l = aow1.O(d);
        (new dkt(d, b.b(), l, -1L, g, null, c, dsu.b)).c(aow1);
        aow1.b();
        aow1.c();
        if (!aow.a(d))
        {
            int j = aow1.A(d);
            i.a(new cwo(g, d, c, j), dir.b().a());
        }
        aoq.d(aow1, d);
        return new gvv(200, null, "");
        Exception exception;
        exception;
        aow1.c();
        throw exception;
    }
}
