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

public class cwg extends cvy
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
    public final dng p;
    public String q;
    public final cvz r;

    public cwg(cvz cvz1)
    {
        super(null);
        r = cvz1;
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

    public cwg(cvz cvz1, String s)
    {
        this(cvz1);
        q = s;
    }

    public cwg(String s, boolean flag, boolean flag1, boolean flag2, byte abyte0[], long l1, 
            String s1, long l2, dng dng)
    {
        super(s);
        a = flag;
        b = flag1;
        j = flag2;
        k = abyte0;
        l = l1;
        m = s1;
        n = g.a(g.nU, "babel_smaxevperconv", 20);
        p = dng;
        r = null;
        o = l2;
        q = null;
    }

    public kws a(String s, int i, int i1)
    {
        if (eev.a("Babel_RequestWriter", 3))
        {
            String s1 = String.valueOf("GetConversationRequest build protobuf:  conversationId=");
            String s2 = c;
            boolean flag = a;
            boolean flag1 = b;
            String s3 = String.valueOf(Arrays.toString(k));
            long l1 = l;
            int j1 = n;
            eev.d("Babel_RequestWriter", (new StringBuilder(String.valueOf(s1).length() + 158 + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s1).append(s2).append(" includeConversationMetadata=").append(flag).append(" includeEvents=").append(flag1).append(" continuationToken=").append(s3).append(" continuationEventTimestamp=").append(l1).append(" maxEventsPerConversation=").append(j1).toString());
        }
        izv izv1 = new izv();
        if (c != null)
        {
            izv1.a = new ixq();
            izv1.a.a = cvu.a(c);
        } else
        if (r != null)
        {
            ixq ixq1 = new ixq();
            ixq1.b = new jax[r.d.size()];
            Iterator iterator = r.d.iterator();
            for (int k1 = 0; iterator.hasNext(); k1++)
            {
                cfz cfz1 = (cfz)iterator.next();
                ixq1.b[k1] = g.a(cfz1, r.b);
            }

            ixq1.c = Integer.valueOf(r.a);
            izv1.a = ixq1;
        } else
        {
            throw new IllegalStateException("must specify either conversationId or participantsQuery");
        }
        izv1.b = Boolean.valueOf(a);
        izv1.c = Boolean.valueOf(b);
        if (j)
        {
            izv1.g = Integer.valueOf(1);
        }
        izv1.requestHeader = cvu.a(s, i, i1, h);
        if (k != null || l != 0L)
        {
            s = new ize();
            if (k != null)
            {
                s.b = Arrays.copyOf(k, k.length);
            }
            if (l != 0L)
            {
                s.a = Long.valueOf(l);
            }
            izv1.d = s;
        }
        izv1.f = Integer.valueOf(n);
        return izv1;
    }

    public void a(aoa aoa1, dcx dcx1)
    {
        super.a(aoa1, dcx1);
        if (m != null)
        {
            diu.b(aoa1.h()).d(m);
        }
        if (r != null && q == null)
        {
            HashSet hashset = new HashSet();
            hashset.add(r);
            dcn.g(aoa1).a(hashset, dir.b().a());
        }
        if (q != null)
        {
            RealTimeChatService.f(aoa1, q);
        }
        if (dcx1.c() == 111 && c != null)
        {
            RealTimeChatService.t(aoa1, c);
        }
    }

    public boolean a(cdl cdl)
    {
        gdv.a(getClass(), cdl.getClass());
        cdl = (cwg)cdl;
        return TextUtils.equals(c, ((cwg) (cdl)).c) && a == ((cwg) (cdl)).a && b == ((cwg) (cdl)).b && l == ((cwg) (cdl)).l && r == null && ((cwg) (cdl)).r == null && TextUtils.equals(m, ((cwg) (cdl)).m) && p == null && ((cwg) (cdl)).p == null;
    }

    public boolean a(cdn cdn, dcx dcx1)
    {
        boolean flag;
        if (r != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return !flag && super.a(cdn, dcx1);
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

    public String f()
    {
        return "conversations/getconversation";
    }

    public int n()
    {
        return 4;
    }
}
