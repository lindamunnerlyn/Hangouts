// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dku
    implements dkt
{

    private Context a;

    public dku()
    {
    }

    public dkt a(Context context)
    {
        a = context;
        return this;
    }

    public void a(ani ani1, String s, String s1, String s2, int i, String s3, int j, 
            int k, String s4, String s5, boolean flag, ffo ffo, int l)
    {
        ((bwg)hgx.a(a, bwg)).a(ani1.h(), bwh.c);
        RealTimeChatService.a(ani1, s, s1, s2, i, s3, j, k, s4, s5, flag, ffo, l);
    }
}
