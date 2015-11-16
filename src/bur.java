// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bur
    implements gbe
{

    final boolean a;
    final buq b;

    bur(buq buq1, boolean flag)
    {
        b = buq1;
        a = flag;
        super();
    }

    public void a(kop kop)
    {
        if (buq.d())
        {
            boolean flag = a;
            ebw.a("Babel", (new StringBuilder(45)).append("Successfully changed knockable state to ").append(flag).toString());
        }
    }

    public void b(kop kop)
    {
        boolean flag = a;
        ebw.g("Babel", (new StringBuilder(41)).append("Failed to change knockable state to ").append(flag).toString());
    }
}
