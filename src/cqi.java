// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class cqi extends cqn
{

    final cqf a;

    cqi(cqf cqf1)
    {
        a = cqf1;
        super(cqf1, (byte)0);
    }

    boolean a()
    {
        if (g.a(cqf.f(a), "babel_network_change_notification", false))
        {
            return ((cdr)hlp.a(cqf.f(a), cdr)).a() == cdq.c;
        } else
        {
            return false;
        }
    }

    dvg b()
    {
        return (new dvh(cqf.f(a))).a(cqf.f(a).getString(l.S)).a();
    }
}
