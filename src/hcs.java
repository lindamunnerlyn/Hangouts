// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hcs extends Enum
    implements joj
{

    public static final hcs a;
    private static final hcs b[];

    private hcs(String s)
    {
        super(s, 0);
    }

    public static joj b()
    {
        return a;
    }

    public static hcs valueOf(String s)
    {
        return (hcs)Enum.valueOf(hcs, s);
    }

    public static hcs[] values()
    {
        return (hcs[])b.clone();
    }

    public Object a()
    {
        return new hdj();
    }

    static 
    {
        a = new hcs("INSTANCE");
        b = (new hcs[] {
            a
        });
    }
}
