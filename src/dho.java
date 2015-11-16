// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.List;

public final class dho extends dgj
{

    final List a;
    final RealTimeChatService e;

    public dho(RealTimeChatService realtimechatservice, aoa aoa, List list)
    {
        e = realtimechatservice;
        a = list;
        super(aoa);
    }

    public List j()
    {
        return a;
    }
}
