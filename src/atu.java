// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class atu extends Enum
{

    public static final atu a;
    public static final atu b;
    public static final atu c;
    public static final atu d;
    private static final atu e[];

    private atu(String s, int i)
    {
        super(s, i);
    }

    public static atu valueOf(String s)
    {
        return (atu)Enum.valueOf(atu, s);
    }

    public static atu[] values()
    {
        return (atu[])e.clone();
    }

    static 
    {
        a = new atu("HANGOUTS_MESSAGE", 0);
        b = new atu("SMS_MESSAGE", 1);
        c = new atu("AUDIO_CALL", 2);
        d = new atu("VIDEO_CALL", 3);
        e = (new atu[] {
            a, b, c, d
        });
    }
}
