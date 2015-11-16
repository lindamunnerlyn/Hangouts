// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

final class bun
    implements gds
{

    final jhh a;
    final boolean b;
    final bum c;

    bun(bum bum1, jhh jhh1, boolean flag)
    {
        c = bum1;
        a = jhh1;
        b = flag;
        super();
    }

    public void a(kws kws)
    {
        if (bum.c())
        {
            eev.a("Babel", String.format("Successfully responded to knock (%s)", new Object[] {
                a.b
            }));
        }
    }

    public void b(kws kws)
    {
        eev.g("Babel", String.format("Knock response failed... retrying in %d ms", new Object[] {
            Long.valueOf(bum.d())
        }));
        bum.a(c).postDelayed(new buo(this), bum.d());
    }
}
