// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dhn
    implements Runnable
{

    final RealTimeChatService a;

    public dhn(RealTimeChatService realtimechatservice)
    {
        a = realtimechatservice;
        super();
    }

    public void run()
    {
        Toast.makeText(g.nU, l.jo, 0).show();
    }
}
