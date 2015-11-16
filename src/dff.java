// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;

abstract class dff extends bgs
{

    public final int d;
    private final Context e;
    private final dfg f;
    private final int g;

    public dff(Context context, int i, dfg dfg1, int j)
    {
        e = context;
        d = i;
        f = dfg1;
        g = j;
    }

    public String a()
    {
        return e.getResources().getString(g);
    }

    protected void a(did did)
    {
        super.a(did);
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
