// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class giw extends Enum
{

    public static final giw a;
    public static final giw b;
    public static final giw c;
    public static final giw d;
    public static final giw e;
    public static final giw f;
    private static final giw g[];

    private giw(String s, int i)
    {
        super(s, i);
    }

    public static giw valueOf(String s)
    {
        return (giw)Enum.valueOf(giw, s);
    }

    public static giw[] values()
    {
        return (giw[])g.clone();
    }

    static 
    {
        a = new giw("SPEAKERPHONE_ON", 0);
        b = new giw("EARPIECE_ON", 1);
        c = new giw("WIRED_HEADSET_ON", 2);
        d = new giw("BLUETOOTH_ON", 3);
        e = new giw("BLUETOOTH_TURNING_ON", 4);
        f = new giw("BLUETOOTH_TURNING_OFF", 5);
        g = (new giw[] {
            a, b, c, d, e, f
        });
    }
}
