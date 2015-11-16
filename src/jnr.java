// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class jnr
{

    private final String a;
    private jns b;
    private jns c;
    private boolean d;

    public jnr(String s)
    {
        b = new jns();
        c = b;
        d = false;
        a = (String)n.b(s);
    }

    private jns a()
    {
        jns jns1 = new jns();
        c.c = jns1;
        c = jns1;
        return jns1;
    }

    private jnr b(String s, Object obj)
    {
        jns jns1 = a();
        jns1.b = obj;
        jns1.a = (String)n.b(s);
        return this;
    }

    public jnr a(Object obj)
    {
        a().b = obj;
        return this;
    }

    public jnr a(String s, int i)
    {
        return b(s, String.valueOf(i));
    }

    public jnr a(String s, Object obj)
    {
        return b(s, obj);
    }

    public jnr a(String s, boolean flag)
    {
        return b(s, String.valueOf(flag));
    }

    public String toString()
    {
        boolean flag = d;
        StringBuilder stringbuilder = (new StringBuilder(32)).append(a).append('{');
        jns jns1 = b.c;
        String s = "";
        while (jns1 != null) 
        {
label0:
            {
                Object obj = jns1.b;
                String s1;
                if (flag)
                {
                    s1 = s;
                    if (obj == null)
                    {
                        break label0;
                    }
                }
                stringbuilder.append(s);
                s1 = ", ";
                if (jns1.a != null)
                {
                    stringbuilder.append(jns1.a).append('=');
                }
                if (obj != null && obj.getClass().isArray())
                {
                    s = Arrays.deepToString(new Object[] {
                        obj
                    });
                    stringbuilder.append(s.substring(1, s.length() - 1));
                } else
                {
                    stringbuilder.append(obj);
                }
            }
            jns1 = jns1.c;
            s = s1;
        }
        return stringbuilder.append('}').toString();
    }
}
