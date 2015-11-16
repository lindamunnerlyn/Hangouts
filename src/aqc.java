// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class aqc extends Enum
{

    public static final aqc a;
    public static final aqc b;
    public static final aqc c;
    public static final aqc d;
    public static final aqc e;
    private static final aqc g[];
    public final String f;

    private aqc(String s, int i, String s1)
    {
        super(s, i);
        f = s1;
    }

    public static aqc valueOf(String s)
    {
        return (aqc)Enum.valueOf(aqc, s);
    }

    public static aqc[] values()
    {
        return (aqc[])g.clone();
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
        a = new aqc("CONTACT", 0, "c:");
        b = new aqc("GAIA", 1, "g:");
        c = new aqc("PHONE", 2, "p:");
        d = new aqc("MANUAL", 3, "SYNTH:");
        e = new aqc("CONVERSATION", 4, "CONV:");
        g = (new aqc[] {
            a, b, c, d, e
        });
    }
}
