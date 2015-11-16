// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hsn extends Enum
{

    public static final hsn a;
    private static final hsn b[];

    private hsn(String s)
    {
        super(s, 0);
    }

    public static hsn valueOf(String s)
    {
        return (hsn)Enum.valueOf(hsn, s);
    }

    public static hsn[] values()
    {
        return (hsn[])b.clone();
    }

    static 
    {
        a = new hsn("IGNORE_CASE");
        b = (new hsn[] {
            a
        });
    }
}
