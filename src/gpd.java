// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class gpd extends Enum
{

    public static final gpd a;
    public static final gpd b;
    public static final gpd c;
    public static final gpd d;
    private static final gpd e[];

    gpd(String s, int i)
    {
        super(s, i);
    }

    public static gpd valueOf(String s)
    {
        return (gpd)Enum.valueOf(gpd, s);
    }

    public static gpd[] values()
    {
        return (gpd[])e.clone();
    }

    abstract boolean a(gpw gpw, String s, gpb gpb);

    static 
    {
        a = new gpe("POSSIBLE");
        b = new gpf("VALID");
        c = new gpg("STRICT_GROUPING");
        d = new gpi("EXACT_GROUPING");
        e = (new gpd[] {
            a, b, c, d
        });
    }
}
