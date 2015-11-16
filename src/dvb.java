// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dvb
    implements Runnable
{

    final boolean a;
    private final aoa b;
    private boolean c;
    private dur d;

    public dvb(aoa aoa1, boolean flag)
    {
        b = aoa1;
        a = flag;
        c = false;
        d = null;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        c = true;
        if (d != null)
        {
            dur.a(d);
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
        Object obj = new aow(g.nU, b.h());
        if (!a) goto _L2; else goto _L1
_L1:
        if (((gqz)hlp.a(g.nU, gqz)).a(b.h()).a("sms_no_full_sync_till_millis", -1L) <= System.currentTimeMillis()) goto _L4; else goto _L3
_L3:
        if (dur.f())
        {
            int i = b.h();
            eev.b("Babel_SMS", (new StringBuilder(59)).append("SmsSyncManager A#").append(i).append(": task can not be scheduled yet").toString());
        }
        dur.a(b.a(), this);
        return;
_L2:
        long l1 = ((gqz)hlp.a(g.nU, gqz)).a(b.h()).a("sms_last_sync_time_millis", -1L);
_L9:
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        int j = b.h();
        eev.e("Babel_SMS", (new StringBuilder(42)).append("SmsSyncManager A#").append(j).append(": task aborted").toString());
        this;
        JVM INSTR monitorexit ;
        dur.a(b.a(), this);
        return;
        d = new dur(((aow) (obj)), l1, a);
        this;
        JVM INSTR monitorexit ;
        int k = dur.b(d);
        if (k < 0)
        {
            dur.a(b.a(), this);
            return;
        }
        break MISSING_BLOCK_LABEL_280;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        dur.a(b.a(), this);
        throw obj;
        if (a)
        {
            ((gqz)hlp.a(g.nU, gqz)).b(b.h()).c("sms_last_full_sync_time_millis", System.currentTimeMillis()).d();
        }
        if (dur.a(((aow) (obj)))) goto _L6; else goto _L5
_L5:
        if (!a || k != 0) goto _L8; else goto _L7
_L7:
        int l = b.h();
        eev.g("Babel_SMS", (new StringBuilder(75)).append("SmsSyncManager A#").append(l).append(": even after full sync we are still not in sync").toString());
        ((gqz)hlp.a(g.nU, gqz)).b(b.h()).c("sms_no_full_sync_till_millis", System.currentTimeMillis() + dur.g()).d();
_L6:
        dur.a(b.a(), this);
        return;
_L8:
        dur.a(b, true, 10000L);
        if (true) goto _L6; else goto _L4
_L4:
        l1 = -1L;
          goto _L9
    }
}
