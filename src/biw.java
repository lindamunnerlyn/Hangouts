// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.fragments.ConversationParticipantsFragment;

public final class biw
    implements eem
{

    final ConversationParticipantsFragment a;

    public biw(ConversationParticipantsFragment conversationparticipantsfragment)
    {
        a = conversationparticipantsfragment;
        super();
    }

    public void a(eej eej1)
    {
        eej1 = eej1.a();
        dqd dqd1 = (dqd)ConversationParticipantsFragment.a(a).b(dqd);
        if (dqd1 != null)
        {
            dqd1.a(a.getContext(), a, ebr.a(eej1), eej1.e(), eej1.f());
        }
    }
}
