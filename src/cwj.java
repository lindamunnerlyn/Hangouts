// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cwj extends cwm
{

    private static final long serialVersionUID = 1L;
    public final String a[];

    public cwj(String as[])
    {
        a = as;
    }

    public String a()
    {
        return "ui_queue";
    }

    public kws a(String s, int i, int j)
    {
        eev.c("Babel_RequestWriter", "GetFifeUrlRequest build protobuf");
        jfy jfy1 = new jfy();
        jfy1.requestHeader = cvu.a(s, i, j, h);
        j = a.length;
        s = new jfx[j];
        for (i = 0; i < j; i++)
        {
            String s1 = a[i];
            jfx jfx1 = new jfx();
            jfx1.b = s1;
            jfx1.a = Integer.valueOf(1);
            s[i] = jfx1;
        }

        jfy1.a = s;
        return jfy1;
    }

    public String f()
    {
        return "urls/urlredirectwrapper";
    }
}
