// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class ayp
    implements Runnable
{

    final List a;
    final ark b;
    final aym c;

    ayp(aym aym1, List list, ark ark)
    {
        c = aym1;
        a = list;
        b = ark;
        super();
    }

    public void run()
    {
        if (aym.a(c) != null)
        {
            aym.a(c).a("finish fg");
            aym.c(c);
        }
        aym.d(c).a(a, b);
    }
}
