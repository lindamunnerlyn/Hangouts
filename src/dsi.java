// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dsi
    implements Runnable
{

    private final ani a;
    private final boolean b;
    private boolean c;
    private dry d;

    public dsi(ani ani1, boolean flag)
    {
        a = ani1;
        b = flag;
        c = false;
        d = null;
    }

    static boolean a(dsi dsi1)
    {
        return dsi1.b;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        c = true;
        if (d != null)
        {
            dry.a(d);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void run()
    {
        Object obj = new aoe(g.nS, a.h());
        if (!b) goto _L2; else goto _L1
_L1:
        if (((gms)hgx.a(g.nS, gms)).a(a.h()).a("sms_no_full_sync_till_millis", -1L) <= System.currentTimeMillis()) goto _L4; else goto _L3
_L3:
        if (dry.f())
        {
            int i = a.h();
            ebw.b("Babel_SMS", (new StringBuilder(59)).append("SmsSyncManager A#").append(i).append(": task can not be scheduled yet").toString());
        }
        dry.a(a.a(), this);
        return;
_L2:
        long l1 = ((gms)hgx.a(g.nS, gms)).a(a.h()).a("sms_last_sync_time_millis", -1L);
_L9:
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        int j = a.h();
        ebw.e("Babel_SMS", (new StringBuilder(42)).append("SmsSyncManager A#").append(j).append(": task aborted").toString());
        this;
        JVM INSTR monitorexit ;
        dry.a(a.a(), this);
        return;
        d = new dry(((aoe) (obj)), l1, b);
        this;
        JVM INSTR monitorexit ;
        int k = dry.b(d);
        if (k < 0)
        {
            dry.a(a.a(), this);
            return;
        }
        break MISSING_BLOCK_LABEL_280;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        dry.a(a.a(), this);
        throw obj;
        if (b)
        {
            ((gms)hgx.a(g.nS, gms)).b(a.h()).c("sms_last_full_sync_time_millis", System.currentTimeMillis()).d();
        }
        if (dry.a(((aoe) (obj)))) goto _L6; else goto _L5
_L5:
        if (!b || k != 0) goto _L8; else goto _L7
_L7:
        int l = a.h();
        ebw.g("Babel_SMS", (new StringBuilder(75)).append("SmsSyncManager A#").append(l).append(": even after full sync we are still not in sync").toString());
        ((gms)hgx.a(g.nS, gms)).b(a.h()).c("sms_no_full_sync_till_millis", System.currentTimeMillis() + dry.g()).d();
_L6:
        dry.a(a.a(), this);
        return;
_L8:
        dry.a(a, true, 10000L);
        if (true) goto _L6; else goto _L4
_L4:
        l1 = -1L;
          goto _L9
    }
}
