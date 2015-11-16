// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hmm
{

    private final String a;
    private hmn b;
    private hmn c;
    private boolean d;

    public hmm(String s)
    {
        b = new hmn();
        c = b;
        d = false;
        a = (String)h.b(s);
    }

    public hmm a(String s, Object obj)
    {
        hmn hmn1 = new hmn();
        c.c = hmn1;
        c = hmn1;
        hmn1.b = obj;
        hmn1.a = (String)h.b(s);
        return this;
    }

    public String toString()
    {
        boolean flag = d;
        StringBuilder stringbuilder = (new StringBuilder(32)).append(a).append('{');
        hmn hmn1 = b.c;
        String s1;
        for (String s = ""; hmn1 != null; s = s1)
        {
label0:
            {
                if (flag)
                {
                    s1 = s;
                    if (hmn1.b == null)
                    {
                        break label0;
                    }
                }
                stringbuilder.append(s);
                s1 = ", ";
                if (hmn1.a != null)
                {
                    stringbuilder.append(hmn1.a).append('=');
                }
                stringbuilder.append(hmn1.b);
            }
            hmn1 = hmn1.c;
        }

        return stringbuilder.append('}').toString();
    }
}
