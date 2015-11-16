// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class aei
    implements adx
{

    private final String a;
    private final int b;
    private final String c;
    private final boolean d;

    public aei(String s, int i, String s1, boolean flag)
    {
        if (s.startsWith("sip:"))
        {
            a = s.substring(4);
        } else
        {
            a = s;
        }
        b = i;
        c = s1;
        d = flag;
    }

    public adz a()
    {
        return adz.i;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof aei))
            {
                return false;
            }
            obj = (aei)obj;
            if (b != ((aei) (obj)).b || !TextUtils.equals(c, ((aei) (obj)).c) || !TextUtils.equals(a, ((aei) (obj)).a) || d != ((aei) (obj)).d)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int j = 0;
        int k = b;
        int i;
        char c1;
        if (c != null)
        {
            i = c.hashCode();
        } else
        {
            i = 0;
        }
        if (a != null)
        {
            j = a.hashCode();
        }
        if (d)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        return c1 + ((i + k * 31) * 31 + j) * 31;
    }

    public String toString()
    {
        String s = String.valueOf(a);
        if (s.length() != 0)
        {
            return "sip: ".concat(s);
        } else
        {
            return new String("sip: ");
        }
    }
}
