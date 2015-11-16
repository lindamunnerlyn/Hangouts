// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hcn extends Enum
    implements joj
{

    public static final hcn a;
    private static final hcn b[];

    private hcn(String s)
    {
        super(s, 0);
    }

    public static joj b()
    {
        return a;
    }

    public static hcn valueOf(String s)
    {
        return (hcn)Enum.valueOf(hcn, s);
    }

    public static hcn[] values()
    {
        return (hcn[])b.clone();
    }

    public Object a()
    {
        return new hcg();
    }

    static 
    {
        a = new hcn("INSTANCE");
        b = (new hcn[] {
            a
        });
    }
}
