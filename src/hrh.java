// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hrh
{

    private final String a;
    private hri b;
    private hri c;
    private boolean d;

    public hrh(String s)
    {
        b = new hri();
        c = b;
        d = false;
        a = (String)h.a(s);
    }

    public hrh a(String s, Object obj)
    {
        hri hri1 = new hri();
        c.c = hri1;
        c = hri1;
        hri1.b = obj;
        hri1.a = (String)h.a(s);
        return this;
    }

    public String toString()
    {
        boolean flag = d;
        StringBuilder stringbuilder = (new StringBuilder(32)).append(a).append('{');
        hri hri1 = b.c;
        String s1;
        for (String s = ""; hri1 != null; s = s1)
        {
label0:
            {
                if (flag)
                {
                    s1 = s;
                    if (hri1.b == null)
                    {
                        break label0;
                    }
                }
                stringbuilder.append(s);
                s1 = ", ";
                if (hri1.a != null)
                {
                    stringbuilder.append(hri1.a).append('=');
                }
                stringbuilder.append(hri1.b);
            }
            hri1 = hri1.c;
        }

        return stringbuilder.append('}').toString();
    }
}
