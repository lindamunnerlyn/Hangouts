// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.views.ConversationListItemWrapper;

public final class edp
    implements Runnable
{

    final ConversationListItemWrapper a;

    public edp(ConversationListItemWrapper conversationlistitemwrapper)
    {
        a = conversationlistitemwrapper;
        super();
    }

    public void run()
    {
        if (ConversationListItemWrapper.a(a) instanceof ecv)
        {
            ((ecv)ConversationListItemWrapper.a(a)).a();
        } else
        if (ConversationListItemWrapper.a(a) instanceof com.google.android.apps.hangouts.fragments.ConversationListFragment.InviteListItem)
        {
            ((com.google.android.apps.hangouts.fragments.ConversationListFragment.InviteListItem)ConversationListItemWrapper.a(a)).a();
            return;
        }
    }
}
