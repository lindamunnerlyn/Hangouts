// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;

final class dgr
    implements dgt
{

    final dgq a;

    dgr(dgq dgq)
    {
        a = dgq;
        super();
    }

    public int a(ani ani, ArrayList arraylist)
    {
        return RealTimeChatService.a(ani, arraylist, null, true);
    }

    public void a(dgp dgp)
    {
        RealTimeChatService.a(dgp);
    }

    public void b(dgp dgp)
    {
        RealTimeChatService.b(dgp);
    }
}
