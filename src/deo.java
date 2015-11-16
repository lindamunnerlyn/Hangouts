// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public final class deo
    implements Serializable
{

    public boolean a;
    public String b;
    public String c;
    public String d;

    deo()
    {
    }

    public String toString()
    {
        boolean flag = a;
        String s = b;
        String s1 = c;
        String s2 = d;
        return (new StringBuilder(String.valueOf(s).length() + 73 + String.valueOf(s1).length() + String.valueOf(s2).length())).append("MergedPerson{isHangoutsReachable=").append(flag).append(", gaiaId='").append(s).append("', avatarUrl='").append(s1).append("', name='").append(s2).append("'}").toString();
    }
}
