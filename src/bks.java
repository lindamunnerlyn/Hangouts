// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.fragments.InvitationFragment;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class bks
    implements bhv
{

    final InvitationFragment a;

    public bks(InvitationFragment invitationfragment)
    {
        a = invitationfragment;
        super();
    }

    public void a(boolean flag, boolean flag1)
    {
        RealTimeChatService.a(InvitationFragment.j(a), InvitationFragment.f(a), false, flag1, flag);
        if (flag)
        {
            RealTimeChatService.a(InvitationFragment.j(a), InvitationFragment.b(a).a, null, InvitationFragment.k(a), true, true);
        }
        bkw bkw1 = InvitationFragment.l(a);
        InvitationFragment.f(a);
        bkw1.u_();
    }
}
