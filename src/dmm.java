// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class dmm
    implements dml
{

    private Context a;

    public dmm()
    {
    }

    public dml a(Context context)
    {
        a = context;
        return this;
    }

    public String a(aoa aoa1, String s, String s1, String s2, int i, String s3, int j, 
            int k, String s4, String s5, boolean flag, fik fik, int l)
    {
        ((bwz)hlp.a(a, bwz)).a(aoa1.h(), bxa.c);
        String s6 = aow.g();
        RealTimeChatService.a(aoa1, s, s6, s1, s2, i, s3, j, k, s4, s5, flag, fik, l);
        return s6;
    }
}
