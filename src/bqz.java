// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bqz extends Enum
{

    public static final bqz a;
    public static final bqz b;
    public static final bqz c;
    private static final bqz d[];

    private bqz(String s, int i)
    {
        super(s, i);
    }

    public static bqz valueOf(String s)
    {
        return (bqz)Enum.valueOf(bqz, s);
    }

    public static bqz[] values()
    {
        return (bqz[])d.clone();
    }

    static 
    {
        a = new bqz("NONE", 0);
        b = new bqz("SELF_MENU", 1);
        c = new bqz("PARTICIPANT_TRAY", 2);
        d = (new bqz[] {
            a, b, c
        });
    }
}
