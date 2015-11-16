// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.conversation.v2.TransportSpinner;

public final class bau extends csw
{

    final TransportSpinner a;

    public bau(TransportSpinner transportspinner, Context context, hof hof, int i)
    {
        a = transportspinner;
        super(context, hof, i, cvc.a.j);
    }

    public void a(cuz cuz1)
    {
        TransportSpinner.a(a, cuz1.e());
    }

    protected void c()
    {
        TransportSpinner.a(a, false);
    }
}
