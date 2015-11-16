// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public class cuy extends cui
{

    private static final long serialVersionUID = 1L;
    public final long a;

    public cuy(long l)
    {
        a = l;
    }

    public String a()
    {
        return "ui_queue";
    }

    public kop a(String s, int i, int j)
    {
        if (ctr.e)
        {
            long l = a;
            ebw.b("Babel_RequestWriter", (new StringBuilder(57)).append("SetDndPresenceRequest build protobuf ").append(l).toString());
        }
        iyg iyg1 = new iyg();
        isj isj1 = new isj();
        long l1 = TimeUnit.MILLISECONDS.toSeconds(TimeUnit.MICROSECONDS.toMillis(a) - System.currentTimeMillis());
        boolean flag;
        if (l1 > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isj1.a = Boolean.valueOf(flag);
        if (l1 <= 0L)
        {
            l1 = 0L;
        }
        isj1.b = Long.valueOf(l1);
        iyg1.b = isj1;
        iyg1.requestHeader = ctq.a(s, i, j, h);
        return iyg1;
    }

    public boolean a(ccg ccg)
    {
        gbh.a(getClass(), ccg.getClass());
        return true;
    }

    public String g()
    {
        return "presence/setpresence";
    }
}
