// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fou
{

    public static final fou a = new fou();
    private boolean b;
    private String c;
    private boolean d;
    private int e;
    private int f;
    private String g;
    private boolean h;
    private int i;
    private int j;
    private int k;

    public fou()
    {
        e = 0x1fffff;
        i = 7;
        j = 3;
        k = 0;
    }

    public fou a(String s)
    {
        c = s;
        return this;
    }

    public boolean a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public boolean c()
    {
        return d;
    }

    public fou d()
    {
        d = true;
        return this;
    }

    public int e()
    {
        return e;
    }

    public int f()
    {
        return f;
    }

    public String g()
    {
        return g;
    }

    public boolean h()
    {
        return h;
    }

    public int i()
    {
        return k;
    }

    public String toString()
    {
        return g.a(new Object[] {
            "mIncludeInvisible", Boolean.valueOf(b), "mQuery", c, "mPeopleOnly", Boolean.valueOf(d), "mProjection", Integer.valueOf(e), "mExtraColumns", Integer.valueOf(f), 
            "mFilterGaiaId", g, "mIncludeEvergreenPeople", Boolean.valueOf(h), "mSearchFields", Integer.valueOf(i), "mFilterGaiaEdgeTypes", Integer.valueOf(j), "mSortOrder", Integer.valueOf(k)
        });
    }

}
