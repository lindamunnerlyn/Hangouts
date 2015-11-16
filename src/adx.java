// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class adx
    implements adz
{

    public final String a;

    public adx(String s)
    {
        a = s;
    }

    public aeb a()
    {
        return aeb.l;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof adx))
        {
            return false;
        } else
        {
            obj = (adx)obj;
            return TextUtils.equals(a, ((adx) (obj)).a);
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
            return "birthday: ".concat(s);
        } else
        {
            return new String("birthday: ");
        }
    }
}
