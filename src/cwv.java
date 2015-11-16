// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cwv extends cwm
{

    private static final long serialVersionUID = 1L;
    public final String a;
    public final int b;

    public cwv(String s, int i)
    {
        a = s;
        b = i;
    }

    public kws a(String s, int i, int j)
    {
        if (cvv.e)
        {
            eev.b("Babel_RequestWriter", "ReportAbuseConversationRequest");
        }
        jdi jdi1 = new jdi();
        jdi1.requestHeader = cvu.a(s, i, j, h);
        jdi1.a = cvu.a(a);
        jdi1.b = (new int[] {
            b
        });
        return jdi1;
    }

    public String f()
    {
        return "conversations/reportabuseconversation";
    }
}
