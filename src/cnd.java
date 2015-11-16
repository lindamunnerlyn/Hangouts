// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cnd extends Enum
{

    public static final cnd a;
    public static final cnd b;
    public static final cnd c;
    public static final cnd d;
    public static final cnd e;
    public static final cnd f;
    public static final cnd g;
    public static final cnd h;
    private static final cnd i[];

    private cnd(String s, int j)
    {
        super(s, j);
    }

    public static cnd valueOf(String s)
    {
        return (cnd)Enum.valueOf(cnd, s);
    }

    public static cnd[] values()
    {
        return (cnd[])i.clone();
    }

    static 
    {
        a = new cnd("CREATE_NEW_GROUP_CONVERSATION", 0);
        b = new cnd("FORK_CONVERSATION", 1);
        c = new cnd("UPGRADE_TO_GROUPCHAT", 2);
        d = new cnd("INVITE_MORE_TO_GROUPCHAT", 3);
        e = new cnd("INVITE_MORE_TO_HANGOUT", 4);
        f = new cnd("INVITE_GAIA_IDS_TO_HANGOUT", 5);
        g = new cnd("CREATE_NEW_HANGOUT", 6);
        h = new cnd("CREATE_NEW_ONE_ON_ONE", 7);
        i = (new cnd[] {
            a, b, c, d, e, f, g, h
        });
    }
}
