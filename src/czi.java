// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class czi extends cxr
{

    private static final long serialVersionUID = 1L;

    public czi(hyb hyb1)
    {
        super(hyb1.apiHeader);
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (hyb)kws.mergeFrom(new hyb(), abyte0);
        if (a(((hyb) (abyte0)).apiHeader))
        {
            return new cyd(((hyb) (abyte0)).apiHeader);
        } else
        {
            return new czi(abyte0);
        }
    }

    public void a(aow aow1, dgk dgk)
    {
        super.a(aow1, dgk);
        dgk = (cuv)c();
        String s = ((cuv) (dgk)).a;
        String s1 = ((cuv) (dgk)).b;
        aow1.a(s, s1, ((cuv) (dgk)).d);
        if (((cuv) (dgk)).d)
        {
            aow1.c(s, s1, ((cuv) (dgk)).c, null);
        } else
        {
            aow1.h(s, s1);
        }
        RealTimeChatService.a(aow1.f().h(), true);
    }
}
