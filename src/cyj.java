// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class cyj extends cvn
{

    private static final long serialVersionUID = 1L;
    private final long g;
    private final boolean h;
    private final boolean i;
    private final ArrayList j = new ArrayList();

    private cyj(izd izd1)
    {
        int k = 0;
        super(izd1.responseHeader, izd1.g);
        g = g.a(izd1.b, 0L);
        h = g.a(izd1.a, false);
        i = g.a(izd1.d, false);
        irm airm[] = izd1.c;
        for (int l = airm.length; k < l; k++)
        {
            irm irm1 = airm[k];
            j.add(irm.toByteArray(irm1));
        }

        if (cvn.a)
        {
            izd1 = String.valueOf(izd1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(izd1).length() + 30)).append("SyncAllNewEventsResponse from:").append(izd1).toString());
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (izd)kop.mergeFrom(new izd(), abyte0);
        if (a(((izd) (abyte0)).responseHeader))
        {
            return new cvz(((izd) (abyte0)).responseHeader);
        } else
        {
            return new cyj(abyte0);
        }
    }

    public void a(aoe aoe1, dfb dfb1)
    {
        Object obj;
        int k;
        boolean flag1;
        flag1 = false;
        k = 0;
        obj = null;
        if (dzy.b())
        {
            (new eaa()).a("sane_response").a(aoe1.f()).b();
        }
        if (!h) goto _L2; else goto _L1
_L1:
        super.a(aoe1, dfb1);
        dfb1 = String.valueOf(ebw.b(aoe1.f().a()));
        if (dfb1.length() != 0)
        {
            dfb1 = "Force clear cache and resync for account:".concat(dfb1);
        } else
        {
            dfb1 = new String("Force clear cache and resync for account:");
        }
        ebw.f("Babel", dfb1);
        aoe1.a();
        aoe1.r();
        aoe1.g("last_successful_sync_time", 0L);
        aoe1.t();
        aoe1.b();
        aoe1.c();
        dfb1 = aoe1.f();
        dhl.b(dfb1.h()).d(((cvg)b).s());
        RealTimeChatService.a(dfb1.h(), false, false, 0, false);
        if (dfb1.t())
        {
            ank.b(g.nS, aoe1.f().h(), "sms_last_sync_time_millis");
            dry.b(dfb1);
        }
_L32:
        return;
        dfb1;
        aoe1.c();
        throw dfb1;
_L2:
        boolean flag;
        int j1;
        if (b != null)
        {
            flag1 = ((cvg)b).c;
            obj = ((cvg)b).s();
        }
        Object obj1 = crw.a(j, flag1, c.d);
        super.a(aoe1, dfb1);
        Object obj2;
        HashSet hashset;
        dhl dhl1;
        Iterator iterator;
        crw crw1;
        Object obj3;
        cza cza1;
        int i1;
        long l1;
        long l2;
        long l3;
        long l4;
        if (any.a)
        {
            l2 = SystemClock.elapsedRealtime();
        } else
        {
            l2 = 0L;
        }
        if (ebw.a("Babel", 3))
        {
            int l = ((List) (obj1)).size();
            ebw.d("Babel", (new StringBuilder(50)).append("processSyncAllNewEventsResponse: count ").append(l).toString());
        }
        hashset = new HashSet();
        obj2 = new HashSet();
        if (cvn.j() != null)
        {
            cvn.j().a("sync_all_new_events_response");
        }
        aoe1.a();
        l3 = SystemClock.elapsedRealtime();
        aoe1.O("last_successful_sync_time");
        flag = true;
        if (!i || ((List) (obj1)).size() <= g.a(g.nS, "babel_separate_gcr_threshold", 5)) goto _L4; else goto _L3
_L3:
        ebw.a("Babel", "Fall back to cold start, create SRC request from warm sync");
        dfb1.a(new cvh(5, ((String) (obj))));
        dfb1.a(new cvh(6, null));
        aoe1.r();
        aoe1.m();
        aoe1.g("last_successful_sync_time", 0L);
        k = 1;
_L31:
        aoe1.b();
          goto _L5
_L4:
        l1 = SystemClock.elapsedRealtime();
        dhl1 = dhl.b(aoe1.f().h());
        iterator = ((List) (obj1)).iterator();
_L10:
        if (!iterator.hasNext()) goto _L7; else goto _L6
_L6:
        crw1 = (crw)iterator.next();
        if (any.a(aoe1.f(), crw1.b)) goto _L9; else goto _L8
_L8:
        g.a(aoe1.f(), 1839);
          goto _L10
        dfb1;
        aoe1.c();
        if (cvn.j() != null)
        {
            cvn.j().a(aoe1.f().h(), "sync_all_new_events_response", SystemClock.elapsedRealtime(), 3);
        }
        throw dfb1;
_L9:
label0:
        {
            if (SystemClock.elapsedRealtime() - l1 >= g())
            {
                aoe1.d();
                l1 = SystemClock.elapsedRealtime();
            }
            obj1 = crw1.a;
            if (crw1.g == 0L)
            {
                break label0;
            }
            if (cvn.a)
            {
                l4 = crw1.g;
                ebw.b("Babel", (new StringBuilder(String.valueOf(obj1).length() + 53)).append("Conversation ").append(((String) (obj1))).append(" has leaveTimestamp ").append(l4).toString());
            }
            aoe1.j(((String) (obj1)));
        }
          goto _L10
        j1 = k;
        if (i) goto _L12; else goto _L11
_L11:
        obj3 = crw1.c;
        if (obj3 == null) goto _L14; else goto _L13
_L13:
        i1 = ((List) (obj3)).size();
_L33:
        if (!g.a(g.nS, "babel_crashifmissedpush", false) || i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_1046;
        }
        if (b == null || !((cvg)b).r())
        {
            break MISSING_BLOCK_LABEL_1046;
        }
        l1 = crw1.b.s;
        ebw.g("Babel", (new StringBuilder(String.valueOf(obj1).length() + 67)).append("Got unexpected missed events in SANE ").append(((String) (obj1))).append(" sorttime ").append(l1).toString());
        for (dfb1 = ((List) (obj3)).iterator(); dfb1.hasNext(); ebw.g("Babel", (new StringBuilder(String.valueOf(obj2).length() + 28)).append("  ").append(((String) (obj2))).append(" time ").append(l1).toString()))
        {
            obj = (cza)dfb1.next();
            obj2 = ((cza) (obj)).m;
            l1 = ((cza) (obj)).e;
        }

        dfb1 = String.valueOf(obj1);
        if (dfb1.length() != 0)
        {
            dfb1 = "Got unexpected missed events in SANE ".concat(dfb1);
        } else
        {
            dfb1 = new String("Got unexpected missed events in SANE ");
        }
        throw new IllegalStateException(dfb1);
        if (!any.a) goto _L16; else goto _L15
_L15:
        ebw.b("Babel", (new StringBuilder(String.valueOf(obj1).length() + 40)).append("syncing conversation ").append(((String) (obj1))).append(" events ").append(i1).toString());
_L21:
        i1 = k;
        if (crw1.b == null)
        {
            break MISSING_BLOCK_LABEL_1140;
        }
        i1 = k;
        if (any.a(aoe1, crw1.b, crw1.h, null, dfb1, null, false))
        {
            i1 = 1;
        }
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_1354;
        }
        if (((List) (obj3)).size() <= 0)
        {
            break MISSING_BLOCK_LABEL_1354;
        }
        k = 0;
        j1 = 0;
        obj3 = ((List) (obj3)).iterator();
