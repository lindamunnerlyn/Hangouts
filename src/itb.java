// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.UUID;

final class itb
    implements itc
{

    private final ith a;
    private final gwu b;
    private final itc c = null;
    private final ldq d;
    private final UUID e;
    private final boolean f = true;

    itb(UUID uuid, ith ith, gwu gwu, ldq ldq1, boolean flag)
    {
        a = ith;
        b = gwu;
        e = (UUID)n.b(uuid);
        d = ldq1;
    }

    public itc a()
    {
        return c;
    }

    public void a(String s)
    {
        n.b(s.equals(b()), "Ended wrong trace, expected %s but got %s", new Object[] {
            s, b()
        });
    }

    public String b()
    {
        return d.k();
    }

    public boolean c()
    {
        return f;
    }
}
