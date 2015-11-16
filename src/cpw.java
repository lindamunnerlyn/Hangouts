// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cpw
{

    public static final String a = cpt.getName();
    private static cpv b;

    public static void a(hgx hgx1)
    {
        if (b == null)
        {
            b = new cpv();
        }
        cpt cpt1;
        if (g.a(g.nS, "babel_phone_verification_enabled", true))
        {
            cpt1 = new cpt();
        } else
        {
            cpt1 = null;
        }
        hgx1.a(cpt, cpt1);
    }

}
