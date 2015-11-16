// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;

public final class fme
{

    public static final fme a = new fme();
    private String b;
    private Collection c;
    private int d;
    private boolean e;
    private long f;
    private String g;
    private int h;
    private int i;
    private int j;

    public fme()
    {
        d = 0x1fffff;
        h = 7;
        i = 0;
    }

    public fme a()
    {
        e = true;
        return this;
    }

    public fme a(String s)
    {
        g = s;
        return this;
    }

    public fme a(Collection collection)
    {
        c = collection;
        return this;
    }

    public String b()
    {
        return b;
    }

    public Collection c()
    {
        return c;
    }

    public int d()
    {
        return d;
    }

    public boolean e()
    {
        return e;
    }

    public long f()
    {
        return f;
    }

    public String g()
    {
        return g;
    }

    public int h()
    {
        return h;
    }

    public int i()
    {
        return i;
    }

    public int j()
    {
        return j;
    }

    public String toString()
    {
        return g.a(new Object[] {
            "mCircleId", b, "mQualifiedIds", c, "mProjection", Integer.valueOf(d), "mPeopleOnly", Boolean.valueOf(e), "mChangedSince", Long.valueOf(f), 
            "mQuery", g, "mSearchFields", Integer.valueOf(h), "mSortOrder", Integer.valueOf(i), "mExtraColumns", Integer.valueOf(j)
        });
    }

}
