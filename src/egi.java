// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.views.BalanceView;

public final class egi
    implements Runnable
{

    final BalanceView a;

    public egi(BalanceView balanceview)
    {
        a = balanceview;
        super();
    }

    public void run()
    {
        a.b.a(new egj(this));
    }
}
