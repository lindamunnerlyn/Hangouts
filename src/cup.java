// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class cup extends cua
{

    private static final long serialVersionUID = 1L;
    public final String a;
    public final String b;

    public cup(String s, String s1, String s2, String s3)
    {
        super(s1, s);
        a = s2;
        b = s3;
    }

    public kop a(String s, int i, int j)
    {
        if (ctr.e)
        {
            ebw.b("Babel_RequestWriter", "setConversationName build protobuf");
        }
        itb itb1 = new itb();
        itb1.b = aoe.c(this.j);
        itb1.a = ctq.a(c);
        itb1.e = Integer.valueOf(6);
        iwy iwy1 = new iwy();
        iwy1.requestHeader = ctq.a(s, i, j, h);
        iwy1.b = a;
        iwy1.a = itb1;
        return iwy1;
    }

    public void a(ani ani1, dbo dbo)
    {
        super.a(ani1, dbo);
        RealTimeChatService.a(ani1.h(), c, b);
    }

    public String g()
    {
        return "conversations/renameconversation";
    }
}
