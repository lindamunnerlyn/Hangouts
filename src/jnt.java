// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jnt
{

    private final String a;
    private jnu b;
    private jnu c;
    private boolean d;

    public jnt(String s)
    {
        b = new jnu();
        c = b;
        d = false;
        a = (String)n.b(s);
    }

    private jnt b(String s, Object obj)
    {
        jnu jnu1 = new jnu();
        c.c = jnu1;
        c = jnu1;
        jnu1.b = obj;
        jnu1.a = (String)n.b(s);
        return this;
    }

    public jnt a(String s, int i)
    {
        return b(s, String.valueOf(i));
    }

    public jnt a(String s, Object obj)
    {
        return b(s, obj);
    }

    public String toString()
    {
        boolean flag = d;
        StringBuilder stringbuilder = (new StringBuilder(32)).append(a).append('{');
        jnu jnu1 = b.c;
        String s1;
        for (String s = ""; jnu1 != null; s = s1)
        {
label0:
            {
                if (flag)
                {
                    s1 = s;
                    if (jnu1.b == null)
                    {
                        break label0;
                    }
                }
                stringbuilder.append(s);
                s1 = ", ";
                if (jnu1.a != null)
                {
                    stringbuilder.append(jnu1.a).append('=');
                }
                stringbuilder.append(jnu1.b);
            }
            jnu1 = jnu1.c;
        }

        return stringbuilder.append('}').toString();
    }
}
