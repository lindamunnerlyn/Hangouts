// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public class cvb extends cui
{

    private static final long serialVersionUID = 1L;
    public final int a;
    public final boolean b;

    public String a()
    {
        return "ui_queue";
    }

    public kop a(String s, int i, int j)
    {
        iuk iuk1;
        if (ctr.e)
        {
            int k = a;
            Object obj;
            if (b)
            {
                obj = " in a call.";
            } else
            {
                obj = " NOT in a call.";
            }
            ebw.b("Babel_RequestWriter", (new StringBuilder(String.valueOf(obj).length() + 51)).append("SetInCallPresenceRequest build protobuf ").append(k).append(((String) (obj))).toString());
        }
        obj = new iyg();
        iuk1 = new iuk();
        if (b)
        {
            boolean flag;
            if (a > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gbh.a(flag);
            iuk1.a = Integer.valueOf(100);
            iuk1.b = Long.valueOf(a);
        } else
        {
            iuk1.a = Integer.valueOf(0);
        }
        obj.e = iuk1;
        obj.requestHeader = ctq.a(s, i, j, h);
        return ((kop) (obj));
    }

    public boolean a(ccg ccg)
    {
        gbh.a(getClass(), ccg.getClass());
        return true;
    }

    public boolean a(cci cci, dbo dbo)
    {
        return false;
    }

    public long b()
    {
        return TimeUnit.SECONDS.toMillis(a);
    }

    public String g()
    {
        return "presence/setpresence";
    }
}
