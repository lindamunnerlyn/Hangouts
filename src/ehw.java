// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.regex.Pattern;

public final class ehw
    implements Comparable
{

    public static final ehw e = new ehw();
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    private ehw()
    {
        a = "DEFAULT";
        b = "";
        c = null;
        d = false;
    }

    public ehw(String s, String s1)
    {
        a = s;
        String as[] = ehv.a().split(s1);
        if (as.length == 0)
        {
            throw new ehx("Empty rule");
        }
        b = as[0];
        s = null;
        boolean flag = false;
        for (int i = 1; i < as.length;)
        {
            String s2 = as[i].toLowerCase();
            if (s2.equals("rewrite") && i + 1 < as.length)
            {
                s = as[i + 1];
                i += 2;
            } else
            if (s2.equals("block"))
            {
                i++;
                flag = true;
            } else
            {
                throw new ehx((new StringBuilder("Illegal rule: ")).append(s1).toString());
            }
        }

        c = s;
        d = flag;
    }

    public String a(String s)
    {
        String s1;
        if (d)
        {
            s1 = null;
        } else
        {
            s1 = s;
            if (c != null)
            {
                return (new StringBuilder()).append(c).append(s.substring(b.length())).toString();
            }
        }
        return s1;
    }

    public int compareTo(Object obj)
    {
        return ((ehw)obj).b.compareTo(b);
    }

}
