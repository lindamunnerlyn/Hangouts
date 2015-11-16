// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dfe extends dff
{

    public dfe(Context context, int j, dfg dfg)
    {
        super(context, j, dfg, l.sW);
    }

    public int b()
    {
        return RealTimeChatService.e(d);
    }

    public Class e()
    {
        return cuj;
    }

    public Class f()
    {
        return czc;
    }

    protected int i()
    {
        return g.a(g.nU, "babel_get_voice_account_info_request_timeout_millis", 20000);
    }
}
