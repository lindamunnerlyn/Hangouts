// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class adv
    implements adx
{

    public final String a;

    public adv(String s)
    {
        a = s;
    }

    public adz a()
    {
        return adz.l;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof adv))
        {
            return false;
        } else
        {
            obj = (adv)obj;
            return TextUtils.equals(a, ((adv) (obj)).a);
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
