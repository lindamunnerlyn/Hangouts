// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class atd extends Enum
{

    public static final atd a;
    public static final atd b;
    public static final atd c;
    public static final atd d;
    private static final atd e[];

    private atd(String s, int i)
    {
        super(s, i);
    }

    public static atd valueOf(String s)
    {
        return (atd)Enum.valueOf(atd, s);
    }

    public static atd[] values()
    {
        return (atd[])e.clone();
    }

    static 
    {
        a = new atd("HANGOUTS_MESSAGE", 0);
        b = new atd("SMS_MESSAGE", 1);
        c = new atd("AUDIO_CALL", 2);
        d = new atd("VIDEO_CALL", 3);
        e = (new atd[] {
            a, b, c, d
        });
    }
}
