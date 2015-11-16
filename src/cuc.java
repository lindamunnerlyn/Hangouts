// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class cuc extends ctu
{

    private static final long serialVersionUID = 3L;
    public final boolean a;
    public final boolean b;
    public final boolean j;
    public final byte k[];
    public final long l;
    public final String m;
    public final int n;
    public final long o;
    public final cza p;
    public String q;
    public final ctv r;

    public cuc(ctv ctv1)
    {
        super(null);
        r = ctv1;
        a = true;
        b = true;
        j = false;
        n = 1;
        k = null;
        l = 0L;
        m = null;
        p = null;
        q = null;
        o = 0L;
    }

    public cuc(ctv ctv1, String s)
    {
        this(ctv1);
        q = s;
    }

    public cuc(String s, boolean flag, boolean flag1, boolean flag2, byte abyte0[], long l1, 
            String s1, long l2, cza cza)
    {
        super(s);
        a = flag;
        b = flag1;
        j = flag2;
        k = abyte0;
        l = l1;
        m = s1;
        n = g.a(g.nS, "babel_smaxevperconv", 20);
        p = cza;
        r = null;
        o = l2;
        q = null;
    }

    public kop a(String s, int i, int i1)
    {
        if (ebw.a("Babel_RequestWriter", 3))
        {
            String s1 = String.valueOf("GetConversationRequest build protobuf:  conversationId=");
            String s2 = c;
            boolean flag = a;
            boolean flag1 = b;
            String s3 = String.valueOf(Arrays.toString(k));
            long l1 = l;
            int j1 = n;
            ebw.d("Babel_RequestWriter", (new StringBuilder(String.valueOf(s1).length() + 158 + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s1).append(s2).append(" includeConversationMetadata=").append(flag).append(" includeEvents=").append(flag1).append(" continuationToken=").append(s3).append(" continuationEventTimestamp=").append(l1).append(" maxEventsPerConversation=").append(j1).toString());
        }
        itq itq1 = new itq();
        if (c != null)
        {
            itq1.a = new irl();
            itq1.a.a = ctq.a(c);
        } else
        if (r != null)
        {
            irl irl1 = new irl();
            irl1.b = new ius[r.d.size()];
            Iterator iterator = r.d.iterator();
            for (int k1 = 0; iterator.hasNext(); k1++)
            {
                ceu ceu1 = (ceu)iterator.next();
                irl1.b[k1] = g.a(ceu1, r.b);
            }

            irl1.c = Integer.valueOf(r.a);
            itq1.a = irl1;
        } else
        {
            throw new IllegalStateException("must specify either conversationId or participantsQuery");
        }
        itq1.b = Boolean.valueOf(a);
        itq1.c = Boolean.valueOf(b);
        if (j)
        {
            itq1.g = Integer.valueOf(1);
        }
        itq1.requestHeader = ctq.a(s, i, i1, h);
        if (k != null || l != 0L)
        {
            s = new isz();
            if (k != null)
            {
                s.b = Arrays.copyOf(k, k.length);
            }
            if (l != 0L)
            {
                s.a = Long.valueOf(l);
            }
            itq1.d = s;
        }
        itq1.f = Integer.valueOf(n);
        return itq1;
    }

    public void a(ani ani1, dbo dbo1)
    {
        super.a(ani1, dbo1);
        if (m != null)
        {
            dhl.b(ani1.h()).e(m);
        }
        if (r != null && q == null)
        {
            HashSet hashset = new HashSet();
            hashset.add(r);
            dbf.h(ani1).a(hashset, dhi.b().a());
        }
        if (q != null)
        {
            RealTimeChatService.f(ani1, q);
        }
        if (dbo1.c() == 111 && c != null)
        {
            RealTimeChatService.t(ani1, c);
        }
    }

    public boolean a(ccg ccg)
    {
        gbh.a(getClass(), ccg.getClass());
        ccg = (cuc)ccg;
        return TextUtils.equals(c, ((cuc) (ccg)).c) && a == ((cuc) (ccg)).a && b == ((cuc) (ccg)).b && l == ((cuc) (ccg)).l && r == null && ((cuc) (ccg)).r == null && TextUtils.equals(m, ((cuc) (ccg)).m) && p == null && ((cuc) (ccg)).p == null;
    }

    public boolean a(cci cci, dbo dbo1)
    {
        boolean flag;
        if (r != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return !flag && super.a(cci, dbo1);
    }

    public long b()
    {
        boolean flag;
        if (a && b && r == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return super.b();
        } else
        {
            return TimeUnit.SECONDS.toMillis(60L);
        }
    }

    public String g()
    {
        return "conversations/getconversation";
    }

    public int o()
    {
        return 4;
    }
}
