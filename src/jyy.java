// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jyy extends Enum
{

    public static final jyy a;
    private static final jyy b[];

    private jyy(String s)
    {
        super(s, 0);
    }

    public static jyy valueOf(String s)
    {
        return (jyy)Enum.valueOf(jyy, s);
    }

    public static jyy[] values()
    {
        return (jyy[])b.clone();
    }

    static 
    {
        a = new jyy("APPEND");
        b = (new jyy[] {
            a
        });
    }
}
