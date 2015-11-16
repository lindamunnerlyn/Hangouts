// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bwr extends Enum
{

    public static final bwr a;
    public static final bwr b;
    public static final bwr c;
    public static final bwr d;
    public static final bwr e;
    public static final bwr f;
    private static final bwr g[];

    private bwr(String s, int i)
    {
        super(s, i);
    }

    public static bwr valueOf(String s)
    {
        return (bwr)Enum.valueOf(bwr, s);
    }

    public static bwr[] values()
    {
        return (bwr[])g.clone();
    }

    static 
    {
        a = new bwr("INVITE", 0);
        b = new bwr("VIDEO_CALL", 1);
        c = new bwr("AUDIO_CALL", 2);
        d = new bwr("STICKER", 3);
        e = new bwr("EDIT_PARTICIPANTS", 4);
        f = new bwr("PEOPLE_LIST", 5);
        g = (new bwr[] {
            a, b, c, d, e, f
        });
    }
}
