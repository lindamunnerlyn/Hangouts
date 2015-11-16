// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class cvg extends cui
{

    private static final long serialVersionUID = 1L;
    public final long a;
    public final List b;
    public final boolean c;
    private final List d;
    private boolean j;
    private boolean k;
    private final String l;

    public cvg(long l1, List list, List list1, boolean flag, boolean flag1, String s1)
    {
        a = l1;
        b = list;
        list = new ArrayList();
        izl izl1;
        for (list1 = list1.iterator(); list1.hasNext(); list.add(izl.toByteArray(izl1)))
        {
            Pair pair = (Pair)list1.next();
            izl1 = new izl();
            izl1.a = ctq.a((String)pair.first);
            izl1.b = (Long)pair.second;
        }

        d = list;
        j = flag;
        c = flag1;
        l = s1;
    }

    public kop a(String s1, int i, int i1)
    {
        boolean flag = false;
        if (ctr.e)
        {
            ebw.b("Babel_RequestWriter", "SyncAllNewEvents.buildProtobuf");
        }
        izc izc1 = new izc();
        if (dzy.b())
        {
            Object obj1 = (new eaa()).a("sane_build_proto");
            Object obj = String.valueOf(s1);
            int j1;
            if (((String) (obj)).length() != 0)
            {
                obj = "id=".concat(((String) (obj)));
            } else
            {
                obj = new String("id=");
            }
            ((eaa) (obj1)).b(((String) (obj))).b((new StringBuilder(17)).append("retry=").append(i).toString()).b();
        }
        if (b != null)
        {
            izc1.b = new iva[b.size()];
            obj = b.iterator();
            for (j1 = 0; ((Iterator) (obj)).hasNext(); j1++)
            {
                obj1 = (cuj)((Iterator) (obj)).next();
                izc1.b[j1] = ((cuj) (obj1)).a();
            }

        } else
        {
            ebw.g("Babel_RequestWriter", "SyncAllNewEventsRequest.buildProtobuf: null localState");
        }
        if (d != null)
        {
            izc1.c = new izl[d.size()];
            int k1 = ((flag) ? 1 : 0);
            while (k1 < d.size()) 
            {
                byte abyte0[] = (byte[])d.get(k1);
                try
                {
                    izc1.c[k1] = (izl)kop.mergeFrom(new izl(), abyte0);
                }
                catch (koo koo1) { }
                k1++;
            }
        } else
        {
            ebw.g("Babel_RequestWriter", "SyncAllNewEventsRequest.buildProtobuf: null rawUnreadConversationStates");
        }
        izc1.d = Integer.valueOf(g.a(g.nS, "babel_smaxbytesperws", 0x186a0));
        izc1.requestHeader = ctq.a(s1, i, i1, h);
        izc1.a = Long.valueOf(a);
        izc1.e = Boolean.valueOf(j);
        return izc1;
    }

    public void a(ani ani1, dbo dbo1)
    {
        String s1 = ani1.a();
        boolean flag;
        if (dbo1.c() == 120)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (ctr.e)
        {
            dbo1 = String.valueOf(s1);
            boolean flag1;
            if (dbo1.length() != 0)
            {
                dbo1 = "SyncAllNewEvents.onFailed ".concat(dbo1);
            } else
            {
                dbo1 = new String("SyncAllNewEvents.onFailed ");
            }
            ebw.b("Babel_RequestWriter", dbo1);
        }
        if (dzy.b())
        {
            dbo1 = (new eaa()).a("sane_expired").d(s1);
            flag1 = k;
            dbo1.b((new StringBuilder(16)).append("isReplaced=").append(flag1).toString()).b((new StringBuilder(13)).append("expired=").append(flag).toString()).b();
        }
        dhl.b(ani1.h()).e(l);
    }

    public boolean a(ccg ccg)
    {
        gbh.a(getClass(), ccg.getClass());
        ccg = (cvg)ccg;
        if (!((cvg) (ccg)).j)
        {
            j = false;
        }
        ccg.k = true;
        return true;
    }

    public long b()
    {
        if (j)
        {
            return g.a(g.nS, "babel_sane_refresh_timeout", 0x15f90L);
        } else
        {
            return g.a(g.nS, "babel_sane_timeout", djk.d);
        }
    }

    public String g()
    {
        return "conversations/syncallnewevents";
    }

    public boolean r()
    {
        return j;
    }

    public String s()
    {
        return l;
    }
}
