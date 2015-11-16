// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class glx extends Enum
{

    public static final glx a;
    public static final glx b;
    public static final glx c;
    public static final glx d;
    private static final glx e[];

    private glx(String s, int i)
    {
        super(s, i);
    }

    public static glx valueOf(String s)
    {
        return (glx)Enum.valueOf(glx, s);
    }

    public static glx[] values()
    {
        return (glx[])e.clone();
    }

    static 
    {
        a = new glx("SPEAKERPHONE", 0);
        b = new glx("EARPIECE", 1);
        c = new glx("BLUETOOTH_HEADSET", 2);
        d = new glx("WIRED_HEADSET", 3);
        e = (new glx[] {
            a, b, c, d
        });
    }
}
