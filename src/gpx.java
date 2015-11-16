// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gpx extends Enum
{

    public static final gpx a;
    public static final gpx b;
    public static final gpx c;
    public static final gpx d;
    private static final gpx e[];

    private gpx(String s, int i)
    {
        super(s, i);
    }

    public static gpx valueOf(String s)
    {
        return (gpx)Enum.valueOf(gpx, s);
    }

    public static gpx[] values()
    {
        return (gpx[])e.clone();
    }

    static 
    {
        a = new gpx("FROM_NUMBER_WITH_PLUS_SIGN", 0);
        b = new gpx("FROM_NUMBER_WITH_IDD", 1);
        c = new gpx("FROM_NUMBER_WITHOUT_PLUS_SIGN", 2);
        d = new gpx("FROM_DEFAULT_COUNTRY", 3);
        e = (new gpx[] {
            a, b, c, d
        });
    }
}
