// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class aee
    implements adz
{

    private final String a;

    public aee(String s)
    {
        a = s;
    }

    public aeb a()
    {
        return aeb.j;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof aee))
        {
            return false;
        } else
        {
            obj = (aee)obj;
            return TextUtils.equals(a, ((aee) (obj)).a);
        }
    }

    public int hashCode()
    {
        if (a != null)
        {
            return a.hashCode();
        } else
        {
            return 0;
        }
    }

    public String toString()
    {
        String s = String.valueOf(a);
        if (s.length() != 0)
        {
            return "nickname: ".concat(s);
        } else
        {
            return new String("nickname: ");
        }
    }
}
