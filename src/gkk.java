// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class gkk
    implements Runnable
{

    final gdq a;
    final gkj b;

    gkk(gkj gkj1, gdq gdq1)
    {
        b = gkj1;
        a = gdq1;
        super();
    }

    public void run()
    {
        b.d.add(a);
        if (b.e)
        {
            a.a();
        }
    }
}
