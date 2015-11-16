// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import com.google.android.apps.hangouts.hangout.IncomingRing;
import com.google.android.apps.hangouts.hangout.IncomingRingActivity;

public final class bqm
    implements android.content.DialogInterface.OnClickListener
{

    final IncomingRingActivity a;

    public bqm(IncomingRingActivity incomingringactivity)
    {
        a = incomingringactivity;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.finish();
        a.j.l();
    }
}
