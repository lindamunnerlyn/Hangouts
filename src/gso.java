// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

final class gso
    implements Runnable
{

    final gsp a;
    final Intent b;
    final gsm c;

    gso(gsm gsm, gsp gsp1, Intent intent)
    {
        c = gsm;
        a = gsp1;
        b = intent;
        super();
    }

    public void run()
    {
        if (a.isAdded())
        {
            ((gte)hlp.a(a.getActivity(), a).a(gte)).a(g.sy, b);
        }
    }
}
