// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bpu
{

    private final String a;
    private final int b;
    private final String c;

    bpu(String s, int i, String s1)
    {
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gdv.b("Expected condition to be false", flag);
        a = s;
        b = i;
        c = s1;
    }

    String a()
    {
        return a;
    }

    String b()
    {
        return c;
    }
}
