// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class czl extends cxr
{

    private static final long serialVersionUID = 1L;

    private czl()
    {
    }

    public static cxr parseFrom(byte abyte0[])
    {
        return new czl();
    }

    public void a(aow aow, dgk dgk)
    {
        super.a(aow, dgk);
        dgk = (cwq)b;
        RealTimeChatService.a(aow, ((cwq) (dgk)).c, ((cwq) (dgk)).a);
    }
}
