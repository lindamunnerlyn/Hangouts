// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aot extends Enum
{

    public static final aot a;
    public static final aot b;
    public static final aot c;
    private static final aot d[];

    private aot(String s, int i)
    {
        super(s, i);
    }

    public static aot valueOf(String s)
    {
        return (aot)Enum.valueOf(aot, s);
    }

    public static aot[] values()
    {
        return (aot[])d.clone();
    }

    static 
    {
        a = new aot("NONE", 0);
        b = new aot("LOCAL_ONLY", 1);
        c = new aot("LOCAL_AND_SERVER", 2);
        d = (new aot[] {
            a, b, c
        });
    }
}
