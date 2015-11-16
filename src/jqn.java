// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class jqn extends Enum
{

    public static final jqn a;
    public static final jqn b;
    public static final jqn c;
    private static final jqn d[];

    jqn(String s, int i)
    {
        super(s, i);
    }

    public static jqn valueOf(String s)
    {
        return (jqn)Enum.valueOf(jqn, s);
    }

    public static jqn[] values()
    {
        return (jqn[])d.clone();
    }

    public abstract int a(int i);

    static 
    {
        a = new jqo("NEXT_LOWER");
        b = new jqp("NEXT_HIGHER");
        c = new jqq("INVERTED_INSERTION_INDEX");
        d = (new jqn[] {
            a, b, c
        });
    }
}
