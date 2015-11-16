// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;

final class azb
    implements Runnable
{

    final Collection a;
    final String b;
    final int c;
    final aza d;

    azb(aza aza1, Collection collection, String s, int i)
    {
        d = aza1;
        a = collection;
        b = s;
        c = i;
        super();
    }

    public void run()
    {
        if (aza.a(d) != null)
        {
            aza.a(d).a("bg started");
        }
        aza.a(d, a, b, c);
    }
}
