// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.hangout.HangoutSelfMenu;

final class bqn
    implements Runnable
{

    final bqf a;

    bqn(bqf bqf1)
    {
        a = bqf1;
        super();
    }

    public void run()
    {
        if (bqf.k(a).a())
        {
            bqf.k(a).b();
            bqf.a(a, bqf.k(a));
        }
        if (bqf.j(a).a())
        {
            bqf.j(a).b();
            bqf.a(a, bqf.j(a));
        }
    }
}
