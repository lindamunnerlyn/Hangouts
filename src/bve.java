// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bve
    implements gds
{

    final boolean a;
    final bvd b;

    bve(bvd bvd1, boolean flag)
    {
        b = bvd1;
        a = flag;
        super();
    }

    public void a(kws kws)
    {
        if (bvd.d())
        {
            boolean flag = a;
            eev.a("Babel", (new StringBuilder(45)).append("Successfully changed knockable state to ").append(flag).toString());
        }
    }

    public void b(kws kws)
    {
        boolean flag = a;
        eev.g("Babel", (new StringBuilder(41)).append("Failed to change knockable state to ").append(flag).toString());
    }
}
