// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class apk extends Enum
{

    public static final apk a;
    public static final apk b;
    public static final apk c;
    public static final apk d;
    public static final apk e;
    public static final apk f;
    public static final apk g;
    private static final apk h[];

    private apk(String s, int i)
    {
        super(s, i);
    }

    public static apk valueOf(String s)
    {
        return (apk)Enum.valueOf(apk, s);
    }

    public static apk[] values()
    {
        return (apk[])h.clone();
    }

    static 
    {
        a = new apk("LOCATION_SHARING", 0);
        b = new apk("GOOGLE_VOICE", 1);
        c = new apk("CHANGE_INVITE_SETTINGS", 2);
        d = new apk("HANGOUTS_ON_AIR", 3);
        e = new apk("GOOGLE_PLUS", 4);
        f = new apk("PHOTO_SHARING", 5);
        g = new apk("GROUP_CONVERSATIONS", 6);
        h = (new apk[] {
            a, b, c, d, e, f, g
        });
    }
}
