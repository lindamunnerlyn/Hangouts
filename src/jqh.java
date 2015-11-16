// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class jqh extends Enum
{

    public static final jqh a;
    public static final jqh b;
    public static final jqh c;
    public static final jqh d;
    public static final jqh e;
    private static final jqh f[];

    jqh(String s, int i)
    {
        super(s, i);
    }

    public static jqh valueOf(String s)
    {
        return (jqh)Enum.valueOf(jqh, s);
    }

    public static jqh[] values()
    {
        return (jqh[])f.clone();
    }

    abstract boolean a();

    static 
    {
        a = new jqi("EXPLICIT");
        b = new jqj("REPLACED");
        c = new jqk("COLLECTED");
        d = new jql("EXPIRED");
        e = new jqm("SIZE");
        f = (new jqh[] {
            a, b, c, d, e
        });
    }
}
