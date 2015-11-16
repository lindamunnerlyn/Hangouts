// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bvm
{

    public static final String a = bsh.getName();
    public static final String b = bva.getName();
    private static bvj c;

    public static void a(hgx hgx1)
    {
        if (c == null)
        {
            c = new bvj();
        }
        hgx1.a(bsh, c.b());
    }

    public static void b(hgx hgx1)
    {
        if (c == null)
        {
            c = new bvj();
        }
        hgx1.a(bva, c.a());
    }

}
