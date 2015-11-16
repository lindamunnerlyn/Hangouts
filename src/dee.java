// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dee extends cvn
{

    private static final boolean g = false;
    private static final long serialVersionUID = 1L;

    private dee(ivf ivf1)
    {
        super(ivf1.responseHeader, -1L);
        if (g)
        {
            ivf1 = String.valueOf(ivf1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(ivf1).length() + 31)).append("MarkEventObservedResponse from:").append(ivf1).toString());
        }
    }

    public static cvn a(ivf ivf1)
    {
        if (a(ivf1.responseHeader))
        {
            String s = String.valueOf(ivf1);
            ebw.f("Babel", (new StringBuilder(String.valueOf(s).length() + 62)).append("MarkEventObservedResponse.processResponse: request failed for ").append(s).toString());
            return new cvz(ivf1.responseHeader);
        } else
        {
            return new dee(ivf1);
        }
    }

    static 
    {
        hik hik = ebw.k;
    }
}
