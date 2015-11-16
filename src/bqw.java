// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.hangout.HangoutSelfMenu;

final class bqw
    implements Runnable
{

    final bqo a;

    bqw(bqo bqo1)
    {
        a = bqo1;
        super();
    }

    public void run()
    {
        if (bqo.k(a).a())
        {
            bqo.k(a).b();
            bqo.a(a, bqo.k(a));
        }
        if (bqo.j(a).a())
        {
            bqo.j(a).b();
            bqo.a(a, bqo.j(a));
        }
    }
}
