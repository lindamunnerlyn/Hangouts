// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aqt extends Enum
{

    public static final aqt a;
    public static final aqt b;
    public static final aqt c;
    public static final aqt d;
    public static final aqt e;
    private static final aqt g[];
    public final String f;

    private aqt(String s, int i, String s1)
    {
        super(s, i);
        f = s1;
    }

    public static aqt valueOf(String s)
    {
        return (aqt)Enum.valueOf(aqt, s);
    }

    public static aqt[] values()
    {
        return (aqt[])g.clone();
    }

    public String a(String s)
    {
        String s1 = String.valueOf(f);
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            return s1.concat(s);
        } else
        {
            return new String(s1);
        }
    }

    public boolean b(String s)
    {
        return s != null && s.startsWith(f);
    }

    public String c(String s)
    {
        if (!b(s))
        {
            return null;
        } else
        {
            return s.substring(f.length());
        }
    }

    static 
    {
        a = new aqt("CONTACT", 0, "c:");
        b = new aqt("GAIA", 1, "g:");
        c = new aqt("PHONE", 2, "p:");
        d = new aqt("MANUAL", 3, "SYNTH:");
        e = new aqt("CONVERSATION", 4, "CONV:");
        g = (new aqt[] {
            a, b, c, d, e
        });
    }
}
