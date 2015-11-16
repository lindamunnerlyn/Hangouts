// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.apps.hangouts.fragments.ConversationParticipantsFragment;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Collection;
import java.util.Iterator;

public final class bjj
    implements bfs
{

    final ConversationParticipantsFragment a;

    public bjj(ConversationParticipantsFragment conversationparticipantsfragment)
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
                if (ConversationParticipantsFragment.p(a) != 1 || ConversationParticipantsFragment.f(a) == null)
                {
                    break label0;
                }
                RealTimeChatService.b(ConversationParticipantsFragment.b(a), ConversationParticipantsFragment.q(a));
                bundle = new long[ConversationParticipantsFragment.q(a).length];
                for (int i = 0; i < ConversationParticipantsFragment.q(a).length; i++)
                {
                    bundle[i] = ConversationParticipantsFragment.r(a);
                }

                RealTimeChatService.a(ConversationParticipantsFragment.b(a), ConversationParticipantsFragment.q(a), bundle, true, false);
                bundle = ConversationParticipantsFragment.s(a).b().iterator();
                do
                {
                    if (!bundle.hasNext())
                    {
                        break;
                    }
                    s = (cfz)bundle.next();
                    if (s != ConversationParticipantsFragment.f(a))
                    {
                        RealTimeChatService.a(ConversationParticipantsFragment.b(a), ((cfz) (s)).b.a, ((cfz) (s)).b.b, ((cfz) (s)).e, true, true);
                    }
                } while (true);
                g.a(a.getActivity(), ConversationParticipantsFragment.b(a), ConversationParticipantsFragment.f(a).e, ConversationParticipantsFragment.f(a).b.a, ConversationParticipantsFragment.f(a).b.b, true);
                g.a(ConversationParticipantsFragment.b(a), 1819);
            }
            return;
        }
        eev.g("Babel", "no participants found when trying to block");
    }

    public void a(String s)
    {
    }

    public void b(String s)
    {
    }
}
