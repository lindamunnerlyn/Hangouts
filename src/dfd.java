// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dfd extends Enum
{

    public static final dfd a;
    public static final dfd b;
    public static final dfd c;
    public static final dfd d;
    public static final dfd e;
    private static final dfd f[];

    private dfd(String s, int i)
    {
        super(s, i);
    }

    public static dfd valueOf(String s)
    {
        return (dfd)Enum.valueOf(dfd, s);
    }

    public static dfd[] values()
    {
        return (dfd[])f.clone();
    }

    static 
    {
        a = new dfd("NONE", 0);
        b = new dfd("DEFERRED", 1);
        c = new dfd("SILENT", 2);
        d = new dfd("DISPLAYONLY", 3);
        e = new dfd("LOUD", 4);
        f = (new dfd[] {
            a, b, c, d, e
        });
    }
}
