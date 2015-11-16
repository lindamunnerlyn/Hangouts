// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class des extends djp
{

    public des(det det1)
    {
        super(det1);
    }

    protected cvt a(aoa aoa, int i, String s)
    {
        return new cuc(aoa, i, (det)a);
    }

    public String a()
    {
        return "background_queue";
    }

    public boolean a(cdl cdl)
    {
        gdv.a(getClass(), cdl.getClass());
        cdl = (det)((des)cdl).a;
        boolean flag;
        if (((det)a).a() != cdl.a())
        {
            flag = ((det)a).a();
        } else
        {
            flag = true;
        }
        if (flag)
        {
            boolean flag1 = cdl.a();
            boolean flag2 = ((det)a).a();
            eev.b("Babel_GetSelfInfo", (new StringBuilder(76)).append("Replacing a GetSelfInfoRequest. Old shouldRetry=").append(flag1).append(". New shouldRetry=").append(flag2).toString());
        }
        return flag;
    }

    public boolean a(cdn cdn, dcx dcx)
    {
        return ((det)a).a() && super.a(cdn, dcx);
    }

    public boolean a(String s)
    {
        return false;
    }

    public long b()
    {
        if (((det)a).a())
        {
            return dcn.b();
        } else
        {
            return 0L;
        }
    }

    protected void b(int i, dcx dcx)
    {
        dcn.b(dcn.e(i), dcx);
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
