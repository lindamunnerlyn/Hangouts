// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public class cxi extends cvy
{

    private static final long serialVersionUID = 1L;
    public final int a;

    public cxi(String s, int i)
    {
        super(s);
        a = i;
    }

    public String a()
    {
        return "background_queue";
    }

    public kws a(String s, int i, int j)
    {
        if (cvv.e)
        {
            eev.b("Babel_RequestWriter", "typingRequest build protobuf");
        }
        jeq jeq1 = new jeq();
        jeq1.requestHeader = cvu.a(s, i, j, h);
        jeq1.a = cvu.a(c);
        jeq1.b = Integer.valueOf(a);
        return jeq1;
    }

    public boolean a(cdl cdl)
    {
        gdv.a(getClass(), cdl.getClass());
        return ((cxi)cdl).c.equals(c);
    }

    public boolean a(cdn cdn1, dcx dcx)
    {
        if (dcz.b(cdn1.c))
        {
            return false;
        } else
        {
            return super.a(cdn1, dcx);
        }
    }

    public long b()
    {
        return TimeUnit.SECONDS.toMillis(10L);
    }

    public String f()
    {
        return "conversations/settyping";
    }
}
