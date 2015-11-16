// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class atp extends Enum
{

    public static final atp a;
    public static final atp b;
    public static final atp c;
    public static final atp d;
    public static final atp e;
    private static final atp f[];

    private atp(String s, int i)
    {
        super(s, i);
    }

    public static atp valueOf(String s)
    {
        return (atp)Enum.valueOf(atp, s);
    }

    public static atp[] values()
    {
        return (atp[])f.clone();
    }

    static 
    {
        a = new atp("NONE", 0);
        b = new atp("PHOTO", 1);
        c = new atp("VIDEO", 2);
        d = new atp("STICKER", 3);
        e = new atp("LOCATION", 4);
        f = (new atp[] {
            a, b, c, d, e
        });
    }
}
