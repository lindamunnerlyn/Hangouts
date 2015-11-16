// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class avy
    implements axu
{

    final ave a;

    avy(ave ave1)
    {
        a = ave1;
        super();
    }

    public void a()
    {
    }

    public void a(String s, axo axo)
    {
        ave.a(a, s);
        RealTimeChatService.m(ave.h(a), s);
        axo = a.getActivity().getApplicationContext();
        cej.a(axo, ave.h(a).h(), s);
        cej.c(axo, ave.h(a).h(), s);
        RealTimeChatService.n(ave.h(a), s);
    }
}
