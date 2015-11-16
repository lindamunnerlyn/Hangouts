// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class frv
    implements ftq
{

    private final String b;
    private final String c;
    private String d;

    public frv(String s, String s1)
    {
        b = s;
        c = s1;
    }

    private String c()
    {
        if (d == null)
        {
            String s = c;
            if (TextUtils.isEmpty(s))
            {
                s = "";
            } else
            {
                StringBuilder stringbuilder = fst.a();
                for (int i = 0; i < s.length(); i++)
                {
                    char c1 = s.charAt(i);
                    if (Character.digit(c1, 10) != -1 || c1 == '+' || c1 == ',' || c1 == ';' || 'a' <= c1 && c1 <= 'z' || 'A' <= c1 && c1 <= 'Z')
                    {
                        stringbuilder.append(c1);
                    }
                }

                s = stringbuilder.toString();
            }
            d = s;
        }
        return d;
    }

    public String a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof frv)
        {
            obj = (frv)obj;
            return g.a(c(), ((frv) (obj)).c());
        } else
        {
            return false;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("PhoneNumber:[Value=");
        String s;
        if (c != null)
        {
            s = c;
        } else
        {
            s = "null";
        }
        stringbuilder = stringbuilder.append(s).append(" Type=");
        if (b != null)
        {
            s = b;
        } else
        {
            s = "null";
        }
        return stringbuilder.append(s).append("]").toString();
    }
}
