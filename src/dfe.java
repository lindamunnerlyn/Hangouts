// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dfe
    implements ServiceConnection
{

    final RealTimeChatService a;

    public dfe(RealTimeChatService realtimechatservice)
    {
        a = realtimechatservice;
        super();
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        RealTimeChatService.a(a, ((dkf)ibinder).a());
        if (RealTimeChatService.l())
        {
            ebw.b("Babel", "RequestWriter connected");
        }
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        RealTimeChatService.a(a, null);
        if (RealTimeChatService.l())
        {
            ebw.b("Babel", "RequestWriter disconnected");
        }
    }
}
