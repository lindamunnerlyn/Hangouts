// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class aef
    implements adx
{

    final String a;
    private final int b;
    private final String c;
    private boolean d;

    public aef(String s, int i, String s1, boolean flag)
    {
        a = s;
        b = i;
        c = s1;
        d = flag;
    }

    public final adz a()
    {
        return adz.b;
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
            if (!(obj instanceof aef))
            {
                return false;
            }
            obj = (aef)obj;
            if (b != ((aef) (obj)).b || !TextUtils.equals(a, ((aef) (obj)).a) || !TextUtils.equals(c, ((aef) (obj)).c) || d != ((aef) (obj)).d)
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
