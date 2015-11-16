// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.hangout.InCallDialpadActivity;

public final class bps extends boh
{

    final InCallDialpadActivity a;

    public bps(InCallDialpadActivity incalldialpadactivity)
    {
        a = incalldialpadactivity;
        super();
    }

    public void b(int i)
    {
        if ((i & 1) == 0)
        {
            a.finish();
        }
    }
}
