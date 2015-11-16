// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class ctg extends ctc
{

    private static final long serialVersionUID = 1L;
    public final String a;

    public ctg(String s)
    {
        a = s;
    }

    public kop a(String s, int i, int j)
    {
        jau jau1 = new jau();
        jau1.a = "conversation";
        jau1.b = a;
        jbn jbn1 = new jbn();
        jbn1.requestHeader = ctq.a(s, i, j, h);
        jbn1.a = jau1;
        return jbn1;
    }

    public void a(ani ani, dbo dbo)
    {
        RealTimeChatService.j(ani, a);
    }

    public long b()
    {
        return 10000L;
    }

    public String g()
    {
        return "hangouts/resolve";
    }
}
