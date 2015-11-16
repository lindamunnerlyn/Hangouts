// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.hangouts.fragments.ConversationParticipantsFragment;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class biy
    implements android.view.View.OnClickListener
{

    final ConversationParticipantsFragment a;

    public biy(ConversationParticipantsFragment conversationparticipantsfragment)
    {
        a = conversationparticipantsfragment;
        super();
    }

    public void onClick(View view)
    {
        int i;
        i = g.a((Integer)view.getTag(), 0);
        view = a.getActivity();
        i;
        JVM INSTR tableswitch 1 6: default 60
    //                   1 61
    //                   2 69
    //                   3 77
    //                   4 303
    //                   5 335
    //                   6 367;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        return;
_L2:
        ConversationParticipantsFragment.b(a);
        return;
_L3:
        ConversationParticipantsFragment.c(a);
        return;
_L4:
        if (ConversationParticipantsFragment.d(a) && ConversationParticipantsFragment.e(a) != null)
        {
            RealTimeChatService.a(ConversationParticipantsFragment.f(a), ConversationParticipantsFragment.e(a).b.a, ConversationParticipantsFragment.e(a).b.b, ConversationParticipantsFragment.e(a).e, false, true);
            Toast.makeText(view, view.getString(l.jz, new Object[] {
                ConversationParticipantsFragment.e(a).e
            }), 0).show();
            ConversationParticipantsFragment.g(a);
            if (ConversationParticipantsFragment.h(a) != null)
            {
                gf gf1 = gf.a();
                ConversationParticipantsFragment.h(a).a = view.getString(l.as, new Object[] {
                    gf1.a(ConversationParticipantsFragment.e(a).e, gq.e)
                });
                if (ConversationParticipantsFragment.h(a).g != null)
                {
                    ((TextView)ConversationParticipantsFragment.h(a).g.findViewById(h.gz)).setText(ConversationParticipantsFragment.h(a).a);
                    return;
                }
            } else
            {
                ebw.g("Babel", "no participants found when trying to unblock");
                return;
            }
        } else
        {
            ConversationParticipantsFragment.i(a);
            return;
        }
          goto _L1
_L5:
        ConversationParticipantsFragment.a(a, view.getString(l.eV), ConversationParticipantsFragment.j(a), ConversationParticipantsFragment.k(a), 103, 2);
        return;
_L6:
        ConversationParticipantsFragment.a(a, view.getString(l.eS), ConversationParticipantsFragment.l(a), ConversationParticipantsFragment.m(a), 102, 1);
        return;
_L7:
        ConversationParticipantsFragment.o(a);
        a.getActivity();
        ConversationParticipantsFragment.n(a);
        return;
    }
}
