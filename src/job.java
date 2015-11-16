// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


abstract class job extends Enum
    implements jnx
{

    public static final job a;
    public static final job b;
    public static final job c;
    public static final job d;
    private static final job e[];

    job(String s, int i)
    {
        super(s, i);
    }

    public static job valueOf(String s)
    {
        return (job)Enum.valueOf(job, s);
    }

    public static job[] values()
    {
        return (job[])e.clone();
    }

    jnx a()
    {
        return this;
    }

    static 
    {
        a = new joc("ALWAYS_TRUE");
        b = new jod("ALWAYS_FALSE");
        c = new joe("IS_NULL");
        d = new jof("NOT_NULL");
        e = (new job[] {
            a, b, c, d
        });
    }
}
