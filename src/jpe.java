// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


abstract class jpe extends Enum
    implements jgt
{

    public static final jpe a;
    public static final jpe b;
    private static final jpe c[];

    jpe(String s, int i)
    {
        super(s, i);
    }

    public static jpe valueOf(String s)
    {
        return (jpe)Enum.valueOf(jpe, s);
    }

    public static jpe[] values()
    {
        return (jpe[])c.clone();
    }

    static 
    {
        a = new jpf("KEY");
        b = new jpg("VALUE");
        c = (new jpe[] {
            a, b
        });
    }
}
