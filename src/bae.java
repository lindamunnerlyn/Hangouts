// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.hangouts.conversation.v2.TransportSpinner;

public final class bae extends bah
    implements android.view.View.OnClickListener
{

    private final TransportSpinner a;

    public bae(TransportSpinner transportspinner)
    {
        a = transportspinner;
    }

    public String a()
    {
        return g.nS.getResources().getString(l.gL);
    }

    public int b()
    {
        return com.google.android.apps.hangouts.R.drawable.bA;
    }

    public void onClick(View view)
    {
        TransportSpinner.c(a);
    }
}
