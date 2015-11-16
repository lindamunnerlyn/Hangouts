// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dqb extends Enum
{

    public static final dqb a;
    public static final dqb b;
    public static final dqb c;
    public static final dqb d;
    public static final dqb e;
    public static final dqb f;
    public static final dqb g;
    private static final dqb h[];

    private dqb(String s, int i)
    {
        super(s, i);
    }

    public static dqb valueOf(String s)
    {
        return (dqb)Enum.valueOf(dqb, s);
    }

    public static dqb[] values()
    {
        return (dqb[])h.clone();
    }

    static 
    {
        a = new dqb("UNKNOWN", 0);
        b = new dqb("QUEUED", 1);
        c = new dqb("SENDING", 2);
        d = new dqb("FAILED_TO_SEND", 3);
        e = new dqb("ON_SERVER", 4);
        f = new dqb("PENDING_DELETE", 5);
        g = new dqb("LOCAL_SYSTEM_MESSAGE", 6);
        h = (new dqb[] {
            a, b, c, d, e, f, g
        });
    }
}
