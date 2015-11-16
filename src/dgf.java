// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.List;

public final class dgf extends dfa
{

    final List a;
    final RealTimeChatService d;

    public dgf(RealTimeChatService realtimechatservice, ani ani, List list)
    {
        d = realtimechatservice;
        a = list;
        super(ani);
    }

    public List j()
    {
        return a;
    }
}
