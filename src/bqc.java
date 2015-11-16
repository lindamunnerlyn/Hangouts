// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.hangout.IncomingInviteService;

public final class bqc
    implements Runnable
{

    final aoa a;
    final com.google.apps.gcomm.hangout.proto.Hangouts.HangoutInviteNotification b;
    final String c;
    final String d;
    final long e;
    final long f;
    final IncomingInviteService g;

    public bqc(IncomingInviteService incominginviteservice, aoa aoa1, com.google.apps.gcomm.hangout.proto.Hangouts.HangoutInviteNotification hangoutinvitenotification, String s, String s1, long l, 
            long l1)
    {
        g = incominginviteservice;
        a = aoa1;
        b = hangoutinvitenotification;
        c = s;
        d = s1;
        e = l;
        f = l1;
        super();
    }

    public void run()
    {
        gdv.a("Expected condition to be true", IncomingInviteService.e().isHeld());
        aow aow1 = new aow(g, a.h());
        byte byte0;
        if (g.a(b.notificationType, 0) == 1)
        {
            byte0 = 20;
        } else
        {
            byte0 = 10;
        }
        aow1.a(a, c, d, e, f, byte0);
        IncomingInviteService.e().release();
    }
}
