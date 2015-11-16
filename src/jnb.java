// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


class jnb extends Enum
{

    public static final jnb a;
    public static final jnb b;
    public static final jnb c;
    public static final jnb d;
    public static final jnb e;
    private static final jnb f[];

    jnb(String s, int i)
    {
        super(s, i);
    }

    public static jnb valueOf(String s)
    {
        return (jnb)Enum.valueOf(jnb, s);
    }

    public static jnb[] values()
    {
        return (jnb[])f.clone();
    }

    static 
    {
        a = new jnc("EXPLICIT");
        b = new jnd("REPLACED");
        c = new jne("COLLECTED");
        d = new jnf("EXPIRED");
        e = new jng("SIZE");
        f = (new jnb[] {
            a, b, c, d, e
        });
    }
}
