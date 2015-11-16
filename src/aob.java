// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aob extends Enum
{

    public static final aob a;
    public static final aob b;
    public static final aob c;
    private static final aob d[];

    private aob(String s, int i)
    {
        super(s, i);
    }

    public static aob valueOf(String s)
    {
        return (aob)Enum.valueOf(aob, s);
    }

    public static aob[] values()
    {
        return (aob[])d.clone();
    }

    static 
    {
        a = new aob("NONE", 0);
        b = new aob("LOCAL_ONLY", 1);
        c = new aob("LOCAL_AND_SERVER", 2);
        d = (new aob[] {
            a, b, c
        });
    }
}
