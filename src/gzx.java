// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gzx
{

    public static final gzx a = (new gzy()).a().b().c();
    private final a b;
    private final boolean c;
    private final boolean d;

    gzx(gzy gzy1)
    {
        b = gzy1.a;
        c = gzy1.b;
        d = gzy1.c;
    }

    public void a()
    {
        if (this != a)
        {
            if (b == null)
            {
                throw new IllegalStateException("must supply network capability to validate constraints");
            }
            if (b.r() && !c)
            {
                throw new had("metered network not allowed");
            }
            if (b.s() && !d)
            {
                throw new had("roaming not allowed");
            }
        }
    }

}
