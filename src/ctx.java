// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class ctx extends ctu
{

    private static final long serialVersionUID = 1L;
    public final long a;
    public final String b[];

    public ctx(String s, long l, String as[])
    {
        super(s);
        a = l;
        b = as;
    }

    public String a()
    {
        return "event_queue";
    }

    public kop a(String s, int i, int j)
    {
        if (ctr.e)
        {
            String s1 = c;
            long l = a;
            ebw.b("Babel_RequestWriter", (new StringBuilder(String.valueOf(s1).length() + 41)).append("Delete conversation ").append(s1).append(" ").append(l).toString());
        }
        iry iry1 = new iry();
        iry1.requestHeader = ctq.a(s, i, j, h);
        iry1.b = ctq.a(c);
        if (b != null)
        {
            iry1.d = b;
            iry1.a = Integer.valueOf(2);
            return iry1;
        } else
        {
            iry1.c = Long.valueOf(a);
            iry1.a = Integer.valueOf(1);
            return iry1;
        }
    }

    public void a(ani ani, dbo dbo)
    {
        if (ebw.a("Babel_RequestWriter", 3))
        {
            String s = String.valueOf(c);
            if (s.length() != 0)
            {
                s = "DeleteConversationRequest: expired for ".concat(s);
            } else
            {
                s = new String("DeleteConversationRequest: expired for ");
            }
            ebw.d("Babel_RequestWriter", s);
        }
        super.a(ani, dbo);
        if (!d)
        {
            RealTimeChatService.a(ani, c, b);
        }
    }

    public boolean a(cci cci, dbo dbo)
    {
        return false;
    }

    public String g()
    {
        return "conversations/deleteconversation";
    }
}
