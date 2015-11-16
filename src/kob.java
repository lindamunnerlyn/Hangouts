// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kob extends Enum
{

    public static final kob a;
    public static final kob b;
    public static final kob c;
    public static final kob d;
    public static final kob e;
    public static final kob f;
    public static final kob g;
    public static final kob h;
    public static final kob i;
    private static final kob k[];
    private final Object j;

    private kob(String s, int l, Object obj)
    {
        super(s, l);
        j = obj;
    }

    public static kob valueOf(String s)
    {
        return (kob)Enum.valueOf(kob, s);
    }

    public static kob[] values()
    {
        return (kob[])k.clone();
    }

    static 
    {
        a = new kob("INT", 0, Integer.valueOf(0));
        b = new kob("LONG", 1, Long.valueOf(0L));
        c = new kob("FLOAT", 2, Float.valueOf(0.0F));
        d = new kob("DOUBLE", 3, Double.valueOf(0.0D));
        e = new kob("BOOLEAN", 4, Boolean.valueOf(false));
        f = new kob("STRING", 5, "");
        g = new kob("BYTE_STRING", 6, klp.a);
        h = new kob("ENUM", 7, null);
        i = new kob("MESSAGE", 8, null);
        k = (new kob[] {
            a, b, c, d, e, f, g, h, i
        });
    }
}
