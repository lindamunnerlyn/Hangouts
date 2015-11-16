// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.regex.Pattern;

public final class ekx
    implements Comparable
{

    public static final ekx e = new ekx();
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    private ekx()
    {
        a = "DEFAULT";
        b = "";
        c = null;
        d = false;
    }

    public ekx(String s, String s1)
    {
        a = s;
        String as[] = ekw.a().split(s1);
        if (as.length == 0)
        {
            throw new eky("Empty rule");
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
                throw new eky((new StringBuilder("Illegal rule: ")).append(s1).toString());
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
        return ((ekx)obj).b.compareTo(b);
    }

}
