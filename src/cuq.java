// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Arrays;

public class cuq extends ctu
{

    private static final long serialVersionUID = 1L;
    public final cey a;
    public final int b;
    public final int j[];

    public cuq(String s)
    {
        super(s);
        b = 1;
        a = null;
        j = new int[0];
    }

    public cuq(String s, int i, int ai[])
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

    public kop a(String s, int i, int k)
    {
        if (ebw.a("Babel_RequestWriter", 3))
        {
            ebw.d("Babel_RequestWriter", "replyToInviteRequest build protobuf");
        }
        ixb ixb1 = new ixb();
        ixb1.requestHeader = ctq.a(s, i, k, h);
        ixb1.c = Integer.valueOf(b);
        ixb1.a = ctq.a(c);
        ixb1.d = Arrays.copyOf(j, j.length);
        return ixb1;
    }

    public void a(ani ani1, dbo dbo)
    {
        super.a(ani1, dbo);
        if (!d)
        {
            RealTimeChatService.b(ani1.h(), c);
        }
    }

    public String g()
    {
        return "conversations/replytoinvite";
    }

    public int o()
    {
        return 4;
    }
}
