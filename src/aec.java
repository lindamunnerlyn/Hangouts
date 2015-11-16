// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class aec
    implements adx
{

    private final String a;

    public aec(String s)
    {
        a = s;
    }

    public adz a()
    {
        return adz.j;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof aec))
        {
            return false;
        } else
        {
            obj = (aec)obj;
            return TextUtils.equals(a, ((aec) (obj)).a);
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
