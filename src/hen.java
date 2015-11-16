// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hen
{

    public static final hen a = (new heo()).a().b().c();
    private final a b;
    private final boolean c;
    private final boolean d;

    hen(heo heo1)
    {
        b = heo1.a;
        c = heo1.b;
        d = heo1.c;
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
                throw new heu("metered network not allowed");
            }
            if (b.s() && !d)
            {
                throw new heu("roaming not allowed");
            }
        }
    }

}
