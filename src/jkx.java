// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jkx extends Enum
    implements fsn
{

    public static final jkx a;
    private static final jkx b[];

    private jkx(String s)
    {
        super(s, 0);
    }

    public static jkx valueOf(String s)
    {
        return (jkx)Enum.valueOf(jkx, s);
    }

    public static jkx[] values()
    {
        return (jkx[])b.clone();
    }

    static 
    {
        a = new jkx("INSTANCE");
        b = (new jkx[] {
            a
        });
    }
}
