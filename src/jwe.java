// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


abstract class jwe extends Enum
    implements jnn
{

    public static final jwe a;
    public static final jwe b;
    private static final jwe c[];

    jwe(String s, int i)
    {
        super(s, i);
    }

    public static jwe valueOf(String s)
    {
        return (jwe)Enum.valueOf(jwe, s);
    }

    public static jwe[] values()
    {
        return (jwe[])c.clone();
    }

    static 
    {
        a = new jwf("KEY");
        b = new jwg("VALUE");
        c = (new jwe[] {
            a, b
        });
    }
}
