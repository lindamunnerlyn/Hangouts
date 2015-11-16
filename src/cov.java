// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cov extends Enum
{

    public static final cov a;
    public static final cov b;
    public static final cov c;
    public static final cov d;
    public static final cov e;
    public static final cov f;
    public static final cov g;
    public static final cov h;
    private static final cov i[];

    private cov(String s, int j)
    {
        super(s, j);
    }

    public static cov valueOf(String s)
    {
        return (cov)Enum.valueOf(cov, s);
    }

    public static cov[] values()
    {
        return (cov[])i.clone();
    }

    static 
    {
        a = new cov("CREATE_NEW_GROUP_CONVERSATION", 0);
        b = new cov("FORK_CONVERSATION", 1);
        c = new cov("UPGRADE_TO_GROUPCHAT", 2);
        d = new cov("INVITE_MORE_TO_GROUPCHAT", 3);
        e = new cov("INVITE_MORE_TO_HANGOUT", 4);
        f = new cov("INVITE_GAIA_IDS_TO_HANGOUT", 5);
        g = new cov("CREATE_NEW_HANGOUT", 6);
        h = new cov("CREATE_NEW_ONE_ON_ONE", 7);
        i = (new cov[] {
            a, b, c, d, e, f, g, h
        });
    }
}