_L19:
        if (!((Iterator) (obj3)).hasNext())
        {
            break MISSING_BLOCK_LABEL_1328;
        }
        cza1 = (cza)((Iterator) (obj3)).next();
        if (!(cza1 instanceof cze)) goto _L18; else goto _L17
_L17:
        k = 1;
_L24:
        any.a(aoe1, cza1, dfb1, h(), i(), l3 * 1000L);
          goto _L19
_L16:
        if (i1 <= 0) goto _L21; else goto _L20
_L20:
        if (!ebw.a("Babel", 3)) goto _L21; else goto _L22
_L22:
        ebw.d("Babel", (new StringBuilder(String.valueOf(obj1).length() + 40)).append("syncing conversation ").append(((String) (obj1))).append(" events ").append(i1).toString());
          goto _L21
_L18:
        if (!(cza1 instanceof crm)) goto _L24; else goto _L23
_L23:
        a(aoe1.f(), ((String) (obj)), (crm)cza1);
        ((crm)cza1).a(2);
        j1 = 1;
          goto _L24
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_1341;
        }
        hashset.add(obj1);
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_1354;
        }
        ((HashSet) (obj2)).add(obj1);
        j1 = i1;
        if (!any.a) goto _L12; else goto _L25
_L25:
        flag1 = crw1.d;
        ebw.b("Babel", (new StringBuilder(26)).append("mustQuerySeparately: ").append(flag1).toString());
        j1 = i1;
_L12:
        if (crw1.b != null || aoe1.p(crw1.a))
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (!i && k != 0) goto _L27; else goto _L26
_L26:
        k = 0;
        if (!any.a) goto _L29; else goto _L28
_L28:
        obj1 = String.valueOf(crw1.a);
        if (((String) (obj1)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_1516;
        }
        obj1 = "requesting more events for ".concat(((String) (obj1)));
_L30:
        ebw.b("Babel", ((String) (obj1)));
_L29:
        dfb1.a(new cuc(crw1.a, true, true, false, null, 0L, ((String) (obj)), 0L, null));
        dhl1.b(((String) (obj)));
        break MISSING_BLOCK_LABEL_1660;
        obj1 = new String("requesting more events for ");
          goto _L30
_L7:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_1570;
        }
        if (any.a)
        {
            ebw.b("Babel", "sync finished");
        }
        aoe1.g("last_successful_sync_time", g);
        dhl1.d(((String) (obj)));
          goto _L31
        if (any.a)
        {
            ebw.b("Babel", "sync not finished");
        }
        aoe1.g("in_progress_sync_time", g);
          goto _L31
_L5:
        aoe1.c();
        if (cvn.j() != null)
        {
            cvn.j().a(aoe1.f().h(), "sync_all_new_events_response", SystemClock.elapsedRealtime(), 3);
        }
        if (any.a)
        {
            l1 = SystemClock.elapsedRealtime();
            ebw.b("Babel", (new StringBuilder(40)).append("processSANE took ").append(l1 - l2).append(" ms").toString());
        }
        if (k != 0)
        {
            any.d(aoe1);
        }
        for (dfb1 = hashset.iterator(); dfb1.hasNext(); any.d(aoe1, (String)dfb1.next())) { }
        dfb1 = ((HashSet) (obj2)).iterator();
        while (dfb1.hasNext()) 
        {
            any.c(aoe1, (String)dfb1.next());
        }
          goto _L32
_L27:
        k = ((flag) ? 1 : 0);
        break MISSING_BLOCK_LABEL_1660;
_L14:
        i1 = 0;
          goto _L33
        flag = k;
        k = j1;
          goto _L10
    }
}
