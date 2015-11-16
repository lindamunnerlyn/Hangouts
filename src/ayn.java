// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;

final class ayn
    implements Runnable
{

    final Collection a;
    final String b;
    final int c;
    final aym d;

    ayn(aym aym1, Collection collection, String s, int i)
    {
        d = aym1;
        a = collection;
        b = s;
        c = i;
        super();
    }

    public void run()
    {
        if (aym.a(d) != null)
        {
            aym.a(d).a("bg started");
        }
        aym.a(d, a, b, c);
    }
}
