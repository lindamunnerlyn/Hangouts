// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class cmh extends cmu
{

    final long a;
    final cls b;

    cmh(cls cls1, String s, long l)
    {
        b = cls1;
        a = l;
        super(s);
    }

    public void a()
    {
        RealTimeChatService.c(b.b, a + 1000L);
    }
}
