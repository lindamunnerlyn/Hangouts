// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dut
    implements Runnable
{

    final aoa a;

    dut(aoa aoa1)
    {
        a = aoa1;
        super();
    }

    public void run()
    {
        aoc.b(g.nU, a.h(), "sms_last_sync_time_millis");
        aoc.b(g.nU, a.h(), "sms_last_full_sync_time_millis");
        aoc.b(g.nU, a.h(), "sms_no_full_sync_till_millis");
        aoq.a(new aow(g.nU, a.h()));
    }
}
