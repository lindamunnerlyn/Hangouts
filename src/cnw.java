// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class cnw extends coj
{

    final cna a;

    cnw(cna cna1, String s)
    {
        a = cna1;
        super(s);
    }

    public void a()
    {
        RealTimeChatService.a(a.c, false, false, 0, false);
    }
}
