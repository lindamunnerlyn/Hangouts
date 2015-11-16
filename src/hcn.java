// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hcn
{

    public static final String a = hhl.getName();
    public static final String b = hhy.getName();
    private static hcm c;

    public static void a(hgx hgx1)
    {
        if (c == null)
        {
            c = new hcm();
        }
        hgx1.a(hhl, new hhl[] {
            new hck(), new hca()
        });
    }

    public static void b(hgx hgx1)
    {
        if (c == null)
        {
            c = new hcm();
        }
        hgx1.a(hhy, new hhy[] {
            new hcb()
        });
    }

}
