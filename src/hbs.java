// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hbs extends Enum
{

    public static final hbs a;
    private static final hbs b[];

    private hbs(String s)
    {
        super(s, 0);
    }

    public static hbs valueOf(String s)
    {
        return (hbs)Enum.valueOf(hbs, s);
    }

    public static hbs[] values()
    {
        return (hbs[])b.clone();
    }

    static 
    {
        a = new hbs("ALLOWED");
        b = (new hbs[] {
            a
        });
    }
}
