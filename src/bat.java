// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.hangouts.conversation.v2.TransportSpinner;

public final class bat extends baw
    implements android.view.View.OnClickListener
{

    private final TransportSpinner a;

    public bat(TransportSpinner transportspinner)
    {
        a = transportspinner;
    }

    public String a()
    {
        return g.nU.getResources().getString(l.gu);
    }

    public int b()
    {
        return com.google.android.apps.hangouts.R.drawable.bw;
    }

    public void onClick(View view)
    {
        a.a();
    }
}
