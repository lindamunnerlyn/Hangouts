// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.LinkedHashMap;
import java.util.Map;

public final class agz
{

    private final String a;
    private final String b;
    private int c;
    private String d;
    private String e;
    private int f;
    private int g;
    private int h;
    private int i;
    private Map j;
    private ahc k;
    private String l;
    private String m;

    public agz()
    {
        a = String.format("Android %s", new Object[] {
            android.os.Build.VERSION.RELEASE
        });
        b = android.os.Build.VERSION.SDK;
        c = 3;
        d = "_s";
        e = "https://csi.gstatic.com/csi";
        f = 16;
        g = 3;
        h = 1;
        i = 1;
        j = new LinkedHashMap();
    }

    public int a()
    {
        return c;
    }

    public agz a(String s)
    {
        d = s;
        return this;
    }

    public agz b(String s)
    {
        e = s;
        return this;
    }

    public String b()
    {
        return d;
    }

    public String c()
    {
        return e;
    }

    public int d()
    {
        return f;
    }

    public int e()
    {
        return g;
    }

    public int f()
    {
        return h;
    }

    public int g()
    {
        return i;
    }

    public Map h()
    {
        return j;
    }

    public ahc i()
    {
        if (k == null)
        {
            k = new ahc(l, m);
        }
        return k;
    }
}
