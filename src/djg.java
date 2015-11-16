// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import java.util.List;

public final class djg extends djp
{

    private long b;

    public djg(djh djh1)
    {
        super(djh1);
        b = 0L;
    }

    protected cvt a(aoa aoa1, int i, String s)
    {
        jsh jsh = ((djh)a).e();
        if (jsh == null || jsh.size() == 0 || !atp.b.equals(((ato)jsh.get(0)).c))
        {
            return new cvr(g.nU, aoa1, dmi.a, i, (djh)a, s);
        } else
        {
            return new cvr(g.nU, aoa1, dmi.b, i, (djh)a, s);
        }
    }

    public String a()
    {
        return "event_queue";
    }

    public boolean a(cdl cdl)
    {
        return false;
    }

    public boolean a(cdn cdn, dcx dcx1)
    {
        if (dcx1.c() != 101)
        {
            return super.a(cdn, dcx1);
        }
        return g.a(Long.valueOf(((amo)hlp.a(g.nU, amo)).a("babel_pending_chat_message_failure_duration", 0L)), 0L) > 0L;
    }

    public boolean a(String s)
    {
        return s.startsWith(((djh)a).a());
    }

    public long b()
    {
        long l;
        if (b != 0L)
        {
            l = b;
        } else
        {
            long l1 = g.a(g.nU, "babel_pending_chat_message_failure_duration", 0L);
            l = l1;
            if (l1 == 0L)
            {
                return g.a(g.nU, "babel_pending_message_failure_duration", 0x124f80L);
            }
        }
        return l;
    }

    public void b(int i, dcx dcx1)
    {
        aoa aoa1 = dcn.e(i);
        if (dcx1 != null && dcx1.c() != 0)
        {
            g.a(aoa1, 1523);
            h.a(aoa1.h(), SystemClock.elapsedRealtime(), 5, (new cab()).a(dcx1.c()).b(((djh)a).a()).a(((djh)a).b()));
        }
    }

    public boolean c()
    {
        return true;
    }

    public boolean d()
    {
        return true;
    }

    public String e()
    {
        Object obj = ((djh)a).d();
        if (((List) (obj)).size() != 1)
        {
            obj = null;
        } else
        {
            String s = ((dmt)((List) (obj)).get(0)).b;
            obj = s;
            if (!g.w(s))
            {
                return null;
            }
        }
        return ((String) (obj));
    }
}
