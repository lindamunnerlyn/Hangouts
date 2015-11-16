// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

final class gog
    implements Runnable
{

    final goh a;
    final Intent b;
    final goe c;

    gog(goe goe, goh goh1, Intent intent)
    {
        c = goe;
        a = goh1;
        b = intent;
        super();
    }

    public void run()
    {
        if (a.isAdded())
        {
            ((gow)hgx.a(a.getActivity(), a).a(gow)).a(g.rX, b);
        }
    }
}
