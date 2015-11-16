// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class hfi
{

    final Context a;
    String b;
    String c;
    String d;
    hfk e;
    boolean f;
    hfr g;
    hen h;

    public hfi(Context context)
    {
        e = hfg.c();
        g = hfr.d;
        h = hen.a;
        g.d(context, "context must be non-null");
        a = context;
    }

    public hfg a()
    {
        g.a(b, "must specify an accountName");
        g.a(c, "must specify an accountGaiaId");
        return new hfg(this);
    }

    public hfi a(hfk hfk)
    {
        g.d(hfk, "progressListener must be non-null");
        e = hfk;
        return this;
    }

    public hfi a(String s)
    {
        b = s;
        return this;
    }

    public hfi b(String s)
    {
        c = s;
        return this;
    }

    public hfi c(String s)
    {
        d = s;
        return this;
    }
}
