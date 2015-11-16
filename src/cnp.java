// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class cnp extends coj
{

    final long a;
    final cna b;

    cnp(cna cna1, String s, long l)
    {
        b = cna1;
        a = l;
        super(s);
    }

    public void a()
    {
        RealTimeChatService.c(b.b, a + 1000L);
    }
}
