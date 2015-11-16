// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public class cwz extends cwm
{

    private static final long serialVersionUID = 1L;
    public final String a;
    public final boolean b = true;
    public final int c;
    public final boolean d = true;

    public cwz(String s, int i)
    {
        a = s;
        c = i;
    }

    public String a()
    {
        return "background_queue";
    }

    public kws a(String s, int i, int j)
    {
        if (cvv.e)
        {
            eev.b("Babel_RequestWriter", "setActiveClient build protobuf");
        }
        jdw jdw1 = new jdw();
        jdw1.requestHeader = cvu.a(s, i, j, h);
        jdw1.b = a;
        jdw1.a = Boolean.valueOf(b);
        jdw1.c = Integer.valueOf(c);
        jdw1.d = Boolean.valueOf(d);
        return jdw1;
    }

    public void a(aoa aoa1, dcx dcx)
    {
        dcx = djt.a(aoa1);
        aoa1 = String.valueOf(eev.b(aoa1.a()));
        if (aoa1.length() != 0)
        {
            aoa1 = "SetActiveClientOperation failed: ".concat(aoa1);
        } else
        {
            aoa1 = new String("SetActiveClientOperation failed: ");
        }
        eev.f("Babel_RequestWriter", aoa1);
        dcx.a(0);
    }

    public boolean a(cdl cdl)
    {
        gdv.a(getClass(), cdl.getClass());
        return true;
    }

    public long b()
    {
        return TimeUnit.SECONDS.toMillis(120L);
    }

    public String f()
    {
        return "clients/setactiveclient";
    }
}
