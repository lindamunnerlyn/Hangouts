// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class cxk extends cwm
{

    private static final long serialVersionUID = 1L;
    public final long a;
    public final List b;
    public final boolean c;
    private final List d;
    private boolean j;
    private boolean k;
    private final String l;

    public cxk(long l1, List list, List list1, boolean flag, boolean flag1, String s)
    {
        a = l1;
        b = list;
        list = new ArrayList();
        jfq jfq1;
        for (list1 = list1.iterator(); list1.hasNext(); list.add(jfq.toByteArray(jfq1)))
        {
            Pair pair = (Pair)list1.next();
            jfq1 = new jfq();
            jfq1.a = cvu.a((String)pair.first);
            jfq1.b = (Long)pair.second;
        }

        d = list;
        j = flag;
        c = flag1;
        l = s;
    }

    public kws a(String s, int i, int i1)
    {
        boolean flag = false;
        if (cvv.e)
        {
            eev.b("Babel_RequestWriter", "SyncAllNewEvents.buildProtobuf");
        }
        jfh jfh1 = new jfh();
        if (edc.b())
        {
            Object obj1 = (new ede()).a("sane_build_proto");
            Object obj = String.valueOf(s);
            int j1;
            if (((String) (obj)).length() != 0)
            {
                obj = "id=".concat(((String) (obj)));
            } else
            {
                obj = new String("id=");
            }
            ((ede) (obj1)).b(((String) (obj))).b((new StringBuilder(17)).append("retry=").append(i).toString()).b();
        }
        if (b != null)
        {
            jfh1.b = new jbf[b.size()];
            obj = b.iterator();
            for (j1 = 0; ((Iterator) (obj)).hasNext(); j1++)
            {
                obj1 = (cwn)((Iterator) (obj)).next();
                jfh1.b[j1] = ((cwn) (obj1)).a();
            }

        } else
        {
            eev.g("Babel_RequestWriter", "SyncAllNewEventsRequest.buildProtobuf: null localState");
        }
        if (d != null)
        {
            jfh1.c = new jfq[d.size()];
            int k1 = ((flag) ? 1 : 0);
            while (k1 < d.size()) 
            {
                byte abyte0[] = (byte[])d.get(k1);
                try
                {
                    jfh1.c[k1] = (jfq)kws.mergeFrom(new jfq(), abyte0);
                }
                catch (kwr kwr1) { }
                k1++;
            }
        } else
        {
            eev.g("Babel_RequestWriter", "SyncAllNewEventsRequest.buildProtobuf: null rawUnreadConversationStates");
        }
        jfh1.d = Integer.valueOf(g.a(g.nU, "babel_smaxbytesperws", 0x186a0));
        jfh1.requestHeader = cvu.a(s, i, i1, h);
        jfh1.a = Long.valueOf(a);
        jfh1.e = Boolean.valueOf(j);
        return jfh1;
    }

    public void a(aoa aoa1, dcx dcx1)
    {
        String s = aoa1.a();
        boolean flag;
        if (dcx1.c() == 120)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (cvv.e)
        {
            dcx1 = String.valueOf(s);
            boolean flag1;
            if (dcx1.length() != 0)
            {
                dcx1 = "SyncAllNewEvents.onFailed ".concat(dcx1);
            } else
            {
                dcx1 = new String("SyncAllNewEvents.onFailed ");
            }
            eev.b("Babel_RequestWriter", dcx1);
        }
        if (edc.b())
        {
            dcx1 = (new ede()).a("sane_expired").d(s);
            flag1 = k;
            dcx1.b((new StringBuilder(16)).append("isReplaced=").append(flag1).toString()).b((new StringBuilder(13)).append("expired=").append(flag).toString()).b();
        }
        diu.b(aoa1.h()).d(l);
    }

    public boolean a(cdl cdl)
    {
        gdv.a(getClass(), cdl.getClass());
        cdl = (cxk)cdl;
        if (!((cxk) (cdl)).j)
        {
            j = false;
        }
        cdl.k = true;
        return true;
    }

    public long b()
    {
        if (j)
        {
            return g.a(g.nU, "babel_sane_refresh_timeout", 0x15f90L);
        } else
        {
            return g.a(g.nU, "babel_sane_timeout", dlb.d);
        }
    }

    public String f()
    {
        return "conversations/syncallnewevents";
    }

    public boolean q()
    {
        return j;
    }

    public String r()
    {
        return l;
    }
}
