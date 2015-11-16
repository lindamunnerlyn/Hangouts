// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class cqk
    implements dvn
{

    final cqj a;

    cqk(cqj cqj1)
    {
        a = cqj1;
        super();
    }

    public void a()
    {
    }

    public void onClick(View view)
    {
        RealTimeChatService.a(cqf.a(a.a), -1L);
    }
}
