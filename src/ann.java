// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ann extends Enum
{

    public static final ann a;
    public static final ann b;
    public static final ann c;
    private static final ann d[];

    private ann(String s, int i)
    {
        super(s, i);
    }

    public static ann valueOf(String s)
    {
        return (ann)Enum.valueOf(ann, s);
    }

    public static ann[] values()
    {
        return (ann[])d.clone();
    }

    static 
    {
        a = new ann("NONE", 0);
        b = new ann("CARRIER", 1);
        c = new ann("GV", 2);
        d = (new ann[] {
            a, b, c
        });
    }
}
