// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dqc extends Enum
{

    public static final dqc a;
    public static final dqc b;
    public static final dqc c;
    public static final dqc d;
    public static final dqc e;
    public static final dqc f;
    public static final dqc g;
    public static final dqc h;
    public static final dqc i;
    public static final dqc j;
    public static final dqc k;
    public static final dqc l;
    public static final dqc m;
    public static final dqc n;
    public static final dqc o;
    public static final dqc p;
    public static final dqc q;
    public static final dqc r;
    private static final dqc s[];

    private dqc(String s1, int i1)
    {
        super(s1, i1);
    }

    public static dqc valueOf(String s1)
    {
        return (dqc)Enum.valueOf(dqc, s1);
    }

    public static dqc[] values()
    {
        return (dqc[])s.clone();
    }

    static 
    {
        a = new dqc("LOCATION_REQUEST_RECEIVER", 0);
        b = new dqc("OUTGOING_USER_MESSAGE", 1);
        c = new dqc("INCOMING_USER_MESSAGE", 2);
        d = new dqc("CONVERSATION_RENAME", 3);
        e = new dqc("MEMBERSHIP_CHANGE_DEPRECATED", 4);
        f = new dqc("ERROR", 5);
        g = new dqc("UNKNOWN", 6);
        h = new dqc("HANGOUT_START_EVENT", 7);
        i = new dqc("HANGOUT_STOP_EVENT", 8);
        j = new dqc("OFF_THE_RECORD", 9);
        k = new dqc("ON_THE_RECORD", 10);
        l = new dqc("MEMBERSHIP_CHANGE_LEAVE", 11);
        m = new dqc("MEMBERSHIP_CHANGE_JOIN", 12);
        n = new dqc("ERROR_FORK", 13);
        o = new dqc("MEMBERSHIP_CHANGE_LEAVE_FORCE_OTR_CONFLICT", 14);
        p = new dqc("ERROR_FORCE_OTR_CONFLICT", 15);
        q = new dqc("SMART_LOCATION_SUGGESTION", 16);
        r = new dqc("LOCATION_REQUEST_SENDER", 17);
        s = (new dqc[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r
        });
    }
}
