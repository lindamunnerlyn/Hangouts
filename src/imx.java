// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.UUID;

final class imx
    implements imy
{

    private final ind a;
    private final gsi b;
    private final imy c = null;
    private final kvm d;
    private final UUID e;
    private final boolean f = true;

    imx(UUID uuid, ind ind, gsi gsi, kvm kvm1, boolean flag)
    {
        a = ind;
        b = gsi;
        e = (UUID)n.b(uuid);
        d = kvm1;
    }

    public imy a()
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
