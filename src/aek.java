// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class aek
    implements adx
{

    private final String a;

    public aek(String s)
    {
        a = s;
    }

    public adz a()
    {
        return adz.h;
    }

    public String b()
    {
        return a;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof aek))
        {
            return false;
        } else
        {
            obj = (aek)obj;
            return TextUtils.equals(a, ((aek) (obj)).a);
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
            return "website: ".concat(s);
        } else
        {
            return new String("website: ");
        }
    }
}
