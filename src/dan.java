// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class dan extends cxr
{

    private static final long serialVersionUID = 1L;
    private final long g;
    private final boolean h;
    private final boolean i;
    private final ArrayList j = new ArrayList();

    private dan(jfi jfi1)
    {
        int k = 0;
        super(jfi1.responseHeader, jfi1.g);
        g = g.a(jfi1.b, 0L);
        h = g.a(jfi1.a, false);
        i = g.a(jfi1.d, false);
        ixr aixr[] = jfi1.c;
        for (int l = aixr.length; k < l; k++)
        {
            ixr ixr1 = aixr[k];
            j.add(ixr.toByteArray(ixr1));
        }

        if (cxr.a)
        {
            jfi1 = String.valueOf(jfi1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(jfi1).length() + 30)).append("SyncAllNewEventsResponse from:").append(jfi1).toString());
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jfi)kws.mergeFrom(new jfi(), abyte0);
        if (a(((jfi) (abyte0)).responseHeader))
        {
            return new cyd(((jfi) (abyte0)).responseHeader);
        } else
        {
            return new dan(abyte0);
        }
    }

    public void a(aow aow1, dgk dgk1)
    {
        Object obj;
        int k;
        boolean flag2;
        flag2 = false;
        k = 0;
        obj = null;
        if (edc.b())
        {
            (new ede()).a("sane_response").a(aow1.f()).b();
        }
        if (!h) goto _L2; else goto _L1
_L1:
        super.a(aow1, dgk1);
        dgk1 = String.valueOf(eev.b(aow1.f().a()));
        if (dgk1.length() != 0)
        {
            dgk1 = "Force clear cache and resync for account:".concat(dgk1);
        } else
        {
            dgk1 = new String("Force clear cache and resync for account:");
        }
        eev.f("Babel", dgk1);
        aow1.a();
        aow1.r();
        aoc.b(g.nU, aow1.f().h(), "last_successful_sync_time", 0L);
        aow1.t();
        aow1.b();
        aow1.c();
        dgk1 = aow1.f();
        diu.b(dgk1.h()).c(((cxk)b).r());
        RealTimeChatService.a(dgk1.h(), false, false, 0, false);
        if (dgk1.r())
        {
            aoc.b(g.nU, aow1.f().h(), "sms_last_sync_time_millis");
            dur.b(dgk1);
        }
_L32:
        return;
        dgk1;
        aow1.c();
        throw dgk1;
_L2:
        boolean flag;
        int j1;
        if (b != null)
        {
            flag2 = ((cxk)b).c;
            obj = ((cxk)b).r();
        }
        Object obj1 = ctz.a(j, flag2, c.d);
        super.a(aow1, dgk1);
        Object obj2;
        HashSet hashset;
        diu diu1;
        Iterator iterator;
        ctz ctz1;
        List list;
        ArrayList arraylist;
        dng dng1;
        int i1;
        boolean flag1;
        long l1;
        long l2;
        long l3;
        long l4;
        if (aoq.a)
        {
            l2 = SystemClock.elapsedRealtime();
        } else
        {
            l2 = 0L;
        }
        if (eev.a("Babel", 3))
        {
            int l = ((List) (obj1)).size();
            eev.d("Babel", (new StringBuilder(50)).append("processSyncAllNewEventsResponse: count ").append(l).toString());
        }
        hashset = new HashSet();
        obj2 = new HashSet();
        if (cxr.j() != null)
        {
            cxr.j().a("sync_all_new_events_response");
        }
        aow1.a();
        l3 = SystemClock.elapsedRealtime();
        aoc.a(g.nU, aow1.f().h(), "last_successful_sync_time", 0L);
        flag = true;
        if (!i || ((List) (obj1)).size() <= g.a(g.nU, "babel_separate_gcr_threshold", 5)) goto _L4; else goto _L3
_L3:
        eev.a("Babel", "Fall back to cold start, create SRC request from warm sync");
        dgk1.a(new cxl(5, ((String) (obj))));
        dgk1.a(new cxl(6, null));
        aow1.r();
        aow1.m();
        aoc.b(g.nU, aow1.f().h(), "last_successful_sync_time", 0L);
        k = 1;
_L31:
        aow1.b();
          goto _L5
_L4:
        l1 = SystemClock.elapsedRealtime();
        diu1 = diu.b(aow1.f().h());
        iterator = ((List) (obj1)).iterator();
_L10:
        if (!iterator.hasNext()) goto _L7; else goto _L6
_L6:
        ctz1 = (ctz)iterator.next();
        if (aoq.a(aow1.f(), ctz1.b)) goto _L9; else goto _L8
_L8:
        g.a(aow1.f(), 1839);
          goto _L10
        dgk1;
        aow1.c();
        if (cxr.j() != null)
        {
            cxr.j().a(aow1.f().h(), "sync_all_new_events_response", SystemClock.elapsedRealtime(), 3);
        }
        throw dgk1;
_L9:
label0:
        {
            if (SystemClock.elapsedRealtime() - l1 >= g())
            {
                aow1.d();
                l1 = SystemClock.elapsedRealtime();
            }
            obj1 = ctz1.a;
            if (ctz1.g == 0L)
            {
                break label0;
            }
            if (cxr.a)
            {
                l4 = ctz1.g;
                eev.b("Babel", (new StringBuilder(String.valueOf(obj1).length() + 53)).append("Conversation ").append(((String) (obj1))).append(" has leaveTimestamp ").append(l4).toString());
            }
            aow1.j(((String) (obj1)));
        }
          goto _L10
        j1 = k;
        if (i) goto _L12; else goto _L11
_L11:
        list = ctz1.c;
        if (list == null) goto _L14; else goto _L13
_L13:
        i1 = list.size();
_L33:
        if (!g.a(g.nU, "babel_crashifmissedpush", false) || i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_1074;
        }
        if (b == null || !((cxk)b).q())
        {
            break MISSING_BLOCK_LABEL_1074;
        }
        l1 = ctz1.b.s;
        eev.g("Babel", (new StringBuilder(String.valueOf(obj1).length() + 67)).append("Got unexpected missed events in SANE ").append(((String) (obj1))).append(" sorttime ").append(l1).toString());
        for (dgk1 = list.iterator(); dgk1.hasNext(); eev.g("Babel", (new StringBuilder(String.valueOf(obj2).length() + 28)).append("  ").append(((String) (obj2))).append(" time ").append(l1).toString()))
        {
            obj = (dng)dgk1.next();
            obj2 = ((dng) (obj)).m;
            l1 = ((dng) (obj)).e;
        }

        dgk1 = String.valueOf(obj1);
        if (dgk1.length() != 0)
        {
            dgk1 = "Got unexpected missed events in SANE ".concat(dgk1);
        } else
        {
            dgk1 = new String("Got unexpected missed events in SANE ");
        }
        throw new IllegalStateException(dgk1);
        if (!aoq.a) goto _L16; else goto _L15
_L15:
        eev.b("Babel", (new StringBuilder(String.valueOf(obj1).length() + 40)).append("syncing conversation ").append(((String) (obj1))).append(" events ").append(i1).toString());
_L21:
        i1 = k;
        if (ctz1.b == null)
        {
            break MISSING_BLOCK_LABEL_1168;
        }
        i1 = k;
        if (aoq.a(aow1, ctz1.b, ctz1.h, null, dgk1, null, false))
        {
            i1 = 1;
        }
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_1436;
        }
        if (list.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_1436;
        }
        aoq.a(aow1, ctz1.a, 0L, dgk1, null);
        arraylist = new ArrayList();
        k = 0;
        j1 = 0;
        flag1 = false;
