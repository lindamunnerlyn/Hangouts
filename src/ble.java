// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.fragments.InvitationFragment;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class ble
    implements bih
{

    final InvitationFragment a;

    public ble(InvitationFragment invitationfragment)
    {
        a = invitationfragment;
        super();
    }

    public void a(boolean flag, boolean flag1)
    {
        RealTimeChatService.a(InvitationFragment.i(a), InvitationFragment.e(a), false, flag1, flag);
        if (flag)
        {
            RealTimeChatService.a(InvitationFragment.i(a), InvitationFragment.a(a).a, null, InvitationFragment.j(a), true, true);
        }
        blf blf1 = InvitationFragment.k(a);
        InvitationFragment.e(a);
        blf1.b();
    }
}
