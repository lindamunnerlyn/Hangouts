// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bnq extends Enum
{

    public static final bnq a;
    public static final bnq b;
    public static final bnq c;
    public static final bnq d;
    private static final bnq e[];

    private bnq(String s, int i)
    {
        super(s, i);
    }

    public static bnq valueOf(String s)
    {
        return (bnq)Enum.valueOf(bnq, s);
    }

    public static bnq[] values()
    {
        return (bnq[])e.clone();
    }

    static 
    {
        a = new bnq("NONE", 0);
        b = new bnq("OUTGOING_AUDIO", 1);
        c = new bnq("OUTGOING_VIDEO", 2);
        d = new bnq("STILL_JOINING", 3);
        e = (new bnq[] {
            a, b, c, d
        });
    }
}
