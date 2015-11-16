// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class gkx extends Enum
{

    public static final gkx a;
    public static final gkx b;
    public static final gkx c;
    public static final gkx d;
    private static final gkx e[];

    gkx(String s, int i)
    {
        super(s, i);
    }

    public static gkx valueOf(String s)
    {
        return (gkx)Enum.valueOf(gkx, s);
    }

    public static gkx[] values()
    {
        return (gkx[])e.clone();
    }

    abstract boolean a(glq glq, String s, gkv gkv);

    static 
    {
        a = new gky("POSSIBLE");
        b = new gkz("VALID");
        c = new gla("STRICT_GROUPING");
        d = new glc("EXACT_GROUPING");
        e = (new gkx[] {
            a, b, c, d
        });
    }
}
