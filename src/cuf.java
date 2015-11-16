// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cuf extends cui
{

    private static final long serialVersionUID = 1L;
    public final String a[];

    public cuf(String as[])
    {
        a = as;
    }

    public String a()
    {
        return "ui_queue";
    }

    public kop a(String s, int i, int j)
    {
        ebw.c("Babel_RequestWriter", "GetFifeUrlRequest build protobuf");
        izt izt1 = new izt();
        izt1.requestHeader = ctq.a(s, i, j, h);
        j = a.length;
        s = new izs[j];
        for (i = 0; i < j; i++)
        {
            String s1 = a[i];
            izs izs1 = new izs();
            izs1.b = s1;
            izs1.a = Integer.valueOf(1);
            s[i] = izs1;
        }

        izt1.a = s;
        return izt1;
    }

    public String g()
    {
        return "urls/urlredirectwrapper";
    }
}
