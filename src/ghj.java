// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class ghj
    implements Runnable
{

    final gbc a;
    final ghi b;

    ghj(ghi ghi1, gbc gbc1)
    {
        b = ghi1;
        a = gbc1;
        super();
    }

    public void run()
    {
        b.c.add(a);
        if (b.d)
        {
            a.a();
        }
    }
}
