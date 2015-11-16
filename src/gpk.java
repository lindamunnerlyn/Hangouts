// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gpk extends Enum
{

    public static final gpk a;
    public static final gpk b;
    public static final gpk c;
    public static final gpk d;
    public static final gpk e;
    private static final gpk f[];

    private gpk(String s, int i)
    {
        super(s, i);
    }

    public static gpk valueOf(String s)
    {
        return (gpk)Enum.valueOf(gpk, s);
    }

    public static gpk[] values()
    {
        return (gpk[])f.clone();
    }

    static 
    {
        a = new gpk("NOT_A_NUMBER", 0);
        b = new gpk("NO_MATCH", 1);
        c = new gpk("SHORT_NSN_MATCH", 2);
        d = new gpk("NSN_MATCH", 3);
        e = new gpk("EXACT_MATCH", 4);
        f = (new gpk[] {
            a, b, c, d, e
        });
    }
}
