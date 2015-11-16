// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dhq
    implements Runnable
{

    final Intent a;
    final did b;
    final Object c;

    public dhq(Intent intent, did did, Object obj)
    {
        a = intent;
        b = did;
        c = obj;
        super();
    }

    public void run()
    {
        RealTimeChatService.a(a, b, c, false);
    }
}
