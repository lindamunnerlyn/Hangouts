// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.wearable.internal.ChannelEventParcelable;

final class ftz
    implements Runnable
{

    final ChannelEventParcelable a;
    final ftq b;

    ftz(ftq ftq, ChannelEventParcelable channeleventparcelable)
    {
        b = ftq;
        a = channeleventparcelable;
        super();
    }

    public void run()
    {
        a.a();
    }
}
