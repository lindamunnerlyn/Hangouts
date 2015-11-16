// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class cxe extends cvn
{

    private static final long serialVersionUID = 1L;

    public cxe(hsx hsx1)
    {
        super(hsx1.apiHeader);
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (hsx)kop.mergeFrom(new hsx(), abyte0);
        if (a(((hsx) (abyte0)).apiHeader))
        {
            return new cvz(((hsx) (abyte0)).apiHeader);
        } else
        {
            return new cxe(abyte0);
        }
    }

    public void a(aoe aoe1, dfb dfb)
    {
        super.a(aoe1, dfb);
        dfb = (css)c();
        String s = ((css) (dfb)).a;
        String s1 = ((css) (dfb)).b;
        aoe1.a(s, s1, ((css) (dfb)).d);
        if (((css) (dfb)).d)
        {
            aoe1.c(s, s1, ((css) (dfb)).c, null);
        } else
        {
            aoe1.h(s, s1);
        }
        RealTimeChatService.a(aoe1.f().h(), true);
    }
}
