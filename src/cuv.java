// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public class cuv extends cui
{

    private static final long serialVersionUID = 1L;
    public final String a;
    public final boolean b = true;
    public final int c;
    public final boolean d = true;

    public cuv(String s, int i)
    {
        a = s;
        c = i;
    }

    public String a()
    {
        return "background_queue";
    }

    public kop a(String s, int i, int j)
    {
        if (ctr.e)
        {
            ebw.b("Babel_RequestWriter", "setActiveClient build protobuf");
        }
        ixr ixr1 = new ixr();
        ixr1.requestHeader = ctq.a(s, i, j, h);
        ixr1.b = a;
        ixr1.a = Boolean.valueOf(b);
        ixr1.c = Integer.valueOf(c);
        ixr1.d = Boolean.valueOf(d);
        return ixr1;
    }

    public void a(ani ani1, dbo dbo)
    {
        dbo = dii.a(ani1);
        ani1 = String.valueOf(ebw.b(ani1.a()));
        if (ani1.length() != 0)
        {
            ani1 = "SetActiveClientOperation failed: ".concat(ani1);
        } else
        {
            ani1 = new String("SetActiveClientOperation failed: ");
        }
        ebw.f("Babel_RequestWriter", ani1);
        dbo.a(0);
    }

    public boolean a(ccg ccg)
    {
        gbh.a(getClass(), ccg.getClass());
        return true;
    }

    public long b()
    {
        return TimeUnit.SECONDS.toMillis(120L);
    }

    public String g()
    {
        return "clients/setactiveclient";
    }
}
