// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public final class amv
    implements Serializable
{

    private String a;
    private String b;

    public amv(String s)
    {
        this("", s);
    }

    public amv(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (this != obj) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (obj == null) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (getClass() != obj.getClass()) goto _L4; else goto _L5
_L5:
        obj = (amv)obj;
        if (a == null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (!a.equals(((amv) (obj)).a)) goto _L4; else goto _L8
_L8:
        return b.equals(((amv) (obj)).b);
_L7:
        if (((amv) (obj)).a != null)
        {
            return false;
        }
        if (true) goto _L8; else goto _L9
_L9:
    }

    public int hashCode()
    {
        int i;
        if (a != null)
        {
            i = a.hashCode();
        } else
        {
            i = 0;
        }
        return i * 31 + b.hashCode();
    }

    public String toString()
    {
        String s = String.valueOf(eev.b(b));
        String s1 = a;
        return (new StringBuilder(String.valueOf(s).length() + 32 + String.valueOf(s1).length())).append("EmailAddress {email: ").append(s).append(" | label: ").append(s1).append("}").toString();
    }
}
