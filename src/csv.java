// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class csv extends Enum
{

    public static final csv a;
    public static final csv b;
    public static final csv c;
    public static final csv d;
    private static final csv e[];

    private csv(String s, int i)
    {
        super(s, i);
    }

    public static csv valueOf(String s)
    {
        return (csv)Enum.valueOf(csv, s);
    }

    public static csv[] values()
    {
        return (csv[])e.clone();
    }

    static 
    {
        a = new csv("PHONE_ACL", 0);
        b = new csv("EMAIL_ACL", 1);
        c = new csv("PUBLIC_ACL", 2);
        d = new csv("CIRCLE_ACL", 3);
        e = (new csv[] {
            a, b, c, d
        });
    }
}
