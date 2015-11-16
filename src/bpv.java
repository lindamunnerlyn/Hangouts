// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.hangout.IncomingRing;

public final class bpv
    implements Runnable
{

    final IncomingRing a;

    public bpv(IncomingRing incomingring)
    {
        a = incomingring;
        super();
    }

    public void run()
    {
        IncomingRing.a(a);
    }
}
