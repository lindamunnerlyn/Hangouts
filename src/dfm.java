// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dfm extends cxr
{

    private static final boolean g = false;
    private static final long serialVersionUID = 1L;

    private dfm(jbk jbk1)
    {
        super(jbk1.responseHeader, -1L);
        if (g)
        {
            jbk1 = String.valueOf(jbk1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(jbk1).length() + 31)).append("MarkEventObservedResponse from:").append(jbk1).toString());
        }
    }

    public static cxr a(jbk jbk1)
    {
        if (a(jbk1.responseHeader))
        {
            String s = String.valueOf(jbk1);
            eev.f("Babel", (new StringBuilder(String.valueOf(s).length() + 62)).append("MarkEventObservedResponse.processResponse: request failed for ").append(s).toString());
            return new cyd(jbk1.responseHeader);
        } else
        {
            return new dfm(jbk1);
        }
    }

    static 
    {
        hnc hnc = eev.k;
    }
}
