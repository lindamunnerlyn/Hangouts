// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cul extends ctu
{

    private static final long serialVersionUID = 1L;
    public final int a;

    public cul(String s, int i)
    {
        super(s);
        a = i;
    }

    public kop a(String s, int i, int j)
    {
        if (ctr.e)
        {
            String s1 = c;
            int k = a;
            ebw.b("Babel_RequestWriter", (new StringBuilder(String.valueOf(s1).length() + 81)).append("setConversationNotificationLevel build protobuf conversationID=").append(s1).append(" level=").append(k).toString());
        }
        ixy ixy1 = new ixy();
        ixy1.requestHeader = ctq.a(s, i, j, h);
        ixy1.a = ctq.a(c);
        ixy1.b = Integer.valueOf(a);
        return ixy1;
    }

    public String g()
    {
        return "conversations/setconversationnotificationlevel";
    }
}
