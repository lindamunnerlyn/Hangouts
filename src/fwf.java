// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.wearable.internal.ChannelEventParcelable;

final class fwf
    implements Runnable
{

    final ChannelEventParcelable a;
    final fvw b;

    fwf(fvw fvw, ChannelEventParcelable channeleventparcelable)
    {
        b = fvw;
        a = channeleventparcelable;
        super();
    }

    public void run()
    {
        a.a();
    }
}
