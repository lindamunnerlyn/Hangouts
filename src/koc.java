// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


abstract class koc extends Enum
{

    public static final koc a;
    public static final koc b;
    public static final koc c;
    private static final koc d[];

    koc(String s, int i)
    {
        super(s, i);
    }

    public static koc valueOf(String s)
    {
        return (koc)Enum.valueOf(koc, s);
    }

    public static koc[] values()
    {
        return (koc[])d.clone();
    }

    abstract Object a(klr klr);

    static 
    {
        a = new kod("LOOSE");
        b = new koe("STRICT");
        c = new kof("LAZY");
        d = (new koc[] {
            a, b, c
        });
    }
}
