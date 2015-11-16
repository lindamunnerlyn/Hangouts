// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class asz extends Enum
{

    public static final asz a;
    public static final asz b;
    public static final asz c;
    public static final asz d;
    public static final asz e;
    private static final asz f[];

    private asz(String s, int i)
    {
        super(s, i);
    }

    public static asz valueOf(String s)
    {
        return (asz)Enum.valueOf(asz, s);
    }

    public static asz[] values()
    {
        return (asz[])f.clone();
    }

    static 
    {
        a = new asz("NONE", 0);
        b = new asz("PHOTO", 1);
        c = new asz("VIDEO", 2);
        d = new asz("STICKER", 3);
        e = new asz("LOCATION", 4);
        f = (new asz[] {
            a, b, c, d, e
        });
    }
}
