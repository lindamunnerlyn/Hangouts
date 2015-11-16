// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class aem
    implements adz
{

    private final String a;

    public aem(String s)
    {
        a = s;
    }

    public aeb a()
    {
        return aeb.h;
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
        if (!(obj instanceof aem))
        {
            return false;
        } else
        {
            obj = (aem)obj;
            return TextUtils.equals(a, ((aem) (obj)).a);
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
