// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bwh extends Enum
{

    public static final bwh a;
    public static final bwh b;
    public static final bwh c;
    private static final bwh f[];
    public final int d;
    public final int e;

    private bwh(String s, int i, int j, int k)
    {
        super(s, i);
        d = j;
        e = k;
    }

    public static bwh valueOf(String s)
    {
        return (bwh)Enum.valueOf(bwh, s);
    }

    public static bwh[] values()
    {
        return (bwh[])f.clone();
    }

    static 
    {
        a = new bwh("CALL_JOINED", 0, 2594, 2598);
        b = new bwh("MESSAGE_RECEIVED", 1, 2593, 2597);
        c = new bwh("MESSAGE_SENT", 2, 2592, 2596);
        f = (new bwh[] {
            a, b, c
        });
    }
}
