// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public class cve extends ctu
{

    private static final long serialVersionUID = 1L;
    public final int a;

    public cve(String s, int i)
    {
        super(s);
        a = i;
    }

    public String a()
    {
        return "background_queue";
    }

    public kop a(String s, int i, int j)
    {
        if (ctr.e)
        {
            ebw.b("Babel_RequestWriter", "typingRequest build protobuf");
        }
        iyl iyl1 = new iyl();
        iyl1.requestHeader = ctq.a(s, i, j, h);
        iyl1.a = ctq.a(c);
        iyl1.b = Integer.valueOf(a);
        return iyl1;
    }

    public boolean a(ccg ccg)
    {
        gbh.a(getClass(), ccg.getClass());
        return ((cve)ccg).c.equals(c);
    }

    public boolean a(cci cci1, dbo dbo)
    {
        if (dbq.b(cci1.c))
        {
            return false;
        } else
        {
            return super.a(cci1, dbo);
        }
    }

    public long b()
    {
        return TimeUnit.SECONDS.toMillis(10L);
    }

    public String g()
    {
        return "conversations/settyping";
    }
}
