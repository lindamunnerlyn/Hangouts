// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class aea
    implements adx
{

    private final String a;
    private final int b;
    private final String c = null;
    private final int d;
    private final boolean e;

    public aea(int i, String s, String s1, int j, boolean flag)
    {
        b = i;
        d = j;
        a = s1;
        e = flag;
    }

    public final adz a()
    {
        return adz.f;
    }

    public String b()
    {
        return a;
    }

    public int c()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof aea))
            {
                return false;
            }
            obj = (aea)obj;
            if (d != ((aea) (obj)).d || b != ((aea) (obj)).b || !TextUtils.equals(c, ((aea) (obj)).c) || !TextUtils.equals(a, ((aea) (obj)).a) || e != ((aea) (obj)).e)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int j = 0;
        int k = d;
        int l = b;
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
        if (e)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        return c1 + ((i + (k * 31 + l) * 31) * 31 + j) * 31;
    }

    public String toString()
    {
        return String.format("type: %d, protocol: %d, custom_protcol: %s, data: %s, isPrimary: %s", new Object[] {
            Integer.valueOf(d), Integer.valueOf(b), c, a, Boolean.valueOf(e)
        });
    }
}
