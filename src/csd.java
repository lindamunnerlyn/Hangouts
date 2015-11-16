// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.URLEncoder;

public class csd extends csa
{

    private static final long serialVersionUID = 1L;
    private final String a;
    private final String b;

    public csd(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public kop a(String s, int j, int k)
    {
        return new csb();
    }

    public String g()
    {
        String s = String.valueOf("users/@me/phones/");
        String s1 = String.valueOf(URLEncoder.encode(b));
        String s2 = String.valueOf("/proxyNumbers/");
        String s3 = String.valueOf(URLEncoder.encode(a));
        return (new StringBuilder(String.valueOf(s).length() + 0 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s).append(s1).append(s2).append(s3).toString();
    }

    public boolean i()
    {
        return false;
    }
}
