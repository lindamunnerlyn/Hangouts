// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.TimeUnit;

public final class dfk extends djp
{

    public dfk(dfl dfl1)
    {
        super(dfl1);
    }

    protected cvt a(aoa aoa, int i, String s)
    {
        return new cuk(aoa, (dfl)a);
    }

    public String a()
    {
        return "background_queue";
    }

    public boolean a(cdl cdl)
    {
        return false;
    }

    public boolean a(String s)
    {
        return false;
    }

    public long b()
    {
        return TimeUnit.SECONDS.toMillis(30L);
    }

    protected void b(int i, dcx dcx)
    {
    }

    public boolean c()
    {
        return false;
    }

    public boolean d()
    {
        return true;
    }

    public String e()
    {
        return null;
    }
}
