// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.URLEncoder;

public class cug extends cud
{

    private static final long serialVersionUID = 1L;
    private final String a;
    private final String b;

    public cug(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public kws a(String s, int i, int j)
    {
        return new cue();
    }

    public String f()
    {
        String s = String.valueOf("users/@me/phones/");
        String s1 = String.valueOf(URLEncoder.encode(b));
        String s2 = String.valueOf("/proxyNumbers/");
        String s3 = String.valueOf(URLEncoder.encode(a));
        return (new StringBuilder(String.valueOf(s).length() + 0 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s).append(s1).append(s2).append(s3).toString();
    }

    public boolean h()
    {
        return false;
    }
}
