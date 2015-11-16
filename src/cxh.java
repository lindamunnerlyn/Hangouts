// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class cxh extends cvn
{

    private static final long serialVersionUID = 1L;

    private cxh()
    {
    }

    public static cvn parseFrom(byte abyte0[])
    {
        return new cxh();
    }

    public void a(aoe aoe, dfb dfb)
    {
        super.a(aoe, dfb);
        dfb = (cum)b;
        RealTimeChatService.a(aoe, ((cum) (dfb)).c, ((cum) (dfb)).a);
    }
}
