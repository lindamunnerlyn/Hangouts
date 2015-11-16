// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class ddw extends ddx
{

    public ddw(Context context, int j, ddy ddy)
    {
        super(context, j, ddy, l.tE);
    }

    public int b()
    {
        return RealTimeChatService.e(d);
    }

    public Class e()
    {
        return csg;
    }

    public Class f()
    {
        return cwy;
    }

    protected int i()
    {
        return g.a(g.nS, "babel_get_voice_account_info_request_timeout_millis", 20000);
    }
}
