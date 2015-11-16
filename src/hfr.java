// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hfr extends Enum
{

    public static final hfr a;
    public static final hfr b;
    public static final hfr c;
    public static final hfr d;
    private static final hfr e[];

    private hfr(String s, int i)
    {
        super(s, i);
    }

    public static hfr valueOf(String s)
    {
        return (hfr)Enum.valueOf(hfr, s);
    }

    public static hfr[] values()
    {
        return (hfr[])e.clone();
    }

    static 
    {
        a = new hfr("STANDARD", 0);
        b = new hfr("FULL", 1);
        c = new hfr("USE_MANUAL_UPLOAD_SERVER_SETTING", 2);
        d = new hfr("NO_POLICY", 3);
        e = (new hfr[] {
            a, b, c, d
        });
    }
}
