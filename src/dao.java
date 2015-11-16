// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class dao extends cxr
{

    private static final long serialVersionUID = 1L;
    private final boolean g;
    private final long h;
    private final long i;
    private final List j = new ArrayList();
    private final boolean k = k();
    private final cfz l[];

    private dao(jfl jfl1)
    {
        int i1 = 0;
        super(jfl1.responseHeader, jfl1.f);
        ixr aixr[];
        if (jfl1.a != null)
        {
            g = true;
            h = g.a(jfl1.a, 0L);
        } else
        {
            g = false;
            h = 0L;
        }
        if (jfl1.c != null)
        {
            i = g.a(jfl1.c, 0L);
        } else
        {
            i = -2L;
        }
        aixr = jfl1.b;
        for (int j1 = aixr.length; i1 < j1; i1++)
        {
            ixr ixr1 = aixr[i1];
            j.add(ixr.toByteArray(ixr1));
        }

        l = cxr.a(jfl1.e, jfl1.b);
        if (cxr.a)
        {
            jfl1 = String.valueOf(jfl1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(jfl1).length() + 37)).append("SyncRecentConversationsResponse from:").append(jfl1).toString());
        }
    }

    private List d(long l1)
    {
        ArrayList arraylist;
        Iterator iterator;
        boolean flag;
        if (b != null)
        {
            flag = ((cxl)b).d;
            if (cxr.a)
            {
                eev.b("Babel", (new StringBuilder(55)).append("SRCResp.buildConversationStateList: suppressNotif=").append(flag).toString());
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
            ctz ctz1 = ctz.a((byte[])iterator.next(), flag, l1);
            if (ctz1 != null)
            {
                arraylist.add(ctz1);
            }
        } while (true);
        return arraylist;
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jfl)kws.mergeFrom(new jfl(), abyte0);
        if (a(((jfl) (abyte0)).responseHeader))
        {
            return new cyd(((jfl) (abyte0)).responseHeader);
        } else
        {
            return new dao(abyte0);
        }
    }

    public void a(aow aow1, dgk dgk1)
    {
        int j1;
        int l1;
        super.a(aow1, dgk1);
        if (eev.a("Babel", 3))
        {
            String s = String.valueOf("processSyncRecentConversationsResponse count: ");
            int i1 = d(0L).size();
            boolean flag = g;
            long l2 = h;
            boolean flag2 = k;
            eev.d("Babel", (new StringBuilder(String.valueOf(s).length() + 105)).append(s).append(i1).append(" has_sync_timestamp: ").append(flag).append(" sync_timestamp: ").append(l2).append(" requestWasForScrollback: ").append(flag2).toString());
        }
        if (edc.b())
        {
            ede ede1 = (new ede()).a("src_response").a(aow1.f());
            boolean flag1 = k;
            ede1.b((new StringBuilder(19)).append("forScrollback=").append(flag1).toString()).b();
        }
        HashSet hashset1 = new HashSet();
        HashSet hashset = new HashSet();
        int k1 = 0;
        cfz acfz[];
        List list;
        Object obj;
        ctz ctz1;
        List list1;
        Object obj1;
        dng dng1;
        int i2;
        long l3;
        long l4;
        long l5;
        if (aoq.a)
        {
            l4 = SystemClock.elapsedRealtime();
        } else
        {
            l4 = 0L;
        }
        if (cxr.j() != null)
        {
            cxr.j().a("sync_recent_conversations_response");
        }
        aow1.a();
        l5 = SystemClock.elapsedRealtime();
        l3 = SystemClock.elapsedRealtime();
        if (l == null) goto _L2; else goto _L1
_L1:
        acfz = l;
        l1 = acfz.length;
        j1 = 0;
_L20:
        if (j1 >= l1) goto _L2; else goto _L3
_L3:
        obj = acfz[j1];
        if (obj == null) goto _L5; else goto _L4
_L4:
        aow1.a(((cfz) (obj)), true);
          goto _L5
_L2:
        list = d(c.d);
        obj = list.iterator();
        j1 = k1;
_L21:
        for (; ((Iterator) (obj)).hasNext(); g.a(aow1.f(), 1839))
        {
            ctz1 = (ctz)((Iterator) (obj)).next();
            if (aoq.a(aow1.f(), ctz1.b))
            {
                break MISSING_BLOCK_LABEL_398;
            }
        }

          goto _L6
        dgk1;
        aow1.c();
        if (cxr.j() != null)
        {
            cxr.j().a(aow1.f().h(), "sync_recent_conversations_response", SystemClock.elapsedRealtime(), 2);
        }
        throw dgk1;
        if (SystemClock.elapsedRealtime() - l3 >= g())
        {
            aow1.d();
            l3 = SystemClock.elapsedRealtime();
        }
        obj1 = ctz1.a;
        list1 = ctz1.c;
        if (eev.a("Babel", 3))
        {
            k1 = list1.size();
            eev.d("Babel", (new StringBuilder(String.valueOf(obj1).length() + 44)).append("processing conversation ").append(((String) (obj1))).append(" events: ").append(k1).toString());
        }
        l1 = j1;
        if (ctz1.b == null)
        {
            break MISSING_BLOCK_LABEL_541;
        }
        l1 = j1;
        if (aoq.a(aow1, ctz1.b, ctz1.h, null, dgk1, null, false))
        {
            l1 = 1;
        }
        if (list1.size() <= 0) goto _L8; else goto _L7
_L7:
        aoq.a(aow1, ctz1.a, ctz1.e, ctz1.f);
        aoq.a(aow1, ctz1.a, 0L, dgk1, null);
        obj1 = new ArrayList();
        j1 = 0;
        i2 = 0;
        k1 = 0;
_L11:
        if (i2 >= list1.size())
        {
            break MISSING_BLOCK_LABEL_726;
        }
        dng1 = (dng)list1.get(i2);
        ((List) (obj1)).addAll(dng1.a());
        if (!(dng1 instanceof dnk)) goto _L10; else goto _L9
_L9:
        j1 = 1;
_L13:
        aoq.a(aow1, dng1, dgk1, h(), i(), l5 * 1000L);
        i2++;
          goto _L11
_L10:
        if (!(dng1 instanceof dmo)) goto _L13; else goto _L12
_L12:
        if (!k())
        {
            break MISSING_BLOCK_LABEL_711;
        }
        ((dmo)dng1).a(4);
        k1 = 1;
          goto _L13
        ((dmo)dng1).a(3);
        k1 = 1;
          goto _L13
        dgk1.a(g.nU, aow1, ctz1.a, ((List) (obj1)));
_L19:
        if (k1 == 0)
        {
            break MISSING_BLOCK_LABEL_757;
        }
        hashset1.add(ctz1.a);
        if (j1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        hashset.add(ctz1.a);
        break; /* Loop/switch isn't completed */
_L6:
        k1 = ((cxl)b).q();
        if (!g || k || k1 != 5)
        {
            break MISSING_BLOCK_LABEL_827;
        }
        aoc.b(g.nU, aow1.f().h(), "last_successful_sync_time", h);
        l1 = list.size();
        aow1.a(i, k1, l1);
        if (k1 != 5) goto _L15; else goto _L14
_L14:
        aow1.a(i, 1, l1);
_L17:
        aow1.j();
        aow1.b();
        aow1.c();
        if (cxr.j() != null)
        {
            cxr.j().a(aow1.f().h(), "sync_recent_conversations_response", SystemClock.elapsedRealtime(), 2);
        }
        dgk1 = ((cxl)b).s();
        if (!TextUtils.isEmpty(dgk1))
        {
            diu.b(aow1.f().h()).c(dgk1);
        }
        if (aoq.a)
        {
            l3 = SystemClock.elapsedRealtime();
            eev.b("Babel", (new StringBuilder(59)).append("processSyncRecentConversations took ").append(l3 - l4).append(" ms").toString());
        }
        if (j1 != 0)
        {
            aoq.d(aow1);
            aow.a(aow1, null);
        }
        for (dgk1 = hashset1.iterator(); dgk1.hasNext(); aoq.d(aow1, (String)dgk1.next())) { }
        break MISSING_BLOCK_LABEL_1052;
_L15:
        if (k1 != 6) goto _L17; else goto _L16
_L16:
        aow1.a(i, 3, l1);
          goto _L17
        for (dgk1 = hashset.iterator(); dgk1.hasNext(); aoq.c(aow1, (String)dgk1.next())) { }
        return;
_L8:
        k1 = 0;
        j1 = 0;
        if (true) goto _L19; else goto _L18
_L5:
        j1++;
          goto _L20
_L18:
        j1 = l1;
          goto _L21
    }

    public boolean k()
    {
        if (b != null)
        {
            gdv.a("Expected condition to be true", b instanceof cxl);
            return ((cxl)b).r();
        } else
        {
            return false;
        }
    }
}
