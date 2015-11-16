// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Arrays;

public class cwu extends cvy
{

    private static final long serialVersionUID = 1L;
    public final cgd a;
    public final int b;
    public final int j[];

    public cwu(String s)
    {
        super(s);
        b = 1;
        a = null;
        j = new int[0];
    }

    public cwu(String s, int i, int ai[])
    {
        super(s);
        b = i;
        a = null;
        j = ai;
    }

    public String a()
    {
        return "event_queue";
    }

    public kws a(String s, int i, int k)
    {
        if (eev.a("Babel_RequestWriter", 3))
        {
            eev.d("Babel_RequestWriter", "replyToInviteRequest build protobuf");
        }
        jdg jdg1 = new jdg();
        jdg1.requestHeader = cvu.a(s, i, k, h);
        jdg1.c = Integer.valueOf(b);
        jdg1.a = cvu.a(c);
        jdg1.d = Arrays.copyOf(j, j.length);
        return jdg1;
    }

    public void a(aoa aoa1, dcx dcx)
    {
        super.a(aoa1, dcx);
        if (!d)
        {
            RealTimeChatService.b(aoa1.h(), c);
        }
    }

    public String f()
    {
        return "conversations/replytoinvite";
    }

    public int n()
    {
        return 4;
    }
}
