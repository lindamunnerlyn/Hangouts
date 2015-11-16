// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gsh extends Enum
    implements kxx
{

    public static final gsh a;
    private static final gsh b[];

    private gsh(String s)
    {
        super(s, 0);
    }

    public static kxx b()
    {
        return a;
    }

    public static gsh valueOf(String s)
    {
        return (gsh)Enum.valueOf(gsh, s);
    }

    public static gsh[] values()
    {
        return (gsh[])b.clone();
    }

    public Object a()
    {
        return new gse();
    }

    static 
    {
        a = new gsh("INSTANCE");
        b = (new gsh[] {
            a
        });
    }
}
