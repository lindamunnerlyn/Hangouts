// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;

public abstract class cdc extends cdj
{

    public static final String a;
    static cdg b = new cdg();
    private final long c;

    protected cdc(Context context, int j, dzx dzx1, long l)
    {
        super(context, j, dzx1);
        c = l;
    }

    static void a(int j, long l)
    {
        apa apa1 = apa.a(g.nS, j);
        ContentValues contentvalues = new ContentValues();
        long l1 = System.currentTimeMillis();
        contentvalues.put("alert_status", "1");
        String s = String.valueOf("alert_status=0 AND (status=");
        int k = dqb.d.ordinal();
        String s1 = String.valueOf("status");
        int i1 = dqb.e.ordinal();
        String s2 = String.valueOf("timestamp");
        s = (new StringBuilder(String.valueOf(s).length() + 79 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(k).append(" OR (").append(s1).append("!=").append(i1).append(" AND ").append(s2).append("+").append(1000L * l).append("<").append(l1 * 1000L).append(")) ").toString();
        if (apa1.b().a("messages", contentvalues, s, null) > 0)
        {
            any.a(j);
        }
    }

    static void a(Context context, int j)
    {
        if (m)
        {
            ebw.b("Babel", "MessageNotifier.cancelAllMessageNotifications");
        }
        String s = c(context, j);
        context = db.a(context);
        ced.a(s, 7);
        context.a(s, 7);
    }

    protected void a(boolean flag)
    {
        t.a(c);
        super.a(flag);
    }

    protected Intent b()
    {
        return (new cde()).a(o, p, q.b());
    }

    protected int e()
    {
        return 7;
    }

    protected int f()
    {
        return g.a(o, "babel_notify_chat_priority_level", 1);
    }

    protected void i()
    {
        g.a(dbf.e(p), 1931);
    }

    static 
    {
        String s = String.valueOf("notified_for_failure!=1 AND conversation_pending_leave!=1 AND status!=");
        int j = dqb.e.ordinal();
        a = (new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(j).toString();
    }
}
