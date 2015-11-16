// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cxb extends cwm
{

    private static final long serialVersionUID = 1L;
    private final int a;
    private final boolean b;

    public cxb(int i, boolean flag)
    {
        a = i;
        b = flag;
    }

    public kws a(String s, int i, int j)
    {
        jea jea1 = new jea();
        jea1.requestHeader = cvu.a(null, true, s, i, j, h);
        s = new ixc();
        s.a = Integer.valueOf(a);
        s.b = Boolean.valueOf(b);
        jea1.a = new ixc[1];
        jea1.a[0] = s;
        return jea1;
    }

    public void a(aoa aoa, dcx dcx)
    {
        dcn.a(dcx);
    }

    public boolean a(cdl cdl)
    {
        gdv.a(getClass(), cdl.getClass());
        return equals(cdl);
    }

    public boolean equals(Object obj)
    {
        obj = (cxb)obj;
        return a == ((cxb) (obj)).a && b == ((cxb) (obj)).b;
    }

    public String f()
    {
        return "contacts/setconfigurationbit";
    }
}
