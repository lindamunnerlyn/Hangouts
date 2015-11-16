// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.apps.hangouts.fragments.ConversationParticipantsFragment;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Collection;
import java.util.Iterator;

public final class bix
    implements bfg
{

    final ConversationParticipantsFragment a;

    public bix(ConversationParticipantsFragment conversationparticipantsfragment)
    {
        a = conversationparticipantsfragment;
        super();
    }

    public void a(Bundle bundle, String s)
    {
label0:
        {
            if (s.equals("block_user"))
            {
                if (ConversationParticipantsFragment.p(a) != 1 || ConversationParticipantsFragment.e(a) == null)
                {
                    break label0;
                }
                RealTimeChatService.b(ConversationParticipantsFragment.f(a), ConversationParticipantsFragment.q(a));
                bundle = new long[ConversationParticipantsFragment.q(a).length];
                for (int i = 0; i < ConversationParticipantsFragment.q(a).length; i++)
                {
                    bundle[i] = ConversationParticipantsFragment.r(a);
                }

                RealTimeChatService.a(ConversationParticipantsFragment.f(a), ConversationParticipantsFragment.q(a), bundle, true, false);
                bundle = ConversationParticipantsFragment.s(a).b().iterator();
                do
                {
                    if (!bundle.hasNext())
                    {
                        break;
                    }
                    s = (ceu)bundle.next();
                    if (s != ConversationParticipantsFragment.e(a))
                    {
                        RealTimeChatService.a(ConversationParticipantsFragment.f(a), ((ceu) (s)).b.a, ((ceu) (s)).b.b, ((ceu) (s)).e, true, true);
                    }
                } while (true);
                g.a(a.getActivity(), ConversationParticipantsFragment.f(a), ConversationParticipantsFragment.e(a).e, ConversationParticipantsFragment.e(a).b.a, ConversationParticipantsFragment.e(a).b.b);
                g.a(ConversationParticipantsFragment.f(a), 1819);
            }
            return;
        }
        ebw.g("Babel", "no participants found when trying to block");
    }

    public void a(String s)
    {
    }

    public void b(String s)
    {
    }
}
