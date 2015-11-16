// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class cwt extends cwe
{

    private static final long serialVersionUID = 1L;
    public final String a;
    public final String b;

    public cwt(String s, String s1, String s2, String s3)
    {
        super(s1, s);
        a = s2;
        b = s3;
    }

    public kws a(String s, int i, int j)
    {
        if (cvv.e)
        {
            eev.b("Babel_RequestWriter", "setConversationName build protobuf");
        }
        izg izg1 = new izg();
        izg1.b = aow.c(this.j);
        izg1.a = cvu.a(c);
        izg1.e = Integer.valueOf(6);
        jdd jdd1 = new jdd();
        jdd1.requestHeader = cvu.a(s, i, j, h);
        jdd1.b = a;
        jdd1.a = izg1;
        return jdd1;
    }

    public void a(aoa aoa1, dcx dcx)
    {
        super.a(aoa1, dcx);
        RealTimeChatService.a(aoa1.h(), c, b);
    }

    public String f()
    {
        return "conversations/renameconversation";
    }
}
