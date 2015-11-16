// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class axj
    implements ayi
{

    final aoa a;
    final avv b;

    axj(avv avv1, aoa aoa)
    {
        b = avv1;
        a = aoa;
        super();
    }

    public void a()
    {
        avv.B(b).a();
    }

    public void a(String s, ayc ayc)
    {
        RealTimeChatService.a(a, s, avv.aK(b));
    }
}
