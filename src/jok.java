// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class jok extends Enum
{

    public static final jok a;
    public static final jok b;
    public static final jok c;
    private static final jok d[];

    jok(String s, int i)
    {
        super(s, i);
    }

    public static jok valueOf(String s)
    {
        return (jok)Enum.valueOf(jok, s);
    }

    public static jok[] values()
    {
        return (jok[])d.clone();
    }

    public abstract jgq a();

    abstract jou a(joh joh, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry, Object obj);

    static 
    {
        a = new jol("STRONG");
        b = new jom("SOFT");
        c = new jon("WEAK");
        d = (new jok[] {
            a, b, c
        });
    }
}
