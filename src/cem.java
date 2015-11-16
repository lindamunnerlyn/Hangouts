// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cem extends Enum
{

    public static final cem a;
    public static final cem b;
    public static final cem c;
    private static final cem d[];

    private cem(String s, int i)
    {
        super(s, i);
    }

    public static cem valueOf(String s)
    {
        return (cem)Enum.valueOf(cem, s);
    }

    public static cem[] values()
    {
        return (cem[])d.clone();
    }

    static 
    {
        a = new cem("MESSAGES", 0);
        b = new cem("HANGOUTS", 1);
        c = new cem("ERRORS", 2);
        d = (new cem[] {
            a, b, c
        });
    }
}
