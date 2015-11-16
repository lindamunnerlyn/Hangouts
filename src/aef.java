// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class aef
    implements adz
{

    public final String a;

    public aef(String s)
    {
        a = s;
    }

    public aeb a()
    {
        return aeb.k;
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
        if (!(obj instanceof aef))
        {
            return false;
        } else
        {
            obj = (aef)obj;
            return TextUtils.equals(a, ((aef) (obj)).a);
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
            return "note: ".concat(s);
        } else
        {
            return new String("note: ");
        }
    }
}
