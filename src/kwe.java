// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kwe extends Enum
{

    public static final kwe a;
    public static final kwe b;
    public static final kwe c;
    public static final kwe d;
    public static final kwe e;
    public static final kwe f;
    public static final kwe g;
    public static final kwe h;
    public static final kwe i;
    private static final kwe k[];
    private final Object j;

    private kwe(String s, int l, Object obj)
    {
        super(s, l);
        j = obj;
    }

    public static kwe valueOf(String s)
    {
        return (kwe)Enum.valueOf(kwe, s);
    }

    public static kwe[] values()
    {
        return (kwe[])k.clone();
    }

    static 
    {
        a = new kwe("INT", 0, Integer.valueOf(0));
        b = new kwe("LONG", 1, Long.valueOf(0L));
        c = new kwe("FLOAT", 2, Float.valueOf(0.0F));
        d = new kwe("DOUBLE", 3, Double.valueOf(0.0D));
        e = new kwe("BOOLEAN", 4, Boolean.valueOf(false));
        f = new kwe("STRING", 5, "");
        g = new kwe("BYTE_STRING", 6, kts.a);
        h = new kwe("ENUM", 7, null);
        i = new kwe("MESSAGE", 8, null);
        k = (new kwe[] {
            a, b, c, d, e, f, g, h, i
        });
    }
}
