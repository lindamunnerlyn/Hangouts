// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cfq extends Enum
{

    public static final cfq a;
    public static final cfq b;
    public static final cfq c;
    public static final cfq d;
    private static final cfq e[];

    private cfq(String s, int i)
    {
        super(s, i);
    }

    public static cfq valueOf(String s)
    {
        return (cfq)Enum.valueOf(cfq, s);
    }

    public static cfq[] values()
    {
        return (cfq[])e.clone();
    }

    static 
    {
        a = new cfq("LOCAL_SMS", 0);
        b = new cfq("MESSAGE", 1);
        c = new cfq("GV_SMS", 2);
        d = new cfq("GV_VOICEMAIL", 3);
        e = (new cfq[] {
            a, b, c, d
        });
    }
}
