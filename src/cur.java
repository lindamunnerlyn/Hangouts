// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cur extends cui
{

    private static final long serialVersionUID = 1L;
    public final String a;
    public final int b;

    public cur(String s, int i)
    {
        a = s;
        b = i;
    }

    public kop a(String s, int i, int j)
    {
        if (ctr.e)
        {
            ebw.b("Babel_RequestWriter", "ReportAbuseConversationRequest");
        }
        ixd ixd1 = new ixd();
        ixd1.requestHeader = ctq.a(s, i, j, h);
        ixd1.a = ctq.a(a);
        ixd1.b = (new int[] {
            b
        });
        return ixd1;
    }

    public String g()
    {
        return "conversations/reportabuseconversation";
    }
}
