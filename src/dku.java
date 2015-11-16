// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ConcurrentHashMap;

public final class dku extends dfy
{

    private static final ConcurrentHashMap a = new ConcurrentHashMap();
    private long e;
    private final cxq f[] = new cxq[14];

    private dku(int j, long l, long l1)
    {
        super(dcn.e(j), l, l1);
        e = -1L;
        f[0] = new cxq(1, 10, 1, "sent_sms_count_since_last_upload");
        f[1] = new cxq(1, 9, 1, "received_sms_count_since_last_upload");
        f[2] = new cxq(1, 10, 2, "sent_mms_count_since_last_upload");
        f[3] = new cxq(1, 9, 2, "received_mms_count_since_last_upload");
        f[4] = new cxq(3, 6, 0, "shown_sms_promo_screen_launch_count_since_last_upload");
        f[5] = new cxq(3, 7, 0, "accepted_sms_promo_screen_launch_count_since_last_upload");
        f[6] = new cxq(3, 8, 0, "declined_sms_promo_screen_launch_count_since_last_upload");
        f[7] = new cxq(4, 6, 0, "shown_sms_promo_screen_notify_count_since_last_upload");
        f[8] = new cxq(4, 7, 0, "accepted_sms_promo_screen_notify_count_since_last_upload");
        f[9] = new cxq(4, 8, 0, "declined_sms_promo_screen_notify_count_since_last_upload");
        f[10] = new cxq(5, 6, 0, "shown_sms_promo_banner_count_since_last_upload");
        f[11] = new cxq(5, 7, 0, "accepted_sms_promo_banner_count_since_last_upload");
        f[12] = new cxq(5, 8, 0, "declined_sms_promo_banner_count_since_last_upload");
        f[13] = new cxq(6, 6, 0, "shown_sms_promo_notify_count_since_last_upload");
    }

    public static dku b(int j)
    {
        dku dku2 = (dku)a.get(Integer.valueOf(j));
        dku dku1 = dku2;
        if (dku2 == null)
        {
            dku1 = new dku(j, g.a(g.nU, "babel_upload_analytics_lomark_seconds", 28800) * 1000, g.a(g.nU, "babel_upload_analytics_highmark_seconds", 43200) * 1000);
            a.putIfAbsent(Integer.valueOf(j), dku1);
            dku1 = (dku)a.get(Integer.valueOf(j));
        }
        return dku1;
    }

    public void a()
    {
        k();
        int j = 0;
        int k;
        int l;
        for (k = 0; j < f.length; k = l)
        {
            String s = f[j].a();
            long l1 = ((gqz)hlp.a(g.nU, gqz)).a(super.b.a).a(s, 0L);
            f[j].a(l1);
            l = k;
            if (l1 > 0L)
            {
                ((gqz)hlp.a(g.nU, gqz)).b(super.b.a).c(s, 0L).d();
                l = k + 1;
            }
            j++;
        }

        if (k > 0)
        {
            a(((dmf) (new cxp(f, k))));
            return;
        }
        if (eev.a("Babel", 3))
        {
            eev.c("Babel", "Skip UploadAnalyticsOperation since there is nothing to upload");
        }
        a(3);
    }

    protected void a(long l)
    {
        e = l;
        ((gqz)hlp.a(g.nU, gqz)).b(super.b.a).c("last_upload_analytics_time", l).d();
    }

    protected long i()
    {
        if (e == -1L)
        {
            e = ((gqz)hlp.a(g.nU, gqz)).a(super.b.a).a("last_upload_analytics_time", -1L);
        }
        return e;
    }

}
