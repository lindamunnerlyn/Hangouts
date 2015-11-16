// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cue extends cui
{

    private static final long serialVersionUID = 1L;

    public cue()
    {
    }

    public String a()
    {
        return "ui_queue";
    }

    public kop a(String s, int i, int j)
    {
        if (ctr.e)
        {
            ebw.b("Babel_RequestWriter", "GetFavoritesRequest()");
        }
        itv itv1 = new itv();
        itv1.requestHeader = ctq.a(null, true, s, i, j, h);
        return itv1;
    }

    public String g()
    {
        return "contacts/getfavorites";
    }
}
