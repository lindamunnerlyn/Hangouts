// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hcr extends Enum
    implements joj
{

    public static final hcr a;
    private static final hcr b[];

    private hcr(String s)
    {
        super(s, 0);
    }

    public static joj b()
    {
        return a;
    }

    public static hcr valueOf(String s)
    {
        return (hcr)Enum.valueOf(hcr, s);
    }

    public static hcr[] values()
    {
        return (hcr[])b.clone();
    }

    public Object a()
    {
        return new hdf();
    }

    static 
    {
        a = new hcr("INSTANCE");
        b = (new hcr[] {
            a
        });
    }
}
