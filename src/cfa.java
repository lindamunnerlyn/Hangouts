// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cfa extends Enum
{

    public static final cfa a;
    public static final cfa b;
    public static final cfa c;
    public static final cfa d;
    private static final cfa e[];

    private cfa(String s, int i)
    {
        super(s, i);
    }

    public static cfa valueOf(String s)
    {
        return (cfa)Enum.valueOf(cfa, s);
    }

    public static cfa[] values()
    {
        return (cfa[])e.clone();
    }

    static 
    {
        a = new cfa("UNKNOWN", 0);
        b = new cfa("PERSON", 1);
        c = new cfa("CIRCLE", 2);
        d = new cfa("PHONE", 3);
        e = (new cfa[] {
            a, b, c, d
        });
    }
}
