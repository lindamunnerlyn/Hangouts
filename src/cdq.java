// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cdq extends Enum
{

    public static final cdq a;
    public static final cdq b;
    public static final cdq c;
    public static final cdq d;
    private static final cdq f[];
    private final boolean e;

    private cdq(String s, int i, boolean flag)
    {
        super(s, i);
        e = flag;
    }

    public static cdq valueOf(String s)
    {
        return (cdq)Enum.valueOf(cdq, s);
    }

    public static cdq[] values()
    {
        return (cdq[])f.clone();
    }

    public boolean a()
    {
        return e;
    }

    static 
    {
        a = new cdq("UNKNOWN", 0, true);
        b = new cdq("DISCONNECTED", 1, false);
        c = new cdq("CAPTIVE_PORTAL", 2, false);
        d = new cdq("CONNECTED", 3, true);
        f = (new cdq[] {
            a, b, c, d
        });
    }
}
