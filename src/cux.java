// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cux extends cui
{

    private static final long serialVersionUID = 1L;
    private final int a;
    private final boolean b;

    public cux(int i, boolean flag)
    {
        a = i;
        b = flag;
    }

    public kop a(String s, int i, int j)
    {
        ixv ixv1 = new ixv();
        ixv1.requestHeader = ctq.a(null, true, s, i, j, h);
        s = new iqx();
        s.a = Integer.valueOf(a);
        s.b = Boolean.valueOf(b);
        ixv1.a = new iqx[1];
        ixv1.a[0] = s;
        return ixv1;
    }

    public void a(ani ani, dbo dbo)
    {
        dbf.a(dbo);
    }

    public boolean a(ccg ccg)
    {
        gbh.a(getClass(), ccg.getClass());
        return equals(ccg);
    }

    public boolean equals(Object obj)
    {
        obj = (cux)obj;
        return a == ((cux) (obj)).a && b == ((cux) (obj)).b;
    }

    public String g()
    {
        return "contacts/setconfigurationbit";
    }
}
