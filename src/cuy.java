// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cuy extends Enum
{

    public static final cuy a;
    public static final cuy b;
    public static final cuy c;
    public static final cuy d;
    private static final cuy e[];

    private cuy(String s, int i)
    {
        super(s, i);
    }

    public static cuy valueOf(String s)
    {
        return (cuy)Enum.valueOf(cuy, s);
    }

    public static cuy[] values()
    {
        return (cuy[])e.clone();
    }

    static 
    {
        a = new cuy("PHONE_ACL", 0);
        b = new cuy("EMAIL_ACL", 1);
        c = new cuy("PUBLIC_ACL", 2);
        d = new cuy("CIRCLE_ACL", 3);
        e = (new cuy[] {
            a, b, c, d
        });
    }
}
