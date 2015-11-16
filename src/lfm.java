// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.xml.sax.Attributes;

final class lfm
{

    lfp a;
    Attributes b;

    lfm(Attributes attributes)
    {
        a = null;
        b = attributes;
        attributes = lfg.a("style", attributes);
        if (attributes != null)
        {
            a = new lfp(attributes);
        }
    }

    public String a(String s)
    {
        String s1 = null;
        if (a != null)
        {
            s1 = a.a(s);
        }
        String s2 = s1;
        if (s1 == null)
        {
            s2 = lfg.a(s, b);
        }
        return s2;
    }

    public String b(String s)
    {
        return a(s);
    }

    public Integer c(String s)
    {
        s = a(s);
        if (s == null)
        {
            return null;
        }
        if (!s.startsWith("#") || s.length() != 4 && s.length() != 7)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        int i;
        int j;
        try
        {
            j = Integer.parseInt(s.substring(1), 16);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        i = j;
        if (s.length() == 4)
        {
            i = j & 0xf | ((j & 0xf00) << 8 | (j & 0xf00) << 12 | (j & 0xf0) << 4 | (j & 0xf0) << 8 | (j & 0xf) << 4);
        }
        return Integer.valueOf(i);
        return lff.a(s);
    }

    public Float d(String s)
    {
        s = a(s);
        if (s == null)
        {
            return null;
        }
        float f;
        try
        {
            f = Float.parseFloat(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return Float.valueOf(f);
    }
}
