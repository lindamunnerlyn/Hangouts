// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cwi extends cwm
{

    private static final long serialVersionUID = 1L;

    public cwi()
    {
    }

    public String a()
    {
        return "ui_queue";
    }

    public kws a(String s, int i, int j)
    {
        if (cvv.e)
        {
            eev.b("Babel_RequestWriter", "GetFavoritesRequest()");
        }
        jaa jaa1 = new jaa();
        jaa1.requestHeader = cvu.a(null, true, s, i, j, h);
        return jaa1;
    }

    public String f()
    {
        return "contacts/getfavorites";
    }
}
