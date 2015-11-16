// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.net.Uri;

public final class bpj
{

    private final String a;
    private final int b;
    private int c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private PendingIntent m;
    private Uri n;

    public bpj(String s, int i1)
    {
        c = 1;
        a = s;
        b = i1;
    }

    public bph a()
    {
        return new bph(a, b, c, d, e, f, g, h, i, j, k, l, m, n);
    }

    public bpj a(int i1)
    {
        c = i1;
        return this;
    }

    public bpj a(String s)
    {
        d = s;
        return this;
    }

    public bpj b(String s)
    {
        e = s;
        return this;
    }

    public bpj c(String s)
    {
        f = s;
        return this;
    }

    public bpj d(String s)
    {
        g = s;
        return this;
    }

    public bpj e(String s)
    {
        h = s;
        return this;
    }

    public bpj f(String s)
    {
        i = s;
        return this;
    }

    public bpj g(String s)
    {
        j = s;
        return this;
    }

    public bpj h(String s)
    {
        k = s;
        return this;
    }

    public bpj i(String s)
    {
        l = s;
        return this;
    }
}
