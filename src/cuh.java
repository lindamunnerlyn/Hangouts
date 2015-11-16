// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cuh extends cud
{

    private static final long serialVersionUID = 1L;
    private final String a;

    public cuh(String s)
    {
        String s1 = eey.g(s);
        if (s1 == null)
        {
            eev.g("Babel_RequestWriter", (new StringBuilder(String.valueOf(s).length() + 45)).append("Invalid phone number: ").append(s).append(" in GetCallRateRequest.").toString());
            a = null;
            return;
        }
        if (s1.charAt(0) == '+')
        {
            a = s1.substring(1);
            return;
        } else
        {
            a = s1;
            return;
        }
    }

    public kws a(String s, int i, int j)
    {
        return new cue();
    }

    public String f()
    {
        String s = String.valueOf("users/@me/destinations/%");
        String s1 = String.valueOf(Integer.toHexString(43));
        String s2 = a;
        String s3 = String.valueOf("/rate");
        return (new StringBuilder(String.valueOf(s).length() + 0 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s).append(s1).append(s2).append(s3).toString();
    }

    public boolean h()
    {
        return false;
    }
}
