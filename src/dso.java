// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class dso
{

    private dsn a;

    public dso(Context context)
    {
        a = new dsn(context);
    }

    public dsn a()
    {
        return a;
    }

    public dso a(long l)
    {
        a.a = l;
        return this;
    }

    public dso a(dsu dsu)
    {
        a.e = dsu;
        return this;
    }

    public dso a(String s)
    {
        a.b = s;
        return this;
    }

    public dso b(String s)
    {
        a.c = s;
        return this;
    }

    public dso c(String s)
    {
        a.d = s;
        return this;
    }
}
