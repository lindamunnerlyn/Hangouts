// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bqq extends Enum
{

    public static final bqq a;
    public static final bqq b;
    public static final bqq c;
    private static final bqq d[];

    private bqq(String s, int i)
    {
        super(s, i);
    }

    public static bqq valueOf(String s)
    {
        return (bqq)Enum.valueOf(bqq, s);
    }

    public static bqq[] values()
    {
        return (bqq[])d.clone();
    }

    static 
    {
        a = new bqq("NONE", 0);
        b = new bqq("SELF_MENU", 1);
        c = new bqq("PARTICIPANT_TRAY", 2);
        d = (new bqq[] {
            a, b, c
        });
    }
}
