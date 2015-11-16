// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.fragments.ConversationParticipantsFragment;

public final class bji
    implements eho
{

    final ConversationParticipantsFragment a;

    public bji(ConversationParticipantsFragment conversationparticipantsfragment)
    {
        a = conversationparticipantsfragment;
        super();
    }

    public void a(ehl ehl1)
    {
        ehl1 = ehl1.a();
        dsx dsx1 = (dsx)ConversationParticipantsFragment.a(a).b(dsx);
        if (dsx1 != null)
        {
            dsx1.a(a.getContext(), a, eep.a(ehl1), ehl1.e(), ehl1.f());
            g.a(ConversationParticipantsFragment.b(a), 2767);
        }
    }
}
