// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class jpm extends Enum
{

    public static final jpm a;
    public static final jpm b;
    public static final jpm c;
    private static final jpm d[];

    jpm(String s, int i)
    {
        super(s, i);
    }

    public static jpm valueOf(String s)
    {
        return (jpm)Enum.valueOf(jpm, s);
    }

    public static jpm[] values()
    {
        return (jpm[])d.clone();
    }

    abstract jpw a(jpj jpj, com.google.common.cache.LocalCache.ReferenceEntry referenceentry, Object obj, int i);

    static 
    {
        a = new jpn("STRONG");
        b = new jpo("SOFT");
        c = new jpp("WEAK");
        d = (new jpm[] {
            a, b, c
        });
    }
}
