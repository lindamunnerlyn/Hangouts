// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

final class bbi
    implements gov
{

    final bbh a;

    bbi(bbh bbh1)
    {
        a = bbh1;
        super();
    }

    public void a(int i, Intent intent)
    {
        if (i == -1 && intent != null)
        {
            intent = g.a(intent);
            if (intent == null)
            {
                return;
            } else
            {
                ((bdp)bbh.a(a).a(bdp)).a(2326);
                intent = azg.a(bbh.b(a), intent);
                bbh.c(a).a(g.ks, intent);
                return;
            }
        } else
        {
            ((bdp)bbh.d(a).a(bdp)).a(2328);
            return;
        }
    }
}
