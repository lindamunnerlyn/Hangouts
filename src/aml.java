// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public final class aml
    implements Serializable
{

    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;

    public aml(String s)
    {
        this("", s, s, s, false);
    }

    public aml(String s, String s1, String s2, String s3, boolean flag)
    {
        a = s;
        b = s1;
        d = s2;
        c = s3;
        e = flag;
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public String d()
    {
        return d;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        obj = (aml)obj;
        if (a == null ? ((aml) (obj)).a != null : !a.equals(((aml) (obj)).a))
        {
            return false;
        }
        if (!b.equals(((aml) (obj)).b))
        {
            return false;
        }
        if (d == null) goto _L4; else goto _L3
_L3:
        if (d.equals(((aml) (obj)).d)) goto _L1; else goto _L5
_L5:
        return false;
_L4:
        if (((aml) (obj)).d == null)
        {
            return true;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        int k;
        if (a != null)
        {
            i = a.hashCode();
        } else
        {
            i = 0;
        }
        k = b.hashCode();
        if (d != null)
        {
            j = d.hashCode();
        }
        return (i * 31 + k) * 31 + j;
    }

    public String toString()
    {
        String s = String.valueOf(ebw.b(b));
        String s1 = a;
        return (new StringBuilder(String.valueOf(s).length() + 32 + String.valueOf(s1).length())).append("PhoneNumber {number: ").append(s).append(" | label: ").append(s1).append("}").toString();
    }
}
