// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fow
{

    public static final fow a = new fow();
    private boolean b;
    private int c;

    public fow()
    {
        c = 0;
    }

    public boolean a()
    {
        return b;
    }

    public fow b()
    {
        b = true;
        return this;
    }

    public int c()
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
