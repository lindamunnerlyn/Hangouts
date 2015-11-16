// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gly extends Enum
{

    public static final gly a;
    public static final gly b;
    public static final gly c;
    public static final gly d;
    public static final gly e;
    public static final gly f;
    private static final gly g[];

    private gly(String s, int i)
    {
        super(s, i);
    }

    public static gly valueOf(String s)
    {
        return (gly)Enum.valueOf(gly, s);
    }

    public static gly[] values()
    {
        return (gly[])g.clone();
    }

    static 
    {
        a = new gly("SPEAKERPHONE_ON", 0);
        b = new gly("EARPIECE_ON", 1);
        c = new gly("WIRED_HEADSET_ON", 2);
        d = new gly("BLUETOOTH_ON", 3);
        e = new gly("BLUETOOTH_TURNING_ON", 4);
        f = new gly("BLUETOOTH_TURNING_OFF", 5);
        g = (new gly[] {
            a, b, c, d, e, f
        });
    }
}
