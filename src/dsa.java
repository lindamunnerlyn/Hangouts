// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dsa
    implements Runnable
{

    final ani a;

    dsa(ani ani1)
    {
        a = ani1;
        super();
    }

    public void run()
    {
        ank.b(g.nS, a.h(), "sms_last_sync_time_millis");
        ank.b(g.nS, a.h(), "sms_last_full_sync_time_millis");
        ank.b(g.nS, a.h(), "sms_no_full_sync_till_millis");
        any.a(new aoe(g.nS, a.h()));
    }
}
