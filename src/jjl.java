// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class jjl extends Enum
{

    public static final jjl a;
    public static final jjl b;
    public static final jjl c;
    public static final jjl d;
    public static final jjl e;
    private static final jjl f[];

    jjl(String s, int i)
    {
        super(s, i);
    }

    public static jjl valueOf(String s)
    {
        return (jjl)Enum.valueOf(jjl, s);
    }

    public static jjl[] values()
    {
        return (jjl[])f.clone();
    }

    abstract boolean a();

    static 
    {
        a = new jjm("EXPLICIT");
        b = new jjn("REPLACED");
        c = new jjo("COLLECTED");
        d = new jjp("EXPIRED");
        e = new jjq("SIZE");
        f = (new jjl[] {
            a, b, c, d, e
        });
    }
}
