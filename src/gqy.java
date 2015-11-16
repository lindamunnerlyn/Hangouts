// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gqy extends Enum
{

    public static final gqy a;
    private static final gqy b[];

    private gqy(String s)
    {
        super(s, 0);
    }

    public static gqy valueOf(String s)
    {
        return (gqy)Enum.valueOf(gqy, s);
    }

    public static gqy[] values()
    {
        return (gqy[])b.clone();
    }

    static 
    {
        a = new gqy("ALLOWED");
        b = (new gqy[] {
            a
        });
    }
}
