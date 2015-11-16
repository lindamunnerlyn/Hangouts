// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class awo
    implements ayi
{

    final avv a;

    awo(avv avv1)
    {
        a = avv1;
        super();
    }

    public void a()
    {
    }

    public void a(String s, ayc ayc)
    {
        avv.a(a, s);
        RealTimeChatService.m(avv.h(a), s);
        ayc = a.getActivity().getApplicationContext();
        cfo.a(ayc, avv.h(a).h(), s);
        cfo.c(ayc, avv.h(a).h(), s);
        RealTimeChatService.n(avv.h(a), s);
    }
}
