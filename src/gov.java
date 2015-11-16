// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gov extends Exception
{

    private gow a;
    private String b;

    public gov(gow gow, String s)
    {
        super(s);
        b = s;
        a = gow;
    }

    public gow a()
    {
        return a;
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(a));
        String s1 = String.valueOf(String.valueOf(b));
        return (new StringBuilder(s.length() + 14 + s1.length())).append("Error type: ").append(s).append(". ").append(s1).toString();
    }
}
