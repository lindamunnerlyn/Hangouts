// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

final class bby
    implements gtd
{

    final bbx a;

    bby(bbx bbx1)
    {
        a = bbx1;
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
                ((beb)bbx.a(a).a(beb)).a(2326);
                intent = azt.a(bbx.b(a), intent);
                bbx.c(a).a(g.kl, intent);
                return;
            }
        } else
        {
            ((beb)bbx.d(a).a(beb)).a(2328);
            return;
        }
    }
}
