// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ddk extends die
{

    public ddk(ddl ddl1)
    {
        super(ddl1);
    }

    protected ctp a(ani ani, int i, String s)
    {
        return new crz(ani, i, (ddl)a);
    }

    public String a()
    {
        return "background_queue";
    }

    public boolean a(ccg ccg)
    {
        gbh.a(getClass(), ccg.getClass());
        ccg = (ddl)((ddk)ccg).a;
        boolean flag;
        if (((ddl)a).a() != ccg.a())
        {
            flag = ((ddl)a).a();
        } else
        {
            flag = true;
        }
        if (flag)
        {
            boolean flag1 = ccg.a();
            boolean flag2 = ((ddl)a).a();
            ebw.b("Babel_GetSelfInfo", (new StringBuilder(76)).append("Replacing a GetSelfInfoRequest. Old shouldRetry=").append(flag1).append(". New shouldRetry=").append(flag2).toString());
        }
        return flag;
    }

    public boolean a(cci cci, dbo dbo)
    {
        return ((ddl)a).a() && super.a(cci, dbo);
    }

    public boolean a(String s)
    {
        return false;
    }

    public long b()
    {
        if (((ddl)a).a())
        {
            return dbf.b();
        } else
        {
            return 0L;
        }
    }

    protected void b(int i, dbo dbo)
    {
        dbf.b(dbf.e(i), dbo);
    }

    public boolean c()
    {
        return false;
    }

    public boolean d()
    {
        return true;
    }
}
