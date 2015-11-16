// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class imv extends Enum
    implements kxx
{

    public static final imv a;
    private static final imv b[];

    private imv(String s)
    {
        super(s, 0);
    }

    public static kxx b()
    {
        return a;
    }

    public static imv valueOf(String s)
    {
        return (imv)Enum.valueOf(imv, s);
    }

    public static imv[] values()
    {
        return (imv[])b.clone();
    }

    public Object a()
    {
        return new inc();
    }

    static 
    {
        a = new imv("INSTANCE");
        b = (new imv[] {
            a
        });
    }
}
