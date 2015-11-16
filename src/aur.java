// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class aur extends coj
{

    final aui a;

    aur(aui aui1, String s)
    {
        a = aui1;
        super(s);
    }

    public void a()
    {
        int i = g.a(a.a, "babel_stress_message_count", 1000);
        RealTimeChatService.a(a.b, a.c.a, 0, i);
    }
}
