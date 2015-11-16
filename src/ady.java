// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class ady
    implements adz
{

    final String a;
    private final int b;
    private final String c;
    private final boolean d;

    public ady(String s, int i, String s1, boolean flag)
    {
        b = i;
        a = s;
        c = s1;
        d = flag;
    }

    public final aeb a()
    {
        return aeb.c;
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
            if (!(obj instanceof ady))
            {
                return false;
            }
            obj = (ady)obj;
            if (b != ((ady) (obj)).b || !TextUtils.equals(a, ((ady) (obj)).a) || !TextUtils.equals(c, ((ady) (obj)).c) || d != ((ady) (obj)).d)
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
