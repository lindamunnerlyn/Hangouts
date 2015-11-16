// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class anx extends dor
{

    private final aoa a;
    private final String b;

    public anx(String s, aoa aoa)
    {
        a = aoa;
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
