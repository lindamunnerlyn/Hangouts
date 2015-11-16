// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gtl extends Enum
{

    public static final gtl a;
    public static final gtl b;
    public static final gtl c;
    private static final gtl d[];

    private gtl(String s, int i)
    {
        super(s, i);
    }

    public static gtl valueOf(String s)
    {
        return (gtl)Enum.valueOf(gtl, s);
    }

    public static gtl[] values()
    {
        return (gtl[])d.clone();
    }

    static 
    {
        a = new gtl("LOADING", 0);
        b = new gtl("LOADED", 1);
        c = new gtl("EMPTY", 2);
        d = (new gtl[] {
            a, b, c
        });
    }
}
