// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jgz
{

    private final String a;
    private jha b;
    private jha c;
    private boolean d;

    public jgz(String s)
    {
        b = new jha();
        c = b;
        d = false;
        a = (String)n.b(s);
    }

    private jgz b(String s, Object obj)
    {
        jha jha1 = new jha();
        c.c = jha1;
        c = jha1;
        jha1.b = obj;
        jha1.a = (String)n.b(s);
        return this;
    }

    public jgz a(String s, int i)
    {
        return b(s, String.valueOf(i));
    }

    public jgz a(String s, Object obj)
    {
        return b(s, obj);
    }

    public String toString()
    {
        boolean flag = d;
        StringBuilder stringbuilder = (new StringBuilder(32)).append(a).append('{');
        jha jha1 = b.c;
        String s1;
        for (String s = ""; jha1 != null; s = s1)
        {
label0:
            {
                if (flag)
                {
                    s1 = s;
                    if (jha1.b == null)
                    {
                        break label0;
                    }
                }
                stringbuilder.append(s);
                s1 = ", ";
                if (jha1.a != null)
                {
                    stringbuilder.append(jha1.a).append('=');
                }
                stringbuilder.append(jha1.b);
            }
            jha1 = jha1.c;
        }

        return stringbuilder.append('}').toString();
    }
}
