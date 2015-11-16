// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public final class arv
    implements Serializable
{

    public final ame a;
    public final aml b;
    public final amd c;

    public arv(amd amd)
    {
        a = null;
        b = null;
        c = amd;
    }

    public arv(ame ame)
    {
        a = ame;
        b = null;
        c = null;
    }

    public arv(aml aml)
    {
        a = null;
        b = aml;
        c = null;
    }

    public String toString()
    {
        String s = String.valueOf(a);
        String s1 = String.valueOf(b);
        String s2 = String.valueOf(c);
        return (new StringBuilder(String.valueOf(s).length() + 50 + String.valueOf(s1).length() + String.valueOf(s2).length())).append("ContactDetail {gaiaId: ").append(s).append(" | phoneNumber: ").append(s1).append(" | email: ").append(s2).append("}").toString();
    }
}
