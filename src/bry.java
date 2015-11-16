// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class bry
    implements ghp
{

    private final String a;
    private final String b;
    private final String c;
    private final int d;

    bry(String s, String s1, String s2, int i)
    {
        a = s;
        b = s1;
        c = s2;
        d = i;
    }

    public String a()
    {
        if (!TextUtils.isEmpty(a))
        {
            return a;
        } else
        {
            return b;
        }
    }

    public String b()
    {
        return b;
    }

    String c()
    {
        return c;
    }

    int d()
    {
        return d;
    }
}
