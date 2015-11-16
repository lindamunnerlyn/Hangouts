// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aqc extends Enum
{

    public static final aqc a;
    public static final aqc b;
    public static final aqc c;
    public static final aqc d;
    public static final aqc e;
    public static final aqc f;
    public static final aqc g;
    private static final aqc h[];

    private aqc(String s, int i)
    {
        super(s, i);
    }

    public static aqc valueOf(String s)
    {
        return (aqc)Enum.valueOf(aqc, s);
    }

    public static aqc[] values()
    {
        return (aqc[])h.clone();
    }

    static 
    {
        a = new aqc("LOCATION_SHARING", 0);
        b = new aqc("GOOGLE_VOICE", 1);
        c = new aqc("CHANGE_INVITE_SETTINGS", 2);
        d = new aqc("HANGOUTS_ON_AIR", 3);
        e = new aqc("GOOGLE_PLUS", 4);
        f = new aqc("PHOTO_SHARING", 5);
        g = new aqc("GROUP_CONVERSATIONS", 6);
        h = (new aqc[] {
            a, b, c, d, e, f, g
        });
    }
}
