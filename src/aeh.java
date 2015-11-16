// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class aeh
    implements adz
{

    final String a;
    private final int b;
    private final String c;
    private boolean d;

    public aeh(String s, int i, String s1, boolean flag)
    {
        a = s;
        b = i;
        c = s1;
        d = flag;
    }

    public final aeb a()
    {
        return aeb.b;
    }

    public String b()
    {
        return a;
    }

    public int c()
    {
        return b;
    }

    public String d()
    {
        return c;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof aeh))
            {
                return false;
            }
            obj = (aeh)obj;
            if (b != ((aeh) (obj)).b || !TextUtils.equals(a, ((aeh) (obj)).a) || !TextUtils.equals(c, ((aeh) (obj)).c) || d != ((aeh) (obj)).d)
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
        if (a != null)
        {
            i = a.hashCode();
        } else
        {
            i = 0;
        }
        if (c != null)
        {
            j = c.hashCode();
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
        return String.format("type: %d, data: %s, label: %s, isPrimary: %s", new Object[] {
            Integer.valueOf(b), a, c, Boolean.valueOf(d)
        });
    }
}
