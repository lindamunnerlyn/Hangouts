// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class jvl extends Enum
{

    public static final jvl a;
    public static final jvl b;
    public static final jvl c;
    private static final jvl d[];

    jvl(String s, int i)
    {
        super(s, i);
    }

    public static jvl valueOf(String s)
    {
        return (jvl)Enum.valueOf(jvl, s);
    }

    public static jvl[] values()
    {
        return (jvl[])d.clone();
    }

    public abstract jnk a();

    abstract jvv a(jvi jvi, com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry, Object obj);

    static 
    {
        a = new jvm("STRONG");
        b = new jvn("SOFT");
        c = new jvo("WEAK");
        d = (new jvl[] {
            a, b, c
        });
    }
}
