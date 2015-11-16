// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public class cxc extends cwm
{

    private static final long serialVersionUID = 1L;
    public final long a;

    public cxc(long l)
    {
        a = l;
    }

    public String a()
    {
        return "ui_queue";
    }

    public kws a(String s, int i, int j)
    {
        if (cvv.e)
        {
            long l = a;
            eev.b("Babel_RequestWriter", (new StringBuilder(57)).append("SetDndPresenceRequest build protobuf ").append(l).toString());
        }
        jel jel1 = new jel();
        iyo iyo1 = new iyo();
        long l1 = TimeUnit.MILLISECONDS.toSeconds(TimeUnit.MICROSECONDS.toMillis(a) - System.currentTimeMillis());
        boolean flag;
        if (l1 > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        iyo1.a = Boolean.valueOf(flag);
        if (l1 <= 0L)
        {
            l1 = 0L;
        }
        iyo1.b = Long.valueOf(l1);
        jel1.b = iyo1;
        jel1.requestHeader = cvu.a(s, i, j, h);
        return jel1;
    }

    public boolean a(cdl cdl)
    {
        gdv.a(getClass(), cdl.getClass());
        return true;
    }

    public String f()
    {
        return "presence/setpresence";
    }
}