_L19:
        if (j1 >= list.size())
        {
            break MISSING_BLOCK_LABEL_1395;
        }
        dng1 = (dng)list.get(j1);
        arraylist.addAll(dng1.a());
        if (!(dng1 instanceof dnk)) goto _L18; else goto _L17
_L17:
        k = 1;
_L24:
        aoq.a(aow1, dng1, dgk1, h(), i(), l3 * 1000L);
        j1++;
          goto _L19
_L16:
        if (i1 <= 0) goto _L21; else goto _L20
_L20:
        if (!eev.a("Babel", 3)) goto _L21; else goto _L22
_L22:
        eev.d("Babel", (new StringBuilder(String.valueOf(obj1).length() + 40)).append("syncing conversation ").append(((String) (obj1))).append(" events ").append(i1).toString());
          goto _L21
_L18:
        if (!(dng1 instanceof dmo)) goto _L24; else goto _L23
_L23:
        a(aow1.f(), ((String) (obj)), (dmo)dng1);
        ((dmo)dng1).a(2);
        flag1 = true;
          goto _L24
        dgk1.a(g.nU, aow1, ctz1.a, arraylist);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_1423;
        }
        hashset.add(obj1);
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_1436;
        }
        ((HashSet) (obj2)).add(obj1);
        j1 = i1;
        if (!aoq.a) goto _L12; else goto _L25
_L25:
        flag2 = ctz1.d;
        eev.b("Babel", (new StringBuilder(26)).append("mustQuerySeparately: ").append(flag2).toString());
        j1 = i1;
_L12:
        if (ctz1.b != null || aow1.p(ctz1.a))
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (!i && k != 0) goto _L27; else goto _L26
_L26:
        k = 0;
        if (!aoq.a) goto _L29; else goto _L28
_L28:
        obj1 = String.valueOf(ctz1.a);
        if (((String) (obj1)).length() == 0)
        {
            break MISSING_BLOCK_LABEL_1598;
        }
        obj1 = "requesting more events for ".concat(((String) (obj1)));
_L30:
        eev.b("Babel", ((String) (obj1)));
_L29:
        dgk1.a(new cwg(ctz1.a, true, true, false, null, 0L, ((String) (obj)), 0L, null));
        diu1.a(((String) (obj)));
        break MISSING_BLOCK_LABEL_1760;
        obj1 = new String("requesting more events for ");
          goto _L30
_L7:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_1661;
        }
        if (aoq.a)
        {
            eev.b("Babel", "sync finished");
        }
        aoc.b(g.nU, aow1.f().h(), "last_successful_sync_time", g);
        diu1.c(((String) (obj)));
          goto _L31
        if (aoq.a)
        {
            eev.b("Babel", "sync not finished");
        }
        aoc.b(g.nU, aow1.f().h(), "in_progress_sync_time", g);
          goto _L31
_L5:
        aow1.c();
        if (cxr.j() != null)
        {
            cxr.j().a(aow1.f().h(), "sync_all_new_events_response", SystemClock.elapsedRealtime(), 3);
        }
        if (aoq.a)
        {
            l1 = SystemClock.elapsedRealtime();
            eev.b("Babel", (new StringBuilder(40)).append("processSANE took ").append(l1 - l2).append(" ms").toString());
        }
        if (k != 0)
        {
            aoq.d(aow1);
        }
        for (dgk1 = hashset.iterator(); dgk1.hasNext(); aoq.d(aow1, (String)dgk1.next())) { }
        dgk1 = ((HashSet) (obj2)).iterator();
        while (dgk1.hasNext()) 
        {
            aoq.c(aow1, (String)dgk1.next());
        }
          goto _L32
_L27:
        k = ((flag) ? 1 : 0);
        break MISSING_BLOCK_LABEL_1760;
_L14:
        i1 = 0;
          goto _L33
        flag = k;
        k = j1;
          goto _L10
    }
}
