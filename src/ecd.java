// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ecd
{

    private static final boolean a;
    private static final ece b;

    public static void a()
    {
        b.a();
        ebw.a("Babel_Trace", "endSection()");
    }

    public static void a(String s)
    {
        if (a)
        {
            String s1 = String.valueOf(s);
            if (s1.length() != 0)
            {
                s1 = "beginSection() ".concat(s1);
            } else
            {
                s1 = new String("beginSection() ");
            }
            ebw.b("Babel_Trace", s1);
        }
        b.a(s);
    }

    static 
    {
        hik hik = ebw.u;
        a = false;
        if (android.os.Build.VERSION.SDK_INT >= 18 && a)
        {
            b = new ecf();
        } else
        {
            b = new ecg();
        }
    }
}
