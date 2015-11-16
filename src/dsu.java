// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dsu extends Enum
{

    public static final dsu a;
    public static final dsu b;
    public static final dsu c;
    public static final dsu d;
    public static final dsu e;
    public static final dsu f;
    public static final dsu g;
    private static final dsu h[];

    private dsu(String s, int i)
    {
        super(s, i);
    }

    public static dsu valueOf(String s)
    {
        return (dsu)Enum.valueOf(dsu, s);
    }

    public static dsu[] values()
    {
        return (dsu[])h.clone();
    }

    static 
    {
        a = new dsu("UNKNOWN", 0);
        b = new dsu("QUEUED", 1);
        c = new dsu("SENDING", 2);
        d = new dsu("FAILED_TO_SEND", 3);
        e = new dsu("ON_SERVER", 4);
        f = new dsu("PENDING_DELETE", 5);
        g = new dsu("LOCAL_SYSTEM_MESSAGE", 6);
        h = (new dsu[] {
            a, b, c, d, e, f, g
        });
    }
}
