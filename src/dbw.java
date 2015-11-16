// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dbw
{

    public static final String a = dgi.getName();
    public static final String b = dij.getName();
    public static final String c = dbt.getName();
    private static dbv d;

    public static void a(hlp hlp1)
    {
        if (d == null)
        {
            d = new dbv();
        }
        hlp1.a(dgi, new dbu[] {
            new dbu()
        });
    }

    public static void b(hlp hlp1)
    {
        if (d == null)
        {
            d = new dbv();
        }
        hlp1.a(dij, new dij[] {
            new dbx()
        });
    }

    public static void c(hlp hlp1)
    {
        if (d == null)
        {
            d = new dbv();
        }
        hlp1.a(dbt, new dby());
    }

}
