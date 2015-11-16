// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class djh extends dep
{

    private static final ConcurrentHashMap a = new ConcurrentHashMap();
    private long d;
    private final cvm e[] = new cvm[14];

    private djh(int j, long l, long l1)
    {
        super(dbf.e(j), l, l1);
        d = -1L;
        e[0] = new cvm(1, 10, 1, "sent_sms_count_since_last_upload");
        e[1] = new cvm(1, 9, 1, "received_sms_count_since_last_upload");
        e[2] = new cvm(1, 10, 2, "sent_mms_count_since_last_upload");
        e[3] = new cvm(1, 9, 2, "received_mms_count_since_last_upload");
        e[4] = new cvm(3, 6, 0, "shown_sms_promo_screen_launch_count_since_last_upload");
        e[5] = new cvm(3, 7, 0, "accepted_sms_promo_screen_launch_count_since_last_upload");
        e[6] = new cvm(3, 8, 0, "declined_sms_promo_screen_launch_count_since_last_upload");
        e[7] = new cvm(4, 6, 0, "shown_sms_promo_screen_notify_count_since_last_upload");
        e[8] = new cvm(4, 7, 0, "accepted_sms_promo_screen_notify_count_since_last_upload");
        e[9] = new cvm(4, 8, 0, "declined_sms_promo_screen_notify_count_since_last_upload");
        e[10] = new cvm(5, 6, 0, "shown_sms_promo_banner_count_since_last_upload");
        e[11] = new cvm(5, 7, 0, "accepted_sms_promo_banner_count_since_last_upload");
        e[12] = new cvm(5, 8, 0, "declined_sms_promo_banner_count_since_last_upload");
        e[13] = new cvm(6, 6, 0, "shown_sms_promo_notify_count_since_last_upload");
    }

    public static djh b(int j)
    {
        djh djh2 = (djh)a.get(Integer.valueOf(j));
        djh djh1 = djh2;
        if (djh2 == null)
        {
            djh1 = new djh(j, g.a(g.nS, "babel_upload_analytics_lomark_seconds", 28800) * 1000, g.a(g.nS, "babel_upload_analytics_highmark_seconds", 43200) * 1000);
            a.putIfAbsent(Integer.valueOf(j), djh1);
            djh1 = (djh)a.get(Integer.valueOf(j));
        }
        return djh1;
    }

    public void a()
    {
        c.c().clear();
        int j = 0;
        int k;
        int l;
        for (k = 0; j < e.length; k = l)
        {
            String s = e[j].a();
            long l1 = ((gms)hgx.a(g.nS, gms)).a(b.h()).a(s, 0L);
            e[j].a(l1);
            l = k;
            if (l1 > 0L)
            {
                ((gms)hgx.a(g.nS, gms)).b(b.h()).c(s, 0L).d();
                l = k + 1;
            }
            j++;
        }

        if (k > 0)
        {
            cvl cvl1 = new cvl(e, k);
            c.a(cvl1);
            return;
        }
        if (ebw.a("Babel", 3))
        {
            ebw.c("Babel", "Skip UploadAnalyticsOperation since there is nothing to upload");
        }
        a(3);
    }

    protected void a(long l)
    {
        d = l;
        ((gms)hgx.a(g.nS, gms)).b(b.h()).c("last_upload_analytics_time", l).d();
    }

    protected long i()
    {
        if (d == -1L)
        {
            d = ((gms)hgx.a(g.nS, gms)).a(b.h()).a("last_upload_analytics_time", -1L);
        }
        return d;
    }

}
