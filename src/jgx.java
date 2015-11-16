// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jgx
{

    private final String a;
    private jgy b;
    private jgy c;
    private boolean d;

    public jgx(String s)
    {
        b = new jgy();
        c = b;
        d = false;
        a = (String)n.b(s);
    }

    private jgy a()
    {
        jgy jgy1 = new jgy();
        c.c = jgy1;
        c = jgy1;
        return jgy1;
    }

    private jgx b(String s, Object obj)
    {
        jgy jgy1 = a();
        jgy1.b = obj;
        jgy1.a = (String)n.b(s);
        return this;
    }

    public jgx a(Object obj)
    {
        a().b = obj;
        return this;
    }

    public jgx a(String s, int i)
    {
        return b(s, String.valueOf(i));
    }

    public jgx a(String s, Object obj)
    {
        return b(s, obj);
    }

    public jgx a(String s, boolean flag)
    {
        return b(s, String.valueOf(flag));
    }

    public String toString()
    {
        boolean flag = d;
        StringBuilder stringbuilder = (new StringBuilder(32)).append(a).append('{');
        jgy jgy1 = b.c;
        String s1;
        for (String s = ""; jgy1 != null; s = s1)
        {
label0:
            {
                if (flag)
                {
                    s1 = s;
                    if (jgy1.b == null)
                    {
                        break label0;
                    }
                }
                stringbuilder.append(s);
                s1 = ", ";
                if (jgy1.a != null)
                {
                    stringbuilder.append(jgy1.a).append('=');
                }
                stringbuilder.append(jgy1.b);
            }
            jgy1 = jgy1.c;
        }

        return stringbuilder.append('}').toString();
    }
}
