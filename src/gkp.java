// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gkp extends Exception
{

    private gkq a;
    private String b;

    public gkp(gkq gkq, String s)
    {
        super(s);
        b = s;
        a = gkq;
    }

    public gkq a()
    {
        return a;
    }

    public String toString()
    {
        String s = String.valueOf(a);
        String s1 = b;
        return (new StringBuilder(String.valueOf(s).length() + 14 + String.valueOf(s1).length())).append("Error type: ").append(s).append(". ").append(s1).toString();
    }
}
