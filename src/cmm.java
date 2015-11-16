// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class cmm extends cmu
{

    final cls a;

    cmm(cls cls1, String s)
    {
        a = cls1;
        super(s);
    }

    public void a()
    {
        RealTimeChatService.a(a.c, false, false, 0, false);
    }
}
