// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class anf extends dlt
{

    private final ani a;
    private final String b;

    public anf(String s, ani ani)
    {
        a = ani;
        b = s;
    }

    public String a()
    {
        return b;
    }

    public String c()
    {
        String s = String.valueOf(b);
        if (s.length() != 0)
        {
            return "###".concat(s);
        } else
        {
            return new String("###");
        }
    }
}
