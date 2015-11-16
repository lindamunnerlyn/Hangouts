// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


abstract class kwf extends Enum
{

    public static final kwf a;
    public static final kwf b;
    public static final kwf c;
    private static final kwf d[];

    kwf(String s, int i)
    {
        super(s, i);
    }

    public static kwf valueOf(String s)
    {
        return (kwf)Enum.valueOf(kwf, s);
    }

    public static kwf[] values()
    {
        return (kwf[])d.clone();
    }

    abstract Object a(ktu ktu);

    static 
    {
        a = new kwg("LOOSE");
        b = new kwh("STRICT");
        c = new kwi("LAZY");
        d = (new kwf[] {
            a, b, c
        });
    }
}
