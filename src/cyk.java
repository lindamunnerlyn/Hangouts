// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class cyk extends cvn
{

    private static final long serialVersionUID = 1L;
    private final boolean g;
    private final long h;
    private final long i;
    private final List j = new ArrayList();
    private final boolean k = k();
    private final ceu l[];

    private cyk(izg izg1)
    {
        int i1 = 0;
        super(izg1.responseHeader, izg1.f);
        irm airm[];
        if (izg1.a != null)
        {
            g = true;
            h = g.a(izg1.a, 0L);
        } else
        {
            g = false;
            h = 0L;
        }
        if (izg1.c != null)
        {
            i = g.a(izg1.c, 0L);
        } else
        {
            i = -2L;
        }
        airm = izg1.b;
        for (int j1 = airm.length; i1 < j1; i1++)
        {
            irm irm1 = airm[i1];
            j.add(irm.toByteArray(irm1));
        }

        l = cvn.a(izg1.e, izg1.b);
        if (cvn.a)
        {
            izg1 = String.valueOf(izg1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(izg1).length() + 37)).append("SyncRecentConversationsResponse from:").append(izg1).toString());
        }
    }

    private List d(long l1)
    {
        ArrayList arraylist;
        Iterator iterator;
        boolean flag;
        if (b != null)
        {
            flag = ((cvh)b).d;
            if (cvn.a)
            {
                ebw.b("Babel", (new StringBuilder(55)).append("SRCResp.buildConversationStateList: suppressNotif=").append(flag).toString());
            }
        } else
        {
            flag = false;
        }
        arraylist = new ArrayList();
        iterator = j.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            crw crw1 = crw.a((byte[])iterator.next(), flag, l1);
            if (crw1 != null)
            {
                arraylist.add(crw1);
            }
        } while (true);
        return arraylist;
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (izg)kop.mergeFrom(new izg(), abyte0);
        if (a(((izg) (abyte0)).responseHeader))
        {
            return new cvz(((izg) (abyte0)).responseHeader);
        } else
        {
            return new cyk(abyte0);
        }
    }

    public void a(aoe aoe1, dfb dfb)
    {
        int j1;
        int l1;
        super.a(aoe1, dfb);
        if (ebw.a("Babel", 3))
        {
            String s = String.valueOf("processSyncRecentConversationsResponse count: ");
            int i1 = d(0L).size();
            boolean flag = g;
            long l2 = h;
            boolean flag2 = k;
            ebw.d("Babel", (new StringBuilder(String.valueOf(s).length() + 105)).append(s).append(i1).append(" has_sync_timestamp: ").append(flag).append(" sync_timestamp: ").append(l2).append(" requestWasForScrollback: ").append(flag2).toString());
        }
        if (dzy.b())
        {
            eaa eaa1 = (new eaa()).a("src_response").a(aoe1.f());
            boolean flag1 = k;
            eaa1.b((new StringBuilder(19)).append("forScrollback=").append(flag1).toString()).b();
        }
        HashSet hashset1 = new HashSet();
        HashSet hashset = new HashSet();
        int k1 = 0;
        ceu aceu[];
        List list;
        Object obj;
        crw crw1;
        Object obj1;
        Object obj2;
        long l3;
        long l4;
        long l5;
        if (any.a)
        {
            l4 = SystemClock.elapsedRealtime();
        } else
        {
            l4 = 0L;
        }
        if (cvn.j() != null)
        {
            cvn.j().a("sync_recent_conversations_response");
        }
        aoe1.a();
        l5 = SystemClock.elapsedRealtime();
        l3 = SystemClock.elapsedRealtime();
        if (l == null) goto _L2; else goto _L1
_L1:
        aceu = l;
        l1 = aceu.length;
        j1 = 0;
_L15:
        if (j1 >= l1) goto _L2; else goto _L3
_L3:
        obj = aceu[j1];
        if (obj == null) goto _L5; else goto _L4
_L4:
        aoe1.a(((ceu) (obj)), true);
          goto _L5
_L2:
        list = d(c.d);
        obj = list.iterator();
        j1 = k1;
_L16:
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_724;
            }
            crw1 = (crw)((Iterator) (obj)).next();
            if (any.a(aoe1.f(), crw1.b))
            {
                break MISSING_BLOCK_LABEL_398;
            }
            g.a(aoe1.f(), 1839);
        } while (true);
        dfb;
        aoe1.c();
        if (cvn.j() != null)
        {
            cvn.j().a(aoe1.f().h(), "sync_recent_conversations_response", SystemClock.elapsedRealtime(), 2);
        }
        throw dfb;
        if (SystemClock.elapsedRealtime() - l3 >= g())
        {
            aoe1.d();
            l3 = SystemClock.elapsedRealtime();
        }
        obj1 = crw1.a;
        obj2 = crw1.c;
        if (ebw.a("Babel", 3))
        {
            k1 = ((List) (obj2)).size();
            ebw.d("Babel", (new StringBuilder(String.valueOf(obj1).length() + 44)).append("processing conversation ").append(((String) (obj1))).append(" events: ").append(k1).toString());
        }
        l1 = j1;
        if (crw1.b == null)
        {
            break MISSING_BLOCK_LABEL_541;
        }
        l1 = j1;
        if (any.a(aoe1, crw1.b, crw1.h, null, dfb, null, false))
        {
            l1 = 1;
        }
        if (crw1.c.size() > 0)
        {
            any.a(aoe1, crw1.a, crw1.e, crw1.f);
        }
        obj1 = ((List) (obj2)).iterator();
        k1 = 0;
        j1 = 0;
