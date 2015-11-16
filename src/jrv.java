// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jrv extends Enum
    implements fuu
{

    public static final jrv a;
    private static final jrv b[];

    private jrv(String s)
    {
        super(s, 0);
    }

    public static jrv valueOf(String s)
    {
        return (jrv)Enum.valueOf(jrv, s);
    }

    public static jrv[] values()
    {
        return (jrv[])b.clone();
    }

    static 
    {
        a = new jrv("INSTANCE");
        b = (new jrv[] {
            a
        });
    }
}
