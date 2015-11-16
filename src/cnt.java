// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class cnt extends coj
{

    final cna a;

    cnt(cna cna, String s)
    {
        a = cna;
        super(s);
    }

    public void a()
    {
        RealTimeChatService.a("android.intent.action.PACKAGE_REPLACED", "com.google.android.talk");
    }
}