_L8:
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_690;
        }
        obj2 = (cza)((Iterator) (obj1)).next();
        if (!(obj2 instanceof cze)) goto _L7; else goto _L6
_L6:
        j1 = 1;
_L10:
        any.a(aoe1, ((cza) (obj2)), dfb, h(), i(), l5 * 1000L);
          goto _L8
_L7:
        if (!(obj2 instanceof crm)) goto _L10; else goto _L9
_L9:
        if (!k())
        {
            break MISSING_BLOCK_LABEL_675;
        }
        ((crm)obj2).a(4);
        k1 = 1;
          goto _L10
        ((crm)obj2).a(3);
        k1 = 1;
          goto _L10
        if (!k1)
        {
            break MISSING_BLOCK_LABEL_706;
        }
        hashset1.add(crw1.a);
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_1044;
        }
        hashset.add(crw1.a);
        break MISSING_BLOCK_LABEL_1044;
        k1 = ((cvh)b).r();
        if (!g || k || k1 != 5)
        {
            break MISSING_BLOCK_LABEL_767;
        }
        aoe1.g("last_successful_sync_time", h);
        l1 = list.size();
        aoe1.a(i, k1, l1);
        if (k1 != 5) goto _L12; else goto _L11
_L11:
        aoe1.a(i, 1, l1);
_L14:
        aoe1.j();
        aoe1.b();
        aoe1.c();
        if (cvn.j() != null)
        {
            cvn.j().a(aoe1.f().h(), "sync_recent_conversations_response", SystemClock.elapsedRealtime(), 2);
        }
        dfb = ((cvh)b).t();
        if (!TextUtils.isEmpty(dfb))
        {
            dhl.b(aoe1.f().h()).d(dfb);
        }
        if (any.a)
        {
            l3 = SystemClock.elapsedRealtime();
            ebw.b("Babel", (new StringBuilder(59)).append("processSyncRecentConversations took ").append(l3 - l4).append(" ms").toString());
        }
        if (j1 != 0)
        {
            any.d(aoe1);
            aoe.a(aoe1, null);
        }
        for (dfb = hashset1.iterator(); dfb.hasNext(); any.d(aoe1, (String)dfb.next())) { }
        break MISSING_BLOCK_LABEL_992;
_L12:
        if (k1 != 6) goto _L14; else goto _L13
_L13:
        aoe1.a(i, 3, l1);
          goto _L14
        for (dfb = hashset.iterator(); dfb.hasNext(); any.c(aoe1, (String)dfb.next())) { }
        return;
_L5:
        j1++;
          goto _L15
        j1 = l1;
          goto _L16
    }

    public boolean k()
    {
        if (b != null)
        {
            gbh.a(b instanceof cvh);
            return ((cvh)b).s();
        } else
        {
            return false;
        }
    }
}
