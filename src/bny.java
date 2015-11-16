// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bny extends Enum
{

    public static final bny a;
    public static final bny b;
    public static final bny c;
    public static final bny d;
    private static final bny e[];

    private bny(String s, int i)
    {
        super(s, i);
    }

    public static bny valueOf(String s)
    {
        return (bny)Enum.valueOf(bny, s);
    }

    public static bny[] values()
    {
        return (bny[])e.clone();
    }

    static 
    {
        a = new bny("NONE", 0);
        b = new bny("OUTGOING_AUDIO", 1);
        c = new bny("OUTGOING_VIDEO", 2);
        d = new bny("STILL_JOINING", 3);
        e = (new bny[] {
            a, b, c, d
        });
    }
}
