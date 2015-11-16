// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gwt extends Enum
    implements joj
{

    public static final gwt a;
    private static final gwt b[];

    private gwt(String s)
    {
        super(s, 0);
    }

    public static joj b()
    {
        return a;
    }

    public static gwt valueOf(String s)
    {
        return (gwt)Enum.valueOf(gwt, s);
    }

    public static gwt[] values()
    {
        return (gwt[])b.clone();
    }

    public Object a()
    {
        return new gwq();
    }

    static 
    {
        a = new gwt("INSTANCE");
        b = (new gwt[] {
            a
        });
    }
}
