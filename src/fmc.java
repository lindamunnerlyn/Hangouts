// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fmc
{

    public static final fmc a = new fmc();
    private boolean b;
    private int c;

    public fmc()
    {
        c = 0;
    }

    public fmc a(boolean flag)
    {
        b = flag;
        return this;
    }

    public boolean a()
    {
        return b;
    }

    public int b()
    {
        return c;
    }

    public String toString()
    {
        return g.a(new Object[] {
            "mIncludePlusPages", Boolean.valueOf(b), "mSortOrder", Integer.valueOf(c)
        });
    }

}
