// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hnr extends Enum
{

    public static final hnr a;
    private static final hnr b[];

    private hnr(String s)
    {
        super(s, 0);
    }

    public static hnr valueOf(String s)
    {
        return (hnr)Enum.valueOf(hnr, s);
    }

    public static hnr[] values()
    {
        return (hnr[])b.clone();
    }

    static 
    {
        a = new hnr("IGNORE_CASE");
        b = (new hnr[] {
            a
        });
    }
}
