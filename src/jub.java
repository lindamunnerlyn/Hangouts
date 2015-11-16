// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


class jub extends Enum
{

    public static final jub a;
    public static final jub b;
    public static final jub c;
    public static final jub d;
    public static final jub e;
    private static final jub f[];

    jub(String s, int i)
    {
        super(s, i);
    }

    public static jub valueOf(String s)
    {
        return (jub)Enum.valueOf(jub, s);
    }

    public static jub[] values()
    {
        return (jub[])f.clone();
    }

    static 
    {
        a = new juc("EXPLICIT");
        b = new jud("REPLACED");
        c = new jue("COLLECTED");
        d = new juf("EXPIRED");
        e = new jug("SIZE");
        f = (new jub[] {
            a, b, c, d, e
        });
    }
}
