// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gxx extends Enum
{

    public static final gxx a;
    public static final gxx b;
    public static final gxx c;
    private static final gxx d[];

    private gxx(String s, int i)
    {
        super(s, i);
    }

    public static gxx valueOf(String s)
    {
        return (gxx)Enum.valueOf(gxx, s);
    }

    public static gxx[] values()
    {
        return (gxx[])d.clone();
    }

    static 
    {
        a = new gxx("LOADING", 0);
        b = new gxx("LOADED", 1);
        c = new gxx("EMPTY", 2);
        d = (new gxx[] {
            a, b, c
        });
    }
}
