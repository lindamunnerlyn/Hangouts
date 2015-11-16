// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bxi extends Enum
{

    public static final bxi a;
    public static final bxi b;
    public static final bxi c;
    public static final bxi d;
    public static final bxi e;
    public static final bxi f;
    private static final bxi g[];

    private bxi(String s, int i)
    {
        super(s, i);
    }

    public static bxi valueOf(String s)
    {
        return (bxi)Enum.valueOf(bxi, s);
    }

    public static bxi[] values()
    {
        return (bxi[])g.clone();
    }

    static 
    {
        a = new bxi("INVITE", 0);
        b = new bxi("VIDEO_CALL", 1);
        c = new bxi("AUDIO_CALL", 2);
        d = new bxi("STICKER", 3);
        e = new bxi("EDIT_PARTICIPANTS", 4);
        f = new bxi("PEOPLE_LIST", 5);
        g = (new bxi[] {
            a, b, c, d, e, f
        });
    }
}
