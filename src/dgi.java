// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dgi
    implements Runnable
{

    final Intent a;
    final dgu b;
    final Object c;
    final RealTimeChatService d;

    public dgi(RealTimeChatService realtimechatservice, Intent intent, dgu dgu, Object obj)
    {
        d = realtimechatservice;
        a = intent;
        b = dgu;
        c = obj;
        super();
    }

    public void run()
    {
        d.a(a, b, c, true);
    }
}
