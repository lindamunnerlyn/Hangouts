// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class giv extends Enum
{

    public static final giv a;
    public static final giv b;
    public static final giv c;
    public static final giv d;
    private static final giv e[];

    private giv(String s, int i)
    {
        super(s, i);
    }

    public static giv valueOf(String s)
    {
        return (giv)Enum.valueOf(giv, s);
    }

    public static giv[] values()
    {
        return (giv[])e.clone();
    }

    static 
    {
        a = new giv("SPEAKERPHONE", 0);
        b = new giv("EARPIECE", 1);
        c = new giv("BLUETOOTH_HEADSET", 2);
        d = new giv("WIRED_HEADSET", 3);
        e = (new giv[] {
            a, b, c, d
        });
    }
}
