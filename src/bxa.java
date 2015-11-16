// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bxa extends Enum
{

    public static final bxa a;
    public static final bxa b;
    public static final bxa c;
    private static final bxa f[];
    public final int d;
    public final int e;

    private bxa(String s, int i, int j, int k)
    {
        super(s, i);
        d = j;
        e = k;
    }

    public static bxa valueOf(String s)
    {
        return (bxa)Enum.valueOf(bxa, s);
    }

    public static bxa[] values()
    {
        return (bxa[])f.clone();
    }

    static 
    {
        a = new bxa("CALL_JOINED", 0, 2594, 2598);
        b = new bxa("MESSAGE_RECEIVED", 1, 2593, 2597);
        c = new bxa("MESSAGE_SENT", 2, 2592, 2596);
        f = (new bxa[] {
            a, b, c
        });
    }
}
