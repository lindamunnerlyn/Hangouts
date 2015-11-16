// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class aee
    implements adx
{

    String a;
    String b;
    String c;
    boolean d;
    private final String e;
    private final int f;

    public aee(String s, String s1, String s2, String s3, int i, boolean flag)
    {
        f = i;
        a = s;
        b = s1;
        c = s2;
        e = s3;
        d = flag;
    }

    public final adz a()
    {
        return adz.e;
    }

    public String b()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (!TextUtils.isEmpty(a))
        {
            stringbuilder.append(a);
        }
        if (!TextUtils.isEmpty(b))
        {
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(b);
        }
        if (!TextUtils.isEmpty(c))
        {
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(c);
        }
        return stringbuilder.toString();
    }

    public String c()
    {
        return a;
    }

    public String d()
    {
        return c;
    }

    public int e()
    {
        return f;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof aee))
            {
                return false;
            }
            obj = (aee)obj;
            if (f != ((aee) (obj)).f || !TextUtils.equals(a, ((aee) (obj)).a) || !TextUtils.equals(b, ((aee) (obj)).b) || !TextUtils.equals(c, ((aee) (obj)).c) || d != ((aee) (obj)).d)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int k = 0;
        int l = f;
        int i;
        int j;
        char c1;
        if (a != null)
        {
            i = a.hashCode();
        } else
        {
            i = 0;
        }
        if (b != null)
        {
            j = b.hashCode();
        } else
        {
            j = 0;
        }
        if (c != null)
        {
            k = c.hashCode();
        }
        if (d)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        return c1 + ((j + (i + l * 31) * 31) * 31 + k) * 31;
    }

    public String toString()
    {
        return String.format("type: %d, organization: %s, department: %s, title: %s, isPrimary: %s", new Object[] {
            Integer.valueOf(f), a, b, c, Boolean.valueOf(d)
        });
    }
}
