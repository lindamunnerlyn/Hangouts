// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class cwb extends cvy
{

    private static final long serialVersionUID = 1L;
    public final long a;
    public final String b[];

    public cwb(String s, long l, String as[])
    {
        super(s);
        a = l;
        b = as;
    }

    public String a()
    {
        return "event_queue";
    }

    public kws a(String s, int i, int j)
    {
        if (cvv.e)
        {
            String s1 = c;
            long l = a;
            eev.b("Babel_RequestWriter", (new StringBuilder(String.valueOf(s1).length() + 41)).append("Delete conversation ").append(s1).append(" ").append(l).toString());
        }
        iyd iyd1 = new iyd();
        iyd1.requestHeader = cvu.a(s, i, j, h);
        iyd1.b = cvu.a(c);
        if (b != null)
        {
            iyd1.d = b;
            iyd1.a = Integer.valueOf(2);
            return iyd1;
        } else
        {
            iyd1.c = Long.valueOf(a);
            iyd1.a = Integer.valueOf(1);
            return iyd1;
        }
    }

    public void a(aoa aoa, dcx dcx)
    {
        if (eev.a("Babel_RequestWriter", 3))
        {
            String s = String.valueOf(c);
            if (s.length() != 0)
            {
                s = "DeleteConversationRequest: expired for ".concat(s);
            } else
            {
                s = new String("DeleteConversationRequest: expired for ");
            }
            eev.d("Babel_RequestWriter", s);
        }
        super.a(aoa, dcx);
        if (!d)
        {
            RealTimeChatService.a(aoa, c, b);
        }
    }

    public boolean a(cdn cdn, dcx dcx)
    {
        return false;
    }

    public String f()
    {
        return "conversations/deleteconversation";
    }
}
