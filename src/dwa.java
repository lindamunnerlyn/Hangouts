// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dwa extends Enum
    implements joj
{

    public static final dwa a;
    private static final dwa b[];

    private dwa(String s)
    {
        super(s, 0);
    }

    public static joj b()
    {
        return a;
    }

    public static dwa valueOf(String s)
    {
        return (dwa)Enum.valueOf(dwa, s);
    }

    public static dwa[] values()
    {
        return (dwa[])b.clone();
    }

    public Object a()
    {
        return grn;
    }

    static 
    {
        a = new dwa("INSTANCE");
        b = (new dwa[] {
            a
        });
    }
}
