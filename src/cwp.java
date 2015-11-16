// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cwp extends cvy
{

    private static final long serialVersionUID = 1L;
    public final int a;

    public cwp(String s, int i)
    {
        super(s);
        a = i;
    }

    public kws a(String s, int i, int j)
    {
        if (cvv.e)
        {
            String s1 = c;
            int k = a;
            eev.b("Babel_RequestWriter", (new StringBuilder(String.valueOf(s1).length() + 81)).append("setConversationNotificationLevel build protobuf conversationID=").append(s1).append(" level=").append(k).toString());
        }
        jed jed1 = new jed();
        jed1.requestHeader = cvu.a(s, i, j, h);
        jed1.a = cvu.a(c);
        jed1.b = Integer.valueOf(a);
        return jed1;
    }

    public String f()
    {
        return "conversations/setconversationnotificationlevel";
    }
}
