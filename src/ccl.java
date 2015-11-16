// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ccl extends Enum
{

    public static final ccl a;
    public static final ccl b;
    public static final ccl c;
    public static final ccl d;
    private static final ccl f[];
    private final boolean e;

    private ccl(String s, int i, boolean flag)
    {
        super(s, i);
        e = flag;
    }

    public static ccl valueOf(String s)
    {
        return (ccl)Enum.valueOf(ccl, s);
    }

    public static ccl[] values()
    {
        return (ccl[])f.clone();
    }

    public boolean a()
    {
        return e;
    }

    static 
    {
        a = new ccl("UNKNOWN", 0, true);
        b = new ccl("DISCONNECTED", 1, false);
        c = new ccl("CAPTIVE_PORTAL", 2, false);
        d = new ccl("CONNECTED", 3, true);
        f = (new ccl[] {
            a, b, c, d
        });
    }
}
