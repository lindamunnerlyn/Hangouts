// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dsv extends Enum
{

    public static final dsv a;
    public static final dsv b;
    public static final dsv c;
    public static final dsv d;
    public static final dsv e;
    public static final dsv f;
    public static final dsv g;
    public static final dsv h;
    public static final dsv i;
    public static final dsv j;
    public static final dsv k;
    public static final dsv l;
    public static final dsv m;
    public static final dsv n;
    public static final dsv o;
    public static final dsv p;
    public static final dsv q;
    public static final dsv r;
    private static final dsv s[];

    private dsv(String s1, int i1)
    {
        super(s1, i1);
    }

    public static dsv valueOf(String s1)
    {
        return (dsv)Enum.valueOf(dsv, s1);
    }

    public static dsv[] values()
    {
        return (dsv[])s.clone();
    }

    static 
    {
        a = new dsv("LOCATION_REQUEST_RECEIVER", 0);
        b = new dsv("OUTGOING_USER_MESSAGE", 1);
        c = new dsv("INCOMING_USER_MESSAGE", 2);
        d = new dsv("CONVERSATION_RENAME", 3);
        e = new dsv("MEMBERSHIP_CHANGE_DEPRECATED", 4);
        f = new dsv("ERROR", 5);
        g = new dsv("UNKNOWN", 6);
        h = new dsv("HANGOUT_START_EVENT", 7);
        i = new dsv("HANGOUT_STOP_EVENT", 8);
        j = new dsv("OFF_THE_RECORD", 9);
        k = new dsv("ON_THE_RECORD", 10);
        l = new dsv("MEMBERSHIP_CHANGE_LEAVE", 11);
        m = new dsv("MEMBERSHIP_CHANGE_JOIN", 12);
        n = new dsv("ERROR_FORK", 13);
        o = new dsv("MEMBERSHIP_CHANGE_LEAVE_FORCE_OTR_CONFLICT", 14);
        p = new dsv("ERROR_FORCE_OTR_CONFLICT", 15);
        q = new dsv("SMART_LOCATION_SUGGESTION", 16);
        r = new dsv("LOCATION_REQUEST_SENDER", 17);
        s = (new dsv[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r
        });
    }
}
