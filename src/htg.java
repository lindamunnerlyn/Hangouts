// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public final class htg
{

    private static final hth a = new hti("-_.*", true);
    private static final hth b = new hti("-_.!~*'()@:$&,;=", false);
    private static final hth c = new hti("-_.!~*'()@:$&,;=+/?", false);
    private static final hth d = new hti("-_.!~*'():$&,;=", false);
    private static final hth e = new hti("-_.!~*'()@:$,;/?:", false);

    public static String a(String s)
    {
        return a.a(s);
    }

    public static String b(String s)
    {
        try
        {
            s = URLDecoder.decode(s, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
        return s;
    }

    public static String c(String s)
    {
        return b.a(s);
    }

    public static String d(String s)
    {
        return c.a(s);
    }

    public static String e(String s)
    {
        return d.a(s);
    }

    public static String f(String s)
    {
        return e.a(s);
    }

}
