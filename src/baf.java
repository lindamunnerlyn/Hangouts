// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.conversation.v2.TransportSpinner;

public final class baf extends ebd
{

    final TransportSpinner a;

    public baf(TransportSpinner transportspinner, hjm hjm, int i)
    {
        a = transportspinner;
        super(hjm, i, csz.a.j);
    }

    public void a(csw csw1)
    {
        TransportSpinner.a(a, csw1.e());
    }

    protected void c()
    {
        TransportSpinner.a(a, false);
    }
}
