// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class fdz
{

    static a a = null;
    private static final Object d = new Object();
    private static int e = 0;
    private static String f = "com.google.android.providers.gsf.permission.READ_GSERVICES";
    public final String b;
    public final Object c;
    private Object g;

    protected fdz(String s, Object obj)
    {
        g = null;
        b = s;
        c = obj;
    }

    public static int a()
    {
        return e;
    }

    public static fdz a(String s, Integer integer)
    {
        return new feb(s, integer);
    }

    public static fdz a(String s, Long long1)
    {
        return new fea(s, long1);
    }

    public static fdz a(String s, String s1)
    {
        return new fec(s, s1);
    }

    public static boolean b()
    {
        return a != null;
    }

    protected abstract Object c();

    public final Object d()
    {
        if (g != null)
        {
            return g;
        } else
        {
            return c();
        }
    }

}
